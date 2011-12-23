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
 * A representation of the model object '<em><b>Logical Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.LogicalModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.LogicalModel#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.entityrelation.EntityrelationPackage#getLogicalModel()
 * @model
 * @generated
 */
public interface LogicalModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.entityrelation.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see org.obeonetwork.dsl.entityrelation.EntityrelationPackage#getLogicalModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.entityrelation.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.obeonetwork.dsl.entityrelation.EntityrelationPackage#getLogicalModel_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // LogicalModel
