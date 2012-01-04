/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.database.PrimaryKey;

import org.obeonetwork.dsl.entityrelation.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getPrimaryKeyMapping()
 * @model
 * @generated
 */
public interface PrimaryKeyMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getPrimaryKeyMapping_PrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getPrimaryKeyMapping_Identifier()
	 * @model required="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

} // PrimaryKeyMapping
