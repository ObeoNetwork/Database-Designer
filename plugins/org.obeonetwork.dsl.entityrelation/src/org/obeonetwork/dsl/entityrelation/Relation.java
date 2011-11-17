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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Relation#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Relation#getJoins <em>Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.entityrelation.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_Roles()
	 * @model upper="2"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.entityrelation.Join}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' containment reference list.
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_Joins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Join> getJoins();

} // Relation
