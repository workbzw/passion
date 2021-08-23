package com.workbzw.app.video.list

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.workbzw.app.base.BaseMVVMFragment
import com.workbzw.app.base.RouterPath
import com.workbzw.app.home.R
import com.workbzw.app.home.databinding.VideoListFragmentBinding

@Route(path = RouterPath.ServiceVideo.VIDEO_COVER_LIST)
class VideoCoverListFragment :
    BaseMVVMFragment<VideoListFragmentBinding, VideoCoverListViewModel>() {
    override fun setLayout(): Int {
        return R.layout.video_list_fragment
    }

    override fun init(savedInstanceState: Bundle?) {
    }


}