# Cars API

Welcome to the Cars API.<br>
Start using the URI `/cars`.
```
POST requests: /cars

GET requests: /cars/{chassiId} or /cars/all

PUT requests: /cars/{chassiId}
```

## About the project

This project was developed for the first challenge of the Compass scholarship program. For this Java project, Spring Boot technology was utilized along with the following dependencies: Data JPA, MySQL Connector, Thymeleaf, Spring Web and Validation. Furthermore, for data persistence, the MySQL database running in a Docker container was used.

Since this is a fictional project, please take into account that, for the purposes of this project, the chassiId is automatically generated by the system itself. We can envision that the system’s objective is to assign chassis numbers to the cars being manufactured.

## Instructions

### Connection to the database

Before running this application, you must have the MySQL DBMS running on your machine. The default user used is:

```
user: root
password: root
```

After completing these steps, you will be ready to run the application. When this API is executed, it will use these settings to create a database called `db_car`.

*If you need to run this application in another DBMS or with other configurations, don't forget to change the `application.properties` settings and add the dependencies in the `pom.xml` file.*

### POST request

The JSON in the body of your POST request must be done as per the code example below:

```
{
    "model": "X5",
    "brand": "bmw",
    "color": "green",
    "fabricationYear": "2018/2019"
}
```

**Common rules:**

- Null values and empty fields are not allowed.
- Element properties are not case sensitive and will be adjusted automatically.
- The "brand" element is configured to allow only the brands: Chevrolet, Volvo, BMW, and Ford.
- The "fabricationYear" element must follow the "year/year" format, other formatting will not be allowed. Example: "2022/2023".
- The "chassisId" field will get a value automatically. It is not necessary to add this element in the body of the request.

**Common errors:**

- **Error 404: Not Found.**
  - Only BMW, Chevrolet, Ford, and Volvo brands are permitted.
- **Error 400: Invalid Data.**
  - Please check that the 'fabricationYear' field property is in the format 'year/year'.
  - All fields must be present, and empty fields are not permitted.
  - Empty fields are not allowed.
- **Error 500: Unavailable Server.**

### GET request

#### GET by chassisId

GET requests for chassisId can be made as per the example below.

**Example URI:**

```
/cars/1
```

**Sample response:**

```
{
    "chassiId": 1,
    "model": "X5",
    "brand": "BMW",
    "color": "Green",
    "fabricationYear": "2018/2019"
}
```

#### GET for all cars

GET requests for all cars can be made as per the example below.

**Example URI:**

```
/cars/all
```

**Common errors:**

- **Error 404: Not Found.**
  - Oops! It appears that this chassiId has not yet been registered.
  - Oops! It appears that no cars have been registered yet.
- **Error 500: Unavailable Server.**

### PUT request

To change a car that has already been created, enter the chassisId in the same way as in the GET request. In the body, use the same JSON model as the POST request.

**Example URI:**

```
/cars/1
```

**Example body:**

```
{
    "model": "X5",
    "brand": "BMW",
    "color": "White",
    "fabricationYear": "2022/2023"
}
```

**Common errors:**

- The same errors as the POST request.
- **Error 400: Invalid Data.**
  - The 'chassiId' field is not necessary in the request body, but if you choose to add it, it must be the same as the URI.


Thank you to the SMs and instructors at Compass for all the tips and guidance in completing this project.
---

<p align="center">
Made with ❤️ by <a href="https://github.com/joellhss">Joel Sousa</a>.
</p>

