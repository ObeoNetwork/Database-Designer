/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.typeslibrary.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface TypeInstancePropertiesEditionPart {

	/**
	 * @return the nativeType
	 * 
	 */
	public EObject getNativeType();

	/**
	 * Init the nativeType
	 * @param settings the combo setting
	 */
	public void initNativeType(EObjectFlatComboSettings settings);

	/**
	 * Defines a new nativeType
	 * @param newValue the new nativeType to set
	 * 
	 */
	public void setNativeType(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setNativeTypeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the nativeType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNativeType(ViewerFilter filter);

	/**
	 * Adds the given filter to the nativeType edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNativeType(ViewerFilter filter);


	/**
	 * @return the length
	 * 
	 */
	public String getLength();

	/**
	 * Defines a new length
	 * @param newValue the new length to set
	 * 
	 */
	public void setLength(String newValue);


	/**
	 * @return the precision
	 * 
	 */
	public String getPrecision();

	/**
	 * Defines a new precision
	 * @param newValue the new precision to set
	 * 
	 */
	public void setPrecision(String newValue);


	/**
	 * @return the literals
	 * 
	 */
	public EList getLiterals();

	/**
	 * Defines a new literals
	 * @param newValue the new literals to set
	 * 
	 */
	public void setLiterals(EList newValue);

	/**
	 * Add a value to the literals multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToLiterals(Object newValue);

	/**
	 * Remove a value to the literals multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToLiterals(Object newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
