package com.kaaneneskpc.shared.di

import com.kaaneneskpc.shared.domain.RecipesRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { RecipesRepository() }
}