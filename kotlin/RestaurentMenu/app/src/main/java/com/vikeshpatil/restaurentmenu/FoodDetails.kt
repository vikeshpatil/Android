package com.vikeshpatil.restaurentmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_details.*

class FoodDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        var bundle = intent.extras

        TVdescription.text = bundle!!.getString("des")
        TVDetailsTitle.text = bundle!!.getString("name")
        IVDetails.setImageResource(bundle!!.getInt("image"))

    }
}
