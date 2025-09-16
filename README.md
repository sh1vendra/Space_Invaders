# Space Invaders

A modern Java implementation of the classic Space Invaders arcade game featuring customizable graphics, dynamic music system, and smooth gameplay mechanics.

## Screenshots

<img width="853" height="701" alt="Screenshot 2025-09-15 at 8 07 30 PM" src="https://github.com/user-attachments/assets/a6c7d062-e21e-49ab-ac80-caf5b071ee3c" />
<img width="853" height="701" alt="Screenshot 2025-09-15 at 8 08 43 PM" src="https://github.com/user-attachments/assets/40536ad3-c745-4006-b3a1-a71a00867b37" />



## Tech Stack

### Core Technologies
- Java SE 8+ — Primary programming language  
- Swing GUI Framework — User interface and game rendering  
- Java AWT — Graphics rendering and event handling  
- Java Sound API — Audio playback system  

### Development Tools
- Java Development Kit (JDK)  
- Integrated Development Environment (IDE) — Compatible with IntelliJ IDEA, Eclipse, NetBeans, VSCode  
- Git — Version control for team collaboration  

### Key Libraries & APIs
- `javax.swing.*` — GUI components and game window  
- `java.awt.*` — Graphics, events, and image handling  
- `javax.sound.sampled.*` — Audio file playback  
- `javax.imageio.ImageIO` — Image loading and processi

## Features

### Core Gameplay
- Smooth movement controls — Arrow keys for horizontal movement  
- Weapon system — Space bar for rapid fire bullets  
- Enemy spawning — Dynamic invader generation  
- Collision detection — Bullet-enemy intersection mechanics  
- Scoring system — Points for enemy elimination  
- Progressive levels — Difficulty increases every 5 points  

### Customization System
- Character selection — Multiple shooter sprites or custom URL images  
- Enemy variants — Different invader designs with URL support  
- Bullet types — Various projectile graphics  
- Music integration — Background audio with custom file support  

### Technical Features
- Modular architecture — Separation of concerns across multiple classes  
- Error handling — Graceful fallback for failed image/audio loading  
- Resource management — Efficient image caching and cleanup  
- Real-time rendering — 20ms timer-based game loop (50 FPS)  
