# WEEK 3 OUTPUTS
### SPRING CORE
## EX-1
![week3_core_ex1](https://github.com/user-attachments/assets/e8895f20-c1ff-49ea-bc67-a017b8d6629d)
## EX-2
![week3_core_ex2](https://github.com/user-attachments/assets/f610d18a-5d87-4b71-b3f3-87d7f12ff8f3)
## EX-4
![week3_core_ex4](https://github.com/user-attachments/assets/2bf68e56-53db-4642-9638-d1c93eb14453)

### SPRING JPA
## JPA vs Hibernate vs Spring Data JPA
JPA (Java Persistence API) is a specification provided by Java to define a standard way for managing relational data using Java objects. It outlines how to map Java classes to database tables and how to perform operations like saving, updating, and querying data. However, JPA itself is just a set of interfaces and annotations — it doesn’t contain any actual code. To use it in real applications, you need a concrete implementation.

Hibernate is the most widely used implementation of the JPA specification. It provides the actual logic behind how entities are persisted, how queries are executed, and how transactions are managed. Hibernate also includes several advanced features beyond JPA, such as caching, lazy loading, and batch processing, which make it a powerful ORM tool on its own. When you use JPA with Hibernate, you write code using JPA interfaces, but Hibernate executes the logic behind the scenes.

Spring Data JPA is a higher-level abstraction built by the Spring team to make working with JPA and Hibernate easier. It simplifies boilerplate code by auto-generating repository implementations and allows you to create queries by just writing method names. Spring Data JPA still uses JPA and Hibernate under the hood, but it provides a more developer-friendly and productive way to interact with your database in Spring-based applications.


