# 🛡️ PayShield: Real-Time Fraud Detection Engine

A real-time fraud detection system designed to analyze payment transactions and detect suspicious activity based on rule-based logic and scalable microservices architecture.

---

## 🚀 Features

- Detects and blocks fraudulent transactions in real-time
- Event-driven microservices architecture for high scalability
- Rule-based fraud engine with support for custom detection logic
- Secure access control with role-based authorization
- Searchable alert logs using Elasticsearch
- Decoupled services for transaction ingestion, fraud detection, and alerting

---

## 🧠 Problem Statement

With the rise in digital payments, fraud detection is more critical than ever. The goal of this project is to design a reliable and extensible system that can detect suspicious patterns (like unusual location, transaction spikes, or duplicate transactions) and trigger alerts or block them immediately — all in real-time.

---

## 🧱 Architecture Overview

- **Microservices** split into:
  - `Transaction Service`
  - `Fraud Detection Service`
  - `Alerting Service`
  - `User/Auth Service`
- **Event-Driven Messaging:** Decoupling via Kafka
- **Data Stores:** MySQL for core data, Elasticsearch for searchable alerts
- **Security:** JWT-based auth with Spring Security

![LLD Diagram](docs/payshield-lld.png)

---

## ⚙️ Core Concepts & Design Patterns

- **SOLID Principles** for clean, testable, and maintainable code
- **Design Patterns Used:**
  - **Strategy Pattern:** For pluggable fraud detection strategies
  - **Chain of Responsibility:** For processing multiple rules in sequence
  - **Adapter Pattern:** For integrating with external ML models (future enhancement)
- **Event-Driven Architecture:** Services communicate through Kafka topics to ensure loose coupling and scalability

---

## 🔒 Security

- JWT-based stateless authentication
- Role-based access control to secure endpoints
- Separate roles for user, fraud analyst, and admin

---

## 📊 Tech Stack


---


---

## 📂 Project Modules

| Module                  | Description                                     |
|------------------------|-------------------------------------------------|
| `user-service`         | Handles user registration, login, roles         |
| `transaction-service`  | Ingests and publishes transaction events         |
| `fraud-service`        | Applies rule-based fraud detection              |
| `alert-service`        | Listens for fraud events, triggers alerts       |
| `common-lib`           | Shared utilities, constants, DTOs               |

---

## 🧪 Sample Fraud Rules

- Geo-location mismatch from last transaction
- Multiple high-value transactions in short time
- Transactions during odd hours
- Velocity-based rules (e.g., more than 3 txns/min)

---

## 🛠️ Future Enhancements

- Integrate with ML-based fraud scoring models via gRPC
- Build admin dashboard with GraphQL or React
- Email/SMS notification integration
- CI/CD with GitHub Actions or Jenkins

---

## 📖 How to Run

> Each module is Spring Boot based and runs independently.

1. Clone the repo:
   ```bash
   git clone https://github.com/Rameshraj55/PayShield-Real-Time-Fraud-Detection-Engine.git
