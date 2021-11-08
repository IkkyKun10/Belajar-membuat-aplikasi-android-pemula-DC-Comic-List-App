package com.dicoding.latihan.lightnovel.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.latihan.lightnovel.R
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        /*
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

         */
        supportActionBar?.hide()
        supportActionBar?.title = "About Me"

        toolbar_about.setNavigationOnClickListener { onBackPressed() }
    }

    /*
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }

     */
}