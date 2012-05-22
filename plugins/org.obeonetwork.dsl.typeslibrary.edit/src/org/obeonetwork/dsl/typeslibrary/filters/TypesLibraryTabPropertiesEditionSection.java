package org.obeonetwork.dsl.typeslibrary.filters;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.typeslibrary.TypesLibrary;

public class TypesLibraryTabPropertiesEditionSection extends AbstractTypeslibraryPropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null && eObj instanceof TypesLibrary) {
			return getProvider(eObj) != null;
		}
		return false;
	}
}
