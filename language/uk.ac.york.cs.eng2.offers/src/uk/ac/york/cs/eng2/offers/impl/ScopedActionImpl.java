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
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.ScopedActionImpl#getTargetMatchType <em>Target Match Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScopedActionImpl extends ActionImpl implements ScopedAction {
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
		result.append(" (targetMatchType: ");
		result.append(targetMatchType);
		result.append(')');
		return result.toString();
	}

} //ScopedActionImpl
