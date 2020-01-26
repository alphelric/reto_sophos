package co.com.retosophos.tottus.tasks;

import static co.com.retosophos.tottus.userinterfaces.MainPage.ADD_TO_CART;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCartShop implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ADD_TO_CART));
	}
	
	public static AddToCartShop product() {
		return new AddToCartShop();
	}

}
