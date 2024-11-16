package com.kaaneneskpc.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute

@Composable
fun BottomBarNavigationGraph(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    /* NavHost(
        modifier = Modifier
            .padding(
                top = paddingValues.calculateTopPadding(),
                bottom = paddingValues.calculateBottomPadding()
            ),
        navController = navController,
        startDestination = Screen.HomeGraph
    ) {
        navigation<Screen.HomeGraph>(
            startDestination = Screen.Home
        ) {
            composable<Screen.Home> {
                HomeScreen(
                    navigateToDetails = {
                        navController.navigate(Screen.Details(it))
                    }
                )
            }
            composable<Screen.Details> {
                val recipeId = it.toRoute<Screen.Details>().id
                DetailsScreen(
                    id = recipeId,
                    navigateBack = { navController.navigateUp() }
                )
            }
        }
        composable<Screen.Saved> {
            SavedScreen(
                navigateToDetails = {
                    navController.navigate(Screen.Details(it))
                }
            )
        }
        composable<Screen.Joke> {
            JokeScreen()
        }
    } */
}