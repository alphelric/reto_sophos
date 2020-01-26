package co.com.retosophos.tottus.interactions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static co.com.retosophos.tottus.userinterfaces.MainPage.SHOP_CART_PRODUCT;
import static co.com.retosophos.tottus.userinterfaces.MainPage.CART_SHOP;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class CartShop implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CART_SHOP));
		actor.should(seeThat(the(SHOP_CART_PRODUCT), isVisible()));
	}
	
	public static CartShop product() {
		return new CartShop();
	}

}
