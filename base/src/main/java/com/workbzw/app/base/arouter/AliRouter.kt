package com.workbzw.app.base.arouter

import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/23 9:59 AM
 * @desc
 */
 class AliRouter : Router {
    override fun navi(path: String) {
        ARouter.getInstance().build(path).navigation()
    }
}