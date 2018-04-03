package com.coderefer.sharedtransitions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

public const val EXTRA_CONTENT = "EXTRA_CONTENT"
class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        supportFinishAfterTransition()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
         when(item!!.itemId){
             R.id.home -> supportFinishAfterTransition()
         }
        return super.onOptionsItemSelected(item)

    }
}
