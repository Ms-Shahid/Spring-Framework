### References
- [Spring projects](https://spring.io/projects)
- [Spring Boot ](https://spring.io/guides/gs/spring-boot/)

### Annotations
 Spring supports various annotations, lets understand them 

| Annotations     | Defined Level     | Description                                                                                             |
|-----------------|-------------------|---------------------------------------------------------------------------------------------------------|
| @Controller     | Class             | informs the dispatcher servelet that this controller handles the incoming request at specified endpoint |
| @RequestMapping | method            | helps in declaring the custom endpoint                                                                  |
| @ResponseBody   | method            | Informs dispatcher to return a method response as http response in web page                             |
| @RequestMapping | method-parameter  | Handles to get the parameters from the view                                                             |
| @Service        | Class             | the business logic resides within the service layer                                                       |
| @Autowired      | variable | the created bean can we used without creating object of bean with Autowired                             |
| @Primary     | method | If there are multiple @componentscan, using @Primary tell spring to pick this one as primary bean to create                             |
| @Configuration | App Config  | Sets up the required configurations                                                            |
