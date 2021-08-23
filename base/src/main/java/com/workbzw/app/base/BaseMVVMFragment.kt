package com.workbzw.app.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/23 1:00 AM
 * @desc
 */
abstract class BaseMVVMFragment<DB : ViewDataBinding, VM : BaseMVVMViewModel> : BaseFragment() {
    lateinit var dataBinding: DB
    lateinit var viewModel: VM
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, setLayout(), container, false)
        viewModel = ViewModelProvider(this).get(viewModel.javaClass)
        dataBinding.setVariable(BR.vm, viewModel)
        dataBinding.lifecycleOwner = this
        init(savedInstanceState)
        return dataBinding.root
    }

}