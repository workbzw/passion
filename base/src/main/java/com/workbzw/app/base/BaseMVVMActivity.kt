package com.workbzw.app.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/22 11:37 PM
 * @desc
 */
abstract class BaseMVVMActivity<DB : ViewDataBinding, VM : BaseMVVMViewModel> : BaseActivity() {

    lateinit var dataBinding: DB
    lateinit var viewModel: VM


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, setLayout())
        viewModel = ViewModelProvider(this).get(viewModel.javaClass)
        dataBinding.lifecycleOwner = this
        dataBinding.setVariable(BR.vm, viewModel)
        init(savedInstanceState)
    }

}