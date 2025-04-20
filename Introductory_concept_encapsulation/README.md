COSC 716 study materials

💡 Encapsulation Practice Problem
Problem Statement:
You are tasked with designing a Library Management System where each Book has:

A title

An author

A price

A publication year

Implement encapsulation in the Book class. The class should:

Hide its fields (title, author, price, and publicationYear) using private access.

Provide getter and setter methods for each field.

Ensure that the price cannot be set to a negative value.

You also need to create a Library class that manages a collection of books. The Library should:

Be able to add books.

Display the details of all books.

📄 Class Design Outline:
Book Class

Fields: title, author, price, publicationYear

Methods:

Getters and setters for each field.

Custom setter to ensure price cannot be negative.

Library Class

Field: A List of books.

Methods:

addBook(Book book) to add a book.

displayBooks() to print details of all books.
