/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.typeslibrary.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

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
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.obeonetwork.dsl.typeslibrary.NativeType;
import org.obeonetwork.dsl.typeslibrary.TypeInstance;
import org.obeonetwork.dsl.typeslibrary.TypesLibraryPackage;
import org.obeonetwork.dsl.typeslibrary.parts.TypeInstancePropertiesEditionPart;
import org.obeonetwork.dsl.typeslibrary.parts.TypeslibraryViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class TypeInstancePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TypeInstancePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject typeInstance, String editing_mode) {
		super(editingContext, typeInstance, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = TypeslibraryViewsRepository.class;
		partKey = TypeslibraryViewsRepository.TypeInstance.class;
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
			final TypeInstance typeInstance = (TypeInstance)elt;
			final TypeInstancePropertiesEditionPart basePart = (TypeInstancePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(TypeslibraryViewsRepository.TypeInstance.Properties.type)) {
				basePart.initType(allResource, typeInstance.getNativeType());
			}
			if (isAccessible(TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.length)) {
				basePart.setLength(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), typeInstance.getLength()));
			}
			
			if (isAccessible(TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.precision)) {
				basePart.setPrecision(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), typeInstance.getPrecision()));
			}
			
			if (typeInstance.getLiterals() != null && isAccessible(TypeslibraryViewsRepository.TypeInstance.Properties.literals))
				basePart.setLiterals(typeInstance.getLiterals());
			
			// init filters
			basePart.addFilterToType(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 * 
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof NativeType);
				}
			
			});
			// Start of user code for additional businessfilters for type
			// End of user code
			
			
			
			
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
		if (editorKey == TypeslibraryViewsRepository.TypeInstance.Properties.type) {
			return TypesLibraryPackage.eINSTANCE.getTypeInstance_NativeType();
		}
		if (editorKey == TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.length) {
			return TypesLibraryPackage.eINSTANCE.getTypeInstance_Length();
		}
		if (editorKey == TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.precision) {
			return TypesLibraryPackage.eINSTANCE.getTypeInstance_Precision();
		}
		if (editorKey == TypeslibraryViewsRepository.TypeInstance.Properties.literals) {
			return TypesLibraryPackage.eINSTANCE.getTypeInstance_Literals();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TypeInstance typeInstance = (TypeInstance)semanticObject;
		if (TypeslibraryViewsRepository.TypeInstance.Properties.type == event.getAffectedEditor()) {
			typeInstance.setNativeType((NativeType)event.getNewValue());
		}
		if (TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.length == event.getAffectedEditor()) {
			typeInstance.setLength((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.precision == event.getAffectedEditor()) {
			typeInstance.setPrecision((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (TypeslibraryViewsRepository.TypeInstance.Properties.literals == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				typeInstance.getLiterals().clear();
				typeInstance.getLiterals().addAll(((List) event.getNewValue()));
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TypeInstancePropertiesEditionPart basePart = (TypeInstancePropertiesEditionPart)editingPart;
			if (TypesLibraryPackage.eINSTANCE.getTypeInstance_NativeType().equals(msg.getFeature()) && basePart != null && isAccessible(TypeslibraryViewsRepository.TypeInstance.Properties.type))
				basePart.setType((Object)msg.getNewValue());
			if (TypesLibraryPackage.eINSTANCE.getTypeInstance_Length().equals(msg.getFeature()) && basePart != null && isAccessible(TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.length)) {
				if (msg.getNewValue() != null) {
					basePart.setLength(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setLength("");
				}
			}
			if (TypesLibraryPackage.eINSTANCE.getTypeInstance_Precision().equals(msg.getFeature()) && basePart != null && isAccessible(TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.precision)) {
				if (msg.getNewValue() != null) {
					basePart.setPrecision(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setPrecision("");
				}
			}
			if (TypesLibraryPackage.eINSTANCE.getTypeInstance_Literals().equals(msg.getFeature()) && basePart != null && isAccessible(TypeslibraryViewsRepository.TypeInstance.Properties.literals)) {
				basePart.setLiterals(((TypeInstance)semanticObject).getLiterals());
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
		return key == TypeslibraryViewsRepository.TypeInstance.Properties.type;
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
				if (TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.length == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(TypesLibraryPackage.eINSTANCE.getTypeInstance_Length().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(TypesLibraryPackage.eINSTANCE.getTypeInstance_Length().getEAttributeType(), newValue);
				}
				if (TypeslibraryViewsRepository.TypeInstance.Properties.TypeAttributes.precision == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(TypesLibraryPackage.eINSTANCE.getTypeInstance_Precision().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(TypesLibraryPackage.eINSTANCE.getTypeInstance_Precision().getEAttributeType(), newValue);
				}
				if (TypeslibraryViewsRepository.TypeInstance.Properties.literals == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(TypesLibraryPackage.eINSTANCE.getTypeInstance_Literals().getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
