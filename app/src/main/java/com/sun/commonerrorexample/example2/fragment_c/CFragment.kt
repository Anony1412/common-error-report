package com.sun.commonerrorexample.example2.fragment_c

import android.os.Bundle
import com.sun.commonerrorexample.R
import com.sun.commonerrorexample.base.BaseFragment
import com.sun.commonerrorexample.databinding.FragmentCBinding
import org.koin.android.viewmodel.ext.android.viewModel

class CFragment: BaseFragment<FragmentCBinding>(), CListener {

    private val viewModel: CViewModel by viewModel()

    override val layoutRes: Int
        get() = R.layout.fragment_c

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewDataBinding.apply {
            viewModel = this@CFragment.viewModel
            listener = this@CFragment
        }
    }

    override fun count() {
        viewModel.plusNumber()
    }
}
