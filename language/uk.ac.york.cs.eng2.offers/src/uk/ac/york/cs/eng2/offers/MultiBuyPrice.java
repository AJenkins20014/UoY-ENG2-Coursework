/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Buy Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.MultiBuyPrice#getQualifyingQuantity <em>Qualifying Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.MultiBuyPrice#getPayForQuantity <em>Pay For Quantity</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMultiBuyPrice()
 * @model
 * @generated
 */
public interface MultiBuyPrice extends ScopedAction {
	/**
	 * Returns the value of the '<em><b>Qualifying Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifying Quantity</em>' attribute.
	 * @see #setQualifyingQuantity(Integer)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMultiBuyPrice_QualifyingQuantity()
	 * @model
	 * @generated
	 */
	Integer getQualifyingQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.MultiBuyPrice#getQualifyingQuantity <em>Qualifying Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifying Quantity</em>' attribute.
	 * @see #getQualifyingQuantity()
	 * @generated
	 */
	void setQualifyingQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Pay For Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay For Quantity</em>' attribute.
	 * @see #setPayForQuantity(Integer)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMultiBuyPrice_PayForQuantity()
	 * @model
	 * @generated
	 */
	Integer getPayForQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.MultiBuyPrice#getPayForQuantity <em>Pay For Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay For Quantity</em>' attribute.
	 * @see #getPayForQuantity()
	 * @generated
	 */
	void setPayForQuantity(Integer value);

} // MultiBuyPrice
