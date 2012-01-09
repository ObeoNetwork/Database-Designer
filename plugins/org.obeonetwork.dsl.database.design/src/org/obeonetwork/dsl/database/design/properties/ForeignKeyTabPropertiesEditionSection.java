package org.obeonetwork.dsl.database.design.properties;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.ForeignKey;
import org.obeonetwork.dsl.database.Table;

public class ForeignKeyTabPropertiesEditionSection extends AbstractDatabasePropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null && eObj instanceof ForeignKey) {
			return getProvider(eObj) != null;
		}
		return false;
	}
}
