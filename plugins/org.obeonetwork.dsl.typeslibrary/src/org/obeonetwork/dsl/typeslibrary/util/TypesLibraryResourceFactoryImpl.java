/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.typeslibrary.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class TypesLibraryResourceFactoryImpl extends ResourceFactoryImpl {

	public TypesLibraryResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResource(URI uri) {
		Resource result = new TypesLibraryResourceImpl(uri);
		return result;
	}

}