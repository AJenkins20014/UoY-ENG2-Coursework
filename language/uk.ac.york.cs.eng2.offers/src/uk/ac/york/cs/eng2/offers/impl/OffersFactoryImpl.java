/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.cs.eng2.offers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OffersFactoryImpl extends EFactoryImpl implements OffersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OffersFactory init() {
		try {
			OffersFactory theOffersFactory = (OffersFactory)EPackage.Registry.INSTANCE.getEFactory(OffersPackage.eNS_URI);
			if (theOffersFactory != null) {
				return theOffersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OffersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OffersPackage.MODEL: return createModel();
			case OffersPackage.CATEGORY: return createCategory();
			case OffersPackage.PRODUCT: return createProduct();
			case OffersPackage.TAG: return createTag();
			case OffersPackage.DATE: return createDate();
			case OffersPackage.OFFER_RULE: return createOfferRule();
			case OffersPackage.RULE_TRIGGER: return createRuleTrigger();
			case OffersPackage.FLAT_DISCOUNT: return createFlatDiscount();
			case OffersPackage.PERCENTAGE_DISCOUNT: return createPercentageDiscount();
			case OffersPackage.SET_PRICE: return createSetPrice();
			case OffersPackage.MULTI_BUY_PRICE: return createMultiBuyPrice();
			case OffersPackage.REQUIRES_TARGET: return createRequiresTarget();
			case OffersPackage.ORDER_TOTAL: return createOrderTotal();
			case OffersPackage.ON_DATE: return createOnDate();
			case OffersPackage.TARGET_GROUP: return createTargetGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OffersPackage.TRIGGER_TYPE:
				return createTriggerTypeFromString(eDataType, initialValue);
			case OffersPackage.MATCH_TYPE:
				return createMatchTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OffersPackage.TRIGGER_TYPE:
				return convertTriggerTypeToString(eDataType, instanceValue);
			case OffersPackage.MATCH_TYPE:
				return convertMatchTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferRule createOfferRule() {
		OfferRuleImpl offerRule = new OfferRuleImpl();
		return offerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleTrigger createRuleTrigger() {
		RuleTriggerImpl ruleTrigger = new RuleTriggerImpl();
		return ruleTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlatDiscount createFlatDiscount() {
		FlatDiscountImpl flatDiscount = new FlatDiscountImpl();
		return flatDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PercentageDiscount createPercentageDiscount() {
		PercentageDiscountImpl percentageDiscount = new PercentageDiscountImpl();
		return percentageDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetPrice createSetPrice() {
		SetPriceImpl setPrice = new SetPriceImpl();
		return setPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiBuyPrice createMultiBuyPrice() {
		MultiBuyPriceImpl multiBuyPrice = new MultiBuyPriceImpl();
		return multiBuyPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiresTarget createRequiresTarget() {
		RequiresTargetImpl requiresTarget = new RequiresTargetImpl();
		return requiresTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderTotal createOrderTotal() {
		OrderTotalImpl orderTotal = new OrderTotalImpl();
		return orderTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnDate createOnDate() {
		OnDateImpl onDate = new OnDateImpl();
		return onDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetGroup createTargetGroup() {
		TargetGroupImpl targetGroup = new TargetGroupImpl();
		return targetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType createTriggerTypeFromString(EDataType eDataType, String initialValue) {
		TriggerType result = TriggerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchType createMatchTypeFromString(EDataType eDataType, String initialValue) {
		MatchType result = MatchType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffersPackage getOffersPackage() {
		return (OffersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OffersPackage getPackage() {
		return OffersPackage.eINSTANCE;
	}

} //OffersFactoryImpl
