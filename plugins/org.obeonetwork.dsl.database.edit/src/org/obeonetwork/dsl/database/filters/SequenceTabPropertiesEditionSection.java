package org.obeonetwork.dsl.database.filters;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.Sequence;

public class SequenceTabPropertiesEditionSection extends AbstractDatabasePropertiesEditionSection {

	@Override
	public boolean select(Object toTest) {
		EObject eObj = resolveSemanticObject(toTest);
		if (eObj != null && eObj instanceof Sequence) {
			return getProvider(eObj) != null;
		}
		return false;
	}
}
