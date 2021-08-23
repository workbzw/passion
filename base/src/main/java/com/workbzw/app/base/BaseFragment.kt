package com.workbzw.app.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/23 12:58 AM
 * @desc
 */
abstract class BaseFragment : Fragment() {
    abstract fun setLayout(): Int
    abstract fun init(savedInstanceState: Bundle?)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ARouter.getInstance().inject(this)
    }
}