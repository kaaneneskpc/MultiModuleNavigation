package com.kaaneneskpc.home

import androidx.lifecycle.ViewModel
import com.kaaneneskpc.shared.domain.RecipesRepository

class HomeViewModel(
    private val repository: RecipesRepository
): ViewModel() {
    fun getAllRecipes() = repository.getAllRecipes()
}