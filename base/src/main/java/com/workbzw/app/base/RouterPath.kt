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
        const val COMPONENT_VIDEO = "/component/video"
        const val COMPONENT_USER = "/component/user"
        const val COMPONENT_APP = "/component/app"
        const val COMPONENT_UPLOADER = "/component/up"
        const val SERVICE_VIDEO = "/service/app"
    }

    interface ComponentVideo {
        companion object {
            const val LIST = "$COMPONENT_VIDEO/list/video"
            const val COVER_LIST = "$COMPONENT_VIDEO/list/cover"
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

    interface ServiceVideo {
        companion object {
            const val VIDEO_LIST = "$SERVICE_VIDEO/list/video"
            const val VIDEO_COVER_LIST = "$SERVICE_VIDEO/list/cover"
        }
    }
}