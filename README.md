# routingCalculator
## 1. rCFull
### 1.1 Overview

This is a web-based application which will perform the following functions:

  1. Read an xml file and store relevant values in two arrays, Edge and Vertices.
  2. Save these arrays to the database.
  3. Create weighted graph diagram from these two arrays.
  4. Calculate shortest path when two nodes are clicked using Bellman Fords algorithm.

This version was developed using the following technologies:

1. Presentation: HTML5, Javascript, CSS, Bootstrap CSS
2. Application: Spring Boot, DOM Parser, Maven
3. Data:  PostgreSQL

### 1.2 Installation

1. Install PostgreSQL
2. Create database using schema file located in additional/schema
3. Open the application in a Java IDE (i.e. Netbeans) and find the below lines in application.properties in the project file (src/main/resources) and add your PostgreSQL Server username and password after the equals

```
	spring.datasource.username= 
	spring.datasource.password= 
```

4. Build the project and then run the project
5. Open desired browser (Firefox and Chrome were used during development) and enter localhost:8080 into the web address bar

### 1.3 Dependencies

+ Java SDK: 17
+ PostgreSQL: 14.2.2
+ Maven: 3.0.0

## 2. rCLight
### 2.1 Overview

This version of routingCalculator has the database requirement removed 

### 2.2 Installation

1. Open the application in a Java IDE (i.e. Netbeans), build the project and then run the project
OR open command line (Windows only) and navigate to rCLight\routingCalculator\target and run the following command:

```
java -jar routingCalculator-0.0.1-SNAPSHOT.jar
```

2. Open desired browser (Firefox and Chrome were used during development) and enter localhost:8080 into the web address bar

### 2.3 Dependencies

+ Java SDK: 17
+ Maven: 3.0.0
