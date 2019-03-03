package com.example.viewflippertest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import kotlinx.android.synthetic.main.view_flipper.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_flipper)
        val list = initArray()
        for (i in 0..2) {
            getImageView(list[i])
        }
        viewFlipper.isAutoStart = true
        viewFlipper.setFlipInterval(1500)
    }

    /**
     * Imitates ImageViews pictures
     */
    private fun initArray(): ArrayList<Int> {
        val returnArray = ArrayList<Int>()
        returnArray.add(R.drawable.ic_action_name)
        returnArray.add(R.mipmap.ic_launcher1)
        returnArray.add(R.mipmap.ic_launcher_round)
        return returnArray
    }

    /**
     * Adds one child
     */
    private fun getImageView(resId: Int) {
        val image = ImageView(this)
        image.setImageResource(resId)
        viewFlipper.addView(image)
    }
}
