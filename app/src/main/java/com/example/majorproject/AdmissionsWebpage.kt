package com.example.majorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.webkit.WebView


class AdmissionsWebpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admissions_webpage)
        val web: WebView = findViewById(R.id.wvUCCAdmissions)
        web.webViewClient = CustomWebViewClient(this)

        val webSettings = web.settings
        webSettings.javaScriptEnabled = true

    web.loadUrl("https://www.facebook.com/uccjamaica")
        }
}