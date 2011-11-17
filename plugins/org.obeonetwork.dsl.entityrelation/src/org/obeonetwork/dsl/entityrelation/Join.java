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
package org.obeonetwork.dsl.entityrelation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Join#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Join#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Identifiers</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.entityrelation.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiers</em>' reference list.
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getJoin_Identifiers()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.entityrelation.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getJoin_Columns()
	 * @model
	 * @generated
	 */
	EList<Attribute> getColumns();

} // Join
