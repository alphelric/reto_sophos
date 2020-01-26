package co.com.retosophos.tottus.interactions;

import static co.com.retosophos.tottus.userinterfaces.MainPage.BTN_PLUS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class AditionalProduct implements Interaction {
		
	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Click.on(BTN_PLUS));	
	}
	
	public static AditionalProduct Btn() {
		return new AditionalProduct();
	}

}
