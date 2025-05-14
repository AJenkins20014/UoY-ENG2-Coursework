/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getTargets <em>Targets</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getTargetMatchType <em>Target Match Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getMinQuantity <em>Min Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getMaxQuantity <em>Max Quantity</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getRequiresTarget()
 * @model
 * @generated
 */
public interface RequiresTarget extends Condition {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.TargetGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getRequiresTarget_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetGroup> getTargets();

	/**
	 * Returns the value of the '<em><b>Target Match Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.MatchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Match Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.MatchType
	 * @see #setTargetMatchType(MatchType)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getRequiresTarget_TargetMatchType()
	 * @model
	 * @generated
	 */
	MatchType getTargetMatchType();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getTargetMatchType <em>Target Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Match Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.MatchType
	 * @see #getTargetMatchType()
	 * @generated
	 */
	void setTargetMatchType(MatchType value);

	/**
	 * Returns the value of the '<em><b>Min Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Quantity</em>' attribute.
	 * @see #setMinQuantity(Integer)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getRequiresTarget_MinQuantity()
	 * @model default="1"
	 * @generated
	 */
	Integer getMinQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getMinQuantity <em>Min Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Quantity</em>' attribute.
	 * @see #getMinQuantity()
	 * @generated
	 */
	void setMinQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Quantity</em>' attribute.
	 * @see #setMaxQuantity(Integer)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getRequiresTarget_MaxQuantity()
	 * @model
	 * @generated
	 */
	Integer getMaxQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getMaxQuantity <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Quantity</em>' attribute.
	 * @see #getMaxQuantity()
	 * @generated
	 */
	void setMaxQuantity(Integer value);

} // RequiresTarget
