package com.dicoding.picodiploma.exploreindonesia

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val wisata = intent.getParcelableExtra<Wisata>(MainActivity.INTENT_PARCELABLE)

        val wisataSrc = findViewById<ImageView>(R.id.ivWisataImage)
        val wisataTitle = findViewById<TextView>(R.id.tv_item_name)
        val wisataSubTitle = findViewById<TextView>(R.id.tv_item_detail)
        val wisataUri = findViewById<Button>(R.id.find_maps)
        val wisataDesc = findViewById<TextView>(R.id.tv_item_deskripsi)


        wisataSrc.setImageResource(wisata.wisataSrc)
        wisataTitle.text = wisata.wisataTitle
        wisataSubTitle.text = wisata.wisataSubTitle
        wisataUri.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(wisata.wisataUri))
            startActivity(i)
        }
        wisataDesc.text = wisata.wisataDesc
        val actionbar = supportActionBar
        actionbar!!.title = "Explore Indonesia"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
