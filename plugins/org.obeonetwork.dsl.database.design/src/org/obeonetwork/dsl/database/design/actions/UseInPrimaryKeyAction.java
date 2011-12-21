package org.obeonetwork.dsl.database.design.actions;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.Column;
import org.obeonetwork.dsl.database.DatabaseFactory;
import org.obeonetwork.dsl.database.PrimaryKey;
import org.obeonetwork.dsl.database.Table;

import fr.obeo.dsl.viewpoint.AbstractDNode;

public class UseInPrimaryKeyAction {

	public boolean canExecuteUseInPrimaryKeyAction(EObject context, Collection<? extends EObject> selections) {
		for (EObject selection : selections) {
			if (selection instanceof AbstractDNode) {
				EObject target = ((AbstractDNode)selection).getTarget();
				if (target instanceof Column) {
					Column column = (Column)target;
					if (column.getPrimaryKey() == null) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public EObject executeUseInPrimaryKeyAction(EObject context, Collection<? extends EObject> selections) {
		for (EObject selection : selections) {
			if (selection instanceof AbstractDNode) {
				EObject target = ((AbstractDNode)selection).getTarget();
				if (target instanceof Column) {
					useInPrimaryKey((Column)target);
				}
			}
		}
		return context;
	}
	
	private void useInPrimaryKey(Column column) {
		// Check if the column is not already in PK
		if (column.getPrimaryKey() == null) {
			if (column.getOwner() instanceof Table) {
				// Get the primary key associated to the table
				Table table = (Table)column.getOwner();
				PrimaryKey pk = table.getPrimaryKey();
				if (pk == null) {
					pk = DatabaseFactory.eINSTANCE.createPrimaryKey();
					pk.setName("PK_" + table.getName());
					table.setPrimaryKey(pk);
				}
				pk.getColumns().add(column);
			}
		}
	}
}
