package com.workbzw.app.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.CoreComponentFactory
import com.alibaba.android.arouter.facade.annotation.Route
import com.workbzw.app.base.RouterPath

@Route(path = RouterPath.Home.MAIN)
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


    }
}