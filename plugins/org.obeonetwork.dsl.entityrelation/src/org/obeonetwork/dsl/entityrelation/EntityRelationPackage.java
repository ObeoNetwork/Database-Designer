/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.entityrelation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.obeonetwork.dsl.entityrelation.EntityRelationFactory
 * @model kind="package"
 * @generated
 */
public interface EntityRelationPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entityrelation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeonetwork.org/dsl/entityrelation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "entityrelation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityRelationPackage eINSTANCE = org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.impl.LogicalElementImpl <em>Logical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.impl.LogicalElementImpl
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getLogicalElement()
	 * @generated
	 */
	int LOGICAL_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__COMMENTS = 1;

	/**
	 * The number of structural features of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.impl.NamedElementImpl
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = LOGICAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__COMMENTS = LOGICAL_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = LOGICAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = LOGICAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.impl.LogicalModelImpl <em>Logical Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.impl.LogicalModelImpl
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getLogicalModel()
	 * @generated
	 */
	int LOGICAL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MODEL__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MODEL__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MODEL__ENTITIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MODEL__RELATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Logical Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityImpl
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IDENTIFIERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.impl.RelationImpl
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ROLES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Joins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__JOINS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.impl.AttributeImpl
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.impl.RoleImpl
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CARDINALITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dependant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DEPENDANT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.impl.IdentifierImpl
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__PRIMARY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.impl.JoinImpl
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 8;

	/**
	 * The feature id for the '<em><b>Identifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__IDENTIFIERS = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__COLUMNS = 1;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.entityrelation.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.entityrelation.Cardinality
	 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 9;


	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.entityrelation.LogicalModel <em>Logical Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Model</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.LogicalModel
	 * @generated
	 */
	EClass getLogicalModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.entityrelation.LogicalModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.LogicalModel#getEntities()
	 * @see #getLogicalModel()
	 * @generated
	 */
	EReference getLogicalModel_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.entityrelation.LogicalModel#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.LogicalModel#getRelations()
	 * @see #getLogicalModel()
	 * @generated
	 */
	EReference getLogicalModel_Relations();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.entityrelation.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.entityrelation.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.entityrelation.Entity#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifiers</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Entity#getIdentifiers()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Identifiers();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.entityrelation.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.entityrelation.Relation#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Relation#getRoles()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.entityrelation.Relation#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joins</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Relation#getJoins()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Joins();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.entityrelation.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.entityrelation.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.entityrelation.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.entityrelation.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.entityrelation.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.entityrelation.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Element</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.LogicalElement
	 * @generated
	 */
	EClass getLogicalElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.entityrelation.LogicalElement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.LogicalElement#getID()
	 * @see #getLogicalElement()
	 * @generated
	 */
	EAttribute getLogicalElement_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.entityrelation.LogicalElement#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.LogicalElement#getComments()
	 * @see #getLogicalElement()
	 * @generated
	 */
	EAttribute getLogicalElement_Comments();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.entityrelation.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.entityrelation.Role#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Role#getEntity()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Entity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.entityrelation.Role#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Role#getCardinality()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.entityrelation.Role#isDependant <em>Dependant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependant</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Role#isDependant()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Dependant();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.entityrelation.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.entityrelation.Identifier#isPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Identifier#isPrimary()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Primary();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.entityrelation.Identifier#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Identifier#getAttributes()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Attributes();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.entityrelation.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.entityrelation.Join#getIdentifiers <em>Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identifiers</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Join#getIdentifiers()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Identifiers();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.entityrelation.Join#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Join#getColumns()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Columns();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.entityrelation.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see org.obeonetwork.dsl.entityrelation.Cardinality
	 * @generated
	 */
	EEnum getCardinality();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntityRelationFactory getEntityRelationFactory();

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
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.impl.LogicalModelImpl <em>Logical Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.impl.LogicalModelImpl
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getLogicalModel()
		 * @generated
		 */
		EClass LOGICAL_MODEL = eINSTANCE.getLogicalModel();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_MODEL__ENTITIES = eINSTANCE.getLogicalModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_MODEL__RELATIONS = eINSTANCE.getLogicalModel_Relations();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityImpl
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Identifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__IDENTIFIERS = eINSTANCE.getEntity_Identifiers();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.impl.RelationImpl
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ROLES = eINSTANCE.getRelation_Roles();

		/**
		 * The meta object literal for the '<em><b>Joins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__JOINS = eINSTANCE.getRelation_Joins();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.impl.AttributeImpl
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.impl.NamedElementImpl
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.impl.LogicalElementImpl <em>Logical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.impl.LogicalElementImpl
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getLogicalElement()
		 * @generated
		 */
		EClass LOGICAL_ELEMENT = eINSTANCE.getLogicalElement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_ELEMENT__ID = eINSTANCE.getLogicalElement_ID();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_ELEMENT__COMMENTS = eINSTANCE.getLogicalElement_Comments();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.impl.RoleImpl
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ENTITY = eINSTANCE.getRole_Entity();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__CARDINALITY = eINSTANCE.getRole_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Dependant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DEPENDANT = eINSTANCE.getRole_Dependant();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.impl.IdentifierImpl
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__PRIMARY = eINSTANCE.getIdentifier_Primary();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__ATTRIBUTES = eINSTANCE.getIdentifier_Attributes();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.impl.JoinImpl
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Identifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__IDENTIFIERS = eINSTANCE.getJoin_Identifiers();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__COLUMNS = eINSTANCE.getJoin_Columns();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.entityrelation.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.entityrelation.Cardinality
		 * @see org.obeonetwork.dsl.entityrelation.impl.EntityRelationPackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

	}

} //EntityRelationPackage
