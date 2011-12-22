/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.ecore.EObject;

import org.obeonetwork.dsl.database.Table;

import org.obeonetwork.dsl.entityrelation.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.TableMapping#getTable <em>Table</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.TableMapping#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dbermapping.DbermappingPackage#getTableMapping()
 * @model
 * @generated
 */
public interface TableMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see org.obeonetwork.dsl.dbermapping.DbermappingPackage#getTableMapping_Table()
	 * @model required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.TableMapping#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see org.obeonetwork.dsl.dbermapping.DbermappingPackage#getTableMapping_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.TableMapping#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // TableMapping
