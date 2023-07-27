# Student-Management-System

This is a simple springboot project having interactive UI(User Interface) to create and update and delete a student. in this application we can store the student details for storing purpose i have used MySQL and H2(in-built) databases.

To develop this application i have used below dependencies,

Web-stater,  
Devtools,  
Spring-Data-Jpa,  
MySQL-Driver,  
H2-database,  
Thymleaf,  
Lombok,  
Swagger

Web-starter dependency is used to provide MVC based application design, it provides in-built server(tomcat) to run our application.

Devtools dependency is used to provide re-start(live re-loading) the server when make changes in the code automatically.

Data-jpa provide persistence logic to communicate with database.

MySQL driver is used to connect the Mysql database and it provides repository methods.

H2 database is a in-built database it stores the data while application is running.

thymeleaf dependency is used to develop UI of this application which is attatched with HTML.

Lombok is used to generate setter and getter for our application. By using @Data we can generate setters and getters.

Swagger dependency is used to generate the documentation of our application it provide necessary data like URL Mappings, input format, output format, method parameters, method return type etc. Also swagger provides UI to test the functionality of Rest-API.

Note : Sample requirement pictures are provided below.
