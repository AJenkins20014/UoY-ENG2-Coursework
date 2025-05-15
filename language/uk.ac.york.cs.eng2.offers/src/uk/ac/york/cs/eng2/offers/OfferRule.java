/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getActions <em>Actions</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getConditions <em>Conditions</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getRuleTrigger <em>Rule Trigger</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule()
 * @model
 * @generated
 */
public interface OfferRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Rule Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.RuleTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Trigger</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_RuleTrigger()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleTrigger> getRuleTrigger();

} // OfferRule
