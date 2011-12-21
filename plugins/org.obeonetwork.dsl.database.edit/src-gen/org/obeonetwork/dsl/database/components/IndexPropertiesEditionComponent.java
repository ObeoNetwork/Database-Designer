/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.database.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.obeonetwork.dsl.database.DatabasePackage;
import org.obeonetwork.dsl.database.Index;
import org.obeonetwork.dsl.database.parts.DatabaseViewsRepository;
import org.obeonetwork.dsl.database.parts.IndexPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class IndexPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public IndexPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject index, String editing_mode) {
		super(editingContext, index, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DatabaseViewsRepository.class;
		partKey = DatabaseViewsRepository.Index.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Index index = (Index)elt;
			final IndexPropertiesEditionPart basePart = (IndexPropertiesEditionPart)editingPart;
			// init values
			if (index.getName() != null && isAccessible(DatabaseViewsRepository.Index.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), index.getName()));
			
			if (index.getQualifier() != null && isAccessible(DatabaseViewsRepository.Index.Properties.qualifier))
				basePart.setQualifier(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), index.getQualifier()));
			
			if (isAccessible(DatabaseViewsRepository.Index.Properties.unique)) {
				basePart.setUnique(index.isUnique());
			}
			if (isAccessible(DatabaseViewsRepository.Index.Properties.cardinality)) {
				basePart.setCardinality(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), index.getCardinality()));
			}
			
			if (index.getIndexType() != null && isAccessible(DatabaseViewsRepository.Index.Properties.indexType))
				basePart.setIndexType(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), index.getIndexType()));
			
			if (index.getComments() != null && isAccessible(DatabaseViewsRepository.Index.Properties.comments))
				basePart.setComments(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), index.getComments()));
			// init filters
			
			
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	protected EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == DatabaseViewsRepository.Index.Properties.name) {
			return DatabasePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == DatabaseViewsRepository.Index.Properties.qualifier) {
			return DatabasePackage.eINSTANCE.getIndex_Qualifier();
		}
		if (editorKey == DatabaseViewsRepository.Index.Properties.unique) {
			return DatabasePackage.eINSTANCE.getIndex_Unique();
		}
		if (editorKey == DatabaseViewsRepository.Index.Properties.cardinality) {
			return DatabasePackage.eINSTANCE.getIndex_Cardinality();
		}
		if (editorKey == DatabaseViewsRepository.Index.Properties.indexType) {
			return DatabasePackage.eINSTANCE.getIndex_IndexType();
		}
		if (editorKey == DatabaseViewsRepository.Index.Properties.comments) {
			return DatabasePackage.eINSTANCE.getDatabaseElement_Comments();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Index index = (Index)semanticObject;
		if (DatabaseViewsRepository.Index.Properties.name == event.getAffectedEditor()) {
			index.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DatabaseViewsRepository.Index.Properties.qualifier == event.getAffectedEditor()) {
			index.setQualifier((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DatabaseViewsRepository.Index.Properties.unique == event.getAffectedEditor()) {
			index.setUnique((Boolean)event.getNewValue());
		}
		if (DatabaseViewsRepository.Index.Properties.cardinality == event.getAffectedEditor()) {
			index.setCardinality((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (DatabaseViewsRepository.Index.Properties.indexType == event.getAffectedEditor()) {
			index.setIndexType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DatabaseViewsRepository.Index.Properties.comments == event.getAffectedEditor()) {
			index.setComments((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			IndexPropertiesEditionPart basePart = (IndexPropertiesEditionPart)editingPart;
			if (DatabasePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Index.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DatabasePackage.eINSTANCE.getIndex_Qualifier().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Index.Properties.qualifier)) {
				if (msg.getNewValue() != null) {
					basePart.setQualifier(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setQualifier("");
				}
			}
			if (DatabasePackage.eINSTANCE.getIndex_Unique().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Index.Properties.unique))
				basePart.setUnique((Boolean)msg.getNewValue());
			
			if (DatabasePackage.eINSTANCE.getIndex_Cardinality().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Index.Properties.cardinality)) {
				if (msg.getNewValue() != null) {
					basePart.setCardinality(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setCardinality("");
				}
			}
			if (DatabasePackage.eINSTANCE.getIndex_IndexType().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Index.Properties.indexType)) {
				if (msg.getNewValue() != null) {
					basePart.setIndexType(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setIndexType("");
				}
			}
			if (DatabasePackage.eINSTANCE.getDatabaseElement_Comments().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Index.Properties.comments)){
				if (msg.getNewValue() != null) {
					basePart.setComments(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setComments("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == DatabaseViewsRepository.Index.Properties.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (DatabaseViewsRepository.Index.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Index.Properties.qualifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getIndex_Qualifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getIndex_Qualifier().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Index.Properties.unique == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getIndex_Unique().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getIndex_Unique().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Index.Properties.cardinality == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getIndex_Cardinality().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getIndex_Cardinality().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Index.Properties.indexType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getIndex_IndexType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getIndex_IndexType().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Index.Properties.comments == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getDatabaseElement_Comments().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getDatabaseElement_Comments().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
