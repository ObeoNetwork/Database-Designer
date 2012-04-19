/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.entityrelation.Attribute;
import org.obeonetwork.dsl.entityrelation.Cardinality;
import org.obeonetwork.dsl.entityrelation.Entity;
import org.obeonetwork.dsl.entityrelation.EntityRelationFactory;
import org.obeonetwork.dsl.entityrelation.EntityRelationPackage;
import org.obeonetwork.dsl.entityrelation.Identifier;
import org.obeonetwork.dsl.entityrelation.Relation;
import org.obeonetwork.dsl.entityrelation.RelationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#isSourceIsComposite <em>Source Is Composite</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getTargetRole <em>Target Role</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#isTargetIsComposite <em>Target Is Composite</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends NamedElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Entity source;

	/**
	 * The default value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRole()
	 * @generated
	 * @ordered
	 */
	protected String sourceRole = SOURCE_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality SOURCE_CARDINALITY_EDEFAULT = Cardinality.ZERO_STAR;

	/**
	 * The cached value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality sourceCardinality = SOURCE_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSourceIsComposite() <em>Source Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceIsComposite() <em>Source Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceIsComposite = SOURCE_IS_COMPOSITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Entity target;

	/**
	 * The default value of the '{@link #getTargetRole() <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRole()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRole() <em>Target Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRole()
	 * @generated
	 * @ordered
	 */
	protected String targetRole = TARGET_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality TARGET_CARDINALITY_EDEFAULT = Cardinality.ZERO_ONE;

	/**
	 * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality targetCardinality = TARGET_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTargetIsComposite() <em>Target Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTargetIsComposite() <em>Target Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetIsComposite()
	 * @generated
	 * @ordered
	 */
	protected boolean targetIsComposite = TARGET_IS_COMPOSITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationElement> elements;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSource() {
		if (source != null && ((EObject)source).eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Entity)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationPackage.RELATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Entity newSource) {
		Entity oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRole() {
		return sourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRole(String newSourceRole) {
		String oldSourceRole = sourceRole;
		sourceRole = newSourceRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION__SOURCE_ROLE, oldSourceRole, sourceRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getSourceCardinality() {
		return sourceCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSourceCardinality(Cardinality newSourceCardinality) {
		Cardinality oldSourceCardinality = sourceCardinality;
		sourceCardinality = newSourceCardinality == null ? SOURCE_CARDINALITY_EDEFAULT : newSourceCardinality;
		if (sourceCardinality != oldSourceCardinality) {
			// Cardinality has changed
			if (oldSourceCardinality.isStarCardinality() == false && sourceCardinality.isStarCardinality() == true) {
				// Cardinality was 0.1 or 1..1 and now is 0..* or 1..*
				
				// Then the source can not be set as composite
				setSourceIsComposite(false);
				// And the other side can not be 0..* or 1..*
				if (targetCardinality == Cardinality.ZERO_STAR) {
					setTargetCardinality(Cardinality.ZERO_ONE);
				} else if (targetCardinality == Cardinality.ONE_STAR) {
					setTargetCardinality(Cardinality.ONE_ONE);
				}
			} else if (oldSourceCardinality.isStarCardinality() == true && sourceCardinality.isStarCardinality() == false) {
				// Cardinality was 0.* or 1..* and now is 0..1 or 1..1
				
				// Checks if the identifier is still consistent with the cardinality
				if (targetCardinality.isStarCardinality() == true) {
					// the previous identifier can not be used anymore
					setIdentifier(pickBestIdentifier(target));
				}
			}
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION__SOURCE_CARDINALITY, oldSourceCardinality, sourceCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceIsComposite() {
		return sourceIsComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSourceIsComposite(boolean newSourceIsComposite) {
		if (newSourceIsComposite == true && sourceCardinality != Cardinality.ONE_ONE && sourceCardinality != Cardinality.ZERO_ONE) {
			// Only roles with 1 as upper cardinality can be set as composite 
			return;
		}
		boolean oldSourceIsComposite = sourceIsComposite;
		sourceIsComposite = newSourceIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION__SOURCE_IS_COMPOSITE, oldSourceIsComposite, sourceIsComposite));
		if (sourceIsComposite == true && targetIsComposite == true) {
			// Only one role can be set as composite
			setTargetIsComposite(false);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTarget() {
		if (target != null && ((EObject)target).eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Entity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationPackage.RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Entity newTarget) {
		Entity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRole() {
		return targetRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRole(String newTargetRole) {
		String oldTargetRole = targetRole;
		targetRole = newTargetRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION__TARGET_ROLE, oldTargetRole, targetRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getTargetCardinality() {
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTargetCardinality(Cardinality newTargetCardinality) {
		Cardinality oldTargetCardinality = targetCardinality;
		targetCardinality = newTargetCardinality == null ? TARGET_CARDINALITY_EDEFAULT : newTargetCardinality;
		if (targetCardinality != oldTargetCardinality) {
			// Cardinality has changed
			if (oldTargetCardinality.isStarCardinality() == false && targetCardinality.isStarCardinality() == true) {
				// Cardinality was 0.1 or 1..1 and now is 0..* or 1..*
				
				// Then the target can not be set as composite
				setTargetIsComposite(false);
				// And the other side can not be 0..* or 1..*
				if (sourceCardinality == Cardinality.ZERO_STAR) {
					setSourceCardinality(Cardinality.ZERO_ONE);
				} else if (sourceCardinality == Cardinality.ONE_STAR) {
					setSourceCardinality(Cardinality.ONE_ONE);
				}
			} else if (oldTargetCardinality.isStarCardinality() == true && targetCardinality.isStarCardinality() == false) {
				// Cardinality was 0.* or 1..* and now is 0..1 or 1..1
				
				// Checks if the identifier is still consistent with the cardinality
				if (sourceCardinality.isStarCardinality() == true) {
					// the previous identifier can not be used anymore
					setIdentifier(pickBestIdentifier(source));
				}
			}
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetIsComposite() {
		return targetIsComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTargetIsComposite(boolean newTargetIsComposite) {
		if (newTargetIsComposite == true && targetCardinality != Cardinality.ONE_ONE && targetCardinality != Cardinality.ZERO_ONE) {
			// Only roles with 1 as upper cardinality can be set as composite 
			return;
		}
		boolean oldTargetIsComposite = targetIsComposite;
		targetIsComposite = newTargetIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION__TARGET_IS_COMPOSITE, oldTargetIsComposite, targetIsComposite));
		if (targetIsComposite == true && sourceIsComposite == true) {
			// Only one role can be set as composite
			setSourceIsComposite(false);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<RelationElement>(RelationElement.class, this, EntityRelationPackage.RELATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && ((EObject)identifier).eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationPackage.RELATION__IDENTIFIER, oldIdentifier, identifier));
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
	 * @generated NOT
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		
		// We may have to delete and recreate RelationElement instances
		if ((identifier == null && oldIdentifier != null)
				|| (identifier != null && oldIdentifier == null)
				|| (identifier.equals(oldIdentifier) == false)) {
			
			// Delete existing RelationElement instances
			Collection<RelationElement> relationsElements = new ArrayList<RelationElement>(getElements());
			for (RelationElement relationElement : relationsElements) {
				EcoreUtil.delete(relationElement);
			}
			
			// Create new RelationElement instances
			if (identifier != null) {
				if (getSource().equals(identifier.eContainer())) {
					// Identifier is attached to the source
					for (Attribute identifierAttribute : identifier.getAttributes()) {
						Attribute otherAttribute = getOrCreateCorrespondingAttribute(getTarget(), identifierAttribute);
						RelationElement relationElt = EntityRelationFactory.eINSTANCE.createRelationElement();
						relationElt.setSourceAttribute(identifierAttribute);
						relationElt.setTargetAttribute(otherAttribute);
						getElements().add(relationElt);
					}
				} else if (getTarget().equals(identifier.eContainer())) {
					// Identifier is attached to the target
					for (Attribute identifierAttribute : identifier.getAttributes()) {
						Attribute otherAttribute = getOrCreateCorrespondingAttribute(getSource(), identifierAttribute);
						RelationElement relationElt = EntityRelationFactory.eINSTANCE.createRelationElement();
						relationElt.setSourceAttribute(otherAttribute);
						relationElt.setTargetAttribute(identifierAttribute);
						getElements().add(relationElt);
					}
				}
			}
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationPackage.RELATION__IDENTIFIER, oldIdentifier, identifier));
	}
	
	/**
	 * @generated NOT
	 */
	private Attribute getOrCreateCorrespondingAttribute(Entity entity, Attribute reference) {
		if (reference.getName() != null) {
			for (Attribute attribute : entity.getAttributes()) {
				if (reference.getName().equalsIgnoreCase(attribute.getName())) {
					return attribute;
				}
			}
		}
		if (entity != null) {
			// No attribute found, we have to create a new one
			Attribute newAttribute = EntityRelationFactory.eINSTANCE.createAttribute();
			entity.getAttributes().add(newAttribute);
			newAttribute.setName(reference.getName());
			newAttribute.setType(EcoreUtil.copy(reference.getType()));
			return newAttribute;
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityRelationPackage.RELATION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case EntityRelationPackage.RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case EntityRelationPackage.RELATION__SOURCE_ROLE:
				return getSourceRole();
			case EntityRelationPackage.RELATION__SOURCE_CARDINALITY:
				return getSourceCardinality();
			case EntityRelationPackage.RELATION__SOURCE_IS_COMPOSITE:
				return isSourceIsComposite();
			case EntityRelationPackage.RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case EntityRelationPackage.RELATION__TARGET_ROLE:
				return getTargetRole();
			case EntityRelationPackage.RELATION__TARGET_CARDINALITY:
				return getTargetCardinality();
			case EntityRelationPackage.RELATION__TARGET_IS_COMPOSITE:
				return isTargetIsComposite();
			case EntityRelationPackage.RELATION__ELEMENTS:
				return getElements();
			case EntityRelationPackage.RELATION__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
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
			case EntityRelationPackage.RELATION__SOURCE:
				setSource((Entity)newValue);
				return;
			case EntityRelationPackage.RELATION__SOURCE_ROLE:
				setSourceRole((String)newValue);
				return;
			case EntityRelationPackage.RELATION__SOURCE_CARDINALITY:
				setSourceCardinality((Cardinality)newValue);
				return;
			case EntityRelationPackage.RELATION__SOURCE_IS_COMPOSITE:
				setSourceIsComposite((Boolean)newValue);
				return;
			case EntityRelationPackage.RELATION__TARGET:
				setTarget((Entity)newValue);
				return;
			case EntityRelationPackage.RELATION__TARGET_ROLE:
				setTargetRole((String)newValue);
				return;
			case EntityRelationPackage.RELATION__TARGET_CARDINALITY:
				setTargetCardinality((Cardinality)newValue);
				return;
			case EntityRelationPackage.RELATION__TARGET_IS_COMPOSITE:
				setTargetIsComposite((Boolean)newValue);
				return;
			case EntityRelationPackage.RELATION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends RelationElement>)newValue);
				return;
			case EntityRelationPackage.RELATION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
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
			case EntityRelationPackage.RELATION__SOURCE:
				setSource((Entity)null);
				return;
			case EntityRelationPackage.RELATION__SOURCE_ROLE:
				setSourceRole(SOURCE_ROLE_EDEFAULT);
				return;
			case EntityRelationPackage.RELATION__SOURCE_CARDINALITY:
				setSourceCardinality(SOURCE_CARDINALITY_EDEFAULT);
				return;
			case EntityRelationPackage.RELATION__SOURCE_IS_COMPOSITE:
				setSourceIsComposite(SOURCE_IS_COMPOSITE_EDEFAULT);
				return;
			case EntityRelationPackage.RELATION__TARGET:
				setTarget((Entity)null);
				return;
			case EntityRelationPackage.RELATION__TARGET_ROLE:
				setTargetRole(TARGET_ROLE_EDEFAULT);
				return;
			case EntityRelationPackage.RELATION__TARGET_CARDINALITY:
				setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
				return;
			case EntityRelationPackage.RELATION__TARGET_IS_COMPOSITE:
				setTargetIsComposite(TARGET_IS_COMPOSITE_EDEFAULT);
				return;
			case EntityRelationPackage.RELATION__ELEMENTS:
				getElements().clear();
				return;
			case EntityRelationPackage.RELATION__IDENTIFIER:
				setIdentifier((Identifier)null);
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
			case EntityRelationPackage.RELATION__SOURCE:
				return source != null;
			case EntityRelationPackage.RELATION__SOURCE_ROLE:
				return SOURCE_ROLE_EDEFAULT == null ? sourceRole != null : !SOURCE_ROLE_EDEFAULT.equals(sourceRole);
			case EntityRelationPackage.RELATION__SOURCE_CARDINALITY:
				return sourceCardinality != SOURCE_CARDINALITY_EDEFAULT;
			case EntityRelationPackage.RELATION__SOURCE_IS_COMPOSITE:
				return sourceIsComposite != SOURCE_IS_COMPOSITE_EDEFAULT;
			case EntityRelationPackage.RELATION__TARGET:
				return target != null;
			case EntityRelationPackage.RELATION__TARGET_ROLE:
				return TARGET_ROLE_EDEFAULT == null ? targetRole != null : !TARGET_ROLE_EDEFAULT.equals(targetRole);
			case EntityRelationPackage.RELATION__TARGET_CARDINALITY:
				return targetCardinality != TARGET_CARDINALITY_EDEFAULT;
			case EntityRelationPackage.RELATION__TARGET_IS_COMPOSITE:
				return targetIsComposite != TARGET_IS_COMPOSITE_EDEFAULT;
			case EntityRelationPackage.RELATION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case EntityRelationPackage.RELATION__IDENTIFIER:
				return identifier != null;
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
		result.append(" (sourceRole: ");
		result.append(sourceRole);
		result.append(", sourceCardinality: ");
		result.append(sourceCardinality);
		result.append(", sourceIsComposite: ");
		result.append(sourceIsComposite);
		result.append(", targetRole: ");
		result.append(targetRole);
		result.append(", targetCardinality: ");
		result.append(targetCardinality);
		result.append(", targetIsComposite: ");
		result.append(targetIsComposite);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * @generated NOT
	 */
	private Identifier pickBestIdentifier(Entity entity) {
		if (entity != null) {
			if (entity.getPrimaryIdentifier() != null) {
				return entity.getPrimaryIdentifier();
			}
			if (entity.getIdentifiers().isEmpty() == false) {
				return entity.getIdentifiers().get(0); 
			}
		}
		return null;
	}

} //RelationImpl
