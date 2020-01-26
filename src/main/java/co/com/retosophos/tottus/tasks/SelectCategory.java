package co.com.retosophos.tottus.tasks;

import static co.com.retosophos.tottus.userinterfaces.MainPage.UNDER_CLOTHES_MEN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class SelectCategory implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(JavaScriptClick.on(UNDER_CLOTHES_MEN));
	}
	
	public static SelectCategory underClothes() {
		return new SelectCategory();
	}

}
