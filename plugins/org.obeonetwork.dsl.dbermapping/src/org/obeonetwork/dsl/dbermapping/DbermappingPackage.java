/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.dbermapping.DbermappingFactory
 * @model kind="package"
 * @generated
 */
public interface DbermappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dbermapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/dsl/dbermapping/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbermapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DbermappingPackage eINSTANCE = org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dbermapping.impl.DatabaseMappingImpl <em>Database Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.dbermapping.impl.DatabaseMappingImpl
	 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getDatabaseMapping()
	 * @generated
	 */
	int DATABASE_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MAPPING__DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Logical Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MAPPING__LOGICAL_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Table Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MAPPING__TABLE_MAPPINGS = 2;

	/**
	 * The number of structural features of the '<em>Database Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dbermapping.impl.TableMappingImpl <em>Table Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.dbermapping.impl.TableMappingImpl
	 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getTableMapping()
	 * @generated
	 */
	int TABLE_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING__ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Table Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dbermapping.DatabaseMapping <em>Database Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Mapping</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.DatabaseMapping
	 * @generated
	 */
	EClass getDatabaseMapping();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.DatabaseMapping#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.DatabaseMapping#getDatabase()
	 * @see #getDatabaseMapping()
	 * @generated
	 */
	EReference getDatabaseMapping_Database();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.DatabaseMapping#getLogicalModel <em>Logical Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logical Model</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.DatabaseMapping#getLogicalModel()
	 * @see #getDatabaseMapping()
	 * @generated
	 */
	EReference getDatabaseMapping_LogicalModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.dbermapping.DatabaseMapping#getTableMappings <em>Table Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Mappings</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.DatabaseMapping#getTableMappings()
	 * @see #getDatabaseMapping()
	 * @generated
	 */
	EReference getDatabaseMapping_TableMappings();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dbermapping.TableMapping <em>Table Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Mapping</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.TableMapping
	 * @generated
	 */
	EClass getTableMapping();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.TableMapping#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.TableMapping#getTable()
	 * @see #getTableMapping()
	 * @generated
	 */
	EReference getTableMapping_Table();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.TableMapping#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.TableMapping#getEntity()
	 * @see #getTableMapping()
	 * @generated
	 */
	EReference getTableMapping_Entity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DbermappingFactory getDbermappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dbermapping.impl.DatabaseMappingImpl <em>Database Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.dbermapping.impl.DatabaseMappingImpl
		 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getDatabaseMapping()
		 * @generated
		 */
		EClass DATABASE_MAPPING = eINSTANCE.getDatabaseMapping();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_MAPPING__DATABASE = eINSTANCE.getDatabaseMapping_Database();

		/**
		 * The meta object literal for the '<em><b>Logical Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_MAPPING__LOGICAL_MODEL = eINSTANCE.getDatabaseMapping_LogicalModel();

		/**
		 * The meta object literal for the '<em><b>Table Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_MAPPING__TABLE_MAPPINGS = eINSTANCE.getDatabaseMapping_TableMappings();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dbermapping.impl.TableMappingImpl <em>Table Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.dbermapping.impl.TableMappingImpl
		 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getTableMapping()
		 * @generated
		 */
		EClass TABLE_MAPPING = eINSTANCE.getTableMapping();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_MAPPING__TABLE = eINSTANCE.getTableMapping_Table();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_MAPPING__ENTITY = eINSTANCE.getTableMapping_Entity();

	}

} //DbermappingPackage
