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
git clone https://github.com/your-username/spring-restful-api.git
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

URL: http://localhost:8080/api/data

Response:

json
Copy
[
  {
    "id": 1,
    "name": "Item 1",
    "description": "This is item 1"
  },
  {
    "id": 2,
    "name": "Item 2",
    "description": "This is item 2"
  }
]
2. Create a New Data Item
Method: POST

URL: http://localhost:8080/api/data

Body (JSON):

json
Copy
{
  "name": "New Item",
  "description": "This is a new item"
}
Response:

json
Copy
{
  "id": 3,
  "name": "New Item",
  "description": "This is a new item"
}
3. Update a Data Item
Method: PUT

URL: http://localhost:8080/api/data/1

Body (JSON):

json
Copy
{
  "name": "Updated Item",
  "description": "This item has been updated"
}
Response:

json
Copy
{
  "id": 1,
  "name": "Updated Item",
  "description": "This item has been updated"
}
4. Delete a Data Item
Method: DELETE

URL: http://localhost:8080/api/data/1

Response: 204 No Content

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
[jaganbehera850@gmail.com]
GitHub Profile

Feel free to contribute to the project by opening issues or submitting pull requests!

