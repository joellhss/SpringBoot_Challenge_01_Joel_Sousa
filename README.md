# Cars API
Start using the URI `/cars`.
```
POST requests: /cars
GET requests: /cars/{chassiId}
```

## About the project
This project was developed for the first challenge of the Compass scholarship program. For this Java project, Spring Boot technology was utilized along with the following dependencies: Data JPA, JDBC, Thymeleaf, and Spring Web. Furthermore, for data persistence, the MySQL database running in a Docker container was used.

## Instructions

### POST

The JSON in the body of your POST request must be done as per the code example below.

```json
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

### GET

GET type requests can be made as per the example below.

**Example URI:**

```
/cars/1
```

**Example response:**

```json
{
    "chassisId": 1,
    "model": "X5",
    "brand": "bmw",
    "color": "green",
    "fabricationYear": "2018/2019"
}
```

**Common errors:**

- **Error 404: Not Found.**
  - Oops! It appears that this chassisId has not yet been registered.
- **Error 500: Unavailable Server.**

