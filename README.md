## Quick Web Application using JSP & Servlets

#### Set up 

- Get the root directory which contains the pom.xml
- Power up the app using `mvn clean` & `mvn install`
- Then trigger the tomcat server using `mvn tomcat67:run`
- Head to `port:8080/login`

![img.png](img.png)
![img_1.png](img_1.png)

#### Details 

- The web app consists of JSP pages along with Servlet business logics to handle the requests
- App consists of various endpoints such as `/login`, `/welcome`, `/resource` etc..
- The application is currently WIP

### Refactor quick app to use Spring-MVC

- Added a spring-mvc dependency 
- ```
  <dependency>
  <groupId>org.springframework</groupId>
  <artifactId>spring-webmvc</artifactId>
  <version>4.2.2.RELEASE</version>
  </dependency>
  ```
- Add the servlet in `web.xml`


### Spring Application flow

- Request comes to Dispatcher => controller/JSP/Servlet : this pattern is called _front controller pattern_
- The Dispatcher servlet is defined in `web.xml`
- Dispatcher servlet based on url in controller, trigger the request at specified endpoint ex : `/login`
- Typically we show the info as JSP page in web browser, therefore, the response of controller is a view
- We have to tell dispatcher that these views are present with `prefix(filename) + suffix(.jsp)`
- To handle this, we have a bean called `viewResolver`, present in class `class="org.springframework.web.servlet.view.InternalResourceViewResolver"`

### Architecture of Spring mvc

![Architecture](https://media.geeksforgeeks.org/wp-content/uploads/20231106150237/Spring-MVC-Framework-Control-flow-Diagram.png)
- The incoming request comes to dispatcher(front controller)
- The dispatcher searches for the right `endpoint` to `route` the request
- Once the dispatcher finds the right route, the request goes to the controller to handle the request endpoint
- Controller performs some operations such as return a `web page`, the controller tells the dispatcher which view to be rendered
- Then the dispatcher talks to viewResolver to get the display view
- Finally, the dispatcher then renders the request, executes the request & sends the response back


### Annotations
 Spring supports various annotations, lets understand them 

| Annotations     | Defined Level     | Description                                                                                             |
|-----------------|-------------------|---------------------------------------------------------------------------------------------------------|
| @Controller     | Class             | informs the dispatcher servelet that this controller handles the incoming request at specified endpoint |
| @RequestMapping | method            | helps in declaring the custom endpoint                                                                  |
| @ResponseBody   | method            | Informs dispatcher to return a method response as http response in web page                             |
| @RequestMapping | method-parameter  | Handles to get the parameters from the view                                                             |
| @Service        | Class             | Spring create a bean of @Service annotated class                                                        |
| @Autowired      | variable | the created bean can we used without creating object of bean with Autowired                             |


### How the view gets renders from different web pages

- Similar to `req.setAttribute("name", name)` in case of `HttpServletRequest`
- In Spring MVC, handles this req using `ModelMap` to render in view. Just make sure that same attribute-name is passed
- `Model` presents this between the controller & view
- This attribute from the view we can get using `@RequestMapping`

### Changes done
- deleted all the servlet classes
- replaced with controller & service package 
- The `/login` is handled in `controller` & validation is added in `service`

## How Spring searchs/know which instance to create
- Spring searches in the package defined in `xml` context `componentscan` bean
- Annotations such as `@controller`, `@service` , `@Autowired` spring manages all & creates instances through scanning in bean context `component-scan`
### Log 4J

- TRACE - Prints complete error info
- DEBUG - Prints good error info
- INFO - prints useful info about error
- WARN - prints warnings
- ERROR - prints the error
