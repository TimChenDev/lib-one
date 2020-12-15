package com.devtimchen.libone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 建立一個 aidl 的 binder
        val binder = ICheckV2.Stub.asInterface(null)
    }
}