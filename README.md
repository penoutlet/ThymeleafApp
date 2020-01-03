# ThymeleafApp
This is a simple app for creating, editing and deleting products. I built it to become familiar with the Thymeleaf templating engine.

The development process began when I created the product entity using jpa annotations, and also marked its fields with validation annotations to enact server-side validation. 
Next I wrote the controllers using Spring Boot 2 and Spring MVC to give the views a way to talk to the server. 
Step 3 entailed making the views functional, using Thymeleaf th:text, th:field, th:if, and other such tags, enabling the transmission of data to and from the server.

I also implemented social login with Google Auth and Spring Security by registering this app at the Google dev console.
