/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.MultiBuyPrice;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Buy Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.MultiBuyPriceImpl#getQualifyingQuantity <em>Qualifying Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.MultiBuyPriceImpl#getPayForQuantity <em>Pay For Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.MultiBuyPriceImpl#getPayAmount <em>Pay Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiBuyPriceImpl extends ScopedActionImpl implements MultiBuyPrice {
	/**
	 * The default value of the '{@link #getQualifyingQuantity() <em>Qualifying Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifyingQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUALIFYING_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifyingQuantity() <em>Qualifying Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifyingQuantity()
	 * @generated
	 * @ordered
	 */
	protected Integer qualifyingQuantity = QUALIFYING_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayForQuantity() <em>Pay For Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayForQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PAY_FOR_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayForQuantity() <em>Pay For Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayForQuantity()
	 * @generated
	 * @ordered
	 */
	protected Integer payForQuantity = PAY_FOR_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayAmount() <em>Pay Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayAmount()
	 * @generated
	 * @ordered
	 */
	protected static final Double PAY_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPayAmount() <em>Pay Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayAmount()
	 * @generated
	 * @ordered
	 */
	protected Double payAmount = PAY_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiBuyPriceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.MULTI_BUY_PRICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getQualifyingQuantity() {
		return qualifyingQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifyingQuantity(Integer newQualifyingQuantity) {
		Integer oldQualifyingQuantity = qualifyingQuantity;
		qualifyingQuantity = newQualifyingQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.MULTI_BUY_PRICE__QUALIFYING_QUANTITY, oldQualifyingQuantity, qualifyingQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPayForQuantity() {
		return payForQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayForQuantity(Integer newPayForQuantity) {
		Integer oldPayForQuantity = payForQuantity;
		payForQuantity = newPayForQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.MULTI_BUY_PRICE__PAY_FOR_QUANTITY, oldPayForQuantity, payForQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getPayAmount() {
		return payAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayAmount(Double newPayAmount) {
		Double oldPayAmount = payAmount;
		payAmount = newPayAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.MULTI_BUY_PRICE__PAY_AMOUNT, oldPayAmount, payAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.MULTI_BUY_PRICE__QUALIFYING_QUANTITY:
				return getQualifyingQuantity();
			case OffersPackage.MULTI_BUY_PRICE__PAY_FOR_QUANTITY:
				return getPayForQuantity();
			case OffersPackage.MULTI_BUY_PRICE__PAY_AMOUNT:
				return getPayAmount();
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
			case OffersPackage.MULTI_BUY_PRICE__QUALIFYING_QUANTITY:
				setQualifyingQuantity((Integer)newValue);
				return;
			case OffersPackage.MULTI_BUY_PRICE__PAY_FOR_QUANTITY:
				setPayForQuantity((Integer)newValue);
				return;
			case OffersPackage.MULTI_BUY_PRICE__PAY_AMOUNT:
				setPayAmount((Double)newValue);
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
			case OffersPackage.MULTI_BUY_PRICE__QUALIFYING_QUANTITY:
				setQualifyingQuantity(QUALIFYING_QUANTITY_EDEFAULT);
				return;
			case OffersPackage.MULTI_BUY_PRICE__PAY_FOR_QUANTITY:
				setPayForQuantity(PAY_FOR_QUANTITY_EDEFAULT);
				return;
			case OffersPackage.MULTI_BUY_PRICE__PAY_AMOUNT:
				setPayAmount(PAY_AMOUNT_EDEFAULT);
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
			case OffersPackage.MULTI_BUY_PRICE__QUALIFYING_QUANTITY:
				return QUALIFYING_QUANTITY_EDEFAULT == null ? qualifyingQuantity != null : !QUALIFYING_QUANTITY_EDEFAULT.equals(qualifyingQuantity);
			case OffersPackage.MULTI_BUY_PRICE__PAY_FOR_QUANTITY:
				return PAY_FOR_QUANTITY_EDEFAULT == null ? payForQuantity != null : !PAY_FOR_QUANTITY_EDEFAULT.equals(payForQuantity);
			case OffersPackage.MULTI_BUY_PRICE__PAY_AMOUNT:
				return PAY_AMOUNT_EDEFAULT == null ? payAmount != null : !PAY_AMOUNT_EDEFAULT.equals(payAmount);
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
		result.append(" (qualifyingQuantity: ");
		result.append(qualifyingQuantity);
		result.append(", payForQuantity: ");
		result.append(payForQuantity);
		result.append(", payAmount: ");
		result.append(payAmount);
		result.append(')');
		return result.toString();
	}

} //MultiBuyPriceImpl
