package com.example.bookcatalogueapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bookcatalogueapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        books()
    }

    fun books(){
        val book1 = bookData("Title: Kufa kuzikana","Author:Ken Walibora","https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1498127583i/15729359.jpg")
        val book2 = bookData("Title: We should all be Feminists","Author:Chimamanda Ngozi Adichie","https://twominutebooks.com/wp-content/uploads/2020/06/51TotTTRSjL.jpg")
        val book3 = bookData("Title: The thing around your neck","Author:Chimamanda Ngozi Adichie","https://kibangabooks.com/wp-content/uploads/2022/05/18DB46AF-8687-45E1-9B64-1DA208B27D55-e1652431351790.jpeg")
        val book4 = bookData("Title: The struggle is my life","Author:Nelson Mandela","https://www.africanbookstore.net/prodimages/struggle-is-my-life_lg.jpg")
        val book5 = bookData("Title: The river and the source","Author:Margaret Ogola","https://ke.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/18/689156/1.jpg?9340")
        val book6 = bookData("Title: Things Fall Apart","Author:Chinua Achebe","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQES51oYhuf-sehVrC0yhaVpKCMnSgwWJ4ndQ&usqp=CAU")
        val book7 = bookData("Title: Arrow of God","Author:Chinua Achebe","https://img1.od-cdn.com/ImageType-400/0290-1/FDB/532/17/%7BFDB53217-FB7A-4919-B301-CA3675F7FC51%7DImg400.jpg")
        val book8 = bookData("Title: The trial of Dedan Kimathi","Author:Ngugi Wa Thiong'o","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1c-emGGm-aLTIO6TMd8hyhOnt_ABJdyqHuHOYmZxGcwM78m0lOabdkZ-XjxU8mfb8Uyo&usqp=CAU")
        val book9 = bookData("Title: Originals","Author:Adam Grant","https://miro.medium.com/v2/resize:fit:366/1*cjQqF9dmgIwdD3JhKNV9qg.jpeg")
        val book10 = bookData("Title: Give and Take","Author:Adam Grant","https://ke.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/99/170494/1.jpg?0650")
        val book11 = bookData("Title: Hidden Potential","Author:Adam Grant","https://target.scene7.com/is/image/Target/GUEST_be2ea1b2-58d3-4f7f-becb-16554856ad84?wid=488&hei=488&fmt=pjpeg")
        val book = listOf<bookData>(book1,book2,book3,book4,book5,book6,book7,book8,book9,book10,book11)
        binding.rvBooksCatalogue.layoutManager = LinearLayoutManager(this)
        var bookAdapter = BookAdapter(book)
        binding.rvBooksCatalogue.adapter = bookAdapter
    }
}