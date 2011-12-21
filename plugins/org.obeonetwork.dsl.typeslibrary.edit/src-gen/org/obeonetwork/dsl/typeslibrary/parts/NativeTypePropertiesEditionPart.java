/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.typeslibrary.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;



// End of user code

/**
 * 
 * 
 */
public interface NativeTypePropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the spec
	 * 
	 */
	public Enumerator getSpec();

	/**
	 * Init the spec
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initSpec(EEnum eenum, Enumerator current);

	/**
	 * Defines a new spec
	 * @param newValue the new spec to set
	 * 
	 */
	public void setSpec(Enumerator newValue);





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
