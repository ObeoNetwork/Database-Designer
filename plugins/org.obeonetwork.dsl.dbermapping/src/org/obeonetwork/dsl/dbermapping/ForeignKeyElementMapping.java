/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.database.ForeignKeyElement;

import org.obeonetwork.dsl.entityrelation.Join;
import org.obeonetwork.dsl.entityrelation.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getForeignKeyElement <em>Foreign Key Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getJoin <em>Join</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyElementMapping()
 * @model
 * @generated
 */
public interface ForeignKeyElementMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Foreign Key Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Element</em>' reference.
	 * @see #setForeignKeyElement(ForeignKeyElement)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyElementMapping_ForeignKeyElement()
	 * @model required="true"
	 * @generated
	 */
	ForeignKeyElement getForeignKeyElement();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getForeignKeyElement <em>Foreign Key Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key Element</em>' reference.
	 * @see #getForeignKeyElement()
	 * @generated
	 */
	void setForeignKeyElement(ForeignKeyElement value);

	/**
	 * Returns the value of the '<em><b>Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' reference.
	 * @see #setJoin(Join)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyElementMapping_Join()
	 * @model required="true"
	 * @generated
	 */
	Join getJoin();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getJoin <em>Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' reference.
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(Join value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyElementMapping_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

} // ForeignKeyElementMapping
