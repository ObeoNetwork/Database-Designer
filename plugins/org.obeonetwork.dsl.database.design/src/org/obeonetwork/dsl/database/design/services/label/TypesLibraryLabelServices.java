/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.database.design.services.label;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.typeslibrary.NativeType;
import org.obeonetwork.dsl.typeslibrary.TypeInstance;
import org.obeonetwork.dsl.typeslibrary.util.TypesLibrarySwitch;

public class TypesLibraryLabelServices extends TypesLibrarySwitch<String> {
	
	public String getTypesLibraryElementLabel(EObject element) {
		return doSwitch(element);
	}

	@Override
	public String caseTypeInstance(TypeInstance typeInstance) {
		// TODO gérer mieux les types, par exemple transformer DECIMAL(%s,%p) en DECIMAL(50,10) automatiquement
		
		return doSwitch(typeInstance.getNativeType());
	}

	@Override
	public String caseNativeType(NativeType nativeType) {
		return nativeType.getName();
	}	
}
