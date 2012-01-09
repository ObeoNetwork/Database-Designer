package org.obeonetwork.dsl.database.design.properties;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.PrimaryKey;
import org.obeonetwork.dsl.database.Table;

public class PrimaryKeyTabPropertiesEditionSection extends AbstractDatabasePropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null) {
			if (eObj instanceof PrimaryKey) {
				return getProvider(eObj) != null;
			} else if (eObj instanceof Table) { 
				// Check if there is a PK
				Table table = (Table)eObj;
				if (table.getPrimaryKey() != null) {
					return getProvider(eObj) != null;
				}
			}
		}
		return false;
	}
}
