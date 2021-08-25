package com.workbzw.app.video.list

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.workbzw.app.base.BaseMVVMFragment
import com.workbzw.app.base.RouterPath
import com.workbzw.app.home.R
import com.workbzw.app.home.databinding.VideoListFragmentBinding

@Route(path = RouterPath.ComponentVideo.LIST_COVER)
class VideoCoverListFragment :
    BaseMVVMFragment<VideoListFragmentBinding, VideoCoverListViewModel>() {

    companion object {
        fun newInstance(): VideoCoverListFragment {
            val args = Bundle()
            val fragment = VideoCoverListFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun setLayout(): Int {
        return R.layout.video_list_fragment
    }

    override fun init(savedInstanceState: Bundle?) {

    }

}