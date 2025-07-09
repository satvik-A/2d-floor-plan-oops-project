# 2d-floor-plan-oops-project

Oops project of group name: "19"  
Group number: "13"

## Project Overview

The 2d-floor-plan-oops-project is a desktop application designed to help users create detailed 2D floor plans with an interactive graphical user interface (GUI). Built using Java and the Swing framework, this tool allows users to visually design rooms, place doors, windows, furniture, and fixtures, and save or load their designs for future editing.

## Running the Pre-built Jar File

You can run the application directly using the provided `2d-floor-plan-oops-project.jar` file without compiling the source code:

1. Locate the `2d-floor-plan-oops-project.jar` file in the project root directory.
2. Open a terminal or command prompt.
3. Execute the following command to run the application:
   ```
   java -jar 2d-floor-plan-oops-project.jar
   ```
4. The GUI window will open, and you can interact with the floor plan.

## Features and Functionality

- **Room Creation:** Users can add multiple rooms to the floor plan, each represented as a panel within the main drawing area.
- **Doors and Windows:** Easily add doors and windows to rooms to simulate real architectural elements.
- **Furniture Placement:** Choose from a variety of furniture items such as beds, tables, sofas, chairs, and dining sets. Furniture can be added via dropdown menus and placed within rooms.
- **Fixtures:** Add essential fixtures including commodes, sinks, showers, stoves, washbasins, and refrigerators to complete the floor plan.
- **Save and Load Designs:** Users can save their current floor plan to a file and load previously saved designs, enabling ongoing project work.
- **Clear All:** A convenient option to clear the entire floor plan and start fresh.
- **Interactive GUI:** The application features a sidebar, top panel with controls, and a central drawing board where all elements are visually represented and manipulated.

## Technology Stack

- **Java:** Core programming language used for application logic.
- **Java Swing:** GUI toolkit used to build the interactive user interface components.

## How to Use the Application

### Running from Source Code

1. Compile all Java source files located in the `2d floor plan/lib` directory.
2. Run the `mainModel` class which contains the main method to launch the application window.
3. Use the sidebar and top panel controls to add rooms, doors, windows, furniture, and fixtures.
4. Save your design using the "save" button, and load saved designs with the "open" button.
5. Use the "Clear All" button to reset the floor plan.

## Key Classes and Their Roles

- **mainModel:** The main driver class that initializes the GUI components, handles user input, and manages the overall application flow.
- **rooms:** Manages room creation and properties within the floor plan.
- **RoomObjects:** Handles the graphical representation and management of furniture and fixtures.
- **filesave:** Responsible for saving and loading floor plan data to and from files.
- **Array:** A utility class used to store and manage collections of rooms, furniture, and fixtures.

## Project Structure

- `2d floor plan/lib/`: Contains all Java source files and image resources used for furniture and fixtures.
- `2d-floor-plan-oops-project.jar`: Pre-built executable jar file for running the application without compiling.

## Contact and Support

For questions or support regarding this project, please contact the group members of group number "13".
