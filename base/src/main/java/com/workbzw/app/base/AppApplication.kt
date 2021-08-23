package com.workbzw.app.base

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/23 9:47 AM
 * @desc
 */
class AppApplication : Application {
    constructor() : super()

    private val isDebug = true
    override fun onCreate() {
        super.onCreate()
        if (isDebug) {
            //以下两种属性必须在初始化之前开启
            //打印日志
            ARouter.openLog();
            //开启调试模式（如果在InstantRun模式下进行，必须开启调试模式）
            // 线上版本需要关闭，否则会有安全风险
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}