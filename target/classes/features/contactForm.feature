Feature: Creating a simple Contact Form

Scenario: Sign up to the contact form

     Given user is in Application Home Page
     When the title is Basic Contact Form - myContactForm.com
     Then click on here link
     When the title is Become a Site User - myContactForm.com
     Then user enters the details
     |Sabari Kannan| sabarikannan@gmail.com|
     Then user click on privacy check box
     And user clicks on submit button
     Then verifying the status

     
     