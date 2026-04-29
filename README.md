Java Problem Statement
2. Core Java: The "SafeLog" Password Validator
Business Case: A cybersecurity firm needs a tool for their "Employee Portal" that forces employees to create strong passwords. Standard "if-else" isn't enough; they need a modular approach.
Problem Statement
Build a Password Strength Checker that validates a string against corporate security policies and provides specific feedback on why a password failed.
Student Tasks:
1. The Policy: The password must be:
○ At least 8 characters long.
○ Contain at least one Uppercase letter.
○ Contain at least one Digit (0-9).
2. Looping Logic: Use a for loop to iterate through the string and Character.isUpperCase() / Character.isDigit() to check requirements.
3. Feedback System: Instead of just saying "Invalid," the program should print specifically: "Missing a digit" or "Too short."
4. Retry Mechanism: Use a while loop to keep asking the user for a password until they enter a valid one.



Python problem statement
Core Python: The "FareCalc" Travel Optimizer
Business Case: A ride-sharing startup, "CityCab," needs a backend script to calculate fares. The fare isn't flat; it changes based on the time of day (Peak Hours) and the type of vehicle requested.
Problem Statement
Write a script that calculates the final "Ride Estimate" based on distance, vehicle type, and a "Surge Pricing" multiplier.
Student Tasks:
1. Dictionary Mapping: Store rates in a dictionary: {'Economy': 10, 'Premium': 18, 'SUV': 25} (rates per km).
2. Surge Logic: Ask the user for the "Hour of Day" (0-23). If the hour is between 17 and 20 (5 PM - 8 PM), apply a 1.5x Surge Multiplier to the total.
3. Function Definition: Create a function calculate_fare(km, type, hour) that returns the final price.
4. Error Handling: If the user enters a vehicle type not in your dictionary, use a try-except block or an if-in check to provide a "Service Not Available" message.
Deliverable: A .py script that takes user input and prints a formatted "Price Receipt."


Sql problem statement
1. SQL: The "Digital Library" Audit Business Case: A local community college has a database of books and student borrows. They are struggling to track "Overdue" books and want to know which categories of books are most popular to decide what to buy next. Problem Statement Create a relational system to track book loans and generate a "Penalty Report" for books not returned within 14 days. Student Tasks: 1. Table Creation: Create Books, Students, and IssuedBooks (with IssueDate and ReturnDate). 2. Overdue Logic: Write a query to find all students who haven't returned a book where the IssueDate was more than 14 days ago and ReturnDate is NULL. 3. Popularity Index: Use COUNT and GROUP BY on the Category column to show which genre (e.g., Fiction, Science, History) is borrowed the most. 4. Data Cleanup: Write a DELETE or UPDATE statement to remove student records who haven't borrowed a book in over 3 years (Inactive accounts). Deliverable: A .sql file containing the DDL (table creation) and the analytical queries.
