/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.Identifier;
import org.obeonetwork.dsl.entityrelation.JoinByIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join By Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.JoinByIdentifierImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.JoinByIdentifierImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinByIdentifierImpl extends JoinImpl implements JoinByIdentifier {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinByIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationPackage.Literals.JOIN_BY_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationPackage.JOIN_BY_IDENTIFIER__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.JOIN_BY_IDENTIFIER__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<Attribute>(Attribute.class, this, EntityRelationPackage.JOIN_BY_IDENTIFIER__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityRelationPackage.JOIN_BY_IDENTIFIER__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case EntityRelationPackage.JOIN_BY_IDENTIFIER__ATTRIBUTES:
				return getAttributes();
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
			case EntityRelationPackage.JOIN_BY_IDENTIFIER__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case EntityRelationPackage.JOIN_BY_IDENTIFIER__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case EntityRelationPackage.JOIN_BY_IDENTIFIER__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case EntityRelationPackage.JOIN_BY_IDENTIFIER__ATTRIBUTES:
				getAttributes().clear();
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
			case EntityRelationPackage.JOIN_BY_IDENTIFIER__IDENTIFIER:
				return identifier != null;
			case EntityRelationPackage.JOIN_BY_IDENTIFIER__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JoinByIdentifierImpl
