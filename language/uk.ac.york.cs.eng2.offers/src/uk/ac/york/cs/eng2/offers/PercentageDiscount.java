/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Percentage Discount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.PercentageDiscount#getPercent <em>Percent</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.PercentageDiscount#getMaxQuantity <em>Max Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.PercentageDiscount#getWholeOrder <em>Whole Order</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPercentageDiscount()
 * @model
 * @generated
 */
public interface PercentageDiscount extends ScopedAction {
	/**
	 * Returns the value of the '<em><b>Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent</em>' attribute.
	 * @see #setPercent(Double)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPercentageDiscount_Percent()
	 * @model
	 * @generated
	 */
	Double getPercent();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.PercentageDiscount#getPercent <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent</em>' attribute.
	 * @see #getPercent()
	 * @generated
	 */
	void setPercent(Double value);

	/**
	 * Returns the value of the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Quantity</em>' attribute.
	 * @see #setMaxQuantity(Integer)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPercentageDiscount_MaxQuantity()
	 * @model
	 * @generated
	 */
	Integer getMaxQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.PercentageDiscount#getMaxQuantity <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Quantity</em>' attribute.
	 * @see #getMaxQuantity()
	 * @generated
	 */
	void setMaxQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Whole Order</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whole Order</em>' attribute.
	 * @see #setWholeOrder(Boolean)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPercentageDiscount_WholeOrder()
	 * @model default="false"
	 * @generated
	 */
	Boolean getWholeOrder();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.PercentageDiscount#getWholeOrder <em>Whole Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whole Order</em>' attribute.
	 * @see #getWholeOrder()
	 * @generated
	 */
	void setWholeOrder(Boolean value);

} // PercentageDiscount
