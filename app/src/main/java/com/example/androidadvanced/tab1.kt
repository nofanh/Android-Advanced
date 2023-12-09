package com.example.androidadvanced

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class tab1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab1)
        val judulTextView = findViewById<TextView>(R.id.judulTextView)
        val sejarahTextView = findViewById<TextView>(R.id.sejarahTextView)
        val fotoImageView = findViewById<ImageView>(R.id.fotoImageView)
        judulTextView.text = "SEJARAH UNIVERSITAS KUNINGAN"
        fotoImageView.setImageResource(R.drawable.logouniku)
        sejarahTextView.text =
            """
            Universitas Kuningan (UNIKU) didirikan sebagai perwujudan dari idealisme dan komitmen Yayasan Pendidikan Sang Adipati Kuningan untuk terus menerus berkarya khususnya dalam bidang peningkatan sumber daya manusia menuju peningkatan mutu kehidupan masyarakat pada umumnya.
            
            Gagasan tentang pendirian Universitas di Kuningan sebetulnya telah ada sejak tahun 1979 ketika Yayasan ini didirikan. Namun karena keterbatasan sumber daya, baik sumber daya manusia maupun sumber daya keuangan, maka niat itu tidak bisa langsung diwujudkan sekaligus. Karena keterbatasan itu Yayasan menggunakan strategi bertahap untuk mendirikan sekolah tinggi – sekolah tinggi sebagai cikal bakal berdirinya universitas.
            """.trimIndent()
    }
}