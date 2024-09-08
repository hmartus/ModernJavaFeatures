[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Java21 - IoT Device Management System

This a sample Spring Boot implementation for TUP Manila Computer Engineering faculty reference. 
The intention is to demonstrate how to create a simple Java backend application with the use of Spring Boot.
Also, a UI was added to demonstrate that you can implement a full-stack application using the Java entirely.

## Functionalites
### FrontEnd
    use this link here: http://localhost:8080/ui

### BackEnd
- POST http://localhost:8080/api/devices/register
```
{  
    "name": "TUP Sensor111",
    "type": "Sensor",
    "location": "TUP PH"
}
```
- GET  http://localhost:8080/api/devices

#### Testing the API
1. Use Bruno, no account is needed. [Download here](https://www.usebruno.com/downloads)
2. Once the Bruno is installed, open the app and import the collection and select "Bruno Collection".
3. Open "API Tests" folder and select "bruno-api-tests.json" file
4. Select the "Location" as "../iotdevicemgmt/API Tests" and click "Import".
5. Notice the "{{host}}" is in red color, this means the environment is not properly set.
6. Locate the "Environment" on the upper right corner of the screen, and drop it down, then select "LocalMachine". {{host}} will now turn to green.

### Links:

Java 21
- [JDK 21](https://jdk.java.net/21/)
- [Alternative | Eclipse Temurin](https://adoptium.net/)

IDE
- [IntelliJ](https://www.jetbrains.com/idea/download/?section=windows)
- [NetBeans 22+](https://netbeans.apache.org/front/main/download/)

BackEnd
- [Spring Boot](https://start.spring.io/)

FrontEnd
- [Vaadin](https://vaadin.com/)