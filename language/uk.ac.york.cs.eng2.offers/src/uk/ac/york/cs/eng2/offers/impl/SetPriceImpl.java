/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.SetPrice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.SetPriceImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.SetPriceImpl#getMaxQuantity <em>Max Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.SetPriceImpl#getWholeOrder <em>Whole Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetPriceImpl extends ScopedActionImpl implements SetPrice {
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final Double AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected Double amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxQuantity() <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxQuantity() <em>Max Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQuantity()
	 * @generated
	 * @ordered
	 */
	protected Integer maxQuantity = MAX_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWholeOrder() <em>Whole Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWholeOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WHOLE_ORDER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getWholeOrder() <em>Whole Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWholeOrder()
	 * @generated
	 * @ordered
	 */
	protected Boolean wholeOrder = WHOLE_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetPriceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.SET_PRICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(Double newAmount) {
		Double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SET_PRICE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxQuantity() {
		return maxQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxQuantity(Integer newMaxQuantity) {
		Integer oldMaxQuantity = maxQuantity;
		maxQuantity = newMaxQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SET_PRICE__MAX_QUANTITY, oldMaxQuantity, maxQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWholeOrder() {
		return wholeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWholeOrder(Boolean newWholeOrder) {
		Boolean oldWholeOrder = wholeOrder;
		wholeOrder = newWholeOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SET_PRICE__WHOLE_ORDER, oldWholeOrder, wholeOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.SET_PRICE__AMOUNT:
				return getAmount();
			case OffersPackage.SET_PRICE__MAX_QUANTITY:
				return getMaxQuantity();
			case OffersPackage.SET_PRICE__WHOLE_ORDER:
				return getWholeOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.SET_PRICE__AMOUNT:
				setAmount((Double)newValue);
				return;
			case OffersPackage.SET_PRICE__MAX_QUANTITY:
				setMaxQuantity((Integer)newValue);
				return;
			case OffersPackage.SET_PRICE__WHOLE_ORDER:
				setWholeOrder((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OffersPackage.SET_PRICE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case OffersPackage.SET_PRICE__MAX_QUANTITY:
				setMaxQuantity(MAX_QUANTITY_EDEFAULT);
				return;
			case OffersPackage.SET_PRICE__WHOLE_ORDER:
				setWholeOrder(WHOLE_ORDER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OffersPackage.SET_PRICE__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case OffersPackage.SET_PRICE__MAX_QUANTITY:
				return MAX_QUANTITY_EDEFAULT == null ? maxQuantity != null : !MAX_QUANTITY_EDEFAULT.equals(maxQuantity);
			case OffersPackage.SET_PRICE__WHOLE_ORDER:
				return WHOLE_ORDER_EDEFAULT == null ? wholeOrder != null : !WHOLE_ORDER_EDEFAULT.equals(wholeOrder);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (amount: ");
		result.append(amount);
		result.append(", maxQuantity: ");
		result.append(maxQuantity);
		result.append(", wholeOrder: ");
		result.append(wholeOrder);
		result.append(')');
		return result.toString();
	}

} //SetPriceImpl
