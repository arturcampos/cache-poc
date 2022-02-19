# Cache - Proof of Concept ![Cache](https://img.shields.io/badge/Redis-darkblue?style=plastic&logo=redis) ![Last updated](https://img.shields.io/github/last-commit/arturcampos/cache-poc/main?label=Last%20updated&style=plastic)  

### Languages and tools


## Content of project
This program emulates a CRUD of customers through REST APIs, using cache strategy for improving performance and avoiding Data base overloads

### Components
- ![Java11](https://img.shields.io/badge/Java11-darkgreen?style=plastic&logo=java)
- ![SpringBoot](https://img.shields.io/badge/SpringBoot-darkgreen?style=plastic&logo=springboot) 
- ![ApacheMaven](https://img.shields.io/badge/Apache%20Maven-darkgreen?style=plastic&logo=apachemaven) - Dependency manager
- ![Docker](https://img.shields.io/badge/Docker-darkblue?style=plastic&logo=docker) ![Docker-Compose](https://img.shields.io/badge/Docker%20Compose-darkblue?style=plastic&logo=docker) - Containers
- ![MongoDB](https://img.shields.io/badge/MongoDB-darkred?style=plastic&logo=mongodb) NoSQL database system
- ![Cache](https://img.shields.io/badge/Redis-darkred?style=plastic&logo=redis) NoSQL in-memory database used as cache

## Running
After cloning this repo: ⤵️

Compile and build code, inside the root directory of the project run: 🧰
```bash
mvn clean package
```
Run the environment using docker-compose: ⏯️

- without loggin:
```bash
docker-compose build
docker-compose up -d
```
- with loggin:
```bash
docker-compose build
docker-compose up
```

Third step is to access a web browser and type [http://localhost:8080/api/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
