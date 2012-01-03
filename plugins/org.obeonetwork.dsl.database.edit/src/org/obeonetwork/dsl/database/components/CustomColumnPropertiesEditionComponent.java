package org.obeonetwork.dsl.database.components;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettingsBuilder.EEFEditorSettingsImpl;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.NavigationStepBuilder;
import org.obeonetwork.dsl.database.Column;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart;
import org.obeonetwork.dsl.database.parts.DatabaseViewsRepository;
import org.obeonetwork.dsl.typeslibrary.NativeType;
import org.obeonetwork.dsl.typeslibrary.NativeTypeKind;
import org.obeonetwork.dsl.typeslibrary.TypeInstance;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;

public class CustomColumnPropertiesEditionComponent extends ColumnPropertiesEditionComponent {

	protected EEFEditorSettingsImpl typeSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, TypesLibraryPackage.eINSTANCE.getTypeInstance_NativeType())
																			.nextStep(NavigationStepBuilder.create(DatabasePackage.eINSTANCE.getColumn_Type())			
																				.index(0)			
																				.discriminator(TypesLibraryPackage.eINSTANCE.getTypeInstance())
																				.build())
																			.build();
	protected EEFEditorSettingsImpl literalsSettings = (EEFEditorSettingsImpl) EEFEditorSettingsBuilder.create(semanticObject, TypesLibraryPackage.eINSTANCE.getTypeInstance_Literals())
																			.nextStep(NavigationStepBuilder.create(DatabasePackage.eINSTANCE.getColumn_Type())			
																				.index(0)			
																				.discriminator(TypesLibraryPackage.eINSTANCE.getTypeInstance())
																				.build())
																			.build();
	
	public CustomColumnPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject column, String editing_mode) {
		super(editingContext, column, editing_mode);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		super.initPart(key, kind, elt, allResource);
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final ColumnPropertiesEditionPart basePart = (ColumnPropertiesEditionPart)editingPart;
			if (isAccessible(DatabaseViewsRepository.Column.Properties.type)) {
				basePart.initType(allResource, typeSettings.getValue());
			}
			if (isAccessible(DatabaseViewsRepository.Column.Properties.literals)) {
				basePart.setLiterals((EList)literalsSettings.getValue());
			}
			updateTypeFieldsVisibility((Column)elt, basePart);
		}
		setInitializing(false);
	}
	
	protected boolean shouldProcess(IPropertiesEditionEvent event) {
		if (event.getAffectedEditor() == DatabaseViewsRepository.Column.Properties.type) {
			return (typeSettings.getValue() == null) ? (event.getNewValue() != null) : (!typeSettings.getValue().equals(event.getNewValue()));
		}
		if (event.getAffectedEditor() == DatabaseViewsRepository.Column.Properties.literals) {
			return (literalsSettings.getValue() == null) ? (event.getNewValue() != null) : (!literalsSettings.getValue().equals(event.getNewValue()));
		}
		return super.shouldProcess(event);
	}	

	@Override
	public void updateSemanticModel(IPropertiesEditionEvent event) {
		Column column = (Column)semanticObject;
		super.updateSemanticModel(event);
		if (DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey == event.getAffectedEditor()) {
			if (Boolean.TRUE.equals(event.getNewValue())) {
				column.addToPrimaryKey();
			} else {
				column.removeFromPrimaryKey();
			}
		}
		if (DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique == event.getAffectedEditor()) {
			if (Boolean.TRUE.equals(event.getNewValue())) {
				column.addToUniqueIndex();
			} else {
				column.removeFromUniqueIndex();
			}
		}
		if (DatabaseViewsRepository.Column.Properties.type == event.getAffectedEditor()) {
			typeSettings.setValue((NativeType)event.getNewValue());
		}
		if (DatabaseViewsRepository.Column.Properties.literals == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				literalsSettings.setValue((List) event.getNewValue());
			}
		}
	}

	@Override
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ColumnPropertiesEditionPart basePart = (ColumnPropertiesEditionPart)editingPart;
			if (DatabasePackage.eINSTANCE.getColumn_PrimaryKey().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey))
				if (msg.getNotifier() instanceof Column) {
					basePart.setPrimaryKey(((Column)msg.getNotifier()).isInPrimaryKey());		
				}
			if (DatabasePackage.eINSTANCE.getColumn_IndexElements().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique))
				if (msg.getNotifier() instanceof Column) {
					basePart.setUnique(((Column)msg.getNotifier()).isUnique());		
				}
			if (TypesLibraryPackage.eINSTANCE.getTypeInstance_Literals().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.literals)) {
				basePart.setLiterals((EList)msg.getNewValue());
			}
			if (TypesLibraryPackage.eINSTANCE.getTypeInstance_NativeType().equals((msg.getFeature()))) {
				updateTypeFieldsVisibility((Column)semanticObject, basePart);
			}
		}
	}
	
	private void updateTypeFieldsVisibility(Column column, ColumnPropertiesEditionPart basePart) {
		if (column.getType() instanceof TypeInstance) {
			TypeInstance typeInstance = (TypeInstance)column.getType();
			if (typeInstance.getNativeType() != null) {
				NativeTypeKind nativeTypeKind = typeInstance.getNativeType().getSpec();
				boolean lengthVisible = (nativeTypeKind == NativeTypeKind.LENGTH || nativeTypeKind == NativeTypeKind.LENGTH_AND_PRECISION);
				boolean precisionVisible = (nativeTypeKind == NativeTypeKind.LENGTH_AND_PRECISION);
				boolean literalsVisible = (nativeTypeKind == NativeTypeKind.ENUM);
				basePart.updateTypeFields(lengthVisible, precisionVisible, literalsVisible);
			}
		}		
	}
}
