# Spring Boot Request Interceptor Demo

This is a simple Spring Boot application demonstrating how to implement and use request interceptors.

## Overview

Request interceptors in Spring Boot allow you to intercept HTTP requests before they reach the controller and after the response is generated. This project implements a basic interceptor that logs request and response information.

## Key Components

### RequestInterceptor
The main interceptor class that implements `HandlerInterceptor` with three key methods:

- **`preHandle()`** - Executed before the request reaches the controller
  - Logs the HTTP method type (GET, POST, etc.)
  - Logs the request URI
  - Returns `true` to continue processing or `false` to abort

- **`postHandle()`** - Executed after the controller processes the request but before the response is sent to the client
  - Useful for modifying the response or adding additional data

- **`afterCompletion()`** - Executed after the complete request-response cycle is finished
  - Useful for cleanup operations and final logging

### RequestInterceptorConfig
Configuration class that registers the interceptor with Spring's `InterceptorRegistry`.

### RESTController
Simple REST controller with a `/api/students` endpoint to test the interceptor functionality.

## How to Run

1. Make sure you have Java 17+ installed
2. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
3. The application will start on port 8080 (default)
4. Test the interceptor by visiting: `http://localhost:8080/api/students`

## Expected Output

When you make a request, you'll see console output like:
```
1 - preHandle() : Before sending req to controller
Method type : GET
Request URL : /api/students
2 - postHandle() : After the controller serves the req (before returning back resp to client)
3 - afterCompletion() : After the req and resp are completed
```

## Tutorial Reference

This project was created following the tutorial from GeeksforGeeks:
[Spring Boot Interceptor](https://www.geeksforgeeks.org/advance-java/spring-boot-interceptor/)

## Technologies Used

- Spring Boot 3.5.0
- Java 17
- Maven
- Lombok
