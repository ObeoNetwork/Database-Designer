/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.database.ForeignKey;

import org.obeonetwork.dsl.entityrelation.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getForeignKeyElementMappings <em>Foreign Key Element Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyMapping()
 * @model
 * @generated
 */
public interface ForeignKeyMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' reference.
	 * @see #setForeignKey(ForeignKey)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyMapping_ForeignKey()
	 * @model required="true"
	 * @generated
	 */
	ForeignKey getForeignKey();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getForeignKey <em>Foreign Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' reference.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(ForeignKey value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyMapping_Relation()
	 * @model required="true"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>Foreign Key Element Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Element Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Element Mappings</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getForeignKeyMapping_ForeignKeyElementMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKeyElementMapping> getForeignKeyElementMappings();

} // ForeignKeyMapping
