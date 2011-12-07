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
package org.obeonetwork.dsl.database.util;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.obeonetwork.dsl.typeslibrary.util.TypesLibraryUtil;

public class DatabaseResourceFactoryImpl extends ResourceFactoryImpl {

	public DatabaseResourceFactoryImpl() {
		super();
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			TypesLibraryUtil.registerPathmaps();
		}

	}

	@Override
	public Resource createResource(URI uri) {
		Resource result = new DatabaseResourceImpl(uri);
		return result;
	}

}