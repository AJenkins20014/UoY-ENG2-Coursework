/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.eng2.offers.OfferRule;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.RuleTrigger;
import uk.ac.york.cs.eng2.offers.TriggerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.RuleTriggerImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.RuleTriggerImpl#getTargetOffer <em>Target Offer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleTriggerImpl extends MinimalEObjectImpl.Container implements RuleTrigger {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerType TYPE_EDEFAULT = TriggerType.ALWAYS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TriggerType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetOffer() <em>Target Offer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOffer()
	 * @generated
	 * @ordered
	 */
	protected OfferRule targetOffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.RULE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TriggerType newType) {
		TriggerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.RULE_TRIGGER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OfferRule getTargetOffer() {
		if (targetOffer != null && targetOffer.eIsProxy()) {
			InternalEObject oldTargetOffer = (InternalEObject)targetOffer;
			targetOffer = (OfferRule)eResolveProxy(oldTargetOffer);
			if (targetOffer != oldTargetOffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.RULE_TRIGGER__TARGET_OFFER, oldTargetOffer, targetOffer));
			}
		}
		return targetOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferRule basicGetTargetOffer() {
		return targetOffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetOffer(OfferRule newTargetOffer) {
		OfferRule oldTargetOffer = targetOffer;
		targetOffer = newTargetOffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.RULE_TRIGGER__TARGET_OFFER, oldTargetOffer, targetOffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.RULE_TRIGGER__TYPE:
				return getType();
			case OffersPackage.RULE_TRIGGER__TARGET_OFFER:
				if (resolve) return getTargetOffer();
				return basicGetTargetOffer();
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
			case OffersPackage.RULE_TRIGGER__TYPE:
				setType((TriggerType)newValue);
				return;
			case OffersPackage.RULE_TRIGGER__TARGET_OFFER:
				setTargetOffer((OfferRule)newValue);
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
			case OffersPackage.RULE_TRIGGER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OffersPackage.RULE_TRIGGER__TARGET_OFFER:
				setTargetOffer((OfferRule)null);
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
			case OffersPackage.RULE_TRIGGER__TYPE:
				return type != TYPE_EDEFAULT;
			case OffersPackage.RULE_TRIGGER__TARGET_OFFER:
				return targetOffer != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RuleTriggerImpl
