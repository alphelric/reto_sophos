@tag
Feature: Tottus shopping
  As a user of the tottus portal
  Want to buy a product from the on-line shop
  For have it at home

  Background: Opening the Tottus portal in browser
    Given Miguel open the website https://www.tottus.com.pe/tottus/ in Chrome

  @buyingClothes
  Scenario: Buying an under clothe from Tottus
    Given He display clothes and accesories
    When He select under clothes seccion
    And He select one Kayser Boxer
    And He add to cart the products to cart shop
    Then He can see the products in cart shop
