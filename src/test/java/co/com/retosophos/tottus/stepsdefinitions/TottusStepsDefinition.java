package co.com.retosophos.tottus.stepsdefinitions;

import co.com.retosophos.tottus.drivers.Chrome;
import co.com.retosophos.tottus.interactions.AditionalProduct;
import co.com.retosophos.tottus.interactions.CartShop;
import co.com.retosophos.tottus.tasks.AddToCartShop;
import co.com.retosophos.tottus.tasks.DisplayList;
import co.com.retosophos.tottus.tasks.SelectCategory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TottusStepsDefinition {
	
	@Given("^(.*) open the website (.*) in Chrome$")
	public void miguelOpenTheWebsiteHttpsWwwTottusComPeTottusInChrome(String actor, String url) {
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled(actor).can(BrowseTheWeb.with(Chrome.web().withUrl(url)));
	}

	@Given("^He display clothes and accesories$")
	public void heDisplayClothesAndAccesories() {
		OnStage.theActorInTheSpotlight().attemptsTo(DisplayList.ClothesAndAccesories());
	}

	@When("^He select under clothes seccion$")
	public void heSelectUnderClothesSeccion() {
		OnStage.theActorInTheSpotlight().attemptsTo(SelectCategory.underClothes());
	}

	@When("^He select one Kayser Boxer$")
	public void heSelectOneKayserBoxer() {
		OnStage.theActorInTheSpotlight().attemptsTo(AditionalProduct.Btn());
	}

	@When("^He add to cart the products to cart shop$")
	public void heAddToCartTheProductsToCartShop() {
		OnStage.theActorInTheSpotlight().attemptsTo(AddToCartShop.product());
	}

	@Then("^He can see the products in cart shop$")
	public void heCanSeeTheProductsInCartShop() {
		OnStage.theActorInTheSpotlight().attemptsTo(CartShop.product());
	}

}
