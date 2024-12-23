# Exercise: Online Library

## Objective
Strengthen your knowledge of arrays and objects in Java by creating classes to manage an online library.

## Scenario Description
You are required to create three classes:
1. **Author**: A class encapsulating the information about a book's author.
2. **Book**: Represents the primary entity of the library, including an `Author` object.
3. **OnlineLibrary**: Stores an array of `Book` objects and provides methods for managing them.

## Tasks

### 1. Create the `Author` Class
Define the following fields in the `Author` class:
- **UUID id**: A unique identifier generated automatically in the constructor.
- **String name**: The name of the author.
- **String biography**: A short biography of the author.

#### Methods in the `Author` Class
- **Constructor**: Accepts `name` and `biography` as parameters and automatically generates `id`.
- **toString()**: Returns a string representation of the author.

### 2. Create the `Book` Class
Define the following fields in the `Book` class:
- **UUID id**: A unique identifier generated automatically in the constructor.
- **String title**: The title of the book.
- **Author author**: An `Author` object representing the author of the book.
- **int year**: The year of publication.
- **boolean isAvailable**: Indicates the book's availability status.

#### Methods in the `Book` Class
- **Constructor**: Accepts `title`, `author` (an `Author` object), and `year` as parameters. The `id` field is generated automatically. The `isAvailable` field defaults to `true`.
- **toString()**: Returns a string representation of the book, including information about the author.

### 3. Create the `OnlineLibrary` Class
#### Fields in the Class
- **Book[] books**: An array of books.
- **int initialCapacity**: The initial capacity of the array.

#### Methods in the Class
1. **addBook(Book book, int index)**:  
   Adds a book to the array at the specified index. If the index is invalid or already occupied, display an error message. If the index equals the array length, increase the array's capacity.

2. **addBook(String title, Author author, int year, int index)**:  
   Creates a `Book` object with the given parameters and calls `addBook`.

3. **growCapacity()**:  
   Increases the array capacity by 1. Create a new array with increased length, copy existing books into it, and replace the old array.

4. **updateBook(Book book, int index)**:  
   Updates the book at the specified index. If the index is invalid or the book does not exist, display an error message.

5. **removeBookById(UUID id)**:  
   Removes a book from the array by its `id`. If no book with the given `id` is found, display an error message.

6. **printBookList()**:  
   Prints a list of all books in the library. Use the `toString()` method to display book details.

7. **getBooksByAuthor(String name)**:  
   Returns an array of books by an author with the specified name. If no books are found, return an empty array. Use both first and last names of the author for the search.

### 4. Create the `Main` Class
Create a `Main` class with a `main` method that:
1. Creates an `OnlineLibrary` object with an `initialCapacity` of 3.
2. Creates several `Author` objects.
3. Adds multiple books to the library.
4. Prints the list of all books.
5. Updates book information and prints the list again.
6. Deletes a book by `id` and prints the list again.
7. Prints a list of all books by a given author's name.

---
This exercise is designed to help you understand how to work with arrays, objects, and their interactions in Java. Follow the steps and experiment with the methods to deepen your understanding.
