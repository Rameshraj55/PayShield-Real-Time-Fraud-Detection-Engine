
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
  https://github.com/Rameshraj55/PayShield-Real-Time-Fraud-Detection-Engine.git
