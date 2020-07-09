package com.zil.aplikasiwisatasemarang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import me.biubiubiu.justifytext.library.JustifyTextView

class WisataView : AppCompatActivity() {

    companion object {
        const val NAMA_WISATA = "nama_wisata"
        const val DETAIL_WISATA = "detail_wisata"
        const val PHOTO_WISATA = "photo_wisata"
        const val RATING_WISATA = "5.0f"
        const val HARGA_TIKET = "gratis"
        const val JAM_BUKA = "jam_buka"
        const val ALAMAT_WISATA = "alamat_wisata"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisataview)

        // Ubah Photo Wisata
        val photo_wisata: ImageView = findViewById(R.id.photo_wisata)
        val photoWisata = intent.getIntExtra(PHOTO_WISATA, 0)
        Glide.with(photo_wisata)
            .load(photoWisata)
            .centerCrop()
            .into(photo_wisata)
        // Ubah Nama Wisata
        val nama_wisata: TextView = findViewById(R.id.nama_wisata)
        val namaWisata = intent.getStringExtra(NAMA_WISATA)
        nama_wisata.text = namaWisata
        // Ubah Detail Wisata
        val detail_wisata: JustifyTextView = findViewById(R.id.detail_wisata)
        val detailWisata = intent.getStringExtra(DETAIL_WISATA)
        detail_wisata.text = detailWisata
        // Ubah Rating Wisata
        val rating_wisata: RatingBar = findViewById(R.id.rating_wisata)
        val rating_number: TextView = findViewById(R.id.rating_number)
        val ratingWisata = intent.getFloatExtra(RATING_WISATA, 5.0f)
        rating_wisata.rating = ratingWisata
        rating_number.text = " (" + ratingWisata + ")"
        // Ubah Harga Tiket
        val harga_tiket: TextView = findViewById(R.id.harga_tiket)
        val hargaTiket = intent.getStringExtra(HARGA_TIKET)
        harga_tiket.text = hargaTiket
        // Ubah Jam Buka
        val jam_buka: TextView = findViewById(R.id.jam_buka)
        val jamBuka = intent.getStringExtra(JAM_BUKA)
        jam_buka.text = jamBuka
        // Ubah Alamat Wisata
        val alamat_wisata: TextView = findViewById(R.id.alamat_wisata)
        val alamatWisata = intent.getStringExtra(ALAMAT_WISATA)
        alamat_wisata.text = alamatWisata

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = namaWisata
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }

    }

}
