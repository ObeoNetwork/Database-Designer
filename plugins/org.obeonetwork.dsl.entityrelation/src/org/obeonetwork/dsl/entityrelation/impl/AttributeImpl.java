/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.Identifier;
import org.obeonetwork.dsl.typeslibrary.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl#getUseInIdentifier <em>Use In Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends NamedElementImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUseInIdentifier() <em>Use In Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseInIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier useInIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationPackage.ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.ATTRIBUTE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getUseInIdentifier() {
		if (useInIdentifier != null && useInIdentifier.eIsProxy()) {
			InternalEObject oldUseInIdentifier = (InternalEObject)useInIdentifier;
			useInIdentifier = (Identifier)eResolveProxy(oldUseInIdentifier);
			if (useInIdentifier != oldUseInIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationPackage.ATTRIBUTE__USE_IN_IDENTIFIER, oldUseInIdentifier, useInIdentifier));
			}
		}
		return useInIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetUseInIdentifier() {
		return useInIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseInIdentifier(Identifier newUseInIdentifier, NotificationChain msgs) {
		Identifier oldUseInIdentifier = useInIdentifier;
		useInIdentifier = newUseInIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityRelationPackage.ATTRIBUTE__USE_IN_IDENTIFIER, oldUseInIdentifier, newUseInIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseInIdentifier(Identifier newUseInIdentifier) {
		if (newUseInIdentifier != useInIdentifier) {
			NotificationChain msgs = null;
			if (useInIdentifier != null)
				msgs = ((InternalEObject)useInIdentifier).eInverseRemove(this, EntityRelationPackage.IDENTIFIER__ATTRIBUTES, Identifier.class, msgs);
			if (newUseInIdentifier != null)
				msgs = ((InternalEObject)newUseInIdentifier).eInverseAdd(this, EntityRelationPackage.IDENTIFIER__ATTRIBUTES, Identifier.class, msgs);
			msgs = basicSetUseInIdentifier(newUseInIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.ATTRIBUTE__USE_IN_IDENTIFIER, newUseInIdentifier, newUseInIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityRelationPackage.ATTRIBUTE__USE_IN_IDENTIFIER:
				if (useInIdentifier != null)
					msgs = ((InternalEObject)useInIdentifier).eInverseRemove(this, EntityRelationPackage.IDENTIFIER__ATTRIBUTES, Identifier.class, msgs);
				return basicSetUseInIdentifier((Identifier)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityRelationPackage.ATTRIBUTE__USE_IN_IDENTIFIER:
				return basicSetUseInIdentifier(null, msgs);
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
			case EntityRelationPackage.ATTRIBUTE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case EntityRelationPackage.ATTRIBUTE__REQUIRED:
				return isRequired();
			case EntityRelationPackage.ATTRIBUTE__USE_IN_IDENTIFIER:
				if (resolve) return getUseInIdentifier();
				return basicGetUseInIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityRelationPackage.ATTRIBUTE__TYPE:
				setType((Type)newValue);
				return;
			case EntityRelationPackage.ATTRIBUTE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case EntityRelationPackage.ATTRIBUTE__USE_IN_IDENTIFIER:
				setUseInIdentifier((Identifier)newValue);
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
			case EntityRelationPackage.ATTRIBUTE__TYPE:
				setType((Type)null);
				return;
			case EntityRelationPackage.ATTRIBUTE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case EntityRelationPackage.ATTRIBUTE__USE_IN_IDENTIFIER:
				setUseInIdentifier((Identifier)null);
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
			case EntityRelationPackage.ATTRIBUTE__TYPE:
				return type != null;
			case EntityRelationPackage.ATTRIBUTE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case EntityRelationPackage.ATTRIBUTE__USE_IN_IDENTIFIER:
				return useInIdentifier != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
