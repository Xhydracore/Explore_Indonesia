package com.dicoding.picodiploma.exploreindonesia

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*

class profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        follow_insta.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/deyndrawan.s/"))
            startActivity(i)
        })
        val actionbar = supportActionBar
        actionbar!!.title = "My Profile"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
