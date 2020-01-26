package co.com.retosophos.tottus.tasks;

import static co.com.retosophos.tottus.userinterfaces.MainPage.CLOTHES_AND_ACCESORIES;

import co.com.retosophos.tottus.interactions.PopOver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class DisplayList implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(PopOver.cancel(), MoveMouse.to(CLOTHES_AND_ACCESORIES));
	}

	public static DisplayList ClothesAndAccesories() {
		return new DisplayList();
	}
}
