package com.dicoding.latihan.lightnovel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.latihan.lightnovel.adapter.DataUserList
import kotlinx.android.synthetic.main.activity_user_detail.*

class UserDetail : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra name"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        supportActionBar?.hide()

        supportActionBar?.elevation = 0f
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationOnClickListener { onBackPressed() }

        val users = intent.getParcelableExtra<User>(EXTRA_NAME)

        users?.avatar?.let { img_detail.setImageResource(it) }
        collapsing.title = users?.name
        tv_detail_overview.text = users?.description
        tv_detail_genre_duration.text = users?.genreComic

    }

    /*
    private fun showGenre(user: User) {
        tv_detail_genre_duration.text = user.genreComic
    }

     */

}