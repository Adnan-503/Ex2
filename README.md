# Spreadsheet Application

## Introduction
Welcome to the Spreadsheet Application! This project is a straightforward and user-friendly tool that lets you work with a 2D table of cells. Think of it as a lightweight spreadsheet where you can input, edit, and calculate data, whether it’s text, numbers, or formulas. Plus, you can save your work and pick up right where you left off!

## What Makes It Special?
- **Interactive Spreadsheet:** Navigate and interact with a grid of cells, just like a traditional spreadsheet.
- **Smart Cells:** Supports different types of cell data, including plain text, numbers, and even formulas.
- **Formula Magic:** Automatically calculates results for formulas you enter (e.g., `=A1+B2`).
- **User-Friendly Interface:** A simple and clean GUI for easy interaction.
- **Save & Load:** Save your data to a file and load it back whenever you need.
- **Error Handling:** Clearly indicates formula issues or circular dependencies.

## How It’s Built

### Key Components

#### Core Classes
- **`Cell.java`:** The backbone for managing cell content and metadata.
- **`SCell.java`:** An implementation of `Cell`, handling data, type, and order of computation.
- **`CellIndex.java`:** Identifies a cell’s location in the grid with (x, y) coordinates.
- **`Index2D.java`:** Interface for 2D index operations.

#### Spreadsheet Logic
- **`Sheet.java`:** The main interface for spreadsheet operations like getting and setting cells, evaluating data, and managing persistence.
- **`Main.java`:** Implements the `Sheet` interface and handles core spreadsheet functionality.

#### GUI Elements
- **`Ex2GUI.java`:** Brings the spreadsheet to life with a graphical interface.
- **`StdDrawEx2.java`:** A custom library for rendering the spreadsheet and processing user inputs.

#### Utilities
- **`Ex2Utils.java`:** Defines constants and utility methods to streamline the spreadsheet and GUI functionality.
- **`CellEntry.java`:** Placeholder for potential future enhancements in cell validation.

## Getting Started

### Running the Program
1. Compile all the Java files:
   ```bash
   javac *.java
   ```
2. Launch the GUI:
   ```bash
   java assignments.ex2.Ex2GUI
   ```

### Using the Spreadsheet
- **Click:** Select a cell to view or edit its content.
- **Edit:** Input text, numbers, or formulas directly (start formulas with `=`).
- **Save:** Use the menu to save your work to a file.
- **Load:** Restore data from a previously saved file.

## Features Up Close

### Cell Types
- **Text:** For non-numeric content.
- **Numbers:** Automatically recognized from your input.
- **Formulas:** Start with `=` and perform calculations with operations like `+`, `-`, `*`, and `/`.

### Interactive GUI
- **Real-Time Updates:** See your changes instantly.
- **Error Feedback:** Errors in formulas or circular dependencies are highlighted.
- **Clear Layout:** Alphabetical column headers and numbered rows for easy navigation.

### Save & Load
- Save only the non-empty cells to keep your files clean.
- Easily load and restore data whenever you need it.

### Robust Error Handling
- Detects and flags circular dependencies.
- Displays clear error messages for formula issues.

