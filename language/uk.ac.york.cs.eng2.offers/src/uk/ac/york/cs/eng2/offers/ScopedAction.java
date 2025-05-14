/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scoped Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ScopedAction#getMaxQuantity <em>Max Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ScopedAction#getMaxUsesPerDay <em>Max Uses Per Day</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ScopedAction#getWholeOrder <em>Whole Order</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ScopedAction#getTargets <em>Targets</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ScopedAction#getTargetMatchType <em>Target Match Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getScopedAction()
 * @model abstract="true"
 * @generated
 */
public interface ScopedAction extends Action {
	/**
	 * Returns the value of the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Quantity</em>' attribute.
	 * @see #setMaxQuantity(Integer)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getScopedAction_MaxQuantity()
	 * @model
	 * @generated
	 */
	Integer getMaxQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ScopedAction#getMaxQuantity <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Quantity</em>' attribute.
	 * @see #getMaxQuantity()
	 * @generated
	 */
	void setMaxQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Uses Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Uses Per Day</em>' attribute.
	 * @see #setMaxUsesPerDay(Integer)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getScopedAction_MaxUsesPerDay()
	 * @model
	 * @generated
	 */
	Integer getMaxUsesPerDay();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ScopedAction#getMaxUsesPerDay <em>Max Uses Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Uses Per Day</em>' attribute.
	 * @see #getMaxUsesPerDay()
	 * @generated
	 */
	void setMaxUsesPerDay(Integer value);

	/**
	 * Returns the value of the '<em><b>Whole Order</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whole Order</em>' attribute.
	 * @see #setWholeOrder(Boolean)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getScopedAction_WholeOrder()
	 * @model default="false"
	 * @generated
	 */
	Boolean getWholeOrder();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ScopedAction#getWholeOrder <em>Whole Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whole Order</em>' attribute.
	 * @see #getWholeOrder()
	 * @generated
	 */
	void setWholeOrder(Boolean value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.TargetGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getScopedAction_Targets()
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
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getScopedAction_TargetMatchType()
	 * @model
	 * @generated
	 */
	MatchType getTargetMatchType();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ScopedAction#getTargetMatchType <em>Target Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Match Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.MatchType
	 * @see #getTargetMatchType()
	 * @generated
	 */
	void setTargetMatchType(MatchType value);

} // ScopedAction
