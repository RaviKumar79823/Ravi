package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage{
	 Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
	 }
	 @FindBy(linkText = "Register")
	 WebElement Register;
	 @FindBy(linkText = "Log in")
	 WebElement Login_link;
	 @FindBy(linkText = "Shopping cart")
	 WebElement Shopping;
	 @FindBy(linkText = "Wishlist")
	 WebElement whishlist;
	 @FindBy(id = "small-searchterms")
	 WebElement search;
	 @FindBy(xpath = "//input[@type='submit']")
	 WebElement submit;
	 @FindBy(linkText = "Books")
	 WebElement books;
	 @FindBy(linkText = "Computers")
	 WebElement computers;
	 @FindBy(linkText = "Electronics")
	 WebElement electronics;
	 @FindBy(linkText = "Apparel & Shoes")
	 WebElement shoes;
	 @FindBy(linkText = "Digital downloads")
	 WebElement downloads;
	 @FindBy(linkText = "Jewelry")
	 WebElement jewelry;
	 @FindBy(linkText = "Gift Cards")
	 WebElement gift;
	 @FindBy(xpath = "//input[@name='NewsletterEmail']")
	 WebElement newsletter;
	 @FindBy(id = "newsletter-subscribe-button")
	 WebElement subscribe;
	 @FindBy(id = "pollanswers-1")
	 WebElement excellent;
	 @FindBy(id = "pollanswers-2")
	 WebElement good;
	 @FindBy(id = "pollanswers-3")
	 WebElement poor;
	 @FindBy(id ="pollanswers-4")
	 WebElement verybad;
	 @FindBy(xpath = "//input[@value='Vote']")
	 WebElement vote;
	 //Folow us
	 
	 @FindBy(linkText = "Facebook")
	 WebElement facebook;
	 @FindBy(linkText = "Twitter")
	 WebElement Twitter;
	 @FindBy(linkText = "RSS")
	 WebElement RSS;
	 @FindBy(linkText = "YouTube")
	 WebElement YouTube;
	 @FindBy(linkText = "Google+")
	 WebElement Google;
	
	 //MY ACCOUNT
	 @FindBy(linkText = "My account")
	 WebElement Myaccount;
	 @FindBy(linkText = "Orders")
	 WebElement Orders;
	 @FindBy(linkText = "Addresses")
	 WebElement Addresses;
	 @FindBy(xpath = "(//a[@class='ico-cart'])[2]")
	 WebElement Shoppingcart;
	 @FindBy(xpath = "(//a[@class='ico-wishlist'])[2]")
	 WebElement Wishlist;
	 
	 //CUSTOMER SERVICES
	 
	 @FindBy(xpath = "//a[text()='Search']")
	 WebElement search1;
	 @FindBy(linkText = "News")
	 WebElement News;
	 @FindBy(linkText = "Blog")
	 WebElement Blog;
	 @FindBy(linkText = "Recently viewed products")
	 WebElement Recently;
	 @FindBy(linkText = "New products")
	 WebElement Newproducts;
	 
	 //INFORMATION
	 
	 @FindBy(linkText = "Sitemap")
	 WebElement Sitemap;
	 @FindBy(linkText = "Shipping & Returns")
	 WebElement Shipping ;
	 @FindBy(linkText = "Privacy Notice")
	 WebElement PrivacyNotice;
	 @FindBy(linkText = "Conditions of Use")
	 WebElement conditionsofuse;
	 @FindBy(linkText = "About us")
	 WebElement Aboutus;
	 @FindBy(linkText = "Contact us")
	 WebElement Contactus;
	 
	 
	 
}
