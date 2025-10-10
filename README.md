[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zFcBiwcS)
# Nested If Statements Assignment

## Overview
This assignment focuses on understanding and implementing nested if statements in Java. Students will work with conditional logic that requires multiple levels of decision-making.

## Assignment 1: Leap Year Checker

### Learning Objectives
- Understand nested if statement structure
- Practice logical thinking with multiple conditions
- Learn about leap year calculation rules
- Implement proper input/output handling

### Understanding Leap Years (and How to Code Them in Java)

#### What is a Leap Year?

A leap year is a year that has 366 days instead of 365.
That extra day goes to February, which has 29 days instead of 28.

#### Why?

Because the Earth doesn't orbit the Sun in exactly 365 days — it actually takes about 365 days + 6 hours.
Those 6 hours add up:

After 4 years → ~24 hours → one extra day needed.

So we add it to February to keep our calendars accurate.

### Leap Year Rules
A year is a leap year if:
1. It is divisible by 4, AND
2. Either it is NOT divisible by 100, OR it IS divisible by 400

This means:
- Years divisible by 4 are leap years (e.g., 2004, 2020, 2024)
- EXCEPT years divisible by 100 are NOT leap years (e.g., 1900, 1800, 2100)
- EXCEPT years divisible by 400 ARE leap years (e.g., 2000, 1600, 2400)

### Requirements
Create a `LeapYearChecker` class that:

1. **Prompts the user** for a year input
2. **Uses nested if statements** to determine if the year is a leap year
3. **Displays the result** in the format: `"YEAR is a leap year."` or `"YEAR is NOT a leap year."`

#### Test Cases
Your program should correctly handle these test cases:

**Leap Years:**
- 2000 (divisible by 4, 100, and 400)
- 2004 (divisible by 4, not by 100)
- 2020 (divisible by 4, not by 100)
- 2024 (divisible by 4, not by 100)
- 1600 (divisible by 4, 100, and 400)
- 2400 (divisible by 4, 100, and 400)

**Not Leap Years:**
- 1900 (divisible by 4 and 100, not by 400)
- 1800 (divisible by 4 and 100, not by 400)
- 2001 (not divisible by 4)
- 2019 (not divisible by 4)
- 2100 (divisible by 4 and 100, not by 400)
- 2200 (divisible by 4 and 100, not by 400)
- 2023 (not divisible by 4)

### Sample Output
```
Enter a year: 2000
2000 is a leap year.
```

```
Enter a year: 1900
1900 is NOT a leap year.
```

---

## Assignment 2: Grading System

### Learning Objectives
- Practice nested if statements with multiple conditions
- Understand grade ranges and modifiers
- Implement complex conditional logic
- Handle edge cases in grading systems

### Grading System Rules

Create a `GradingSystem` class that converts numerical scores (0-100) to letter grades with modifiers:

#### Letter Grade Ranges:
- **A**: 90-100
- **B**: 80-89  
- **C**: 70-79
- **D**: 60-69
- **F**: Below 60

#### Modifier Rules:
Within each grade band:
- **Top 2 points** → Add "+" (e.g., 98-100 = A+, 88-89 = B+)
- **Bottom 4 points** → Add "-" (e.g., 90-93 = A-, 80-83 = B(-) )
- **Middle range** → Plain letter (e.g., 94-97 = A, 84-87 = B)
- **F grade** → No modifiers (always just "F")

### Examples:
- 100 → A+
- 99 → A+
- 98 → A+
- 97 → A
- 96 → A
- 95 → A
- 94 → A
- 93 → A-
- 92 → A-
- 91 → A-
- 90 → A-
- 89 → B+
- 88 → B+
- 87 → B
- 86 → B
- 85 → B
- 84 → B
- 83 → B-
- 82 → B-
- 81 → B-
- 80 → B-
- 79 → C+
- 78 → C+
- 77 → C
- 76 → C
- 75 → C
- 74 → C
- 73 → C-
- 72 → C-
- 71 → C-
- 70 → C-
- 69 → D+
- 68 → D+
- 67 → D
- 66 → D
- 65 → D
- 64 → D
- 63 → D-
- 62 → D-
- 61 → D-
- 60 → D-
- 59 → F
- 0 → F

### Requirements
Create a `GradingSystem` class that:

1. **Prompts the user** for a score (0-100)
2. **Uses nested if statements** to determine the letter grade and modifier
3. **Displays the result** in the format: `"The grade is: GRADE"`

### Implementation Guidelines

#### Test Cases
Your program should correctly handle these test cases:

**A Grades:**
- 100, 99, 98 → A+
- 97, 96, 95, 94 → A
- 93, 92, 91, 90 → A-

**B Grades:**
- 89, 88 → B+
- 87, 86, 85, 84 → B
- 83, 82, 81, 80 → B-

**C Grades:**
- 79, 78 → C+
- 77, 76, 75, 74 → C
- 73, 72, 71, 70 → C-

**D Grades:**
- 69, 68 → D+
- 67, 66, 65, 64 → D
- 63, 62, 61, 60 → D-

**F Grades:**
- 59, 50, 0 → F (no modifiers)

### Sample Output
```
Enter a score (0–100): 98
The grade is: A+

Enter a score (0–100): 95
The grade is: A

Enter a score (0–100): 92
The grade is: A-

Enter a score (0–100): 88
The grade is: B+

Enter a score (0–100): 85
The grade is: B

Enter a score (0–100): 82
The grade is: B-

Enter a score (0–100): 78
The grade is: C+

Enter a score (0–100): 75
The grade is: C

Enter a score (0–100): 72
The grade is: C-

Enter a score (0–100): 68
The grade is: D+

Enter a score (0–100): 65
The grade is: D

Enter a score (0–100): 62
The grade is: D-

Enter a score (0–100): 59
The grade is: F
```
