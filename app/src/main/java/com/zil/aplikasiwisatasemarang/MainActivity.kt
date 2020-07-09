package com.zil.aplikasiwisatasemarang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var rvWisata: RecyclerView
    private var list: ArrayList<Wisata> = arrayListOf()
    private var twiceExit = false

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)
        list.addAll(WisataData.listData)
        showRecyclerList()
    }

    public override fun onDestroy() {
        super.onDestroy()
    }

    public override fun onPause() {
        super.onPause()
    }

    public override fun onResume() {
        super.onResume()
    }

    public override fun onRestart() {
        super.onRestart()
    }

    override fun onBackPressed() {
        if (twiceExit) {
            super.onBackPressed()
            return
        }

        this.twiceExit = true
        Toast.makeText(this, "Tap again to exit", Toast.LENGTH_SHORT).show()
        Handler().postDelayed(Runnable{ twiceExit = false }, 2000)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about_me, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.aboutButton -> {
                val gotoAbout = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(gotoAbout)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listWisataAdapter = ListWisataAdapter(list)
        val listAnimation = AlphaInAnimationAdapter(listWisataAdapter).apply { setFirstOnly(false) }
        rvWisata.adapter = ScaleInAnimationAdapter(listAnimation).apply { setFirstOnly(false) }

        listWisataAdapter.setClickItem(object: ListWisataAdapter.ClickItem {
            override fun itemClicked(data: Wisata) {
                showWisata(data)
            }
        })
    }

    private fun showWisata(wisata: Wisata) {
        val moveData = Intent(this@MainActivity, WisataView::class.java)
        moveData.putExtra(WisataView.NAMA_WISATA, wisata.name)
        moveData.putExtra(WisataView.DETAIL_WISATA, wisata.detail)
        moveData.putExtra(WisataView.PHOTO_WISATA, wisata.photo)
        moveData.putExtra(WisataView.RATING_WISATA, wisata.rating)
        moveData.putExtra(WisataView.ALAMAT_WISATA, wisata.alamat)
        moveData.putExtra(WisataView.JAM_BUKA, wisata.buka)
        moveData.putExtra(WisataView.HARGA_TIKET, wisata.hargaTiket)

        startActivity(moveData)
    }
}
