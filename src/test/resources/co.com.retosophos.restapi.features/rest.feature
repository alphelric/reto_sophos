@tag
Feature: Rest api
  As a user of the tottus portal
  Want to buy a product from the on-line shop
  For have it at home

  Background: BaseUrl
    Given Miguel call an api from https://gorest.co.in

  @tag1
  Scenario: Albums api
    When He Put in /public-api/albums/
      | id | user_id | title                    |
      | 32 |    2684 | automation rest services |
    Then He Get the /public-api/albums/
      | id | user_id | title                    |
      | 32 |    2684 | automation rest services |
