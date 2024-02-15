# Chain of Responsibility Implementation in Java 🔗

This project showcases the Chain of Responsibility design pattern in Java, focusing on a scenario where a salary adjustment request passes through various levels of management approval. It demonstrates how to decouple request senders and receivers by giving multiple objects a chance to handle the request.

## Project Structure

The project is structured into key packages and classes reflecting the Chain of Responsibility pattern:

- `model`: Contains `SalaryAdjustmentRequest` class representing the request with employee details and adjustment amount.
- `handler`: Contains `CompensationHandler` interface and its implementations (`TeamLeadHandler`, `LineManagerHandler`, `HRManager`) representing different levels of management.
- `Main`: The entry point of the application that sets up the chain and initiates the request processing.

## Getting Started

### Prerequisites

- Java JDK 11 or later
- Your favorite IDE (Integrated Development Environment)

### Running the Application 🏃

1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Run the `Main.java` class.

This setup simulates a salary adjustment request being processed through different handlers in the chain, demonstrating the pattern's effectiveness in managing approval workflows.

### Simulating Salary Adjustment Requests

To simulate processing a salary adjustment request, follow these steps:

1. Instantiate handlers for each level of management.
2. Link handlers in order of their hierarchy.
3. Create a `SalaryAdjustmentRequest` object with sample data.
4. Pass the request to the initial handler in the chain.

### Example Code Snippet

```java
public class Main {
    public static void main(String[] args) {
        Handler teamLead = new TeamLeadHandler();
        Handler lineManager = new LineManagerHandler();
        Handler hrManager = new HRManagerHandler();

        teamLead.setNextHandler(lineManager);
        lineManager.setNextHandler(hrManager);

        SalaryAdjustmentRequest request = new SalaryAdjustmentRequest("John Doe", 3200, 15);
        teamLead.handleRequest(request);
    }
}
```

## Learn More 📚
For those interested in exploring the Chain of Responsibility pattern further, the following resources are recommended:
- Video Tutorial: [Chain-of-Responsibility Implementation Explained - Java (Example)](https://youtu.be/KwQ7cCmmZ8E)
- Detailed Article: [Chain of Responsibility Implementation in Java](https://nemanjatanaskovic.com/chain-of-responsibility-implementation-in-java/)

## Contributing
Your contributions make the open-source community an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

## License
This project is licensed under the MIT License.