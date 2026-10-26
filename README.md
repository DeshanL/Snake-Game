# 🐍 Classic Snake Game - Android

[![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Language](https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Min SDK](https://img.shields.io/badge/Min%20SDK-24-blue?style=for-the-badge)](https://developer.android.com/about/dashboards)
[![Target SDK](https://img.shields.io/badge/Target%20SDK-33%2F34-green?style=for-the-badge)](https://developer.android.com/about/versions/14)
[![Build Tool](https://img.shields.io/badge/Build-Gradle%20(Kotlin%20DSL)-02303A?style=for-the-badge&logo=gradle&logoColor=white)](https://gradle.org/)

A retro-style 2D **Snake Game** built natively for Android using **Kotlin**. Experience classic arcade gameplay with multi-tier difficulty levels, dynamic collision physics, adaptive speed scaling, and responsive on-screen navigation controls.

---

## 🎮 Key Features

- **Multi-Level Difficulty Modes**:
  - **Level 1 (Easy)**: Relaxed pace (`300ms` tick interval) — ideal for beginners.
  - **Level 2 (Medium)**: Balanced challenge (`150ms` tick interval) — moderate reflex test.
  - **Level 3 (Hard)**: Fast-paced thrill (`50ms` tick interval) — for expert players.
- **Dynamic Game Loop**: Custom frame updates orchestrated via Android's `Handler` and `Runnable` threading model.
- **Euclidean Collision Detection**: Precision mathematical hit-testing using Euclidean distance calculations ($\sqrt{\Delta x^2 + \Delta y^2}$) for seamless food ingestion.
- **Dynamic Body Growth**: Renders and tracks new `ImageView` body segments dynamically along the snake's historical coordinates.
- **Adaptive Speed Scaling**: Gradually decreases tick delay as your score increases, continuously elevating difficulty.
- **Boundary & Collision Constraints**: Real-time board boundary detection triggering game-over states with distinct visual alerts.
- **Game State Management**: Full control with `Start`, `Pause`, `Resume`, `Play Again (Restart)`, and live in-game score counters.

---

## 🛠️ Tech Stack & Architecture

- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Architecture**: XML Layouts (`ConstraintLayout`, `RelativeLayout`, Dynamic View Injection)
- **Concurrency / Timing**: Android `Handler` & `Runnable` message loop
- **Target Platform**: Android API 24 (Nougat) up to Android API 34 (Android 14)
- **Build System**: Gradle Kotlin DSL (`build.gradle.kts`)

---

## 📂 Project Structure

```plaintext
Snake-Game/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/snakegame/
│   │   │   │   ├── MainActivity.kt        # Level selection menu & navigation
│   │   │   │   ├── MainActivity1.kt       # Level 1 game engine (Easy - 300ms)
│   │   │   │   ├── MainActivity2.kt       # Level 2 game engine (Medium - 150ms)
│   │   │   │   └── MainActivity3.kt       # Level 3 game engine (Hard - 50ms)
│   │   │   ├── res/
│   │   │   │   ├── drawable/              # Custom vector graphics (snake, food, assets)
│   │   │   │   ├── layout/                # UI screens for menu and game boards
│   │   │   │   └── values/                # Strings, colors, and themes
│   │   │   └── AndroidManifest.xml        # App permissions and activity declarations
│   │   └── build.gradle.kts               # App-level dependencies and configs
├── gradle/                                # Gradle wrapper files
├── build.gradle.kts                       # Project-level build script
├── settings.gradle.kts                    # Module configurations
└── README.md                              # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites

- **Android Studio** (Hedgehog, Iguana, or later recommended)
- **JDK**: Version 1.8 or 17
- **Android SDK**: API level 24+ installed
- Physical Android device (USB debugging enabled) or an Android Virtual Device (AVD)

### Installation & Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/DeshanL/Snake-Game.git
   cd Snake-Game
   ```

2. **Open in Android Studio**:
   - Open Android Studio.
   - Select **Open an Existing Project** and choose the `Snake-Game` directory.
   - Wait for Gradle to sync dependencies.

3. **Build & Run**:
   - Select your target device or emulator from the device dropdown.
   - Click the green **Run** button (`Shift + F10`) or execute via CLI:
     ```bash
     # Debug build
     ./gradlew assembleDebug

     # Install directly to connected device
     ./gradlew installDebug
     ```

---

## 🕹️ How to Play

1. **Choose a Level**: Tap **Level 1**, **Level 2**, or **Level 3** from the main menu.
2. **Start the Game**: Tap **New Game** on the board.
3. **Control the Snake**: Use the on-screen direction pad (**Up**, **Down**, **Left**, **Right**) to steer.
4. **Feed the Snake**: Guide the head to collect food tokens to grow the snake and score points.
5. **Survive**: Avoid colliding into the board boundaries.
6. **Pause / Resume**: Need a break? Tap **Pause** and resume whenever you're ready.

---

## 💡 Resume Project Highlights

If adding this project to your resume or portfolio:

> **Developed a native Android 2D Snake game in Kotlin featuring a real-time game loop powered by `Handler` and `Runnable` scheduling. Engineered Euclidean distance collision detection for dynamic food ingestion and multi-segment body rendering, implemented boundary collision logic with state management (pause, resume, restart), and designed a 3-tier difficulty engine with adaptive speed scaling.**

---

## 📄 License

This project is open-source under the [MIT License](LICENSE). Contributions, issues, and feature requests are welcome!
