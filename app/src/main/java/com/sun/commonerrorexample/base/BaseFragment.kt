package com.sun.commonerrorexample.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.sun.commonerrorexample.R

abstract class BaseFragment<VB : ViewDataBinding> : Fragment() {

    protected lateinit var viewDataBinding: VB

    @get:LayoutRes
    protected abstract val layoutRes: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = DataBindingUtil
            .inflate(LayoutInflater.from(activity), layoutRes, container, false)
        return viewDataBinding.root
    }

    fun navigateTo(newFragment: Fragment) {
        activity?.supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.frameContent, newFragment)
            ?.addToBackStack(newFragment.javaClass.name)
            ?.commit()
    }

    fun backToLatest(tag: String) {
        activity?.supportFragmentManager?.findFragmentByTag(tag)
    }

    fun popBackStack() {
        activity?.supportFragmentManager?.popBackStack()
    }
}
