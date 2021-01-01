package com.sun.commonerrorexample.di

import com.sun.commonerrorexample.example1.fragment_a.AViewModel
import com.sun.commonerrorexample.example1.fragment_b.BViewModel
import com.sun.commonerrorexample.example2.fragment_c.CViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { AViewModel() }
    viewModel { BViewModel() }
    viewModel { CViewModel() }
}
