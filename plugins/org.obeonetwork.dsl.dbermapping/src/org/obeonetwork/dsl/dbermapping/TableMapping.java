/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.obeonetwork.dsl.dbermapping.TableMapping#getColumnMappings <em>Column Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.TableMapping#getForeignKeyMappings <em>Foreign Key Mappings</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Column Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.dbermapping.ColumnMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Mappings</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dbermapping.DbermappingPackage#getTableMapping_ColumnMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnMapping> getColumnMappings();

	/**
	 * Returns the value of the '<em><b>Foreign Key Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key Mappings</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dbermapping.DbermappingPackage#getTableMapping_ForeignKeyMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKeyMapping> getForeignKeyMappings();

} // TableMapping
