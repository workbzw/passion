package com.workbzw.app.base

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.reflect.ParameterizedType
import java.lang.reflect.TypeVariable

/**
 * @author bzw [workbzw@outlook.com]
 * @date   2021/8/22 11:37 PM
 * @desc
 */
abstract class BaseMVVMActivity<DB : ViewDataBinding, VM : BaseMVVMViewModel> : BaseActivity() {

    var dataBinding: DB? = null
    var viewModel: VM? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, setLayout())
        //创建viewModel
        val modelClass: Class<*>
        val type = javaClass.genericSuperclass
        modelClass = if (type is ParameterizedType) {
            type.actualTypeArguments[1] as Class<*>
        } else {
            //如果没有指定泛型参数，则默认使用BaseViewModel
            BaseViewModel::class.java
        }
        ViewModelProvider(this).get(modelClass as Class<VM>)
        dataBinding?.lifecycleOwner = this
        dataBinding?.setVariable(BR.vm, viewModel)
        init(savedInstanceState)
    }


}

