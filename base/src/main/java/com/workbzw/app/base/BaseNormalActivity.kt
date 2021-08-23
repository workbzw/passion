package com.workbzw.app.base

import android.os.Bundle

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/22 11:43 PM
 * @desc
 */
abstract class BaseNormalActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayout())
        init(savedInstanceState)
    }
}