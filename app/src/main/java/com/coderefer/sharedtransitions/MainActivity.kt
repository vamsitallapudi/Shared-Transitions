package com.coderefer.sharedtransitions

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.content.ContextCompat
import android.support.v4.view.ViewCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.new_bg))
        imageView.setOnClickListener {startDetailActivity(imageView)}
        imageView.tag = "new_bg"
        imageView2.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.apple_raw))
        imageView2.setOnClickListener {startDetailActivity(imageView2)}
        imageView2.tag = "apple_raw"
    }

    private fun startDetailActivity(view : View) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(TAG_KEY, view.tag.toString())
        val activityOptionsCompat = ActivityOptionsCompat
                .makeSceneTransitionAnimation(this, view, ViewCompat.getTransitionName(view))
        startActivity(intent, activityOptionsCompat.toBundle())
    }

    companion object {
        const val TAG_KEY = "TAG_KEY"
    }
}
