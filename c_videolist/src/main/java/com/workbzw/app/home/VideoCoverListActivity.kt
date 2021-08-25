package com.workbzw.app.home

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.workbzw.app.base.BaseMVVMActivity
import com.workbzw.app.base.RouterPath
import com.workbzw.app.home.databinding.ActivityVideoCoverListBinding
import com.workbzw.app.video.list.VideoCoverListFragment

@Route(path = RouterPath.ComponentVideo.LIST)
class VideoCoverListActivity :
    BaseMVVMActivity<ActivityVideoCoverListBinding, VideoCoverListViewModel>() {
    override fun setLayout(): Int {
        return R.layout.activity_video_cover_list
    }

    override fun init(savedInstanceState: Bundle?) {
        val fragment = VideoCoverListFragment.newInstance()
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commitNow()
        }
    }

}