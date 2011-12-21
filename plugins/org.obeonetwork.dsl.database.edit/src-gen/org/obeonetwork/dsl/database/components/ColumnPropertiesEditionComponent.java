/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.database.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.database.Column;
import org.obeonetwork.dsl.database.DatabaseFactory;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.Sequence;
import org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart;
import org.obeonetwork.dsl.database.parts.DatabaseViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class ColumnPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for sequence EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings sequenceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ColumnPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject column, String editing_mode) {
		super(editingContext, column, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DatabaseViewsRepository.class;
		partKey = DatabaseViewsRepository.Column.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Column column = (Column)elt;
			final ColumnPropertiesEditionPart basePart = (ColumnPropertiesEditionPart)editingPart;
			// init values
			if (column.getName() != null && isAccessible(DatabaseViewsRepository.Column.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), column.getName()));
			
			if (isAccessible(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable)) {
				basePart.setNullable(column.isNullable());
			}
			if (isAccessible(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey)) {
				basePart.setPrimaryKey(column.isInPrimaryKey());
			}
			if (isAccessible(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique)) {
				basePart.setUnique(column.isUnique());
			}
			if (isAccessible(DatabaseViewsRepository.Column.Properties.Sequence.autoincrement)) {
				basePart.setAutoincrement(column.isAutoincrement());
			}
			if (isAccessible(DatabaseViewsRepository.Column.Properties.Sequence.sequence_)) {
				// init part
				sequenceSettings = new EObjectFlatComboSettings(column, DatabasePackage.eINSTANCE.getColumn_Sequence());
				basePart.initSequence(sequenceSettings);
				// set the button mode
				basePart.setSequenceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (column.getDefaultValue() != null && isAccessible(DatabaseViewsRepository.Column.Properties.defaultValue))
				basePart.setDefaultValue(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), column.getDefaultValue()));
			
			if (column.getComments() != null && isAccessible(DatabaseViewsRepository.Column.Properties.comments))
				basePart.setComments(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), column.getComments()));
			// init filters
			
			
			
			
			
			basePart.addFilterToSequence(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Sequence); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for sequence
			// End of user code
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}











	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == DatabaseViewsRepository.Column.Properties.name) {
			return DatabasePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable) {
			return DatabasePackage.eINSTANCE.getColumn_Nullable();
		}
		if (editorKey == DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey) {
			return DatabasePackage.eINSTANCE.getColumn_InPrimaryKey();
		}
		if (editorKey == DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique) {
			return DatabasePackage.eINSTANCE.getColumn_Unique();
		}
		if (editorKey == DatabaseViewsRepository.Column.Properties.Sequence.autoincrement) {
			return DatabasePackage.eINSTANCE.getColumn_Autoincrement();
		}
		if (editorKey == DatabaseViewsRepository.Column.Properties.Sequence.sequence_) {
			return DatabasePackage.eINSTANCE.getColumn_Sequence();
		}
		if (editorKey == DatabaseViewsRepository.Column.Properties.defaultValue) {
			return DatabasePackage.eINSTANCE.getColumn_DefaultValue();
		}
		if (editorKey == DatabaseViewsRepository.Column.Properties.comments) {
			return DatabasePackage.eINSTANCE.getDatabaseElement_Comments();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Column column = (Column)semanticObject;
		if (DatabaseViewsRepository.Column.Properties.name == event.getAffectedEditor()) {
			column.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable == event.getAffectedEditor()) {
			column.setNullable((Boolean)event.getNewValue());
		}
		if (DatabaseViewsRepository.Column.Properties.Sequence.autoincrement == event.getAffectedEditor()) {
			column.setAutoincrement((Boolean)event.getNewValue());
		}
		if (DatabaseViewsRepository.Column.Properties.Sequence.sequence_ == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sequenceSettings.setToReference((Sequence)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Sequence eObject = DatabaseFactory.eINSTANCE.createSequence();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				sequenceSettings.setToReference(eObject);
			}
		}
		if (DatabaseViewsRepository.Column.Properties.defaultValue == event.getAffectedEditor()) {
			column.setDefaultValue((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DatabaseViewsRepository.Column.Properties.comments == event.getAffectedEditor()) {
			column.setComments((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ColumnPropertiesEditionPart basePart = (ColumnPropertiesEditionPart)editingPart;
			if (DatabasePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DatabasePackage.eINSTANCE.getColumn_Nullable().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable))
				basePart.setNullable((Boolean)msg.getNewValue());
			
			if (DatabasePackage.eINSTANCE.getColumn_InPrimaryKey().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey))
				basePart.setPrimaryKey((Boolean)msg.getNewValue());
			
			if (DatabasePackage.eINSTANCE.getColumn_Unique().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique))
				basePart.setUnique((Boolean)msg.getNewValue());
			
			if (DatabasePackage.eINSTANCE.getColumn_Autoincrement().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.Sequence.autoincrement))
				basePart.setAutoincrement((Boolean)msg.getNewValue());
			
			if (DatabasePackage.eINSTANCE.getColumn_Sequence().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.Sequence.sequence_))
				basePart.setSequence((EObject)msg.getNewValue());
			if (DatabasePackage.eINSTANCE.getColumn_DefaultValue().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.defaultValue)) {
				if (msg.getNewValue() != null) {
					basePart.setDefaultValue(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDefaultValue("");
				}
			}
			if (DatabasePackage.eINSTANCE.getDatabaseElement_Comments().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Column.Properties.comments)){
				if (msg.getNewValue() != null) {
					basePart.setComments(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComments("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == DatabaseViewsRepository.Column.Properties.name || key == DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (DatabaseViewsRepository.Column.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.nullable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getColumn_Nullable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getColumn_Nullable().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.primaryKey == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getColumn_InPrimaryKey().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getColumn_InPrimaryKey().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Column.Properties.NullablePkAndUnique.unique == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getColumn_Unique().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getColumn_Unique().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Column.Properties.Sequence.autoincrement == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getColumn_Autoincrement().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getColumn_Autoincrement().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Column.Properties.defaultValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getColumn_DefaultValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getColumn_DefaultValue().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Column.Properties.comments == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getDatabaseElement_Comments().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getDatabaseElement_Comments().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
