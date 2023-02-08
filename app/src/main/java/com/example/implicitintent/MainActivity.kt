package com.example.implicitintent

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.provider.MediaStore.Audio.Media
import androidx.cardview.widget.CardView
import com.example.implicitintent.R.id.CardResult

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultButton= findViewById<CardView>(CardResult)       //For opening our website
        resultButton.setOnClickListener{ // This method tells us what will happen if we click on the button
            val intent= Intent(Intent.ACTION_VIEW) // Action view allows the user to view the website
            intent.data= Uri.parse("https://jcboseustymca.co.in/Forms/Student/ResultStudents.aspx") //Here website link is provided using Uri.parse("Link")
            startActivity(intent) // This would initiate our activity
        }

        val camButton= findViewById<CardView>(R.id.CardCamera) //For opening camera
        camButton.setOnClickListener {
            val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE) //This action will allow the user to capture the images via camera using MediaStore.ACTION_IMAGE_CAPTURE
            startActivity(intent) //Here we need no to provide any data to the user so just we will start the activity
        }

    }
}