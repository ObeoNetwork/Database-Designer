package org.obeonetwork.dsl.database.design.properties;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.Constraint;

public class ConstraintTabPropertiesEditionSection extends AbstractDatabasePropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null && eObj instanceof Constraint) {
			return getProvider(eObj) != null;
		}
		return false;
	}
}
