/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.entityrelation.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRelation_Roles()
	 * @model containment="true" upper="2"
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
