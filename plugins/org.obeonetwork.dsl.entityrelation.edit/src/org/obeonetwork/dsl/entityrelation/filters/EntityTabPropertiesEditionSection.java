package org.obeonetwork.dsl.entityrelation.filters;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.entityrelation.Entity;


public class EntityTabPropertiesEditionSection extends AbstractEntityRelationPropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null && eObj instanceof Entity) {
			return getProvider(eObj) != null;
		}
		return false;
	}
}
