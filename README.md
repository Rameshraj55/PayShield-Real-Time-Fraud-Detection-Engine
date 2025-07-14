# 🛡️ PayShield: Real-Time Fraud Detection Engine

A scalable, real-time fraud detection system that processes financial transactions, evaluates them using rule-based and pattern-matching strategies, and generates alerts for suspicious activities. Built to extend your understanding of Java microservices, Kafka event-driven architecture, and secure APIs.

---

## 📌 Features

-  Detects suspicious transactions in real-time using custom fraud rules.
-  Event-driven architecture with Kafka for loose coupling and async processing.
-  Rule engine using Strategy + Chain of Responsibility patterns.
-  Alerts generated for flagged transactions and stored for analyst review.
-  Secured endpoints with JWT-based authentication and role-based access control.
-  Ready for scaling horizontally with separate microservice modules.

---

##  Tech Stack

| Layer           | Technology                     |
|----------------|----------------------------------|
| Backend         | Java 17, Spring Boot            |
| Messaging Queue | Apache Kafka                    |
| Database        | MySQL                           |
| Caching/Search  | (Optional) Elasticsearch        |
| Auth            | Spring Security + JWT           |
| Architecture    | REST APIs, Microservices, Event-driven |

 API Endpoints (Sample)

| Method | Endpoint              | Description              |
| ------ | --------------------- | ------------------------ |
| POST   | `/transactions`       | Submit a new transaction |
| GET    | `/alerts`             | View all fraud alerts    |
| POST   | `/auth/login`         | Login with JWT           |
| PATCH  | `/alerts/{id}/review` | Mark alert as reviewed   |


