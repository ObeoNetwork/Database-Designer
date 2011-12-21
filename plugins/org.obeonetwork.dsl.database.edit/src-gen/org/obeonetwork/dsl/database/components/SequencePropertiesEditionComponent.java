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
import org.obeonetwork.dsl.database.Sequence;
import org.obeonetwork.dsl.database.parts.DatabaseViewsRepository;
import org.obeonetwork.dsl.database.parts.SequencePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class SequencePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public SequencePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sequence, String editing_mode) {
		super(editingContext, sequence, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = DatabaseViewsRepository.class;
		partKey = DatabaseViewsRepository.Sequence.class;
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
			final Sequence sequence = (Sequence)elt;
			final SequencePropertiesEditionPart basePart = (SequencePropertiesEditionPart)editingPart;
			// init values
			if (sequence.getName() != null && isAccessible(DatabaseViewsRepository.Sequence.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), sequence.getName()));
			
			if (isAccessible(DatabaseViewsRepository.Sequence.Properties.StartIncrement.start)) {
				basePart.setStart(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), sequence.getStart()));
			}
			
			if (isAccessible(DatabaseViewsRepository.Sequence.Properties.StartIncrement.increment)) {
				basePart.setIncrement(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), sequence.getIncrement()));
			}
			
			if (isAccessible(DatabaseViewsRepository.Sequence.Properties.MinMax.minValue)) {
				basePart.setMinValue(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), sequence.getMinValue()));
			}
			
			if (isAccessible(DatabaseViewsRepository.Sequence.Properties.MinMax.maxValue)) {
				basePart.setMaxValue(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), sequence.getMaxValue()));
			}
			
			if (sequence.getComments() != null && isAccessible(DatabaseViewsRepository.Sequence.Properties.comments))
				basePart.setComments(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), sequence.getComments()));
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
		if (editorKey == DatabaseViewsRepository.Sequence.Properties.name) {
			return DatabasePackage.eINSTANCE.getNamedElement_Name();
		}
		if (editorKey == DatabaseViewsRepository.Sequence.Properties.StartIncrement.start) {
			return DatabasePackage.eINSTANCE.getSequence_Start();
		}
		if (editorKey == DatabaseViewsRepository.Sequence.Properties.StartIncrement.increment) {
			return DatabasePackage.eINSTANCE.getSequence_Increment();
		}
		if (editorKey == DatabaseViewsRepository.Sequence.Properties.MinMax.minValue) {
			return DatabasePackage.eINSTANCE.getSequence_MinValue();
		}
		if (editorKey == DatabaseViewsRepository.Sequence.Properties.MinMax.maxValue) {
			return DatabasePackage.eINSTANCE.getSequence_MaxValue();
		}
		if (editorKey == DatabaseViewsRepository.Sequence.Properties.comments) {
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
		Sequence sequence = (Sequence)semanticObject;
		if (DatabaseViewsRepository.Sequence.Properties.name == event.getAffectedEditor()) {
			sequence.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (DatabaseViewsRepository.Sequence.Properties.StartIncrement.start == event.getAffectedEditor()) {
			sequence.setStart((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (DatabaseViewsRepository.Sequence.Properties.StartIncrement.increment == event.getAffectedEditor()) {
			sequence.setIncrement((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (DatabaseViewsRepository.Sequence.Properties.MinMax.minValue == event.getAffectedEditor()) {
			sequence.setMinValue((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (DatabaseViewsRepository.Sequence.Properties.MinMax.maxValue == event.getAffectedEditor()) {
			sequence.setMaxValue((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (DatabaseViewsRepository.Sequence.Properties.comments == event.getAffectedEditor()) {
			sequence.setComments((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			SequencePropertiesEditionPart basePart = (SequencePropertiesEditionPart)editingPart;
			if (DatabasePackage.eINSTANCE.getNamedElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Sequence.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (DatabasePackage.eINSTANCE.getSequence_Start().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Sequence.Properties.StartIncrement.start)) {
				if (msg.getNewValue() != null) {
					basePart.setStart(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setStart("");
				}
			}
			if (DatabasePackage.eINSTANCE.getSequence_Increment().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Sequence.Properties.StartIncrement.increment)) {
				if (msg.getNewValue() != null) {
					basePart.setIncrement(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setIncrement("");
				}
			}
			if (DatabasePackage.eINSTANCE.getSequence_MinValue().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Sequence.Properties.MinMax.minValue)) {
				if (msg.getNewValue() != null) {
					basePart.setMinValue(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setMinValue("");
				}
			}
			if (DatabasePackage.eINSTANCE.getSequence_MaxValue().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Sequence.Properties.MinMax.maxValue)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxValue(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setMaxValue("");
				}
			}
			if (DatabasePackage.eINSTANCE.getDatabaseElement_Comments().equals(msg.getFeature()) && basePart != null && isAccessible(DatabaseViewsRepository.Sequence.Properties.comments)){
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
		return key == DatabaseViewsRepository.Sequence.Properties.name;
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
				if (DatabaseViewsRepository.Sequence.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getNamedElement_Name().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Sequence.Properties.StartIncrement.start == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getSequence_Start().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getSequence_Start().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Sequence.Properties.StartIncrement.increment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getSequence_Increment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getSequence_Increment().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Sequence.Properties.MinMax.minValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getSequence_MinValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getSequence_MinValue().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Sequence.Properties.MinMax.maxValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(DatabasePackage.eINSTANCE.getSequence_MaxValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(DatabasePackage.eINSTANCE.getSequence_MaxValue().getEAttributeType(), newValue);
				}
				if (DatabaseViewsRepository.Sequence.Properties.comments == event.getAffectedEditor()) {
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
