package co.com.retosophos.tottus.interactions;

import static co.com.retosophos.tottus.userinterfaces.MainPage.POPOVER_BTN_CANCEL;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class PopOver implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(POPOVER_BTN_CANCEL));
	}
	
	public static PopOver cancel() {
		return new PopOver();
	}

}
