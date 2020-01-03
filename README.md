# ThymeleafApp
This is a simple app for creating, editing and deleting products. I built it to become familiar with the Thymeleaf templating engine.

The development process began when I created the product entity using jpa to persist the objects in the MySQL database. 
Next I wrote the controllers using Spring Boot 2 and Spring MVC to give the views a way to talk to the server. 
Step 3 entailed making the views functional, using Thymeleaf th:text, th:field, th:if, and other tags, which enabled the transmission of data to and from the server. To ensure valid input was entered, I implemented javax.validation annotations, such as @Positive to prevent the product price from having a negative value. Following that, I beautified the views with Bootstrap 4, making them responsive to different device sizes. I also implemented social login with Google Auth and Spring Security by registering this app at the Google dev console.

Finally, I provisioned an Heroku app with a JAWSDB MySQL add-on and deployed the application.

 
