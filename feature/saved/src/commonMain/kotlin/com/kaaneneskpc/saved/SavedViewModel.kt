package com.kaaneneskpc.saved

import androidx.lifecycle.ViewModel
import com.kaaneneskpc.shared.domain.RecipesRepository

class SavedViewModel(
    private val repository: RecipesRepository
): ViewModel() {
    fun getSavedRecipes() = repository.getSavedRecipes()
}