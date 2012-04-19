package org.obeonetwork.dsl.typeslibrary.filters;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.typeslibrary.UserDefinedTypeRef;

public class UserDefinedTypeRefTabPropertiesEditionSection extends AbstractTypeslibraryPropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null && eObj instanceof UserDefinedTypeRef) {
			return getProvider(eObj) != null;
		}
		return false;
	}
}
