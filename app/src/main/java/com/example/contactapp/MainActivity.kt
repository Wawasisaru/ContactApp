package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Create a list of contacts
        val contacts = mutableListOf(
            ContactData(firstName = "Saru ", email = "saru@gmail.com", phoneNumber = "+254789032724", imageResId = R.drawable.avater),
            ContactData(firstName = "Lyle", email = "lyle@gmail.com", phoneNumber = "+2452841289", imageResId = R.drawable.avater),
            ContactData("Rita","rita@gmail.com","078746348", imageResId = R.drawable.avater),
            ContactData(firstName = "Kanoro", email = "kanoro@gmail.com", phoneNumber = "079023745873", imageResId = R.drawable.avater ),
            ContactData(firstName = "Jemimah", email = "Jemima@gmail.com", phoneNumber = "075348464", imageResId = R.drawable.avater),
            ContactData(firstName = "Cynthia", email = "cythia@gmai.com", phoneNumber = "079085667", imageResId = R.drawable.avater),
            ContactData(firstName = "Jacinta", email = "jacinta@gmail.com", phoneNumber = "0707000277", imageResId = R.drawable.avater)


        )

        // Create a recycler view and set the adapter
        val recyclerView = findViewById<RecyclerView>(R.id.rvContact)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactRvAdapter(contacts)
    }
}







