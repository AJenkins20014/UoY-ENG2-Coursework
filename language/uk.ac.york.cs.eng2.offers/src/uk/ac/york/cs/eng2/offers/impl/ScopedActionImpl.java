/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.york.cs.eng2.offers.MatchType;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.ScopedAction;
import uk.ac.york.cs.eng2.offers.TargetGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scoped Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl#getMaxQuantity <em>Max Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl#getMaxUsesPerDay <em>Max Uses Per Day</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl#getWholeOrder <em>Whole Order</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl#getTargetMatchType <em>Target Match Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScopedActionImpl extends ActionImpl implements ScopedAction {
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
	 * The default value of the '{@link #getMaxUsesPerDay() <em>Max Uses Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUsesPerDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_USES_PER_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxUsesPerDay() <em>Max Uses Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUsesPerDay()
	 * @generated
	 * @ordered
	 */
	protected Integer maxUsesPerDay = MAX_USES_PER_DAY_EDEFAULT;

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
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetGroup> targets;

	/**
	 * The default value of the '{@link #getTargetMatchType() <em>Target Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMatchType()
	 * @generated
	 * @ordered
	 */
	protected static final MatchType TARGET_MATCH_TYPE_EDEFAULT = MatchType.ALL;

	/**
	 * The cached value of the '{@link #getTargetMatchType() <em>Target Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMatchType()
	 * @generated
	 * @ordered
	 */
	protected MatchType targetMatchType = TARGET_MATCH_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.SCOPED_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SCOPED_ACTION__MAX_QUANTITY, oldMaxQuantity, maxQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxUsesPerDay() {
		return maxUsesPerDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxUsesPerDay(Integer newMaxUsesPerDay) {
		Integer oldMaxUsesPerDay = maxUsesPerDay;
		maxUsesPerDay = newMaxUsesPerDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SCOPED_ACTION__MAX_USES_PER_DAY, oldMaxUsesPerDay, maxUsesPerDay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SCOPED_ACTION__WHOLE_ORDER, oldWholeOrder, wholeOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetGroup> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<TargetGroup>(TargetGroup.class, this, OffersPackage.SCOPED_ACTION__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatchType getTargetMatchType() {
		return targetMatchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetMatchType(MatchType newTargetMatchType) {
		MatchType oldTargetMatchType = targetMatchType;
		targetMatchType = newTargetMatchType == null ? TARGET_MATCH_TYPE_EDEFAULT : newTargetMatchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SCOPED_ACTION__TARGET_MATCH_TYPE, oldTargetMatchType, targetMatchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OffersPackage.SCOPED_ACTION__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.SCOPED_ACTION__MAX_QUANTITY:
				return getMaxQuantity();
			case OffersPackage.SCOPED_ACTION__MAX_USES_PER_DAY:
				return getMaxUsesPerDay();
			case OffersPackage.SCOPED_ACTION__WHOLE_ORDER:
				return getWholeOrder();
			case OffersPackage.SCOPED_ACTION__TARGETS:
				return getTargets();
			case OffersPackage.SCOPED_ACTION__TARGET_MATCH_TYPE:
				return getTargetMatchType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.SCOPED_ACTION__MAX_QUANTITY:
				setMaxQuantity((Integer)newValue);
				return;
			case OffersPackage.SCOPED_ACTION__MAX_USES_PER_DAY:
				setMaxUsesPerDay((Integer)newValue);
				return;
			case OffersPackage.SCOPED_ACTION__WHOLE_ORDER:
				setWholeOrder((Boolean)newValue);
				return;
			case OffersPackage.SCOPED_ACTION__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends TargetGroup>)newValue);
				return;
			case OffersPackage.SCOPED_ACTION__TARGET_MATCH_TYPE:
				setTargetMatchType((MatchType)newValue);
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
			case OffersPackage.SCOPED_ACTION__MAX_QUANTITY:
				setMaxQuantity(MAX_QUANTITY_EDEFAULT);
				return;
			case OffersPackage.SCOPED_ACTION__MAX_USES_PER_DAY:
				setMaxUsesPerDay(MAX_USES_PER_DAY_EDEFAULT);
				return;
			case OffersPackage.SCOPED_ACTION__WHOLE_ORDER:
				setWholeOrder(WHOLE_ORDER_EDEFAULT);
				return;
			case OffersPackage.SCOPED_ACTION__TARGETS:
				getTargets().clear();
				return;
			case OffersPackage.SCOPED_ACTION__TARGET_MATCH_TYPE:
				setTargetMatchType(TARGET_MATCH_TYPE_EDEFAULT);
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
			case OffersPackage.SCOPED_ACTION__MAX_QUANTITY:
				return MAX_QUANTITY_EDEFAULT == null ? maxQuantity != null : !MAX_QUANTITY_EDEFAULT.equals(maxQuantity);
			case OffersPackage.SCOPED_ACTION__MAX_USES_PER_DAY:
				return MAX_USES_PER_DAY_EDEFAULT == null ? maxUsesPerDay != null : !MAX_USES_PER_DAY_EDEFAULT.equals(maxUsesPerDay);
			case OffersPackage.SCOPED_ACTION__WHOLE_ORDER:
				return WHOLE_ORDER_EDEFAULT == null ? wholeOrder != null : !WHOLE_ORDER_EDEFAULT.equals(wholeOrder);
			case OffersPackage.SCOPED_ACTION__TARGETS:
				return targets != null && !targets.isEmpty();
			case OffersPackage.SCOPED_ACTION__TARGET_MATCH_TYPE:
				return targetMatchType != TARGET_MATCH_TYPE_EDEFAULT;
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
		result.append(" (maxQuantity: ");
		result.append(maxQuantity);
		result.append(", maxUsesPerDay: ");
		result.append(maxUsesPerDay);
		result.append(", wholeOrder: ");
		result.append(wholeOrder);
		result.append(", targetMatchType: ");
		result.append(targetMatchType);
		result.append(')');
		return result.toString();
	}

} //ScopedActionImpl
