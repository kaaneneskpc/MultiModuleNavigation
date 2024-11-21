package com.kaaneneskpc.di

import org.koin.core.module.dsl.viewModel
import com.kaaneneskpc.saved.SavedViewModel
import com.kaaneneskpc.details.DetailsViewModel
import com.kaaneneskpc.home.HomeViewModel
import org.koin.dsl.module

val koinModules = module {
    viewModel { HomeViewModel(repository = get()) }
    viewModel { DetailsViewModel(repository = get()) }
    viewModel { SavedViewModel(repository = get()) }
}