# CB-Link Melo Software V2

A Java-based desktop application built with Swing for business management and analytics.

## Technical Stack

- Java 17
- Swing UI Framework
- Gradle 8.8
- JFreeChart 1.5.5 for data visualization
- Custom UI components and layouts

## Getting Started

### Prerequisites

- JDK 17 or higher
- Gradle 8.8+

### Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/cb-link_melo.git
```

2. Navigate to project directory:
```bash
cd cb-link_melo
```

3. Build the project:
```bash
./gradlew build
```

4. Run the application:
```bash
./gradlew run
```

### Project Structure

```
src/main/java/dashboard/
├── components/     # UI components
├── layouts/        # Layout management
├── utils/          # Utility classes
└── Main.java       # Application entry point
```

## Development

The application follows a component-based architecture with:
- Modular UI components
- Custom layouts
- Theme-based styling
- Event-driven interactions

### Building

```bash
./gradlew clean build
```

### Testing

```bash
./gradlew test
```

### Packaging

```bash
./gradlew jar
```

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the Apache License 2.0
