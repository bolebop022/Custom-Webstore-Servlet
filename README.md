# CustomWebStore - DIY Spring-like MVC Framework

🚀 A simple web store built with a custom dispatcher (no Spring!) to understand how request handling works under the hood.

## Table of Contents
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Getting Started](#-getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Project Structure](#-project-structure)
- [How It Works](#-how-it-works)
- [Running the App](#-running-the-app)
- [Next Steps](#-next-steps)
- [License](#-license)

## ✨ Features
- Product listing page (`/products`)
- Manual request routing without Spring
- JSP-based views
- Simple ModelAndView implementation
- Basic dependency management

## 🛠️ Tech Stack
- **Core**: Java Servlets
- **Frontend**: JSP
- **JSON Handling**: Jackson
- **Embedded Server**: Jetty (optional)

## 🚀 Getting Started

### Prerequisites
- Java 8+
- Maven
- Servlet container (Tomcat/Jetty) or use embedded server

### Project Structure
````
src/
├── main/
│   ├── java/
│   │   ├── dispatcher/       # Custom dispatcher implementation
│   │   ├── controllers/      # Application controllers
│   │   ├── models/           # Data models
│   │   └── utils/            # Helper classes
│   └── webapp/
│       ├── WEB-INF/
│       │   └── views/        # JSP views
│       └── index.jsp         # Homepage
pom.xml                       # Maven configuration
````
### Installation
```bash
git clone https://github.com/yourusername/CustomWebStore.git
cd CustomWebStore
mvn clean install

