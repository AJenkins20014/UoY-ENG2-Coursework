/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TargetGroup#getMatchType <em>Match Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TargetGroup#getProducts <em>Products</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TargetGroup#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TargetGroup#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTargetGroup()
 * @model
 * @generated
 */
public interface TargetGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.MatchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.MatchType
	 * @see #setMatchType(MatchType)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTargetGroup_MatchType()
	 * @model
	 * @generated
	 */
	MatchType getMatchType();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.TargetGroup#getMatchType <em>Match Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.MatchType
	 * @see #getMatchType()
	 * @generated
	 */
	void setMatchType(MatchType value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTargetGroup_Products()
	 * @model
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTargetGroup_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTargetGroup_Categories()
	 * @model
	 * @generated
	 */
	EList<Category> getCategories();

} // TargetGroup
