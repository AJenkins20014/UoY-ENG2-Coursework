/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OnDate#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OnDate#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOnDate()
 * @model
 * @generated
 */
public interface OnDate extends Condition {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' reference.
	 * @see #setStartDate(Date)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOnDate_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OnDate#getStartDate <em>Start Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' reference.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' reference.
	 * @see #setEndDate(Date)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOnDate_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OnDate#getEndDate <em>End Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' reference.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

} // OnDate
