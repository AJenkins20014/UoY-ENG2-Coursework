/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersPackage
 * @generated
 */
public interface OffersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersFactory eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * Returns a new object of class '<em>Offer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer Rule</em>'.
	 * @generated
	 */
	OfferRule createOfferRule();

	/**
	 * Returns a new object of class '<em>Rule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Trigger</em>'.
	 * @generated
	 */
	RuleTrigger createRuleTrigger();

	/**
	 * Returns a new object of class '<em>Flat Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flat Discount</em>'.
	 * @generated
	 */
	FlatDiscount createFlatDiscount();

	/**
	 * Returns a new object of class '<em>Percentage Discount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percentage Discount</em>'.
	 * @generated
	 */
	PercentageDiscount createPercentageDiscount();

	/**
	 * Returns a new object of class '<em>Set Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Price</em>'.
	 * @generated
	 */
	SetPrice createSetPrice();

	/**
	 * Returns a new object of class '<em>Multi Buy Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Buy Price</em>'.
	 * @generated
	 */
	MultiBuyPrice createMultiBuyPrice();

	/**
	 * Returns a new object of class '<em>Requires Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requires Target</em>'.
	 * @generated
	 */
	RequiresTarget createRequiresTarget();

	/**
	 * Returns a new object of class '<em>Order Total</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Total</em>'.
	 * @generated
	 */
	OrderTotal createOrderTotal();

	/**
	 * Returns a new object of class '<em>On Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Date</em>'.
	 * @generated
	 */
	OnDate createOnDate();

	/**
	 * Returns a new object of class '<em>Target Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Group</em>'.
	 * @generated
	 */
	TargetGroup createTargetGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OffersPackage getOffersPackage();

} //OffersFactory
