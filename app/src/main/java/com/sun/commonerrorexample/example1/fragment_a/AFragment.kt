package com.sun.commonerrorexample.example1.fragment_a

import android.os.Bundle
import android.util.Log
import com.sun.commonerrorexample.R
import com.sun.commonerrorexample.base.BaseFragment
import com.sun.commonerrorexample.databinding.FragmentABinding
import com.sun.commonerrorexample.example1.fragment_b.BFragment
import org.koin.android.viewmodel.ext.android.viewModel

class AFragment : BaseFragment<FragmentABinding>(), AListener {

    private val viewModel: AViewModel by viewModel()

    override val layoutRes: Int
        get() = R.layout.fragment_a

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(AViewModel::class.java)
        viewDataBinding.apply {
            viewModel = this@AFragment.viewModel
            listener = this@AFragment
        }
        viewModel.test.value = "Done!"

        /* then run app and rotate screen, look at in the Log tab */
        /* method hasObservers return true meaning already has observer instance exist */
        if (viewModel.test.hasObservers()) {
            Log.d("TAG", "hasObservers")
        }

//        viewModel.test.observe(this) {
//            Log.d("TAG", it)
//        }

        viewModel.test.observe(viewLifecycleOwner) {
            Log.d("TAG", it)
        }
    }

    override fun goToB() {
        navigateTo(BFragment())
    }
}
