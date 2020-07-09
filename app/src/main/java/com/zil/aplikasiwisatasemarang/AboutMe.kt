package com.zil.aplikasiwisatasemarang

import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar

class AboutMe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutme)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "About Me"
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }

        val myphoto: ImageView = findViewById(R.id.iv_photo)
        val mbitmap = (resources.getDrawable(R.drawable.myphoto) as BitmapDrawable).bitmap
        val imageRounded = Bitmap.createBitmap(mbitmap.width, mbitmap.height, mbitmap.config)
        val canvas = Canvas(imageRounded)
        val mpaint = Paint().apply {
            isAntiAlias = true
            setShader(BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP))
        }
        canvas.drawRoundRect((RectF(0f, 0f, mbitmap.width.toFloat(), mbitmap.height.toFloat())), 100f, 100f, mpaint)
        myphoto.setImageBitmap(imageRounded)

    }

}
