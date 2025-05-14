/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersFactory
 * @model kind="package"
 * @generated
 */
public interface OffersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "offers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.york.ac.uk/eng2/202425/offers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersPackage eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ModelImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Offer Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OFFER_RULES = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Saved Dates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SAVED_DATES = 2;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PRODUCTS = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TAGS = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Subcategories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUBCATEGORIES = 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TAGS = 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.DateImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__MONTH = 2;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__DAY = 3;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferRule()
	 * @generated
	 */
	int OFFER_RULE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Rule Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__RULE_TRIGGER = 3;

	/**
	 * The number of structural features of the '<em>Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.RuleTriggerImpl <em>Rule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.RuleTriggerImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getRuleTrigger()
	 * @generated
	 */
	int RULE_TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Target Offer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER__TARGET_OFFER = 1;

	/**
	 * The number of structural features of the '<em>Rule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REPEATABLE = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl <em>Scoped Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getScopedAction()
	 * @generated
	 */
	int SCOPED_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ACTION__REPEATABLE = ACTION__REPEATABLE;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ACTION__MAX_QUANTITY = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Uses Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ACTION__MAX_USES_PER_DAY = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Whole Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ACTION__WHOLE_ORDER = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ACTION__TARGETS = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Match Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ACTION__TARGET_MATCH_TYPE = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Scoped Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Scoped Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.FlatDiscountImpl <em>Flat Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.FlatDiscountImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFlatDiscount()
	 * @generated
	 */
	int FLAT_DISCOUNT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT__NAME = SCOPED_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT__REPEATABLE = SCOPED_ACTION__REPEATABLE;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT__MAX_QUANTITY = SCOPED_ACTION__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Uses Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT__MAX_USES_PER_DAY = SCOPED_ACTION__MAX_USES_PER_DAY;

	/**
	 * The feature id for the '<em><b>Whole Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT__WHOLE_ORDER = SCOPED_ACTION__WHOLE_ORDER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT__TARGETS = SCOPED_ACTION__TARGETS;

	/**
	 * The feature id for the '<em><b>Target Match Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT__TARGET_MATCH_TYPE = SCOPED_ACTION__TARGET_MATCH_TYPE;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT__AMOUNT = SCOPED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flat Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT_FEATURE_COUNT = SCOPED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flat Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_DISCOUNT_OPERATION_COUNT = SCOPED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.PercentageDiscountImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPercentageDiscount()
	 * @generated
	 */
	int PERCENTAGE_DISCOUNT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__NAME = SCOPED_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__REPEATABLE = SCOPED_ACTION__REPEATABLE;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__MAX_QUANTITY = SCOPED_ACTION__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Uses Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__MAX_USES_PER_DAY = SCOPED_ACTION__MAX_USES_PER_DAY;

	/**
	 * The feature id for the '<em><b>Whole Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__WHOLE_ORDER = SCOPED_ACTION__WHOLE_ORDER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__TARGETS = SCOPED_ACTION__TARGETS;

	/**
	 * The feature id for the '<em><b>Target Match Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__TARGET_MATCH_TYPE = SCOPED_ACTION__TARGET_MATCH_TYPE;

	/**
	 * The feature id for the '<em><b>Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT__PERCENT = SCOPED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Percentage Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_FEATURE_COUNT = SCOPED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Percentage Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_OPERATION_COUNT = SCOPED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.SetPriceImpl <em>Set Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.SetPriceImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getSetPrice()
	 * @generated
	 */
	int SET_PRICE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE__NAME = SCOPED_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE__REPEATABLE = SCOPED_ACTION__REPEATABLE;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE__MAX_QUANTITY = SCOPED_ACTION__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Uses Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE__MAX_USES_PER_DAY = SCOPED_ACTION__MAX_USES_PER_DAY;

	/**
	 * The feature id for the '<em><b>Whole Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE__WHOLE_ORDER = SCOPED_ACTION__WHOLE_ORDER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE__TARGETS = SCOPED_ACTION__TARGETS;

	/**
	 * The feature id for the '<em><b>Target Match Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE__TARGET_MATCH_TYPE = SCOPED_ACTION__TARGET_MATCH_TYPE;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE__AMOUNT = SCOPED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE_FEATURE_COUNT = SCOPED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PRICE_OPERATION_COUNT = SCOPED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.MultiBuyPriceImpl <em>Multi Buy Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.MultiBuyPriceImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMultiBuyPrice()
	 * @generated
	 */
	int MULTI_BUY_PRICE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE__NAME = SCOPED_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE__REPEATABLE = SCOPED_ACTION__REPEATABLE;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE__MAX_QUANTITY = SCOPED_ACTION__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Uses Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE__MAX_USES_PER_DAY = SCOPED_ACTION__MAX_USES_PER_DAY;

	/**
	 * The feature id for the '<em><b>Whole Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE__WHOLE_ORDER = SCOPED_ACTION__WHOLE_ORDER;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE__TARGETS = SCOPED_ACTION__TARGETS;

	/**
	 * The feature id for the '<em><b>Target Match Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE__TARGET_MATCH_TYPE = SCOPED_ACTION__TARGET_MATCH_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifying Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE__QUALIFYING_QUANTITY = SCOPED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pay For Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE__PAY_FOR_QUANTITY = SCOPED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Buy Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE_FEATURE_COUNT = SCOPED_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi Buy Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_BUY_PRICE_OPERATION_COUNT = SCOPED_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.AddFreeProductImpl <em>Add Free Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.AddFreeProductImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAddFreeProduct()
	 * @generated
	 */
	int ADD_FREE_PRODUCT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FREE_PRODUCT__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Repeatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FREE_PRODUCT__REPEATABLE = ACTION__REPEATABLE;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FREE_PRODUCT__PRODUCT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FREE_PRODUCT__QUANTITY = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Free Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FREE_PRODUCT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Free Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FREE_PRODUCT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.RequiresTargetImpl <em>Requires Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.RequiresTargetImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getRequiresTarget()
	 * @generated
	 */
	int REQUIRES_TARGET = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_TARGET__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_TARGET__TARGETS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Match Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_TARGET__TARGET_MATCH_TYPE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_TARGET__MIN_QUANTITY = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_TARGET__MAX_QUANTITY = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Requires Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_TARGET_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Requires Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_TARGET_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OrderTotalImpl <em>Order Total</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OrderTotalImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOrderTotal()
	 * @generated
	 */
	int ORDER_TOTAL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TOTAL__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Min Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TOTAL__MIN_TOTAL = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TOTAL__MAX_TOTAL = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Order Total</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TOTAL_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Order Total</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TOTAL_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OnDateImpl <em>On Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OnDateImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOnDate()
	 * @generated
	 */
	int ON_DATE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DATE__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DATE__START_DATE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DATE__END_DATE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>On Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DATE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>On Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_DATE_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TargetGroupImpl <em>Target Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TargetGroupImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTargetGroup()
	 * @generated
	 */
	int TARGET_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Match Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__MATCH_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__TAGS = 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP__CATEGORIES = 3;

	/**
	 * The number of structural features of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Target Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.TriggerType <em>Trigger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerType()
	 * @generated
	 */
	int TRIGGER_TYPE = 19;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.MatchType <em>Match Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.MatchType
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMatchType()
	 * @generated
	 */
	int MATCH_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getOfferRules <em>Offer Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offer Rules</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getOfferRules()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OfferRules();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getCategories()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getSavedDates <em>Saved Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Saved Dates</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getSavedDates()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_SavedDates();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getProducts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getTags()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Tags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the container reference '{@link uk.ac.york.cs.eng2.offers.Category#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getParent()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Category#getSubcategories <em>Subcategories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getSubcategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Subcategories();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.Product#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Category();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.Product#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getTags()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Tags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Date#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Date#getName()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Date#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Date#getYear()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Year();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Date#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Date#getMonth()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Month();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Date#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Date#getDay()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Day();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OfferRule <em>Offer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Rule</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule
	 * @generated
	 */
	EClass getOfferRule();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getName()
	 * @see #getOfferRule()
	 * @generated
	 */
	EAttribute getOfferRule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferRule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getActions()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getConditions()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.eng2.offers.OfferRule#getRuleTrigger <em>Rule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Trigger</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getRuleTrigger()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_RuleTrigger();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.RuleTrigger <em>Rule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Trigger</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RuleTrigger
	 * @generated
	 */
	EClass getRuleTrigger();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.RuleTrigger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RuleTrigger#getType()
	 * @see #getRuleTrigger()
	 * @generated
	 */
	EAttribute getRuleTrigger_Type();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.RuleTrigger#getTargetOffer <em>Target Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Offer</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RuleTrigger#getTargetOffer()
	 * @see #getRuleTrigger()
	 * @generated
	 */
	EReference getRuleTrigger_TargetOffer();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Action#getRepeatable <em>Repeatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeatable</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action#getRepeatable()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Repeatable();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ScopedAction <em>Scoped Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ScopedAction
	 * @generated
	 */
	EClass getScopedAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ScopedAction#getMaxQuantity <em>Max Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ScopedAction#getMaxQuantity()
	 * @see #getScopedAction()
	 * @generated
	 */
	EAttribute getScopedAction_MaxQuantity();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ScopedAction#getMaxUsesPerDay <em>Max Uses Per Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Uses Per Day</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ScopedAction#getMaxUsesPerDay()
	 * @see #getScopedAction()
	 * @generated
	 */
	EAttribute getScopedAction_MaxUsesPerDay();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ScopedAction#getWholeOrder <em>Whole Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whole Order</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ScopedAction#getWholeOrder()
	 * @see #getScopedAction()
	 * @generated
	 */
	EAttribute getScopedAction_WholeOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.ScopedAction#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ScopedAction#getTargets()
	 * @see #getScopedAction()
	 * @generated
	 */
	EReference getScopedAction_Targets();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ScopedAction#getTargetMatchType <em>Target Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Match Type</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ScopedAction#getTargetMatchType()
	 * @see #getScopedAction()
	 * @generated
	 */
	EAttribute getScopedAction_TargetMatchType();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.FlatDiscount <em>Flat Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Discount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FlatDiscount
	 * @generated
	 */
	EClass getFlatDiscount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.FlatDiscount#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FlatDiscount#getAmount()
	 * @see #getFlatDiscount()
	 * @generated
	 */
	EAttribute getFlatDiscount_Amount();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.PercentageDiscount <em>Percentage Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Discount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PercentageDiscount
	 * @generated
	 */
	EClass getPercentageDiscount();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.PercentageDiscount#getPercent <em>Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PercentageDiscount#getPercent()
	 * @see #getPercentageDiscount()
	 * @generated
	 */
	EAttribute getPercentageDiscount_Percent();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.SetPrice <em>Set Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.SetPrice
	 * @generated
	 */
	EClass getSetPrice();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.SetPrice#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.SetPrice#getAmount()
	 * @see #getSetPrice()
	 * @generated
	 */
	EAttribute getSetPrice_Amount();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.MultiBuyPrice <em>Multi Buy Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Buy Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MultiBuyPrice
	 * @generated
	 */
	EClass getMultiBuyPrice();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.MultiBuyPrice#getQualifyingQuantity <em>Qualifying Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifying Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MultiBuyPrice#getQualifyingQuantity()
	 * @see #getMultiBuyPrice()
	 * @generated
	 */
	EAttribute getMultiBuyPrice_QualifyingQuantity();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.MultiBuyPrice#getPayForQuantity <em>Pay For Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pay For Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MultiBuyPrice#getPayForQuantity()
	 * @see #getMultiBuyPrice()
	 * @generated
	 */
	EAttribute getMultiBuyPrice_PayForQuantity();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.AddFreeProduct <em>Add Free Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Free Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.AddFreeProduct
	 * @generated
	 */
	EClass getAddFreeProduct();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.AddFreeProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.AddFreeProduct#getProduct()
	 * @see #getAddFreeProduct()
	 * @generated
	 */
	EReference getAddFreeProduct_Product();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.AddFreeProduct#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.AddFreeProduct#getQuantity()
	 * @see #getAddFreeProduct()
	 * @generated
	 */
	EAttribute getAddFreeProduct_Quantity();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.RequiresTarget <em>Requires Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires Target</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RequiresTarget
	 * @generated
	 */
	EClass getRequiresTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RequiresTarget#getTargets()
	 * @see #getRequiresTarget()
	 * @generated
	 */
	EReference getRequiresTarget_Targets();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getTargetMatchType <em>Target Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Match Type</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RequiresTarget#getTargetMatchType()
	 * @see #getRequiresTarget()
	 * @generated
	 */
	EAttribute getRequiresTarget_TargetMatchType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getMinQuantity <em>Min Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RequiresTarget#getMinQuantity()
	 * @see #getRequiresTarget()
	 * @generated
	 */
	EAttribute getRequiresTarget_MinQuantity();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.RequiresTarget#getMaxQuantity <em>Max Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.RequiresTarget#getMaxQuantity()
	 * @see #getRequiresTarget()
	 * @generated
	 */
	EAttribute getRequiresTarget_MaxQuantity();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OrderTotal <em>Order Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Total</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OrderTotal
	 * @generated
	 */
	EClass getOrderTotal();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OrderTotal#getMinTotal <em>Min Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Total</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OrderTotal#getMinTotal()
	 * @see #getOrderTotal()
	 * @generated
	 */
	EAttribute getOrderTotal_MinTotal();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OrderTotal#getMaxTotal <em>Max Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Total</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OrderTotal#getMaxTotal()
	 * @see #getOrderTotal()
	 * @generated
	 */
	EAttribute getOrderTotal_MaxTotal();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OnDate <em>On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Date</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OnDate
	 * @generated
	 */
	EClass getOnDate();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.OnDate#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Date</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OnDate#getStartDate()
	 * @see #getOnDate()
	 * @generated
	 */
	EReference getOnDate_StartDate();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.OnDate#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Date</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OnDate#getEndDate()
	 * @see #getOnDate()
	 * @generated
	 */
	EReference getOnDate_EndDate();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.TargetGroup <em>Target Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Group</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TargetGroup
	 * @generated
	 */
	EClass getTargetGroup();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.TargetGroup#getMatchType <em>Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Type</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TargetGroup#getMatchType()
	 * @see #getTargetGroup()
	 * @generated
	 */
	EAttribute getTargetGroup_MatchType();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.TargetGroup#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TargetGroup#getProducts()
	 * @see #getTargetGroup()
	 * @generated
	 */
	EReference getTargetGroup_Products();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.TargetGroup#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TargetGroup#getTags()
	 * @see #getTargetGroup()
	 * @generated
	 */
	EReference getTargetGroup_Tags();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.TargetGroup#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TargetGroup#getCategories()
	 * @see #getTargetGroup()
	 * @generated
	 */
	EReference getTargetGroup_Categories();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.cs.eng2.offers.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Type</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @generated
	 */
	EEnum getTriggerType();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.cs.eng2.offers.MatchType <em>Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Type</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MatchType
	 * @generated
	 */
	EEnum getMatchType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OffersFactory getOffersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ModelImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Offer Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OFFER_RULES = eINSTANCE.getModel_OfferRules();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CATEGORIES = eINSTANCE.getModel_Categories();

		/**
		 * The meta object literal for the '<em><b>Saved Dates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SAVED_DATES = eINSTANCE.getModel_SavedDates();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PRODUCTS = eINSTANCE.getModel_Products();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TAGS = eINSTANCE.getModel_Tags();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__PARENT = eINSTANCE.getCategory_Parent();

		/**
		 * The meta object literal for the '<em><b>Subcategories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUBCATEGORIES = eINSTANCE.getCategory_Subcategories();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CATEGORY = eINSTANCE.getProduct_Category();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TAGS = eINSTANCE.getProduct_Tags();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.DateImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__NAME = eINSTANCE.getDate_Name();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__YEAR = eINSTANCE.getDate_Year();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__MONTH = eINSTANCE.getDate_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__DAY = eINSTANCE.getDate_Day();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferRule()
		 * @generated
		 */
		EClass OFFER_RULE = eINSTANCE.getOfferRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_RULE__NAME = eINSTANCE.getOfferRule_Name();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__ACTIONS = eINSTANCE.getOfferRule_Actions();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__CONDITIONS = eINSTANCE.getOfferRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Rule Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__RULE_TRIGGER = eINSTANCE.getOfferRule_RuleTrigger();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.RuleTriggerImpl <em>Rule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.RuleTriggerImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getRuleTrigger()
		 * @generated
		 */
		EClass RULE_TRIGGER = eINSTANCE.getRuleTrigger();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TRIGGER__TYPE = eINSTANCE.getRuleTrigger_Type();

		/**
		 * The meta object literal for the '<em><b>Target Offer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TRIGGER__TARGET_OFFER = eINSTANCE.getRuleTrigger_TargetOffer();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Repeatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__REPEATABLE = eINSTANCE.getAction_Repeatable();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl <em>Scoped Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getScopedAction()
		 * @generated
		 */
		EClass SCOPED_ACTION = eINSTANCE.getScopedAction();

		/**
		 * The meta object literal for the '<em><b>Max Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPED_ACTION__MAX_QUANTITY = eINSTANCE.getScopedAction_MaxQuantity();

		/**
		 * The meta object literal for the '<em><b>Max Uses Per Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPED_ACTION__MAX_USES_PER_DAY = eINSTANCE.getScopedAction_MaxUsesPerDay();

		/**
		 * The meta object literal for the '<em><b>Whole Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPED_ACTION__WHOLE_ORDER = eINSTANCE.getScopedAction_WholeOrder();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_ACTION__TARGETS = eINSTANCE.getScopedAction_Targets();

		/**
		 * The meta object literal for the '<em><b>Target Match Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPED_ACTION__TARGET_MATCH_TYPE = eINSTANCE.getScopedAction_TargetMatchType();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.FlatDiscountImpl <em>Flat Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.FlatDiscountImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFlatDiscount()
		 * @generated
		 */
		EClass FLAT_DISCOUNT = eINSTANCE.getFlatDiscount();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAT_DISCOUNT__AMOUNT = eINSTANCE.getFlatDiscount_Amount();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.PercentageDiscountImpl <em>Percentage Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.PercentageDiscountImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPercentageDiscount()
		 * @generated
		 */
		EClass PERCENTAGE_DISCOUNT = eINSTANCE.getPercentageDiscount();

		/**
		 * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_DISCOUNT__PERCENT = eINSTANCE.getPercentageDiscount_Percent();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.SetPriceImpl <em>Set Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.SetPriceImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getSetPrice()
		 * @generated
		 */
		EClass SET_PRICE = eINSTANCE.getSetPrice();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PRICE__AMOUNT = eINSTANCE.getSetPrice_Amount();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.MultiBuyPriceImpl <em>Multi Buy Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.MultiBuyPriceImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMultiBuyPrice()
		 * @generated
		 */
		EClass MULTI_BUY_PRICE = eINSTANCE.getMultiBuyPrice();

		/**
		 * The meta object literal for the '<em><b>Qualifying Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_BUY_PRICE__QUALIFYING_QUANTITY = eINSTANCE.getMultiBuyPrice_QualifyingQuantity();

		/**
		 * The meta object literal for the '<em><b>Pay For Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_BUY_PRICE__PAY_FOR_QUANTITY = eINSTANCE.getMultiBuyPrice_PayForQuantity();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.AddFreeProductImpl <em>Add Free Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.AddFreeProductImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAddFreeProduct()
		 * @generated
		 */
		EClass ADD_FREE_PRODUCT = eINSTANCE.getAddFreeProduct();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_FREE_PRODUCT__PRODUCT = eINSTANCE.getAddFreeProduct_Product();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_FREE_PRODUCT__QUANTITY = eINSTANCE.getAddFreeProduct_Quantity();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.RequiresTargetImpl <em>Requires Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.RequiresTargetImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getRequiresTarget()
		 * @generated
		 */
		EClass REQUIRES_TARGET = eINSTANCE.getRequiresTarget();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES_TARGET__TARGETS = eINSTANCE.getRequiresTarget_Targets();

		/**
		 * The meta object literal for the '<em><b>Target Match Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES_TARGET__TARGET_MATCH_TYPE = eINSTANCE.getRequiresTarget_TargetMatchType();

		/**
		 * The meta object literal for the '<em><b>Min Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES_TARGET__MIN_QUANTITY = eINSTANCE.getRequiresTarget_MinQuantity();

		/**
		 * The meta object literal for the '<em><b>Max Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES_TARGET__MAX_QUANTITY = eINSTANCE.getRequiresTarget_MaxQuantity();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OrderTotalImpl <em>Order Total</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OrderTotalImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOrderTotal()
		 * @generated
		 */
		EClass ORDER_TOTAL = eINSTANCE.getOrderTotal();

		/**
		 * The meta object literal for the '<em><b>Min Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TOTAL__MIN_TOTAL = eINSTANCE.getOrderTotal_MinTotal();

		/**
		 * The meta object literal for the '<em><b>Max Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TOTAL__MAX_TOTAL = eINSTANCE.getOrderTotal_MaxTotal();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OnDateImpl <em>On Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OnDateImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOnDate()
		 * @generated
		 */
		EClass ON_DATE = eINSTANCE.getOnDate();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_DATE__START_DATE = eINSTANCE.getOnDate_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_DATE__END_DATE = eINSTANCE.getOnDate_EndDate();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TargetGroupImpl <em>Target Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TargetGroupImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTargetGroup()
		 * @generated
		 */
		EClass TARGET_GROUP = eINSTANCE.getTargetGroup();

		/**
		 * The meta object literal for the '<em><b>Match Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_GROUP__MATCH_TYPE = eINSTANCE.getTargetGroup_MatchType();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_GROUP__PRODUCTS = eINSTANCE.getTargetGroup_Products();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_GROUP__TAGS = eINSTANCE.getTargetGroup_Tags();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_GROUP__CATEGORIES = eINSTANCE.getTargetGroup_Categories();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.TriggerType <em>Trigger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.TriggerType
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerType()
		 * @generated
		 */
		EEnum TRIGGER_TYPE = eINSTANCE.getTriggerType();

		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.MatchType <em>Match Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.MatchType
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMatchType()
		 * @generated
		 */
		EEnum MATCH_TYPE = eINSTANCE.getMatchType();

	}

} //OffersPackage
