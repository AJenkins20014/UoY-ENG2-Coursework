/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.RuleTrigger#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.RuleTrigger#getTargetOffer <em>Target Offer</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getRuleTrigger()
 * @model
 * @generated
 */
public interface RuleTrigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.TriggerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see #setType(TriggerType)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getRuleTrigger_Type()
	 * @model
	 * @generated
	 */
	TriggerType getType();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.RuleTrigger#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see #getType()
	 * @generated
	 */
	void setType(TriggerType value);

	/**
	 * Returns the value of the '<em><b>Target Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Offer</em>' reference.
	 * @see #setTargetOffer(OfferRule)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getRuleTrigger_TargetOffer()
	 * @model
	 * @generated
	 */
	OfferRule getTargetOffer();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.RuleTrigger#getTargetOffer <em>Target Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Offer</em>' reference.
	 * @see #getTargetOffer()
	 * @generated
	 */
	void setTargetOffer(OfferRule value);

} // RuleTrigger
