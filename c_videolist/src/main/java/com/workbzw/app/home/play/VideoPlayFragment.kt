package com.workbzw.app.video.play

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.workbzw.app.base.BaseMVVMFragment
import com.workbzw.app.base.RouterPath
import com.workbzw.app.home.R
import com.workbzw.app.home.databinding.VideoPlayFragmentBinding

/**
 * 视频列表
 */
@Route(path = RouterPath.ServiceVideo.VIDEO_LIST)
class VideoPlayFragment : BaseMVVMFragment<VideoPlayFragmentBinding, VideoPlayViewModel>() {
    override fun setLayout(): Int {
        return R.layout.video_play_fragment
    }

    fun getInstence() {

    }

    override fun init(savedInstanceState: Bundle?) {

    }
}