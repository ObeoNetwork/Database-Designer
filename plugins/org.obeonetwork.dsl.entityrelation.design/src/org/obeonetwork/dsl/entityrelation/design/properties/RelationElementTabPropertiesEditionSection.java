package org.obeonetwork.dsl.entityrelation.design.properties;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.entityrelation.RelationElement;


public class RelationElementTabPropertiesEditionSection extends AbstractEntityRelationPropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null && eObj instanceof RelationElement) {
			return getProvider(eObj) != null;
		}
		return false;
	}
}
