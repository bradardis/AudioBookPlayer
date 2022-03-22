package edu.temple.bookfragments

class BookList {
    var arr = arrayOfNulls<Book>(10)


    //iterates through the array of nulls and adds the book at the earliest index
    fun add(Book: Book) {
        for (i in 0..9){
            if(arr[i] == null){
                arr[i] = Book
            }
        }
    }
    //removes the book from the array, this will not be called on a null value so we use the !! operator to get the ide to stop crying
    fun remove(Book: Book) {
        for (i in 0..9){
            if(arr[i]!!.title == Book.title){
                arr[i] = null
            }
        }
    }
    fun get(int: Int): Book? {
       return arr[int];
    }

    //iterates through the array checking for all non null values and returns the number of books in booklist
    fun size(): Int {
       var z = 0
        for (i in 0..9){
            if(arr[i] != null){
               z++
            }
        }
        return z
    }
}