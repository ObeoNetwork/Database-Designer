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
	 * The feature id for the '<em><b>Column Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING__COLUMN_MAPPINGS = 2;

	/**
	 * The feature id for the '<em><b>Primary Key Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING__PRIMARY_KEY_MAPPINGS = 3;

	/**
	 * The feature id for the '<em><b>Foreign Key Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING__FOREIGN_KEY_MAPPINGS = 4;

	/**
	 * The number of structural features of the '<em>Table Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dbermapping.impl.ColumnMappingImpl <em>Column Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.dbermapping.impl.ColumnMappingImpl
	 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getColumnMapping()
	 * @generated
	 */
	int COLUMN_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Column Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dbermapping.impl.PrimaryKeyMappingImpl <em>Primary Key Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.dbermapping.impl.PrimaryKeyMappingImpl
	 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getPrimaryKeyMapping()
	 * @generated
	 */
	int PRIMARY_KEY_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_MAPPING__PRIMARY_KEY = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_MAPPING__IDENTIFIER = 1;

	/**
	 * The number of structural features of the '<em>Primary Key Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyMappingImpl <em>Foreign Key Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.dbermapping.impl.ForeignKeyMappingImpl
	 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getForeignKeyMapping()
	 * @generated
	 */
	int FOREIGN_KEY_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_MAPPING__FOREIGN_KEY = 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_MAPPING__RELATION = 1;

	/**
	 * The feature id for the '<em><b>Foreign Key Element Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_MAPPING__FOREIGN_KEY_ELEMENT_MAPPINGS = 2;

	/**
	 * The number of structural features of the '<em>Foreign Key Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_MAPPING_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyElementMappingImpl <em>Foreign Key Element Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.dbermapping.impl.ForeignKeyElementMappingImpl
	 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getForeignKeyElementMapping()
	 * @generated
	 */
	int FOREIGN_KEY_ELEMENT_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Foreign Key Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Join</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_ELEMENT_MAPPING__JOIN = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_ELEMENT_MAPPING__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Foreign Key Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_ELEMENT_MAPPING_FEATURE_COUNT = 3;


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
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.dbermapping.TableMapping#getColumnMappings <em>Column Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column Mappings</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.TableMapping#getColumnMappings()
	 * @see #getTableMapping()
	 * @generated
	 */
	EReference getTableMapping_ColumnMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.dbermapping.TableMapping#getPrimaryKeyMappings <em>Primary Key Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Key Mappings</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.TableMapping#getPrimaryKeyMappings()
	 * @see #getTableMapping()
	 * @generated
	 */
	EReference getTableMapping_PrimaryKeyMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.dbermapping.TableMapping#getForeignKeyMappings <em>Foreign Key Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key Mappings</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.TableMapping#getForeignKeyMappings()
	 * @see #getTableMapping()
	 * @generated
	 */
	EReference getTableMapping_ForeignKeyMappings();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dbermapping.ColumnMapping <em>Column Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Mapping</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ColumnMapping
	 * @generated
	 */
	EClass getColumnMapping();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.ColumnMapping#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ColumnMapping#getColumn()
	 * @see #getColumnMapping()
	 * @generated
	 */
	EReference getColumnMapping_Column();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.ColumnMapping#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ColumnMapping#getAttribute()
	 * @see #getColumnMapping()
	 * @generated
	 */
	EReference getColumnMapping_Attribute();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping <em>Primary Key Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Mapping</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping
	 * @generated
	 */
	EClass getPrimaryKeyMapping();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Key</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping#getPrimaryKey()
	 * @see #getPrimaryKeyMapping()
	 * @generated
	 */
	EReference getPrimaryKeyMapping_PrimaryKey();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping#getIdentifier()
	 * @see #getPrimaryKeyMapping()
	 * @generated
	 */
	EReference getPrimaryKeyMapping_Identifier();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping <em>Foreign Key Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key Mapping</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ForeignKeyMapping
	 * @generated
	 */
	EClass getForeignKeyMapping();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Key</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getForeignKey()
	 * @see #getForeignKeyMapping()
	 * @generated
	 */
	EReference getForeignKeyMapping_ForeignKey();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getRelation()
	 * @see #getForeignKeyMapping()
	 * @generated
	 */
	EReference getForeignKeyMapping_Relation();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getForeignKeyElementMappings <em>Foreign Key Element Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Foreign Key Element Mappings</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ForeignKeyMapping#getForeignKeyElementMappings()
	 * @see #getForeignKeyMapping()
	 * @generated
	 */
	EReference getForeignKeyMapping_ForeignKeyElementMappings();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping <em>Foreign Key Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key Element Mapping</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping
	 * @generated
	 */
	EClass getForeignKeyElementMapping();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getForeignKeyElement <em>Foreign Key Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Key Element</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getForeignKeyElement()
	 * @see #getForeignKeyElementMapping()
	 * @generated
	 */
	EReference getForeignKeyElementMapping_ForeignKeyElement();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Join</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getJoin()
	 * @see #getForeignKeyElementMapping()
	 * @generated
	 */
	EReference getForeignKeyElementMapping_Join();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping#getRole()
	 * @see #getForeignKeyElementMapping()
	 * @generated
	 */
	EReference getForeignKeyElementMapping_Role();

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

		/**
		 * The meta object literal for the '<em><b>Column Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_MAPPING__COLUMN_MAPPINGS = eINSTANCE.getTableMapping_ColumnMappings();

		/**
		 * The meta object literal for the '<em><b>Primary Key Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_MAPPING__PRIMARY_KEY_MAPPINGS = eINSTANCE.getTableMapping_PrimaryKeyMappings();

		/**
		 * The meta object literal for the '<em><b>Foreign Key Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_MAPPING__FOREIGN_KEY_MAPPINGS = eINSTANCE.getTableMapping_ForeignKeyMappings();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dbermapping.impl.ColumnMappingImpl <em>Column Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.dbermapping.impl.ColumnMappingImpl
		 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getColumnMapping()
		 * @generated
		 */
		EClass COLUMN_MAPPING = eINSTANCE.getColumnMapping();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_MAPPING__COLUMN = eINSTANCE.getColumnMapping_Column();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_MAPPING__ATTRIBUTE = eINSTANCE.getColumnMapping_Attribute();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dbermapping.impl.PrimaryKeyMappingImpl <em>Primary Key Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.dbermapping.impl.PrimaryKeyMappingImpl
		 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getPrimaryKeyMapping()
		 * @generated
		 */
		EClass PRIMARY_KEY_MAPPING = eINSTANCE.getPrimaryKeyMapping();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY_MAPPING__PRIMARY_KEY = eINSTANCE.getPrimaryKeyMapping_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY_MAPPING__IDENTIFIER = eINSTANCE.getPrimaryKeyMapping_Identifier();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyMappingImpl <em>Foreign Key Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.dbermapping.impl.ForeignKeyMappingImpl
		 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getForeignKeyMapping()
		 * @generated
		 */
		EClass FOREIGN_KEY_MAPPING = eINSTANCE.getForeignKeyMapping();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_MAPPING__FOREIGN_KEY = eINSTANCE.getForeignKeyMapping_ForeignKey();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_MAPPING__RELATION = eINSTANCE.getForeignKeyMapping_Relation();

		/**
		 * The meta object literal for the '<em><b>Foreign Key Element Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_MAPPING__FOREIGN_KEY_ELEMENT_MAPPINGS = eINSTANCE.getForeignKeyMapping_ForeignKeyElementMappings();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyElementMappingImpl <em>Foreign Key Element Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.dbermapping.impl.ForeignKeyElementMappingImpl
		 * @see org.obeonetwork.dsl.dbermapping.impl.DbermappingPackageImpl#getForeignKeyElementMapping()
		 * @generated
		 */
		EClass FOREIGN_KEY_ELEMENT_MAPPING = eINSTANCE.getForeignKeyElementMapping();

		/**
		 * The meta object literal for the '<em><b>Foreign Key Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT = eINSTANCE.getForeignKeyElementMapping_ForeignKeyElement();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_ELEMENT_MAPPING__JOIN = eINSTANCE.getForeignKeyElementMapping_Join();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_ELEMENT_MAPPING__ROLE = eINSTANCE.getForeignKeyElementMapping_Role();

	}

} //DbermappingPackage
