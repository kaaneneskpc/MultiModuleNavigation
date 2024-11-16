package com.kaaneneskpc

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.*
import com.kaaneneskpc.navigation.RootNavigationGraph
import com.kaaneneskpc.presentation.root.RootScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val drawerState = rememberDrawerState(DrawerValue.Closed)
        RootNavigationGraph(
            root = { navigateToSettings ->
                RootScreen(drawerState, navigateToSettings)
            }
        )
    }
}