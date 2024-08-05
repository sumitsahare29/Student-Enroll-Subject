
# Student Enrollement

This is simple Spring Boot application that manages student enrollements in multiple subjects. It uses Hibernate as the Object-Relational-Mapping framework and MySQL as the database.  

I have created only the Backend Part, there is no security added.



## Features

- Student Management: Create, Enroll student in multiple subject, Read students.
- Subject Management: Create, Read subjects.
- Hibernate Integration: Use Hibernate for ORM.
- MySQL Database: Store data in a MySQL database.


## Configure Database

 - Create MySQL Database named 'microservices'.
 - Update the 'application.properties' file in 'src/main/resources' with your MySQL database credentials:
 ```
   spring.datasource.url=jdbc:mysql://localhost:3306/microservices
   spring.datasource.username=root
   spring.datasource.password=root
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

   ```
## Installation

- Download the latest Binary Zip archive under "Files": [Maven](https://maven.apache.org/download.cgi)
- Extract the downloaded ZIP File to the directory of your choice.
- Set up environment Variables
- Verify Installation - Open CMD and type 'mvn -version'.


    
## Run In CMD
- Download and Extract the ZIP File

  First, download the ZIP file containing your Spring Boot application from GitHub. Once  downloaded, extract the contents of the ZIP file to a directory on your local machine.

```
 https://github.com/sumitsahare29/Student-Enroll-Subject.git
```

- Build the Spring Boot Application
  
  If project uses Maven, navigate to the directory containing 'pom.xml' and run:

```bash
 mvn clean package
```

- Run the Spring Boot Application
  
  After a successful build, navigate to the directory where the JAR file is located and execute.

```bash
  cd target
```
```bash
  java -jar StudentEnrollSubject-0.0.1-SNAPSHOT.jar
```


## API Reference

My whole Spring Boot Application Running on SERVER PORT 8090

### Student:

- Create Students (POST)
  
```http
   localhost:8090/students/addStd
```
     {
     "std_name":"sumit sahare",
     "std_address":"pune"
     }


### Subject:

- Create Subjects (POST)
  
```http
   localhost:8090/subjects/addSub
```
   
     {
      "sub_name":"information technology"
     }


-  Read All Subject (GET)

```http
  localhost:8090/subjects/getAllSub
```

 ### Enrollments:

- Enroll the Student in Subject (POST)
  
```http
   localhost:8090/students/{std_id}/enroll/{sub_id}
``` 


- Read All Students (GET)

```http
  localhost:8090/students/getAllStd
```

- Read Single Student (GET)

```http
  localhost:8090/getSingleStd/{std_id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `std_id`      | `Integer` | **Required**. std_id of item to fetch |

  ## Images
  <img src="https://github.com/user-attachments/assets/61051274-ff33-4e77-8ff5-d3366b03c174" alt="Screenshot" width="400" height="300">
  <img src="https://github.com/user-attachments/assets/b47ac4cb-f651-4e91-bcd0-bcf289cbebb5" alt="Screenshot" width="400" height="300">

