package com.kaaneneskpc.details

import androidx.lifecycle.ViewModel
import com.kaaneneskpc.shared.domain.RecipesRepository

class DetailsViewModel(
    private val repository: RecipesRepository
): ViewModel() {
    fun getSelectedRecipe(id: Int) = repository.getSelectedRecipe(id)
    fun toggleFavorites(id: Int) = repository.toggleFavorite(id)
}