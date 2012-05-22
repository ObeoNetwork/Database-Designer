package org.obeonetwork.dsl.database.filters;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.PrimaryKey;

public class PrimaryKeyTabPropertiesEditionSection extends AbstractDatabasePropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null) {
			if (eObj instanceof PrimaryKey) {
				return getProvider(eObj) != null;
			}
		}
		return false;
	}
}
