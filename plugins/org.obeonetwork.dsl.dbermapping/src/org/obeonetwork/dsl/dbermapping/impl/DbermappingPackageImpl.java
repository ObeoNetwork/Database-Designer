/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.obeonetwork.dsl.database.DatabasePackage;

import org.obeonetwork.dsl.dbermapping.ColumnMapping;
import org.obeonetwork.dsl.dbermapping.DatabaseMapping;
import org.obeonetwork.dsl.dbermapping.DbermappingFactory;
import org.obeonetwork.dsl.dbermapping.DbermappingPackage;
import org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping;
import org.obeonetwork.dsl.dbermapping.ForeignKeyMapping;
import org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping;
import org.obeonetwork.dsl.dbermapping.TableMapping;

import org.obeonetwork.dsl.entityrelation.EntityrelationPackage;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DbermappingPackageImpl extends EPackageImpl implements DbermappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyElementMappingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.obeonetwork.dsl.dbermapping.DbermappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DbermappingPackageImpl() {
		super(eNS_URI, DbermappingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DbermappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DbermappingPackage init() {
		if (isInited) return (DbermappingPackage)EPackage.Registry.INSTANCE.getEPackage(DbermappingPackage.eNS_URI);

		// Obtain or create and register package
		DbermappingPackageImpl theDbermappingPackage = (DbermappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DbermappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DbermappingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DatabasePackage.eINSTANCE.eClass();
		EntityrelationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDbermappingPackage.createPackageContents();

		// Initialize created meta-data
		theDbermappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDbermappingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DbermappingPackage.eNS_URI, theDbermappingPackage);
		return theDbermappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseMapping() {
		return databaseMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseMapping_Database() {
		return (EReference)databaseMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseMapping_LogicalModel() {
		return (EReference)databaseMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseMapping_TableMappings() {
		return (EReference)databaseMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableMapping() {
		return tableMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableMapping_Table() {
		return (EReference)tableMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableMapping_Entity() {
		return (EReference)tableMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableMapping_ColumnMappings() {
		return (EReference)tableMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableMapping_PrimaryKeyMappings() {
		return (EReference)tableMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableMapping_ForeignKeyMappings() {
		return (EReference)tableMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnMapping() {
		return columnMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnMapping_Column() {
		return (EReference)columnMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnMapping_Attribute() {
		return (EReference)columnMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryKeyMapping() {
		return primaryKeyMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryKeyMapping_PrimaryKey() {
		return (EReference)primaryKeyMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryKeyMapping_Identifier() {
		return (EReference)primaryKeyMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeignKeyMapping() {
		return foreignKeyMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyMapping_ForeignKey() {
		return (EReference)foreignKeyMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyMapping_Relation() {
		return (EReference)foreignKeyMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyMapping_ForeignKeyElementMappings() {
		return (EReference)foreignKeyMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeignKeyElementMapping() {
		return foreignKeyElementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyElementMapping_ForeignKeyElement() {
		return (EReference)foreignKeyElementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyElementMapping_Join() {
		return (EReference)foreignKeyElementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyElementMapping_Role() {
		return (EReference)foreignKeyElementMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbermappingFactory getDbermappingFactory() {
		return (DbermappingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		databaseMappingEClass = createEClass(DATABASE_MAPPING);
		createEReference(databaseMappingEClass, DATABASE_MAPPING__DATABASE);
		createEReference(databaseMappingEClass, DATABASE_MAPPING__LOGICAL_MODEL);
		createEReference(databaseMappingEClass, DATABASE_MAPPING__TABLE_MAPPINGS);

		tableMappingEClass = createEClass(TABLE_MAPPING);
		createEReference(tableMappingEClass, TABLE_MAPPING__TABLE);
		createEReference(tableMappingEClass, TABLE_MAPPING__ENTITY);
		createEReference(tableMappingEClass, TABLE_MAPPING__COLUMN_MAPPINGS);
		createEReference(tableMappingEClass, TABLE_MAPPING__PRIMARY_KEY_MAPPINGS);
		createEReference(tableMappingEClass, TABLE_MAPPING__FOREIGN_KEY_MAPPINGS);

		columnMappingEClass = createEClass(COLUMN_MAPPING);
		createEReference(columnMappingEClass, COLUMN_MAPPING__COLUMN);
		createEReference(columnMappingEClass, COLUMN_MAPPING__ATTRIBUTE);

		primaryKeyMappingEClass = createEClass(PRIMARY_KEY_MAPPING);
		createEReference(primaryKeyMappingEClass, PRIMARY_KEY_MAPPING__PRIMARY_KEY);
		createEReference(primaryKeyMappingEClass, PRIMARY_KEY_MAPPING__IDENTIFIER);

		foreignKeyMappingEClass = createEClass(FOREIGN_KEY_MAPPING);
		createEReference(foreignKeyMappingEClass, FOREIGN_KEY_MAPPING__FOREIGN_KEY);
		createEReference(foreignKeyMappingEClass, FOREIGN_KEY_MAPPING__RELATION);
		createEReference(foreignKeyMappingEClass, FOREIGN_KEY_MAPPING__FOREIGN_KEY_ELEMENT_MAPPINGS);

		foreignKeyElementMappingEClass = createEClass(FOREIGN_KEY_ELEMENT_MAPPING);
		createEReference(foreignKeyElementMappingEClass, FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT);
		createEReference(foreignKeyElementMappingEClass, FOREIGN_KEY_ELEMENT_MAPPING__JOIN);
		createEReference(foreignKeyElementMappingEClass, FOREIGN_KEY_ELEMENT_MAPPING__ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DatabasePackage theDatabasePackage = (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		EntityrelationPackage theEntityrelationPackage = (EntityrelationPackage)EPackage.Registry.INSTANCE.getEPackage(EntityrelationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(databaseMappingEClass, DatabaseMapping.class, "DatabaseMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseMapping_Database(), theDatabasePackage.getDataBase(), null, "database", null, 1, 1, DatabaseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseMapping_LogicalModel(), theEntityrelationPackage.getLogicalModel(), null, "logicalModel", null, 1, 1, DatabaseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseMapping_TableMappings(), this.getTableMapping(), null, "tableMappings", null, 0, -1, DatabaseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableMappingEClass, TableMapping.class, "TableMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableMapping_Table(), theDatabasePackage.getTable(), null, "table", null, 1, 1, TableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableMapping_Entity(), theEntityrelationPackage.getEntity(), null, "entity", null, 1, 1, TableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableMapping_ColumnMappings(), this.getColumnMapping(), null, "columnMappings", null, 0, -1, TableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableMapping_PrimaryKeyMappings(), this.getPrimaryKeyMapping(), null, "primaryKeyMappings", null, 0, -1, TableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableMapping_ForeignKeyMappings(), this.getForeignKeyMapping(), null, "foreignKeyMappings", null, 0, -1, TableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnMappingEClass, ColumnMapping.class, "ColumnMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnMapping_Column(), theDatabasePackage.getColumn(), null, "column", null, 1, 1, ColumnMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnMapping_Attribute(), theEntityrelationPackage.getAttribute(), null, "attribute", null, 1, 1, ColumnMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyMappingEClass, PrimaryKeyMapping.class, "PrimaryKeyMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimaryKeyMapping_PrimaryKey(), theDatabasePackage.getPrimaryKey(), null, "primaryKey", null, 1, 1, PrimaryKeyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimaryKeyMapping_Identifier(), theEntityrelationPackage.getIdentifier(), null, "identifier", null, 1, 1, PrimaryKeyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreignKeyMappingEClass, ForeignKeyMapping.class, "ForeignKeyMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeignKeyMapping_ForeignKey(), theDatabasePackage.getForeignKey(), null, "foreignKey", null, 1, 1, ForeignKeyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKeyMapping_Relation(), theEntityrelationPackage.getRelation(), null, "relation", null, 1, 1, ForeignKeyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKeyMapping_ForeignKeyElementMappings(), this.getForeignKeyElementMapping(), null, "foreignKeyElementMappings", null, 0, -1, ForeignKeyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreignKeyElementMappingEClass, ForeignKeyElementMapping.class, "ForeignKeyElementMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeignKeyElementMapping_ForeignKeyElement(), theDatabasePackage.getForeignKeyElement(), null, "foreignKeyElement", null, 1, 1, ForeignKeyElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKeyElementMapping_Join(), theEntityrelationPackage.getJoin(), null, "join", null, 1, 1, ForeignKeyElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKeyElementMapping_Role(), theEntityrelationPackage.getRole(), null, "role", null, 1, 1, ForeignKeyElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DbermappingPackageImpl
