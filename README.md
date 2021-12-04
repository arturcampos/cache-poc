# Cache - Proof of Concept

Proof of concept using springboot + mongoDB + redis as a mem-cache

## Content of project
This program emulates a CRUD of customers through REST APIs, using cache strategy for improving performance and avoiding Data base overloads

### Components
- Mongo Data base (NoSQL database system)
- Redis (NoSQL in-memory database used as cache)
- Java 11
- Spring Boot v2.6.0

## Running
These are the pre-requirements for running this project:
* [Docker](https://docs.docker.com/engine/install/) installed
* [docker-compose](https://docs.docker.com/compose/install/) installed

First step is to compile and build code, inside the root directory of the project run:
```bash
mvn clean install
```
Second step is to run the environment using docker-compose:

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