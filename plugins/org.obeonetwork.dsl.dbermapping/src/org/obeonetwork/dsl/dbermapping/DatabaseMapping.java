/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.database.DataBase;
import org.obeonetwork.dsl.entityrelation.LogicalModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.DatabaseMapping#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.DatabaseMapping#getLogicalModel <em>Logical Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.DatabaseMapping#getTableMappings <em>Table Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getDatabaseMapping()
 * @model
 * @generated
 */
public interface DatabaseMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(DataBase)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getDatabaseMapping_Database()
	 * @model required="true"
	 * @generated
	 */
	DataBase getDatabase();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.DatabaseMapping#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(DataBase value);

	/**
	 * Returns the value of the '<em><b>Logical Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Model</em>' reference.
	 * @see #setLogicalModel(LogicalModel)
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getDatabaseMapping_LogicalModel()
	 * @model required="true"
	 * @generated
	 */
	LogicalModel getLogicalModel();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.dbermapping.DatabaseMapping#getLogicalModel <em>Logical Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Model</em>' reference.
	 * @see #getLogicalModel()
	 * @generated
	 */
	void setLogicalModel(LogicalModel value);

	/**
	 * Returns the value of the '<em><b>Table Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.dbermapping.TableMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Mappings</em>' containment reference list.
	 * @see org.obeonetwork.dsl.dbermapping.DBERMappingPackage#getDatabaseMapping_TableMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableMapping> getTableMappings();

} // DatabaseMapping
