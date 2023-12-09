package com.example.androidadvanced

import android.app.TabActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TabHost



class MainActivity : TabActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabHost = tabHost
        setNewTab(
            this,
            tabHost,
            "tab1",
            "Universitas",
            R.drawable.icn,
            Intent(this, tab1::class.java)
        )
        setNewTab(
            this, tabHost, "tab2", "Fakultas",
            R.drawable.icn, Intent(this, tab2::class.java)
        )
        setNewTab(
            this, tabHost, "tab3", "Program Studi",
            R.drawable.icn, Intent(this, tab3::class.java)
        )
    }

    private fun setNewTab(
        context: Context, tabHost: TabHost, tag: String,
        title: String, icon: Int, intentid: Intent
    ) {
        val tabSpec = tabHost.newTabSpec(tag)
        tabSpec.setIndicator(title, context.resources.getDrawable(icon))
        tabSpec.setContent(intentid)
        tabHost.addTab(tabSpec)
    }
}