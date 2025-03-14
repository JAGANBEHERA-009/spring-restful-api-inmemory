# spring-restful-api-inmemory
This repository hosts a Spring Boot backend with a RESTful API, featuring Service, Repository, and Model layers. It uses ArrayList and Java objects for in-memory data storage, supporting XML/JSON formats. Testable via Postman with HTTP methods: GET, POST, PUT, DELETE.
Spring Boot RESTful API Backend
This project is a backend application built using Spring Boot that provides a RESTful API for managing data. The application uses an in-memory data store (ArrayList) to simulate a database and supports XML and JSON data formats. The API is designed to be tested using Postman or any other HTTP client.

Features
RESTful API: Implements standard HTTP methods (GET, POST, PUT, DELETE).

Layered Architecture: Follows a clean separation of concerns with Service, Repository, and Model layers.

In-Memory Data Store: Uses ArrayList and Java objects to store data.

Data Formats: Supports both XML and JSON for requests and responses.

Testing: Easily testable using Postman.

Technologies Used
Spring Boot: Framework for building the RESTful API.

Java: Programming language used for development.

Postman: Tool for testing the API endpoints.

Maven: Build automation and dependency management.

Project Structure
The project is organized into the following layers:

Model: Contains the data structure (Java objects).

Repository: Manages the in-memory data store (ArrayList).

Service: Implements business logic and interacts with the repository.

Controller: Exposes RESTful endpoints and handles HTTP requests.

API Endpoints
HTTP Method	Endpoint	Description
GET	/api/data	Get all data items.
GET	/api/data/{id}	Get a specific data item by ID.
POST	/api/data	Create a new data item.
PUT	/api/data/{id}	Update an existing data item by ID.
DELETE	/api/data/{id}	Delete a data item by ID.
How to Run the Project
Clone the Repository:

bash
Copy
git clone [https://github.com/JAGANBEHERA-009/spring-restful-api-inmemory]
cd spring-restful-api
Build the Project:

bash
Copy
mvn clean install
Run the Application:

bash
Copy
mvn spring-boot:run
Access the API:

The API will be available at http://localhost:8080.

Use Postman to test the endpoints.

Example Requests
1. Get All Data Items
Method: GET

URL:  http://localhost:8080/jobPosts

Response:

json
[
    {
        "postId": 1,
        "postProfile": "Java Developer",
        "postDesc": "Must have good experience in core Java and advanced Java",
        "reqExperience": 2,
        "postTechStack": [
            "Core Java",
            "J2EE",
            "Spring Boot",
            "Hibernate"
        ]
    },
    {
        "postId": 2,
        "postProfile": "Frontend Developer",
        "postDesc": "Experience in building responsive web applications using React",
        "reqExperience": 3,
        "postTechStack": [
            "HTML",
            "CSS",
            "JavaScript",
            "React"
        ]
    },
    {
        "postId": 3,
        "postProfile": "Data Scientist",
        "postDesc": "Strong background in machine learning and data analysis",
        "reqExperience": 4,
        "postTechStack": [
            "Python",
            "Machine Learning",
            "Data Analysis"
        ]
    },
    {
        "postId": 4,
        "postProfile": "Network Engineer",
        "postDesc": "Design and implement computer networks for efficient data communication",
        "reqExperience": 5,
        "postTechStack": [
            "Networking",
            "Cisco",
            "Routing",
            "Switching"
        ]
    },
    {
        "postId": 5,
        "postProfile": "Mobile App Developer",
        "postDesc": "Experience in mobile app development for iOS and Android",
        "reqExperience": 3,
        "postTechStack": [
            "iOS Development",
            "Android Development",
            "Mobile App"
        ]
    }
]
2. Create a New Data Item
Method: POST

URL:  http://localhost:8080/jobPost

Body (JSON):

json
{
    "postId": 6,
    "postProfile": " App Developer",
    "postDesc": "Experience in mobile app development for iOS and Android",
    "reqExperience": 9,
    "postTechStack": [
        "iOS Development",
        "Android Development",
        "Mobile App"
    ]
}
Response:

json
{
    "postId": 6,
    "postProfile": " App Developer",
    "postDesc": "Experience in mobile app development for iOS and Android",
    "reqExperience": 9,
    "postTechStack": [
        "iOS Development",
        "Android Development",
        "Mobile App"
    ]
}
3. Update a Data Item
Method: PUT

URL: http://localhost:8080/jobPost

Body (JSON):

json
Copy
{
    "postId": 6,
    "postProfile": "Mobile Developer",
    "postDesc": "Experience in building responsive web applications using React",
    "reqExperience": 8,
    "postTechStack": [
        "HTML",
        "CSS",
        "JavaScript",
        "React"
    ]
}
Response:

json
{
    "postId": 6,
    "postProfile": "Mobile Developer",
    "postDesc": "Experience in building responsive web applications using React",
    "reqExperience": 8,
    "postTechStack": [
        "HTML",
        "CSS",
        "JavaScript",
        "React"
    ]
}
4. Delete a Data Item
Method: DELETE

URL: http://localhost:8080/jobPost/5

Response:Deleted

Testing with Postman
Import the provided Postman Collection (if available) into Postman.

Use the collection to test all endpoints (GET, POST, PUT, DELETE).

Ensure the request headers are set to Content-Type: application/json or Content-Type: application/xml based on the data format.

Future Enhancements
Add validation for request data.

Implement error handling and custom exceptions.

Add logging for better debugging.

Extend the data model with additional fields.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Author
[jagan Behera]
[https://github.com/JAGANBEHERA-009]
GitHub Profile

Feel free to contribute to the project by opening issues or submitting pull requests!

