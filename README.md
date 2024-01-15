## Quick Web Application using JSP & Servlets

#### Set up 

- Get the root directory which contains the pom.xml
- Power up the app using `mvn clean` & `mvn install`
- Then trigger the tomcat server using `mvn tomcat67:run`
- Head to `port:8080/login`

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

- Request comes to Dispatcher -> controller/JSP/Servlet : this pattern is called _front controller pattern_
- The Dispatcher servlet is defined in `web.xml`
- Dispatcher servlet based on url in controller, trigger the request at specified endpoint ex : `/login`
- Typically we show the info as JSP page in web browser, therefore, the response of controller is a view
- We have to tell dispatcher that these views are present with `prefix(filename) + suffix(.jsp)`
- To handle this, we have a bean called `viewResolver`, present in class `class="org.springframework.web.servlet.view.InternalResourceViewResolver"`

### Architecture of Spring mvc

- The incoming request comes to dispatcher(front controller)
- The dispatcher searches for the right `endpoint` to `route` the request
- Once the dispatcher finds the right route, the request goes to the controller to handle the request endpoint
- Controller performs some operations such as return a `web page`, the controller tells the dispatcher which view to be rendered
- Then the dispatcher talks to viewResolver to get the display view
- Finally, the dispatcher then renders the request, executes the request & sends the response back


### Annotations
 Spring supports various annotations, lets understand them 

| Annotations     | Defined Level | Description                                                                                             |
|-----------------|---------------|---------------------------------------------------------------------------------------------------------|
| @Controller     | Class         | informs the dispatcher servelet that this controller handles the incoming request at specified endpoint |
| @RequestMapping | method        | helps in declaring the custom endpoint                                                                  |
| @ResponseBody   | method        | Informs dispatcher to return a method response as http response in web page                             |
