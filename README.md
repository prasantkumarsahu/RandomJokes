# Random Jokes
This is a API project for adding Jokes and fetching added Jokes randomly.

![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot "Spring Boot") ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white "Java") ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white "Postman") ![Google Chrome](https://img.shields.io/badge/Google%20Chrome-4285F4?style=for-the-badge&logo=GoogleChrome&logoColor=white "Google Chrome")

## Frameworks and Languages
![Java v17](https://img.shields.io/badge/Java-v17-green "Java 17") ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-v3.0.5-brightgreen "Spring Boot v3.0.5")

---
## Browser / Tools
![Google Chrome](https://img.shields.io/badge/Google%20Chrome-v112.0.5615.138-yellow "Google Chrome") ![Postman](https://img.shields.io/badge/Postman-v10.13.0-orange "Postman")
---
## Dataflow
- ### End Points / Controllers
    - `@GetMapping(value = "/joke")`
    - `@PostMapping(value = "/joke")`
- ### Services
    - ```java
        public String getJoke() {

		int randNum = (int) (Math.random() * (jokes.size() - 1));

		return jokes.get(randNum);
	    }
        ```
    - ```java
        public void addJoke(String joke) {

		jokes.add(joke);
	    }
        ```
- ### Database
    I haven't used any **Database** in this project yet. But for data storing I have used a `Collections`.

    ```java
    private List<String> jokes
    ```
---
## Datastructures
- `ArrayList<>`
---
## Summary
This API is a `Spring Boot` project that is about fetching random jokes. We can add and fetch random jokes. In this project request is sent from the client on HTTP in JSON body or from path variable and stored in object then response is sent back from the server by JSON format to the client.

