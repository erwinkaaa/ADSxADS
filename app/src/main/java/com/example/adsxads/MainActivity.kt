package com.example.adsxads

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_favorite_dish.*
import kotlinx.android.synthetic.main.layout_home.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout_sate_ayam_kelapa.setOnClickListener {
            startActivity(Intent(this, RecipeDetailActivity::class.java))
        }
    }
}
