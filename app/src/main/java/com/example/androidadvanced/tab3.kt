package com.example.androidadvanced

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class tab3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab3)
        val judulTextView = findViewById<TextView>(R.id.judulTextView)
        val visiTextView = findViewById<TextView>(R.id.visiTextView)
        val isivisiTextView = findViewById<TextView>(R.id.isivisiTextView)
        val profilTextView = findViewById<TextView>(R.id.profillulusan)
        val isiprofilTextView = findViewById<TextView>(R.id.isiprofilTextView)
        val mbkmTextView = findViewById<TextView>(R.id.mbkm)
        val isimbkmTextView = findViewById<TextView>(R.id.isimbkmTextView)
        val fotoImageView = findViewById<ImageView>(R.id.fotoImageView)
        judulTextView.text = "PRODI SISTEM INFORMASI"
        fotoImageView.setImageResource(R.drawable.logo_prodi)
        visiTextView.text = "VISI"
        isivisiTextView.text =
            "Terwujudnya program studi sistem informasi sebagai program studi yang handal dan unggul dalam penyelenggaraan Tri Darma Perguruan Tinggi, unggul di bidang rekayasa sistem informasi di Wilayah Jawa Barat pada tahun 2032."
        profilTextView.text = "PROFIL LULUSAN"
        isiprofilTextView.text =
            "System Analyst, Data Analyst, Chief Information Officer (CIO), Software Quality Assurance."
        mbkmTextView.text = "KEGIATAN MBKM"
        isimbkmTextView.text =
            "Magang, Studi Independen, Bangkit Academy, Pertukaran Mahasiswa Merdeka (PMM) Nusantara, International Credit Transfer (ICT)."
    }
}