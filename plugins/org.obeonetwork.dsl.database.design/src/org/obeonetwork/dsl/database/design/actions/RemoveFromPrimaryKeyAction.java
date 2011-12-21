package org.obeonetwork.dsl.database.design.actions;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.Column;
import org.obeonetwork.dsl.database.PrimaryKey;

import fr.obeo.dsl.viewpoint.AbstractDNode;

public class RemoveFromPrimaryKeyAction {

	public boolean canExecuteRemoveFromPrimaryKeyAction(EObject context, Collection<? extends EObject> selections) {
		for (EObject selection : selections) {
			if (selection instanceof AbstractDNode) {
				EObject target = ((AbstractDNode)selection).getTarget();
				if (target instanceof Column) {
					Column column = (Column)target;
					if (column.getPrimaryKey() != null) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public EObject executeRemoveFromPrimaryKeyAction(EObject context, Collection<? extends EObject> selections) {
		for (EObject selection : selections) {
			if (selection instanceof AbstractDNode) {
				EObject target = ((AbstractDNode)selection).getTarget();
				if (target instanceof Column) {
					removeFromPrimaryKey((Column)target);
				}
			}
		}
		return context;
	}
	
	private void removeFromPrimaryKey(Column column) {
		// Check if the column is already in PK
		PrimaryKey pk = column.getPrimaryKey(); 
		if (pk != null) {
			pk.getColumns().remove(column);
		}
	}
}
