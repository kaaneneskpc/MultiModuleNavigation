package com.kaaneneskpc

import RootScreen
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.kaaneneskpc.navigation.RootNavigationGraph
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App() {
    MaterialTheme {
        KoinContext {
            val scope = rememberCoroutineScope()
            val drawerState = rememberDrawerState(DrawerValue.Closed)
            RootNavigationGraph(
                root = { navigateToSettings ->
                    RootScreen(
                        drawerState = drawerState,
                        navigateToSettings = {
                            navigateToSettings()
                            scope.launch {
                                drawerState.close()
                            }
                        }
                    )
                }
            )
        }
    }
}