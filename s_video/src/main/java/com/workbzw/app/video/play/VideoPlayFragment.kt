package com.workbzw.app.video.play

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.workbzw.app.base.BaseMVVMFragment
import com.workbzw.app.base.RouterPath
import com.workbzw.app.video.R
import com.workbzw.app.video.databinding.VideoPlayFragmentBinding

/**
 * 视频列表
 */
@Route(path = RouterPath.ServiceVideo.VIDEO_LIST)
class VideoPlayFragment : BaseMVVMFragment<VideoPlayFragmentBinding, VideoPlayViewModel>() {
    override fun setLayout(): Int {
        return R.layout.video_play_fragment
    }

    override fun init(savedInstanceState: Bundle?) {

    }
}