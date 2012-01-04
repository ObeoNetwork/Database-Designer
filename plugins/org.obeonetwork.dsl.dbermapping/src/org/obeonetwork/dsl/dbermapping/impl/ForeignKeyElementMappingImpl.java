/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.dbermapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.obeonetwork.dsl.database.ForeignKeyElement;
import org.obeonetwork.dsl.dbermapping.DBERMappingPackage;
import org.obeonetwork.dsl.dbermapping.ForeignKeyElementMapping;
import org.obeonetwork.dsl.entityrelation.RelationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyElementMappingImpl#getForeignKeyElement <em>Foreign Key Element</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.dbermapping.impl.ForeignKeyElementMappingImpl#getRelationElement <em>Relation Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyElementMappingImpl extends EObjectImpl implements ForeignKeyElementMapping {
	/**
	 * The cached value of the '{@link #getForeignKeyElement() <em>Foreign Key Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyElement()
	 * @generated
	 * @ordered
	 */
	protected ForeignKeyElement foreignKeyElement;

	/**
	 * The cached value of the '{@link #getRelationElement() <em>Relation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationElement()
	 * @generated
	 * @ordered
	 */
	protected RelationElement relationElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyElementMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DBERMappingPackage.Literals.FOREIGN_KEY_ELEMENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyElement getForeignKeyElement() {
		if (foreignKeyElement != null && foreignKeyElement.eIsProxy()) {
			InternalEObject oldForeignKeyElement = (InternalEObject)foreignKeyElement;
			foreignKeyElement = (ForeignKeyElement)eResolveProxy(oldForeignKeyElement);
			if (foreignKeyElement != oldForeignKeyElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT, oldForeignKeyElement, foreignKeyElement));
			}
		}
		return foreignKeyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyElement basicGetForeignKeyElement() {
		return foreignKeyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyElement(ForeignKeyElement newForeignKeyElement) {
		ForeignKeyElement oldForeignKeyElement = foreignKeyElement;
		foreignKeyElement = newForeignKeyElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT, oldForeignKeyElement, foreignKeyElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationElement getRelationElement() {
		if (relationElement != null && relationElement.eIsProxy()) {
			InternalEObject oldRelationElement = (InternalEObject)relationElement;
			relationElement = (RelationElement)eResolveProxy(oldRelationElement);
			if (relationElement != oldRelationElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__RELATION_ELEMENT, oldRelationElement, relationElement));
			}
		}
		return relationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationElement basicGetRelationElement() {
		return relationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationElement(RelationElement newRelationElement) {
		RelationElement oldRelationElement = relationElement;
		relationElement = newRelationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__RELATION_ELEMENT, oldRelationElement, relationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT:
				if (resolve) return getForeignKeyElement();
				return basicGetForeignKeyElement();
			case DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__RELATION_ELEMENT:
				if (resolve) return getRelationElement();
				return basicGetRelationElement();
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
			case DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT:
				setForeignKeyElement((ForeignKeyElement)newValue);
				return;
			case DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__RELATION_ELEMENT:
				setRelationElement((RelationElement)newValue);
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
			case DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT:
				setForeignKeyElement((ForeignKeyElement)null);
				return;
			case DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__RELATION_ELEMENT:
				setRelationElement((RelationElement)null);
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
			case DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__FOREIGN_KEY_ELEMENT:
				return foreignKeyElement != null;
			case DBERMappingPackage.FOREIGN_KEY_ELEMENT_MAPPING__RELATION_ELEMENT:
				return relationElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyElementMappingImpl
