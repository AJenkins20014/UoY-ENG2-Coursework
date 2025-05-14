/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.OrderTotal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Total</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OrderTotalImpl#getMinTotal <em>Min Total</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OrderTotalImpl#getMaxTotal <em>Max Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderTotalImpl extends ConditionImpl implements OrderTotal {
	/**
	 * The default value of the '{@link #getMinTotal() <em>Min Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotal()
	 * @generated
	 * @ordered
	 */
	protected static final Double MIN_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinTotal() <em>Min Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotal()
	 * @generated
	 * @ordered
	 */
	protected Double minTotal = MIN_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTotal() <em>Max Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotal()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTotal() <em>Max Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotal()
	 * @generated
	 * @ordered
	 */
	protected Double maxTotal = MAX_TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderTotalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.ORDER_TOTAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMinTotal() {
		return minTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinTotal(Double newMinTotal) {
		Double oldMinTotal = minTotal;
		minTotal = newMinTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ORDER_TOTAL__MIN_TOTAL, oldMinTotal, minTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMaxTotal() {
		return maxTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTotal(Double newMaxTotal) {
		Double oldMaxTotal = maxTotal;
		maxTotal = newMaxTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ORDER_TOTAL__MAX_TOTAL, oldMaxTotal, maxTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.ORDER_TOTAL__MIN_TOTAL:
				return getMinTotal();
			case OffersPackage.ORDER_TOTAL__MAX_TOTAL:
				return getMaxTotal();
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
			case OffersPackage.ORDER_TOTAL__MIN_TOTAL:
				setMinTotal((Double)newValue);
				return;
			case OffersPackage.ORDER_TOTAL__MAX_TOTAL:
				setMaxTotal((Double)newValue);
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
			case OffersPackage.ORDER_TOTAL__MIN_TOTAL:
				setMinTotal(MIN_TOTAL_EDEFAULT);
				return;
			case OffersPackage.ORDER_TOTAL__MAX_TOTAL:
				setMaxTotal(MAX_TOTAL_EDEFAULT);
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
			case OffersPackage.ORDER_TOTAL__MIN_TOTAL:
				return MIN_TOTAL_EDEFAULT == null ? minTotal != null : !MIN_TOTAL_EDEFAULT.equals(minTotal);
			case OffersPackage.ORDER_TOTAL__MAX_TOTAL:
				return MAX_TOTAL_EDEFAULT == null ? maxTotal != null : !MAX_TOTAL_EDEFAULT.equals(maxTotal);
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
		result.append(" (minTotal: ");
		result.append(minTotal);
		result.append(", maxTotal: ");
		result.append(maxTotal);
		result.append(')');
		return result.toString();
	}

} //OrderTotalImpl
