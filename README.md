# Project Directory Documentation

## Project Directory Structure
```
com.javguide.ems_backend
├── controller    # Handles REST API endpoint logic
├── dto           # Data Transfer Objects for data communication
├── entity        # Database entity representations
├── exception     # Custom exception handling and definitions
├── mapper        # Mapper between entity and DTO
├── repository    # Database access layer (using JPA)
└── service       # Core business logic
```

---

## Explanation of Main Directories

### 1. `src/main/java/com.javguide.ems_backend`
This folder contains the main source code for the application.

- **controller**
    - This folder contains classes responsible for handling HTTP requests from clients (REST API endpoints).
    - Example: `EmployeeController.java` manages CRUD operations for employees.

- **dto**
    - This folder contains Data Transfer Objects, used to send or receive data between the client and server.
    - Example: `EmployeeDto.java`.

- **entity**
    - This folder contains JPA entities that represent tables in the database.
    - Example: `Employee.java` represents the `employees` table in the database.

- **exception**
    - This folder is used to define custom exceptions and handle them.
    - Example: `ResourceNotFoundException.java` to handle cases where entities are not found.

- **mapper**
    - This folder contains mappers to convert between entities (`entity`) and DTOs (`dto`).
    - Example: `EmployeeMapper.java`.

- **repository**
    - This folder contains interfaces for database access using Spring Data JPA.
    - Example: `EmployeeRepository.java`.

- **service**
    - This folder contains the core business logic of the application.
    - Example: `EmployeeService.java` manages CRUD operations at the business logic level.

---

## How to Run the Project

### Prerequisites
- Java Development Kit (JDK) 17 or newer.
- Maven (if not using Maven Wrapper).

### Steps to Run
1. Clone this repository:
   ```bash
   git clone git@github.com:Allfin/proshop-v2.git
   ```
2. Navigate to the project directory:
   ```bash
   cd ems-backend
   ```
3. Run the application using Maven Wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Access the application in your browser:
   ```
   http://localhost:8080
   ```

---

## Additional Notes
- Ensure the `application.properties` file is configured correctly for database connections.
- Use the `src/test` folder to add unit and integration tests.
- If the directory structure changes, update this documentation to reflect the changes.