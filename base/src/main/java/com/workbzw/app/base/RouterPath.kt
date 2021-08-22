package com.workbzw.app.base

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/18 2:44 PM
 * @desc
 */
interface RouterPath {

    companion object {
        const val HOME = "/home"
        const val USER = "/user"
        const val APP = "/app"
    }

    interface Home {
        companion object {
            const val MAIN = HOME + "/main"
        }
    }

    interface User {
        companion object {
            const val MAIN = USER + "/main"
        }
    }

    interface App {
        companion object {
            const val MAIN = APP + "/main"
        }
    }
}