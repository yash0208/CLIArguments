# CLIArguments

A flexible Java-based CLI argument parser framework designed to allow multiple teams to define and handle their own command-line arguments without code duplication. Each team can implement their own argument parsing logic, supporting a structure similar to Unix commands (e.g., `ls -a`).

## Features
- Singleton pattern for argument management
- Extensible argument creation (main, extended, parameters)
- Prevents duplicate argument definitions
- Example implementation for print-like commands

## Project Structure
```
src/main/java/org/example/
  ├── Main.java                        # Entry point, interactive CLI
  ├── CLIArguments.java                # Singleton argument manager
  ├── Model/
  │     └── Argument.java              # Argument data model
  └── ArgumentCreatingService/
        ├── ArgumentCreator.java       # (Interface, not shown above)
        └── PrintArgumentCreationClass.java # Example argument creator
```

## Usage
1. **Run the application:**
   - Use your IDE or run via command line:
     ```sh
     mvn compile exec:java -Dexec.mainClass="org.example.Main"
     ```
2. **Follow the prompts:**
   - Enter the main argument, extended argument, and parameters as requested.
   - The system will create and store the argument, then allow you to call it.

## Example
```
Enter Main Argument: print
Enter Extended Argument: -en
Enter Argument Parameters with a space in between: Hello World
```

## Extending
- Implement the `ArgumentCreator` interface to define new argument creation logic for your team.
- Register new argument types via the `CLIArguments` singleton.

## Requirements
- Java 8 or higher
- Maven

