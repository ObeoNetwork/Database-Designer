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

import org.obeonetwork.dsl.database.DatabaseElement;
import org.obeonetwork.dsl.database.NamedElement;
import org.obeonetwork.dsl.database.util.DatabaseSwitch;

public class DatabaseEditLabelServices extends DatabaseSwitch<DatabaseElement>{
	
	private String editedLabelContent;

	public DatabaseElement editDatabaseElementLabel(DatabaseElement element, String editedLabelContent) {
		this.editedLabelContent = editedLabelContent;
		return doSwitch(element);
	}

	@Override
	public DatabaseElement caseNamedElement(NamedElement object) {
		object.setName(editedLabelContent);
		return object;
	}
}
