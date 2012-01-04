/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.database.DataBase;
import org.obeonetwork.dsl.dbermapping.DBERMappingPackage;
import org.obeonetwork.dsl.dbermapping.DatabaseMapping;
import org.obeonetwork.dsl.dbermapping.TableMapping;
import org.obeonetwork.dsl.entityrelation.LogicalModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.DatabaseMappingImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.DatabaseMappingImpl#getLogicalModel <em>Logical Model</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.DatabaseMappingImpl#getTableMappings <em>Table Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseMappingImpl extends EObjectImpl implements DatabaseMapping {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DataBase database;

	/**
	 * The cached value of the '{@link #getLogicalModel() <em>Logical Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalModel()
	 * @generated
	 * @ordered
	 */
	protected LogicalModel logicalModel;

	/**
	 * The cached value of the '{@link #getTableMappings() <em>Table Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<TableMapping> tableMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DBERMappingPackage.Literals.DATABASE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (DataBase)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DBERMappingPackage.DATABASE_MAPPING__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBase basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DataBase newDatabase) {
		DataBase oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBERMappingPackage.DATABASE_MAPPING__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalModel getLogicalModel() {
		if (logicalModel != null && logicalModel.eIsProxy()) {
			InternalEObject oldLogicalModel = (InternalEObject)logicalModel;
			logicalModel = (LogicalModel)eResolveProxy(oldLogicalModel);
			if (logicalModel != oldLogicalModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DBERMappingPackage.DATABASE_MAPPING__LOGICAL_MODEL, oldLogicalModel, logicalModel));
			}
		}
		return logicalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalModel basicGetLogicalModel() {
		return logicalModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalModel(LogicalModel newLogicalModel) {
		LogicalModel oldLogicalModel = logicalModel;
		logicalModel = newLogicalModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBERMappingPackage.DATABASE_MAPPING__LOGICAL_MODEL, oldLogicalModel, logicalModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableMapping> getTableMappings() {
		if (tableMappings == null) {
			tableMappings = new EObjectContainmentEList<TableMapping>(TableMapping.class, this, DBERMappingPackage.DATABASE_MAPPING__TABLE_MAPPINGS);
		}
		return tableMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DBERMappingPackage.DATABASE_MAPPING__TABLE_MAPPINGS:
				return ((InternalEList<?>)getTableMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DBERMappingPackage.DATABASE_MAPPING__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case DBERMappingPackage.DATABASE_MAPPING__LOGICAL_MODEL:
				if (resolve) return getLogicalModel();
				return basicGetLogicalModel();
			case DBERMappingPackage.DATABASE_MAPPING__TABLE_MAPPINGS:
				return getTableMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DBERMappingPackage.DATABASE_MAPPING__DATABASE:
				setDatabase((DataBase)newValue);
				return;
			case DBERMappingPackage.DATABASE_MAPPING__LOGICAL_MODEL:
				setLogicalModel((LogicalModel)newValue);
				return;
			case DBERMappingPackage.DATABASE_MAPPING__TABLE_MAPPINGS:
				getTableMappings().clear();
				getTableMappings().addAll((Collection<? extends TableMapping>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DBERMappingPackage.DATABASE_MAPPING__DATABASE:
				setDatabase((DataBase)null);
				return;
			case DBERMappingPackage.DATABASE_MAPPING__LOGICAL_MODEL:
				setLogicalModel((LogicalModel)null);
				return;
			case DBERMappingPackage.DATABASE_MAPPING__TABLE_MAPPINGS:
				getTableMappings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DBERMappingPackage.DATABASE_MAPPING__DATABASE:
				return database != null;
			case DBERMappingPackage.DATABASE_MAPPING__LOGICAL_MODEL:
				return logicalModel != null;
			case DBERMappingPackage.DATABASE_MAPPING__TABLE_MAPPINGS:
				return tableMappings != null && !tableMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseMappingImpl
