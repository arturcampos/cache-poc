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

```bash
docker-compose up
```
