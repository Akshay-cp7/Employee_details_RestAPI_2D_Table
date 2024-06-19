- This is the continuation of my previous repository, now added more contents in the table, converted 1D structure to 2D Tables with the help of map

you can now store datas like this:
        - employees.put("E1", new CloudEmployee("E1", "Arun", 3000, "sales"));
        - employees.put("E2", new CloudEmployee("E2", "Amal", 4000, "sales"));
        - employees.put("E3", new CloudEmployee("E3", "Vimal", 2000, "HR"));
        
and works by changing the URI:
- http://localhost:8080/cloudemployee/E1
- http://localhost:8080/cloudemployee/E2
- http://localhost:8080/cloudemployee/E3



These are the changes made: 
- Map Creation: A Map called employees is created to store CloudEmployee objects. Each employee is identified by a unique employeeId (like “E1”, “E2”, “E3”).
- Static Block: This block initializes the Map with three CloudEmployee objects, each with different details.
- @GetMapping Annotation: The
- @GetMapping("/{employeeId}") annotation maps HTTP GET requests to the getCloudEmployeeDetails method.
- The {employeeId} in the path indicates that it’s a variable part of the URL.
- @PathVariable Annotation: The @PathVariable annotation is used to extract the employeeId from the URL and pass it as a parameter to the getCloudEmployeeDetails method.
- Method Modification: The getCloudEmployeeDetails method now uses the employeeId to retrieve and return the corresponding CloudEmployee object from the Map.
- JSON Serialization: The CloudEmployee class has been annotated with @JsonProperty, which tells Spring Boot to include these fields when converting the object to JSON format for the response.



Code written on intellij with help of springboot. java version : 21, Dependancy : Spring web,
check out my previous code for one diamentional table,
