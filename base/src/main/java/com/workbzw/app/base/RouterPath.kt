package com.workbzw.app.base

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/18 2:44 PM
 * @desc
 */
interface RouterPath {
    companion object {
        /**
         *
         */
        const val COMPONENT_VIDEO = "/video"
        const val COMPONENT_USER = "/user"
        const val COMPONENT_APP = "/app"
        const val COMPONENT_UPLOADER = "/up"
    }

    interface ComponentVideo {
        companion object {
            const val LIST_VIDEO = "$COMPONENT_VIDEO/list/video"
            const val LIST_COVER = "$COMPONENT_VIDEO/list/cover"
        }
    }

    interface ComponentUser {
        companion object {
            const val MAIN = "$COMPONENT_USER/main"
        }
    }

    interface ComponentApp {
        companion object {
            const val MAIN = "$COMPONENT_APP/main"
        }
    }

    interface ComponentUploader {
        companion object {
            const val MAIN = "$COMPONENT_UPLOADER/main"
        }
    }

}