package com.example.androidadvanced

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class tab2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab2)
        val judulTextView = findViewById<TextView>(R.id.judulTextView)
        val visiTextView = findViewById<TextView>(R.id.visiTextView)
        val isivisiTextView = findViewById<TextView>(R.id.isivisiTextView)
        val misiTextView = findViewById<TextView>(R.id.misiTextView)
        val isimisiTextView = findViewById<TextView>(R.id.isimisiTextView)
        val fotoImageView = findViewById<ImageView>(R.id.fotoImageView)
        judulTextView.text = "FAKULTAS ILMU KOMPUTER"
        fotoImageView.setImageResource(R.drawable.logo_fkom)
        visiTextView.text = "VISI"
        isivisiTextView.text =
            "Terwujudnya Fakultas  Ilmu Komputer  Universitas Kuningan sebagai  fakultas andal  yang  unggul  dalam  penyelenggaraaan  Tri  Darma  Perguruan  Tinggi  di Wilayah Jawa Barat pada tahun 2032“"
        misiTextView.text = "MISI"
        isimisiTextView.text =
            """
            1. Menyelenggarakan pendidikan, penelitian, dan pengabdian pada masyarakat secara terpadu berdasarkan pada kaidah-kaidah pendidikan modern.
            2. Membina dan mengembangkan kehidupan akademik yang sehat sesuai dengan nilai-nilai dan norma-norma yang berkembang di dunia akademik.
            3. Menyelenggarakan riset-riset ilmiah yang tidak saja mampu mendorong pertumbuhan ilmu dan teknologi, tetapi juga dapat menjamin kebutuhan dunia industri dan bisnis yang berkembang sangat pesat dewasa ini.
            4. Menjadi sarana terjadinya pertemuan-pertemuan ilmiah baik lingkup lokal maupun nasional sehingga dapat memberikan warna dan kontribusi yang nyata dalam kemajuan ilmu dan teknologi.
            """.trimIndent()
    }
}

