package Demo

case class Book(title: String, author: String, isbn: String)

object labsheet5q2 {

  val lib: scala.collection.mutable.Set[Book] = scala.collection.mutable.Set(
    Book("1984", "George Orwell", "12345"),
    Book("Jaws", "Peter Benchely", "09876"),
    Book("Vendor of Sweets", "R.K.Narayan", "11223"),
    Book("Bringing Tony Home","Tissa Abeysekara","22234")
  );

  def addBook(newBook: Book): Unit = {
    lib += newBook
    println(s"Book '${newBook.title}' added to the library.")
  }

  def removeBook(isbn: String): Unit = {
    var bookRemoved = false

    for (book <- lib) {
      if (book.isbn == isbn) {
        println(s"Book '${book.title}' removed from the library.")
        bookRemoved = true
        lib -= book
      }
    }

    if (!bookRemoved) {
      println(s"No book found with ISBN $isbn.")
    }

  }

  def isBookInLibrary(isbn: String): Unit = {
    var count = 0
    for (book <- lib) {
      if (book.isbn == isbn) {
        count=1 ;
        println("Book with ISBN "+isbn+" exist in the library")
      }
    }
    if(count==0){
      println("There's no book with ISBN "+isbn+" in the library")
    }
  }

  def displayLibrary(): Unit = {
    println("Current library collection:")
    for (book <- lib) {
      println(s"${book.title} by ${book.author}, ISBN: ${book.isbn}")
    }
  }

  def searchBookByTitle(title: String): Unit = {
    var found = false
    for (book <- lib) {
      if (book.title == title) {
        println(s"Book found: ${book.title} by ${book.author}, ISBN: ${book.isbn}")
        found = true
      }
    }
    if (!found) {
      println(s"No book found with title '$title'.")
    }
  }


  def displayBooksByAuthor(author: String): Unit = {
    var booksByAuthor: List[Book] = List()

    for (book <- lib) {
      if (book.author == author) {
        booksByAuthor = booksByAuthor :+ book
      }
    }

    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      for (book <- booksByAuthor) {
        println(s"${book.title}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No books found by author '$author'.")
    }
  }


  def main(args: Array[String]): Unit = {
    displayLibrary()

    println("\nAdding a new book...")
    addBook(Book("Malgudi Days", "R.K.Narayan", "48511"))
    displayLibrary()

    println("\nChecking if a book is in the library...")
    isBookInLibrary("12345")

    println("\nRemoving a book...")
    removeBook("09876")
    displayLibrary()

    println("\nSearching for a book by title...")
    searchBookByTitle("Vendor of Sweets")

    println("\nDisplaying all books by a specific author...")
    displayBooksByAuthor("R.K.Narayan")
  }
}

