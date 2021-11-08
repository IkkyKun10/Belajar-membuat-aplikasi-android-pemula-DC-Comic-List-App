package com.dicoding.latihan.lightnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.ShareCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.latihan.lightnovel.about.AboutActivity
import com.dicoding.latihan.lightnovel.adapter.DataUserList
import com.dicoding.latihan.lightnovel.adp.DcListCallback
import com.dicoding.latihan.lightnovel.adp.GridCardAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DcListCallback {

    private var list: ArrayList<User> = arrayListOf()
    private lateinit var userAdapter: GridCardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.elevation = 0f

        list.addAll(DataUserList.listData)

        showRecycler()

        userAdapter.onItemClickListener = {
            val intent = Intent(this@MainActivity, UserDetail::class.java)
            intent.putExtra(UserDetail.EXTRA_NAME, it)
            startActivity(intent)
        }
    }

    private fun showRecycler() {
        rc_view.layoutManager = LinearLayoutManager(this)
        userAdapter = GridCardAdapter(list, this, this)
        rc_view.adapter = userAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onShareClick(user: User) {
        if (application != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Bagikan aplikasi ini sekarang.")
                .setText("Segera Baca Comik DC ${user.name} di dccomics.com")
                .startChooser()
        }
    }
}