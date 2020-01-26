package co.com.retosophos.tottus.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MainPage {
	
	public static final Target POPOVER_BTN_CANCEL = Target.the("cancel conditions in popover").located(By.id("onesignal-popover-cancel-button"));
	
	public static final Target CLOTHES_AND_ACCESORIES = Target.the("display clothes and accesories list").locatedBy("//li[@class='sm-ofertas']//p[contains(text(),'Ropa y Accesorios')]");
	
	public static final Target UNDER_CLOTHES_MEN = Target.the("under clothes category").locatedBy("(//a[@href='/tottus/browse/Ropa-Interior/cat1480036' and contains(text(),'Ropa Interior')])[1]");
	
	public static final Target BTN_PLUS = Target.the("add one aditional product").locatedBy("(//*[@class='btn btn-default green-border btn-xs'])[2]");
	
	public static final Target ADD_TO_CART = Target.the("button add to cart shop").locatedBy("(//*[@class='atg_behavior_addItemToCart btn-add-cart'])[1]");
	
	public static final Target CART_SHOP = Target.the("display cart shop").located(By.id("atg_store_richCartTarget"));
	
	public static final Target SHOP_CART_PRODUCT = Target.the("product in cart shop added").located(By.id("selected-product"));
	
}
