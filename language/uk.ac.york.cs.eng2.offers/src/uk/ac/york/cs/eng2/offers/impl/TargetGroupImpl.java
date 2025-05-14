/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.york.cs.eng2.offers.Category;
import uk.ac.york.cs.eng2.offers.MatchType;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Product;
import uk.ac.york.cs.eng2.offers.Tag;
import uk.ac.york.cs.eng2.offers.TargetGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TargetGroupImpl#getMatchType <em>Match Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TargetGroupImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TargetGroupImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TargetGroupImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetGroupImpl extends MinimalEObjectImpl.Container implements TargetGroup {
	/**
	 * The default value of the '{@link #getMatchType() <em>Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchType()
	 * @generated
	 * @ordered
	 */
	protected static final MatchType MATCH_TYPE_EDEFAULT = MatchType.ALL;

	/**
	 * The cached value of the '{@link #getMatchType() <em>Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchType()
	 * @generated
	 * @ordered
	 */
	protected MatchType matchType = MATCH_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.TARGET_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatchType getMatchType() {
		return matchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchType(MatchType newMatchType) {
		MatchType oldMatchType = matchType;
		matchType = newMatchType == null ? MATCH_TYPE_EDEFAULT : newMatchType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.TARGET_GROUP__MATCH_TYPE, oldMatchType, matchType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectResolvingEList<Product>(Product.class, this, OffersPackage.TARGET_GROUP__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectResolvingEList<Tag>(Tag.class, this, OffersPackage.TARGET_GROUP__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<Category>(Category.class, this, OffersPackage.TARGET_GROUP__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.TARGET_GROUP__MATCH_TYPE:
				return getMatchType();
			case OffersPackage.TARGET_GROUP__PRODUCTS:
				return getProducts();
			case OffersPackage.TARGET_GROUP__TAGS:
				return getTags();
			case OffersPackage.TARGET_GROUP__CATEGORIES:
				return getCategories();
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
			case OffersPackage.TARGET_GROUP__MATCH_TYPE:
				setMatchType((MatchType)newValue);
				return;
			case OffersPackage.TARGET_GROUP__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case OffersPackage.TARGET_GROUP__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case OffersPackage.TARGET_GROUP__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
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
			case OffersPackage.TARGET_GROUP__MATCH_TYPE:
				setMatchType(MATCH_TYPE_EDEFAULT);
				return;
			case OffersPackage.TARGET_GROUP__PRODUCTS:
				getProducts().clear();
				return;
			case OffersPackage.TARGET_GROUP__TAGS:
				getTags().clear();
				return;
			case OffersPackage.TARGET_GROUP__CATEGORIES:
				getCategories().clear();
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
			case OffersPackage.TARGET_GROUP__MATCH_TYPE:
				return matchType != MATCH_TYPE_EDEFAULT;
			case OffersPackage.TARGET_GROUP__PRODUCTS:
				return products != null && !products.isEmpty();
			case OffersPackage.TARGET_GROUP__TAGS:
				return tags != null && !tags.isEmpty();
			case OffersPackage.TARGET_GROUP__CATEGORIES:
				return categories != null && !categories.isEmpty();
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
		result.append(" (matchType: ");
		result.append(matchType);
		result.append(')');
		return result.toString();
	}

} //TargetGroupImpl
