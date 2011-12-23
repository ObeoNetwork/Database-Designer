/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.dbermapping.DbermappingPackage
 * @generated
 */
public interface DbermappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbermappingFactory eINSTANCE = org.obeonetwork.dsl.dbermapping.impl.DbermappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Database Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Mapping</em>'.
	 * @generated
	 */
	DatabaseMapping createDatabaseMapping();

	/**
	 * Returns a new object of class '<em>Table Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Mapping</em>'.
	 * @generated
	 */
	TableMapping createTableMapping();

	/**
	 * Returns a new object of class '<em>Column Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Mapping</em>'.
	 * @generated
	 */
	ColumnMapping createColumnMapping();

	/**
	 * Returns a new object of class '<em>Primary Key Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Key Mapping</em>'.
	 * @generated
	 */
	PrimaryKeyMapping createPrimaryKeyMapping();

	/**
	 * Returns a new object of class '<em>Foreign Key Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Key Mapping</em>'.
	 * @generated
	 */
	ForeignKeyMapping createForeignKeyMapping();

	/**
	 * Returns a new object of class '<em>Foreign Key Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Key Element Mapping</em>'.
	 * @generated
	 */
	ForeignKeyElementMapping createForeignKeyElementMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DbermappingPackage getDbermappingPackage();

} //DbermappingFactory
