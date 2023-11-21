Spring Boot REST API Example
A simple Spring Boot project that exposes a RESTful API to retrieve a list of products in JSON format.

Packages
Model: Contains data model classes, e.g., Product.
Controller: Manages HTTP requests and defines API endpoints.
Service: Implements business logic.
Config: Includes configuration classes for the application.
Usage
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/your-springboot-rest-api.git
Navigate to the project directory:

bash
Copy code
cd your-springboot-rest-api
Run the application:

bash
Copy code
mvn spring-boot:run
Access the API at http://localhost:8080/api/products.

API Endpoint
GET /api/products: Retrieve a list of products in JSON format.

Example Request:

bash
Copy code
curl http://localhost:8080/products
![Screenshot 2023-11-21 202959](https://github.com/Ankush-ai/SpringRestDemo/assets/83574516/7bc7092a-c772-4b54-9694-9c285a0806e0)


Configuration
The project uses an in-memory database with default configurations.

Contribution
Contributions are welcome! Feel free to open issues or submit pull requests.

License
This project is licensed under the MIT License.
