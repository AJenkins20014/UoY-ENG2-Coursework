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
import uk.ac.york.cs.eng2.offers.RequiresTarget;
import uk.ac.york.cs.eng2.offers.TargetGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.RequiresTargetImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.RequiresTargetImpl#getTargetMatchType <em>Target Match Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.RequiresTargetImpl#getMinQuantity <em>Min Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.RequiresTargetImpl#getMaxQuantity <em>Max Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequiresTargetImpl extends ConditionImpl implements RequiresTarget {
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
	 * The default value of the '{@link #getMinQuantity() <em>Min Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_QUANTITY_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getMinQuantity() <em>Min Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinQuantity()
	 * @generated
	 * @ordered
	 */
	protected Integer minQuantity = MIN_QUANTITY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiresTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.REQUIRES_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TargetGroup> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<TargetGroup>(TargetGroup.class, this, OffersPackage.REQUIRES_TARGET__TARGETS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.REQUIRES_TARGET__TARGET_MATCH_TYPE, oldTargetMatchType, targetMatchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinQuantity() {
		return minQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinQuantity(Integer newMinQuantity) {
		Integer oldMinQuantity = minQuantity;
		minQuantity = newMinQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.REQUIRES_TARGET__MIN_QUANTITY, oldMinQuantity, minQuantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.REQUIRES_TARGET__MAX_QUANTITY, oldMaxQuantity, maxQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OffersPackage.REQUIRES_TARGET__TARGETS:
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
			case OffersPackage.REQUIRES_TARGET__TARGETS:
				return getTargets();
			case OffersPackage.REQUIRES_TARGET__TARGET_MATCH_TYPE:
				return getTargetMatchType();
			case OffersPackage.REQUIRES_TARGET__MIN_QUANTITY:
				return getMinQuantity();
			case OffersPackage.REQUIRES_TARGET__MAX_QUANTITY:
				return getMaxQuantity();
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
			case OffersPackage.REQUIRES_TARGET__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends TargetGroup>)newValue);
				return;
			case OffersPackage.REQUIRES_TARGET__TARGET_MATCH_TYPE:
				setTargetMatchType((MatchType)newValue);
				return;
			case OffersPackage.REQUIRES_TARGET__MIN_QUANTITY:
				setMinQuantity((Integer)newValue);
				return;
			case OffersPackage.REQUIRES_TARGET__MAX_QUANTITY:
				setMaxQuantity((Integer)newValue);
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
			case OffersPackage.REQUIRES_TARGET__TARGETS:
				getTargets().clear();
				return;
			case OffersPackage.REQUIRES_TARGET__TARGET_MATCH_TYPE:
				setTargetMatchType(TARGET_MATCH_TYPE_EDEFAULT);
				return;
			case OffersPackage.REQUIRES_TARGET__MIN_QUANTITY:
				setMinQuantity(MIN_QUANTITY_EDEFAULT);
				return;
			case OffersPackage.REQUIRES_TARGET__MAX_QUANTITY:
				setMaxQuantity(MAX_QUANTITY_EDEFAULT);
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
			case OffersPackage.REQUIRES_TARGET__TARGETS:
				return targets != null && !targets.isEmpty();
			case OffersPackage.REQUIRES_TARGET__TARGET_MATCH_TYPE:
				return targetMatchType != TARGET_MATCH_TYPE_EDEFAULT;
			case OffersPackage.REQUIRES_TARGET__MIN_QUANTITY:
				return MIN_QUANTITY_EDEFAULT == null ? minQuantity != null : !MIN_QUANTITY_EDEFAULT.equals(minQuantity);
			case OffersPackage.REQUIRES_TARGET__MAX_QUANTITY:
				return MAX_QUANTITY_EDEFAULT == null ? maxQuantity != null : !MAX_QUANTITY_EDEFAULT.equals(maxQuantity);
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
		result.append(" (targetMatchType: ");
		result.append(targetMatchType);
		result.append(", minQuantity: ");
		result.append(minQuantity);
		result.append(", maxQuantity: ");
		result.append(maxQuantity);
		result.append(')');
		return result.toString();
	}

} //RequiresTargetImpl
