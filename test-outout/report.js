$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/contactForm.feature");
formatter.feature({
  "name": "Creating a simple Contact Form",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sign up to the contact form",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in Application Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactForm.user_is_in_Application_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title is Basic Contact Form - myContactForm.com",
  "keyword": "When "
});
formatter.match({
  "location": "ContactForm.the_title_is_Basic_Contact_Form_myContactForm_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on here link",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactForm.click_on_here_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title is Become a Site User - myContactForm.com",
  "keyword": "When "
});
formatter.match({
  "location": "ContactForm.the_title_is_Become_a_Site_User_myContactForm_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the details",
  "rows": [
    {
      "cells": [
        "Sabari Kannan",
        "sabarikannan@gmail.com"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ContactForm.user_enters_the_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on privacy check box",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactForm.user_click_on_privacy_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "ContactForm.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifying the status",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactForm.verifying_the_status()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});