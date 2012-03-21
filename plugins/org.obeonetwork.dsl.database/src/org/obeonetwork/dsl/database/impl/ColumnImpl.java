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
package org.obeonetwork.dsl.database.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.obeonetwork.dsl.database.AbstractTable;
import org.obeonetwork.dsl.database.Column;
import org.obeonetwork.dsl.database.DatabaseFactory;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.ForeignKey;
import org.obeonetwork.dsl.database.ForeignKeyElement;
import org.obeonetwork.dsl.database.Index;
import org.obeonetwork.dsl.database.IndexElement;
import org.obeonetwork.dsl.database.PrimaryKey;
import org.obeonetwork.dsl.database.Sequence;
import org.obeonetwork.dsl.database.Table;
import org.obeonetwork.dsl.typeslibrary.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#getIndexElements <em>Index Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#getForeignKeyElements <em>Foreign Key Elements</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#isAutoincrement <em>Autoincrement</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#isInPrimaryKey <em>In Primary Key</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#isInForeignKey <em>In Foreign Key</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.database.impl.ColumnImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends NamedElementImpl implements Column {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndexElements() <em>Index Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexElement> indexElements;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey primaryKey;

	/**
	 * The cached value of the '{@link #getForeignKeyElements() <em>Foreign Key Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKeyElement> foreignKeyElements;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence sequence;

	/**
	 * The default value of the '{@link #isAutoincrement() <em>Autoincrement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoincrement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOINCREMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoincrement() <em>Autoincrement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoincrement()
	 * @generated
	 * @ordered
	 */
	protected boolean autoincrement = AUTOINCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInPrimaryKey() <em>In Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_PRIMARY_KEY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isInForeignKey() <em>In Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_FOREIGN_KEY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.COLUMN__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.COLUMN__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Index> getIndexes() {
		List<Index> indexes = new ArrayList<Index>();
		for (IndexElement indexElement : getIndexElements()) {
			if (!indexes.contains(indexElement.eContainer())) {
				indexes.add((Index)indexElement.eContainer());
			}
		}
		return new EcoreEList.UnmodifiableEList<Index>(this,
															DatabasePackage.Literals.COLUMN__INDEXES,
															indexes.size(),
															indexes.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexElement> getIndexElements() {
		if (indexElements == null) {
			indexElements = new EObjectWithInverseResolvingEList<IndexElement>(IndexElement.class, this, DatabasePackage.COLUMN__INDEX_ELEMENTS, DatabasePackage.INDEX_ELEMENT__COLUMN);
		}
		return indexElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getPrimaryKey() {
		if (primaryKey != null && primaryKey.eIsProxy()) {
			InternalEObject oldPrimaryKey = (InternalEObject)primaryKey;
			primaryKey = (PrimaryKey)eResolveProxy(oldPrimaryKey);
			if (primaryKey != oldPrimaryKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.COLUMN__PRIMARY_KEY, oldPrimaryKey, primaryKey));
			}
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.COLUMN__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		if (newPrimaryKey != primaryKey) {
			NotificationChain msgs = null;
			if (primaryKey != null)
				msgs = ((InternalEObject)primaryKey).eInverseRemove(this, DatabasePackage.PRIMARY_KEY__COLUMNS, PrimaryKey.class, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, DatabasePackage.PRIMARY_KEY__COLUMNS, PrimaryKey.class, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.COLUMN__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ForeignKey> getForeignKeys() {
		List<ForeignKey> foreignKeys = new ArrayList<ForeignKey>();
		for (ForeignKeyElement fkElement : getForeignKeyElements()) {
			if (!foreignKeys.contains(fkElement.eContainer())) {
				foreignKeys.add((ForeignKey)fkElement.eContainer());
			}
		}
		return new EcoreEList.UnmodifiableEList<ForeignKey>(this,
															DatabasePackage.Literals.COLUMN__FOREIGN_KEYS,
															foreignKeys.size(),
															foreignKeys.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKeyElement> getForeignKeyElements() {
		if (foreignKeyElements == null) {
			foreignKeyElements = new EObjectWithInverseResolvingEList<ForeignKeyElement>(ForeignKeyElement.class, this, DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS, DatabasePackage.FOREIGN_KEY_ELEMENT__FK_COLUMN);
		}
		return foreignKeyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabasePackage.COLUMN__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.COLUMN__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabasePackage.COLUMN__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.COLUMN__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (Sequence)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.COLUMN__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Sequence newSequence) {
		Sequence oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.COLUMN__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTable getOwner() {
		if (eContainerFeatureID() != DatabasePackage.COLUMN__OWNER) return null;
		return (AbstractTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(AbstractTable newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, DatabasePackage.COLUMN__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(AbstractTable newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != DatabasePackage.COLUMN__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, DatabasePackage.ABSTRACT_TABLE__COLUMNS, AbstractTable.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.COLUMN__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoincrement() {
		return autoincrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoincrement(boolean newAutoincrement) {
		boolean oldAutoincrement = autoincrement;
		autoincrement = newAutoincrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.COLUMN__AUTOINCREMENT, oldAutoincrement, autoincrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInPrimaryKey() {
		return (getPrimaryKey() != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInForeignKey() {
		return !(getForeignKeys().isEmpty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isUnique() {
		// We have to check if the column is contained within a unique index
		for (Index index : getIndexes()) {
			if (index.isUnique()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addToPrimaryKey() {
		// Do nothing if the column is already a PK column or if it does not belong to a table
		if (isInPrimaryKey() == false
				&& getOwner() != null
				&& getOwner() instanceof Table) {
			Table table = (Table)getOwner();
			// First, ensure there is a Primary Key defined on this table
			PrimaryKey pk = table.getPrimaryKey();
			if (pk == null) {
				// Create a new PK
				pk = DatabaseFactory.eINSTANCE.createPrimaryKey();
				pk.setName(table.getName() + "_PK");
				table.setPrimaryKey(pk);
			}
			
			// Then attach the column to the primary key
			pk.getColumns().add(this);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFromPrimaryKey() {
		if (isInPrimaryKey() == true) {
			getPrimaryKey().getColumns().remove(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addToUniqueIndex() {
		if (isUnique() == false
				&& getOwner() != null
				&& getOwner() instanceof Table) {
			Table table = (Table)getOwner();
			// Check if there is a unique index defined on the table
			Index uniqueIndex = null;
			for(Index index : table.getIndexes()) {
				if (index.isUnique()) {
					uniqueIndex = index;
					break;
				}
			}
			if (uniqueIndex == null) {
				// Create a new unique index
				uniqueIndex = DatabaseFactory.eINSTANCE.createIndex();
				uniqueIndex.setName(table.getName() + "_UNIQUE_INDEX");
				uniqueIndex.setUnique(true);
				table.getIndexes().add(uniqueIndex);
			}
			// We are sure we have a unique index here
			IndexElement indexElt = DatabaseFactory.eINSTANCE.createIndexElement();
			uniqueIndex.getElements().add(indexElt);
			indexElt.setAsc(true);
			indexElt.setColumn(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeFromUniqueIndex() {
		Collection<IndexElement> indexElements = new ArrayList<IndexElement>(getIndexElements());
		for (IndexElement indexElt : indexElements) {
			// Check if the associated index is unique
			if (indexElt.eContainer() instanceof Index) {
				Index index = (Index)indexElt.eContainer();
				if (index.isUnique()) {
					EcoreUtil.delete(indexElt, true);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.COLUMN__INDEX_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndexElements()).basicAdd(otherEnd, msgs);
			case DatabasePackage.COLUMN__PRIMARY_KEY:
				if (primaryKey != null)
					msgs = ((InternalEObject)primaryKey).eInverseRemove(this, DatabasePackage.PRIMARY_KEY__COLUMNS, PrimaryKey.class, msgs);
				return basicSetPrimaryKey((PrimaryKey)otherEnd, msgs);
			case DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeyElements()).basicAdd(otherEnd, msgs);
			case DatabasePackage.COLUMN__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((AbstractTable)otherEnd, msgs);
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
			case DatabasePackage.COLUMN__INDEX_ELEMENTS:
				return ((InternalEList<?>)getIndexElements()).basicRemove(otherEnd, msgs);
			case DatabasePackage.COLUMN__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
			case DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS:
				return ((InternalEList<?>)getForeignKeyElements()).basicRemove(otherEnd, msgs);
			case DatabasePackage.COLUMN__TYPE:
				return basicSetType(null, msgs);
			case DatabasePackage.COLUMN__OWNER:
				return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DatabasePackage.COLUMN__OWNER:
				return eInternalContainer().eInverseRemove(this, DatabasePackage.ABSTRACT_TABLE__COLUMNS, AbstractTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabasePackage.COLUMN__NULLABLE:
				return isNullable();
			case DatabasePackage.COLUMN__DEFAULT_VALUE:
				return getDefaultValue();
			case DatabasePackage.COLUMN__INDEXES:
				return getIndexes();
			case DatabasePackage.COLUMN__INDEX_ELEMENTS:
				return getIndexElements();
			case DatabasePackage.COLUMN__PRIMARY_KEY:
				if (resolve) return getPrimaryKey();
				return basicGetPrimaryKey();
			case DatabasePackage.COLUMN__FOREIGN_KEYS:
				return getForeignKeys();
			case DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS:
				return getForeignKeyElements();
			case DatabasePackage.COLUMN__TYPE:
				return getType();
			case DatabasePackage.COLUMN__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case DatabasePackage.COLUMN__OWNER:
				return getOwner();
			case DatabasePackage.COLUMN__AUTOINCREMENT:
				return isAutoincrement();
			case DatabasePackage.COLUMN__IN_PRIMARY_KEY:
				return isInPrimaryKey();
			case DatabasePackage.COLUMN__IN_FOREIGN_KEY:
				return isInForeignKey();
			case DatabasePackage.COLUMN__UNIQUE:
				return isUnique();
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
			case DatabasePackage.COLUMN__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case DatabasePackage.COLUMN__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case DatabasePackage.COLUMN__INDEX_ELEMENTS:
				getIndexElements().clear();
				getIndexElements().addAll((Collection<? extends IndexElement>)newValue);
				return;
			case DatabasePackage.COLUMN__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
				return;
			case DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS:
				getForeignKeyElements().clear();
				getForeignKeyElements().addAll((Collection<? extends ForeignKeyElement>)newValue);
				return;
			case DatabasePackage.COLUMN__TYPE:
				setType((Type)newValue);
				return;
			case DatabasePackage.COLUMN__SEQUENCE:
				setSequence((Sequence)newValue);
				return;
			case DatabasePackage.COLUMN__OWNER:
				setOwner((AbstractTable)newValue);
				return;
			case DatabasePackage.COLUMN__AUTOINCREMENT:
				setAutoincrement((Boolean)newValue);
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
			case DatabasePackage.COLUMN__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case DatabasePackage.COLUMN__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case DatabasePackage.COLUMN__INDEX_ELEMENTS:
				getIndexElements().clear();
				return;
			case DatabasePackage.COLUMN__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
				return;
			case DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS:
				getForeignKeyElements().clear();
				return;
			case DatabasePackage.COLUMN__TYPE:
				setType((Type)null);
				return;
			case DatabasePackage.COLUMN__SEQUENCE:
				setSequence((Sequence)null);
				return;
			case DatabasePackage.COLUMN__OWNER:
				setOwner((AbstractTable)null);
				return;
			case DatabasePackage.COLUMN__AUTOINCREMENT:
				setAutoincrement(AUTOINCREMENT_EDEFAULT);
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
			case DatabasePackage.COLUMN__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case DatabasePackage.COLUMN__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case DatabasePackage.COLUMN__INDEXES:
				return !getIndexes().isEmpty();
			case DatabasePackage.COLUMN__INDEX_ELEMENTS:
				return indexElements != null && !indexElements.isEmpty();
			case DatabasePackage.COLUMN__PRIMARY_KEY:
				return primaryKey != null;
			case DatabasePackage.COLUMN__FOREIGN_KEYS:
				return !getForeignKeys().isEmpty();
			case DatabasePackage.COLUMN__FOREIGN_KEY_ELEMENTS:
				return foreignKeyElements != null && !foreignKeyElements.isEmpty();
			case DatabasePackage.COLUMN__TYPE:
				return type != null;
			case DatabasePackage.COLUMN__SEQUENCE:
				return sequence != null;
			case DatabasePackage.COLUMN__OWNER:
				return getOwner() != null;
			case DatabasePackage.COLUMN__AUTOINCREMENT:
				return autoincrement != AUTOINCREMENT_EDEFAULT;
			case DatabasePackage.COLUMN__IN_PRIMARY_KEY:
				return isInPrimaryKey() != IN_PRIMARY_KEY_EDEFAULT;
			case DatabasePackage.COLUMN__IN_FOREIGN_KEY:
				return isInForeignKey() != IN_FOREIGN_KEY_EDEFAULT;
			case DatabasePackage.COLUMN__UNIQUE:
				return isUnique() != UNIQUE_EDEFAULT;
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
		result.append(" (nullable: ");
		result.append(nullable);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", autoincrement: ");
		result.append(autoincrement);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
