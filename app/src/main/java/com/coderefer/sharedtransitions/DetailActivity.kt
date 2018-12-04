package com.coderefer.sharedtransitions

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imageView.setImageResource(getResourceId(this, intent.getStringExtra(MainActivity.TAG_KEY)))
    }

    override fun onBackPressed() {
        supportFinishAfterTransition()
        super.onBackPressed()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
         when(item?.itemId){
             android.R.id.home ->  {
                 supportFinishAfterTransition()
                 return true
             }
         }
        return super.onOptionsItemSelected(item)

    }


    fun getResourceId(context: Context, drawableName:String): Int {
        val resources = context.resources
        return resources.getIdentifier(drawableName, "drawable",
                context.packageName)
    }
}
