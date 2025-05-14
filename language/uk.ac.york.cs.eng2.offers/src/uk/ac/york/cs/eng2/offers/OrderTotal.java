/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Total</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OrderTotal#getMinTotal <em>Min Total</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OrderTotal#getMaxTotal <em>Max Total</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrderTotal()
 * @model
 * @generated
 */
public interface OrderTotal extends Condition {
	/**
	 * Returns the value of the '<em><b>Min Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Total</em>' attribute.
	 * @see #setMinTotal(Double)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrderTotal_MinTotal()
	 * @model
	 * @generated
	 */
	Double getMinTotal();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OrderTotal#getMinTotal <em>Min Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Total</em>' attribute.
	 * @see #getMinTotal()
	 * @generated
	 */
	void setMinTotal(Double value);

	/**
	 * Returns the value of the '<em><b>Max Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Total</em>' attribute.
	 * @see #setMaxTotal(Double)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrderTotal_MaxTotal()
	 * @model
	 * @generated
	 */
	Double getMaxTotal();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OrderTotal#getMaxTotal <em>Max Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Total</em>' attribute.
	 * @see #getMaxTotal()
	 * @generated
	 */
	void setMaxTotal(Double value);

} // OrderTotal
