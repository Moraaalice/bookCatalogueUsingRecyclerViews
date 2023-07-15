package com.example.bookcatalogueapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bookcatalogueapp.databinding.BooksBinding
import com.squareup.picasso.Picasso

class BookAdapter(var bookList:List<bookData>):RecyclerView.Adapter<BookViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        var binding = BooksBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BookViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        var books = bookList.get(position)
        holder.binding.itBookAuthor.text = books.author
        holder.binding.itBookTitle.text = books.title
        Picasso
            .get()
            .load(books.image)
            .into(holder.binding.imageView2)

    }

    override fun getItemCount(): Int {
        return bookList.size
    }
}
class BookViewHolder(var binding: BooksBinding):RecyclerView.ViewHolder(binding.root){

}