/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.database.Column;

import org.obeonetwork.dsl.entityrelation.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ColumnMapping#getColumn <em>Column</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.ColumnMapping#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getColumnMapping()
 * @model
 * @generated
 */
public interface ColumnMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getColumnMapping_Column()
	 * @model required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.ColumnMapping#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getColumnMapping_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.ColumnMapping#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // ColumnMapping
