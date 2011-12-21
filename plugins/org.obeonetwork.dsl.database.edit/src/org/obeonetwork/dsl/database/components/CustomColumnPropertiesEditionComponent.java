package org.obeonetwork.dsl.database.components;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.obeonetwork.dsl.database.Column;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.parts.ColumnPropertiesEditionPart;
import org.obeonetwork.dsl.database.parts.DatabaseViewsRepository;

public class CustomColumnPropertiesEditionComponent extends ColumnPropertiesEditionComponent {

	public CustomColumnPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject column, String editing_mode) {
		super(editingContext, column, editing_mode);
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
		}
	}
}
