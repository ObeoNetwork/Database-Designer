/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.entityrelation;

import org.obeonetwork.dsl.typeslibrary.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Attribute#isRequired <em>Required</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.entityrelation.Attribute#getUseInIdentifier <em>Use In Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getAttribute_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Attribute#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Use In Identifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.entityrelation.Identifier#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use In Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use In Identifier</em>' reference.
	 * @see #setUseInIdentifier(Identifier)
	 * @see org.obeonetwork.dsl.entityrelation.EntityRelationPackage#getAttribute_UseInIdentifier()
	 * @see org.obeonetwork.dsl.entityrelation.Identifier#getAttributes
	 * @model opposite="attributes"
	 * @generated
	 */
	Identifier getUseInIdentifier();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.entityrelation.Attribute#getUseInIdentifier <em>Use In Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use In Identifier</em>' reference.
	 * @see #getUseInIdentifier()
	 * @generated
	 */
	void setUseInIdentifier(Identifier value);

} // Attribute
