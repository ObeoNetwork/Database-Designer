package org.obeonetwork.dsl.entityrelation.filters;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.entityrelation.LogicalModel;


public class LogicalModelTabPropertiesEditionSection extends AbstractEntityRelationPropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null && eObj instanceof LogicalModel) {
			return getProvider(eObj) != null;
		}
		return false;
	}
}
