Here's the README file for your student portal project:

---

# Student Portal

Student Portal is a web application for managing student information, performing CRUD (Create, Read, Update, Delete) operations on a student database.

## Database Details

- **Database Name**: `student_db`
- **Table Name**: `students`
- **Table Schema**:
  ```sql
  CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)  not null,
    email VARCHAR(50) not null,
    age INT
  );
  ```

## Features

- **Create**: Add new students to the database.
- **Read**: Display a list of all students.
- **Update**: Edit the details of existing students.
- **Delete**: Remove students from the database.

## Tech Stack

- Java EE
- JDBC
- JSP
- Servlets
- MySQL database

## Installation

1. Clone the repository:

```bash
$ git clone https://github.com/Purushotham-Palla/studentportal.git
```

2. Set up the database:

   - Create a database named `student_db`.
   - Create the `students` table using the schema provided above.

3. Import the project into your IDE as a Dynamic Web Project.

4. Add the necessary JAR files for JDBC and Servlets.

5. Update the database connection details in the utility class.

## Deployment

1. Deploy the project on a servlet container like Apache Tomcat.

2. Access the application through the provided URL (e.g., `http://localhost:8080/studentportal`).

## Usage

- **Add Student**: Navigate to the "Add Student" page and fill out the form.
- **View Students**: Navigate to the "View Students" page to see the list of students.
- **Update Student**: Click the "Edit" button next to a student's details to update their information.
- **Delete Student**: Click the "Delete" button next to a student's details to remove them from the database.

## Contact

For any questions or feedback, feel free to reach out:

- **Author**: Purushotham-Palla
- **GitHub**: [Purushotham-Palla](https://github.com/Purushotham-Palla/)
- **Email**: ppurushotham2001@gmail.com

---

