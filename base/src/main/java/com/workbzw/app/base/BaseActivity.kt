package com.workbzw.app.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/22 11:37 PM
 * @desc
 */
abstract class BaseActivity : AppCompatActivity() {
    abstract fun setLayout(): Int
    abstract fun init(savedInstanceState: Bundle?)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ARouter.getInstance().inject(this)
    }
}