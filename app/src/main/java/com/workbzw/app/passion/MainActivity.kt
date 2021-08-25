package com.workbzw.app.passion

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.alibaba.android.arouter.facade.annotation.Route
import com.workbzw.app.base.BaseMVVMActivity
import com.workbzw.app.base.RouterPath
import com.workbzw.app.passion.databinding.ActivityMainBinding

@Route(path = RouterPath.ComponentApp.MAIN)
class MainActivity : BaseMVVMActivity<ActivityMainBinding, MainViewModel>() {


    override fun setLayout(): Int {
        return R.layout.activity_main
    }

    override fun init(savedInstanceState: Bundle?) {
        navItemClicked()
        initViewPager()
    }

    private fun initViewPager() {
        var vpAdapter = ViewPagerAdapter(supportFragmentManager)
        dataBinding?.vpContainer?.adapter = vpAdapter
    }


    private fun navItemClicked() {
        dataBinding?.nav?.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_1 -> {
                    dataBinding?.vpContainer?.currentItem = 0
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.nav_2 -> {
                    dataBinding?.vpContainer?.currentItem = 1
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }

    class ViewPagerAdapter(fm: FragmentManager) :
        FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


        var list: List<Fragment> = listOf(Fragment(), Fragment())
        override fun getCount(): Int {
            return list.size
        }

        override fun getItem(position: Int): Fragment {
            return list[position]
        }


    }

}