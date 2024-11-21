package com.kaaneneskpc.di

import com.kaaneneskpc.shared.di.repositoryModule
import org.koin.core.context.startKoin

fun initializeKoin() {
    startKoin {
        modules(repositoryModule, koinModules)
    }
}