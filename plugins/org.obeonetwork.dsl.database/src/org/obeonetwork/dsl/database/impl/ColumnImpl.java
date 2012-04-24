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
import org.eclipse.emf.ecore.EObject;
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
		return (Boolean)eGet(DatabasePackage.Literals.COLUMN__NULLABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		eSet(DatabasePackage.Literals.COLUMN__NULLABLE, newNullable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return (String)eGet(DatabasePackage.Literals.COLUMN__DEFAULT_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		eSet(DatabasePackage.Literals.COLUMN__DEFAULT_VALUE, newDefaultValue);
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
	@SuppressWarnings("unchecked")
	public EList<IndexElement> getIndexElements() {
		return (EList<IndexElement>)eGet(DatabasePackage.Literals.COLUMN__INDEX_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey getPrimaryKey() {
		return (PrimaryKey)eGet(DatabasePackage.Literals.COLUMN__PRIMARY_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		eSet(DatabasePackage.Literals.COLUMN__PRIMARY_KEY, newPrimaryKey);
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
	@SuppressWarnings("unchecked")
	public EList<ForeignKeyElement> getForeignKeyElements() {
		return (EList<ForeignKeyElement>)eGet(DatabasePackage.Literals.COLUMN__FOREIGN_KEY_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type)eGet(DatabasePackage.Literals.COLUMN__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eSet(DatabasePackage.Literals.COLUMN__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getSequence() {
		return (Sequence)eGet(DatabasePackage.Literals.COLUMN__SEQUENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(Sequence newSequence) {
		eSet(DatabasePackage.Literals.COLUMN__SEQUENCE, newSequence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTable getOwner() {
		return (AbstractTable)eGet(DatabasePackage.Literals.COLUMN__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(AbstractTable newOwner) {
		eSet(DatabasePackage.Literals.COLUMN__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoincrement() {
		return (Boolean)eGet(DatabasePackage.Literals.COLUMN__AUTOINCREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoincrement(boolean newAutoincrement) {
		eSet(DatabasePackage.Literals.COLUMN__AUTOINCREMENT, newAutoincrement);
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

} //ColumnImpl
