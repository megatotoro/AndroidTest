package com.skillbox.skillboxhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text)
        textView.text = """
            BuildType = ${BuildConfig.BUILD_TYPE}
            Flavour = ${BuildConfig.FLAVOR}
            VersionCode = ${BuildConfig.VERSION_CODE}
            VersionName = ${BuildConfig.VERSION_NAME}
            ApplicationId = ${BuildConfig.APPLICATION_ID}
        """.trimIndent()
    }
}
