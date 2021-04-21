package com.example.nybooks.presentation.books


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooks.R
import com.example.nybooks.data.model.Book
import kotlinx.android.synthetic.main.activity_books.*


class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)


        toolbarMain.title = getString(R.string.books_title)
        setSupportActionBar(toolbarMain)

        with(recyclerBooks) {
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getBooks())
        }
    }

    fun getBooks(): List<Book> {
        return listOf<Book>(
            Book("Title 1", "Author 1"),
            Book("Title 2", "Author 2"),
            Book("Title 3", "Author 3")
        )
    }
}