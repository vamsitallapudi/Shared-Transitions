package com.coderefer.sharedtransitions

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.view.ViewCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            val activityOptionsCompat = ActivityOptionsCompat
                    .makeSceneTransitionAnimation(this, imageView as View, ViewCompat.getTransitionName(imageView))
            startActivity(intent, activityOptionsCompat.toBundle())

        }
    }
}
