# Software-Design-and-Architecture
Information Expert Principle

Overview: The Information Expert principle says that each part of a program should handle the information it knows about. This keeps the code neat and easy to understand.

Why Use the Information Expert Principle?

Clear Organization: Each part of the program handles its own information and related tasks.
Easy to Fix: When each part has clear responsibilities, it's easier to fix or change the code.
Simple Design: Fewer connections between parts make the program easier to follow.
Real-Life Example: Think of a grocery store:

Each item knows its own price.
The cashier doesn't need to remember prices. They scan items, and the system finds the price and adds it up.
In programming, the product class holds the price, and the cashier (like a BookStore class) adds prices together for the total.

Conclusion: Just like a cashier relies on each item's price, classes in a program should handle only their own information. This keeps the program simple, tidy, and easier to manage.
