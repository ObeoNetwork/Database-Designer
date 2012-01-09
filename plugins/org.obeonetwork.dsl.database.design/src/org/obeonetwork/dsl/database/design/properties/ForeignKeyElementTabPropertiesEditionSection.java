package org.obeonetwork.dsl.database.design.properties;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.ForeignKeyElement;

public class ForeignKeyElementTabPropertiesEditionSection extends AbstractDatabasePropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null && eObj instanceof ForeignKeyElement) {
			return getProvider(eObj) != null;
		}
		return false;
	}
}
