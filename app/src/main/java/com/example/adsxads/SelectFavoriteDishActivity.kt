package com.example.adsxads

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_favorite_dish.*

class SelectFavoriteDishActivity : AppCompatActivity() {

    var meatIsSelected = false
    var veggieIsSelected = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_dish)

        card_meat.setOnClickListener {
            if (!meatIsSelected) {
                iv_meat.visibility = View.VISIBLE
                meatIsSelected = true
            } else {
                iv_meat.visibility = View.GONE
                meatIsSelected = false
            }
        }

        card_veggie.setOnClickListener {
            if (!veggieIsSelected) {
                iv_veggie.visibility = View.VISIBLE
                veggieIsSelected = true
            } else {
                iv_veggie.visibility = View.GONE
                veggieIsSelected = false
            }
        }

        btn_select_fav_dish.setOnClickListener {
            startActivity(Intent(this, RegisterSuccessActivity::class.java))
        }
    }
}
