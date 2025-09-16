# Space Invaders

A modern Java implementation of the classic Space Invaders arcade game featuring customizable graphics, dynamic music system, and smooth gameplay mechanics.

## Screenshots
<img width="853" height="701" alt="Screenshot 2025-09-15 at 8 07 24 PM" src="https://github.com/user-attachments/assets/1c46d219-f437-4ae6-b3d3-cd799d65851a" />
<img width="853" height="701" alt="Screenshot 2025-09-15 at 8 07 48 PM" src="https://github.com/user-attachments/assets/d3188bf7-b72e-4bc1-be43-b3ca095c3bcf" />
<img width="853" height="701" alt="Screenshot 2025-09-15 at 8 08 43 PM" src="https://github.com/user-attachments/assets/cdc1905d-beb7-4037-ae68-c9c9750293a0" />


## Tech Stack

### Core Technologies
- **Java SE 8+** - Primary programming language
- **Swing GUI Framework** - User interface and game rendering
- **Java AWT** - Graphics rendering and event handling
- **Java Sound API** - Audio playback system

### Development Tools
- **Java Development Kit (JDK)**
- **Integrated Development Environment (IDE)** - Compatible with IntelliJ IDEA, Eclipse, NetBeans, VSCode
- **Git** - Version control for team collaboration

### Key Libraries & APIs
- `javax.swing.*` - GUI components and game window
- `java.awt.*` - Graphics, events, and image handling
- `javax.sound.sampled.*` - Audio file playback
- `javax.imageio.ImageIO` - Image loading and processing
- `java.util.*` - Data structures (ArrayList, Random)
- `java.net.*` - URL-based image loading

## Features

### Core Gameplay
- **Smooth Movement Controls** - Arrow keys for horizontal movement
- **Weapon System** - Space bar for rapid fire bullets
- **Enemy Spawning** - Dynamic invader generation
- **Collision Detection** - Bullet-enemy intersection mechanics
- **Scoring System** - Points for enemy elimination
- **Progressive Levels** - Difficulty increases every 5 points

### Customization System
- **Character Selection** - Multiple shooter sprites or custom URL images
- **Enemy Variants** - Different invader designs with URL support
- **Bullet Types** - Various projectile graphics
- **Music Integration** - Background audio with custom file support

### Technical Features
- **Modular Architecture** - Separation of concerns across multiple classes
- **Error Handling** - Graceful fallback for failed image/audio loading
- **Resource Management** - Efficient image caching and cleanup
- **Real-time Rendering** - 20ms timer-based game loop (50 FPS)

## Project Structure

```
spaceinvaders/
├── Main.java                 # Application entry point
├── SpaceInvadersUI.java     # Core game engine and UI
├── MenuBarManager.java       # Menu system coordinator
├── ImageSelection.java       # Image loading and management
├── ListenerActions.java      # Game logic and input handling
├── PaintingActions.java      # Rendering and graphics
├── GameExceptions.java       # Error handling utilities
├── ShooterMenu.java         # Player character customization
├── InvaderMenu.java         # Enemy appearance options
├── BulletMenu.java          # Projectile customization
└── MusicMenu.java           # Audio system management
```

## Installation & Setup

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- IDE with Java support (recommended)

### Running the Game
1. Clone the repository
2. Compile all Java files in the `spaceinvaders` package
3. Run the `Main.java` file
4. Game window will open with menu bar for customization

### Controls
- **Left Arrow** - Move player left
- **Right Arrow** - Move player right
- **Space Bar** - Fire bullets
- **Menu Bar** - Access customization options during gameplay

## Architecture Highlights

### Object-Oriented Design
- **Encapsulation** - Each class handles specific responsibilities
- **Inner Classes** - Bullet and InvaderBox entities within main game class
- **Interface Implementation** - ActionListener and KeyListener for event handling

### Design Patterns
- **Singleton Pattern** - MenuBarManager for centralized menu creation
- **Factory Pattern** - Menu creation methods
- **Observer Pattern** - Event-driven input handling

