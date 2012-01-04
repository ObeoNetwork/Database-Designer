/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Role#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Role#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Role#isDependant <em>Dependant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRole_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Role#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.obeonetwork.dsl.entityrelation.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.obeonetwork.dsl.entityrelation.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRole_Cardinality()
	 * @model
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Role#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.obeonetwork.dsl.entityrelation.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Dependant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependant</em>' attribute.
	 * @see #setDependant(boolean)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getRole_Dependant()
	 * @model
	 * @generated
	 */
	boolean isDependant();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Role#isDependant <em>Dependant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependant</em>' attribute.
	 * @see #isDependant()
	 * @generated
	 */
	void setDependant(boolean value);

} // Role
