package com.sun.commonerrorexample.example1.fragment_b

import android.os.Bundle
import com.sun.commonerrorexample.R
import com.sun.commonerrorexample.base.BaseFragment
import com.sun.commonerrorexample.databinding.FragmentBBinding

class BFragment: BaseFragment<FragmentBBinding>(), BListener {
    override val layoutRes: Int
        get() = R.layout.fragment_b

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewDataBinding.listener = this@BFragment
    }

    override fun popBackStackFragment() {
        popBackStack()
    }
}
