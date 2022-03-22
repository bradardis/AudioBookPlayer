package edu.temple.bookfragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ViewModel: ViewModel(){
    var Book = null;

    val currentBook: MutableLiveData<Book> by lazy{
        MutableLiveData<Book>()
    }
}