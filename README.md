# Yoga Class Admission Project

This project is a simple web application for handling Yoga Class admissions. Participants can enroll in the monthly classes, choose their preferred batches, and make monthly payments.

## Problem Statement

As the CTO of an outsourcing firm, you are tasked with building an admission form for monthly Yoga classes. Participants can enroll any day of the month but are required to pay for the entire month. The monthly fee is 500 INR, and there are four batches available each day. Participants can shift between batches monthly but must stay in the same batch within a month.

## Technology Used

- **Frontend:**
  - HTML
  - CSS
  - JavaScript

- **Backend:**
  - Spring Boot (Java)

- **Database:**
  - MySQL

## Setup Instructions

1. **Frontend:**
   - Open `index.html` in a web browser.
   - Enroll participants using the provided form.

2. **Backend:**
   - Set up a new Spring Boot project.
   - Configure your database connection in `application.properties`.
   - Run the Spring Boot application.

## Database Configuration

```properties
# MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/yoga_classes
spring.datasource.username=root
spring.datasource.password=root_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect


Certainly! Below is a template for a well-documented README.md file for your Yoga Class Admission project. Feel free to customize it further based on your specific needs.

markdown
Copy code
# Yoga Class Admission Project

This project is a simple web application for handling Yoga Class admissions. Participants can enroll in the monthly classes, choose their preferred batches, and make monthly payments.

## Problem Statement

As the CTO of an outsourcing firm, you are tasked with building an admission form for monthly Yoga classes. Participants can enroll any day of the month but are required to pay for the entire month. The monthly fee is 500 INR, and there are four batches available each day. Participants can shift between batches monthly but must stay in the same batch within a month.

## Technology Used

- **Frontend:**
  - HTML
  - CSS
  - JavaScript

- **Backend:**
  - Spring Boot (Java)

- **Database:**
  - MySQL

## Folder Structure

your_project/
|-- src/
| |-- main/
| |-- java/
| | |-- com/
| | |-- yourcompany/
| | |-- YourJavaApplication.java
| |
| |-- resources/
| |-- static/
| |-- index.html
| |-- styles.css
| |-- script.js
|
|-- pom.xml

markdown
Copy code

- `src/main/java/com/yourcompany/`: Java code (backend) resides here.
- `src/main/resources/static/`: Static resources (HTML, CSS, JavaScript) are stored here.

## Setup Instructions

1. **Frontend:**
   - Open `index.html` in a web browser.
   - Enroll participants using the provided form.

2. **Backend:**
   - Set up a new Spring Boot project.
   - Configure your database connection in `application.properties`.
   - Run the Spring Boot application.

## Database Configuration

```properties
# MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/yoga_classes
spring.datasource.username=root
spring.datasource.password=root_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
Replace placeholders with your actual MySQL database connection details.

Testing
Enroll participants through the form.
Check the console for backend logs.
Verify enrolled participants using the backend API.
Additional Notes
Make sure to replace placeholders in code with your actual values.
Adjust configurations based on your specific environment.
For a production setup, consider additional security measures.
![Screenshot 2023-12-19 181042](https://github.com/Ankush-ai/YogaApp/assets/83574516/ff0e750b-3a26-468f-8c1a-b454ac81c51a)
![Screenshot 2023-12-19 175314](https://github.com/Ankush-ai/YogaApp/assets/83574516/74df8ea9-fa4a-4a97-9d67-23ed7c1c3352)
![Screenshot 2023-12-19 175328](https://github.com/Ankush-ai/YogaApp/assets/83574516/59ea5dcc-a0c6-4571-a850-ead644a3f8e2)




