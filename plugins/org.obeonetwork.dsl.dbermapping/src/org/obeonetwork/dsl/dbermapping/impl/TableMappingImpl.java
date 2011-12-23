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
import org.obeonetwork.dsl.database.Table;

import org.obeonetwork.dsl.dbermapping.ColumnMapping;
import org.obeonetwork.dsl.dbermapping.DbermappingPackage;
import org.obeonetwork.dsl.dbermapping.PrimaryKeyMapping;
import org.obeonetwork.dsl.dbermapping.ForeignKeyMapping;
import org.obeonetwork.dsl.dbermapping.TableMapping;

import org.obeonetwork.dsl.entityrelation.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.TableMappingImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.TableMappingImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.TableMappingImpl#getColumnMappings <em>Column Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.TableMappingImpl#getPrimaryKeyMappings <em>Primary Key Mappings</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.TableMappingImpl#getForeignKeyMappings <em>Foreign Key Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableMappingImpl extends EObjectImpl implements TableMapping {
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getColumnMappings() <em>Column Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnMapping> columnMappings;

	/**
	 * The cached value of the '{@link #getPrimaryKeyMappings() <em>Primary Key Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKeyMapping> primaryKeyMappings;

	/**
	 * The cached value of the '{@link #getForeignKeyMappings() <em>Foreign Key Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKeyMapping> foreignKeyMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbermappingPackage.Literals.TABLE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (Table)eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbermappingPackage.TABLE_MAPPING__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbermappingPackage.TABLE_MAPPING__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbermappingPackage.TABLE_MAPPING__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbermappingPackage.TABLE_MAPPING__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnMapping> getColumnMappings() {
		if (columnMappings == null) {
			columnMappings = new EObjectContainmentEList<ColumnMapping>(ColumnMapping.class, this, DbermappingPackage.TABLE_MAPPING__COLUMN_MAPPINGS);
		}
		return columnMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKeyMapping> getPrimaryKeyMappings() {
		if (primaryKeyMappings == null) {
			primaryKeyMappings = new EObjectContainmentEList<PrimaryKeyMapping>(PrimaryKeyMapping.class, this, DbermappingPackage.TABLE_MAPPING__PRIMARY_KEY_MAPPINGS);
		}
		return primaryKeyMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKeyMapping> getForeignKeyMappings() {
		if (foreignKeyMappings == null) {
			foreignKeyMappings = new EObjectContainmentEList<ForeignKeyMapping>(ForeignKeyMapping.class, this, DbermappingPackage.TABLE_MAPPING__FOREIGN_KEY_MAPPINGS);
		}
		return foreignKeyMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbermappingPackage.TABLE_MAPPING__COLUMN_MAPPINGS:
				return ((InternalEList<?>)getColumnMappings()).basicRemove(otherEnd, msgs);
			case DbermappingPackage.TABLE_MAPPING__PRIMARY_KEY_MAPPINGS:
				return ((InternalEList<?>)getPrimaryKeyMappings()).basicRemove(otherEnd, msgs);
			case DbermappingPackage.TABLE_MAPPING__FOREIGN_KEY_MAPPINGS:
				return ((InternalEList<?>)getForeignKeyMappings()).basicRemove(otherEnd, msgs);
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
			case DbermappingPackage.TABLE_MAPPING__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case DbermappingPackage.TABLE_MAPPING__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case DbermappingPackage.TABLE_MAPPING__COLUMN_MAPPINGS:
				return getColumnMappings();
			case DbermappingPackage.TABLE_MAPPING__PRIMARY_KEY_MAPPINGS:
				return getPrimaryKeyMappings();
			case DbermappingPackage.TABLE_MAPPING__FOREIGN_KEY_MAPPINGS:
				return getForeignKeyMappings();
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
			case DbermappingPackage.TABLE_MAPPING__TABLE:
				setTable((Table)newValue);
				return;
			case DbermappingPackage.TABLE_MAPPING__ENTITY:
				setEntity((Entity)newValue);
				return;
			case DbermappingPackage.TABLE_MAPPING__COLUMN_MAPPINGS:
				getColumnMappings().clear();
				getColumnMappings().addAll((Collection<? extends ColumnMapping>)newValue);
				return;
			case DbermappingPackage.TABLE_MAPPING__PRIMARY_KEY_MAPPINGS:
				getPrimaryKeyMappings().clear();
				getPrimaryKeyMappings().addAll((Collection<? extends PrimaryKeyMapping>)newValue);
				return;
			case DbermappingPackage.TABLE_MAPPING__FOREIGN_KEY_MAPPINGS:
				getForeignKeyMappings().clear();
				getForeignKeyMappings().addAll((Collection<? extends ForeignKeyMapping>)newValue);
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
			case DbermappingPackage.TABLE_MAPPING__TABLE:
				setTable((Table)null);
				return;
			case DbermappingPackage.TABLE_MAPPING__ENTITY:
				setEntity((Entity)null);
				return;
			case DbermappingPackage.TABLE_MAPPING__COLUMN_MAPPINGS:
				getColumnMappings().clear();
				return;
			case DbermappingPackage.TABLE_MAPPING__PRIMARY_KEY_MAPPINGS:
				getPrimaryKeyMappings().clear();
				return;
			case DbermappingPackage.TABLE_MAPPING__FOREIGN_KEY_MAPPINGS:
				getForeignKeyMappings().clear();
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
			case DbermappingPackage.TABLE_MAPPING__TABLE:
				return table != null;
			case DbermappingPackage.TABLE_MAPPING__ENTITY:
				return entity != null;
			case DbermappingPackage.TABLE_MAPPING__COLUMN_MAPPINGS:
				return columnMappings != null && !columnMappings.isEmpty();
			case DbermappingPackage.TABLE_MAPPING__PRIMARY_KEY_MAPPINGS:
				return primaryKeyMappings != null && !primaryKeyMappings.isEmpty();
			case DbermappingPackage.TABLE_MAPPING__FOREIGN_KEY_MAPPINGS:
				return foreignKeyMappings != null && !foreignKeyMappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableMappingImpl
