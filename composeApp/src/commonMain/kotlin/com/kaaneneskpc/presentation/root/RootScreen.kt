package com.kaaneneskpc.presentation.root

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.rememberCoroutineScope
import com.kaaneneskpc.presentation.component.CustomNavigationDrawer
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RootScreen(
    drawerState: DrawerState,
    navigateToSettings: () -> Unit
) {
    val scope = rememberCoroutineScope()
    CustomNavigationDrawer(
        drawerState = drawerState,
        onSettings = navigateToSettings
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text("Root")
                    },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = null
                            )
                        }
                    }
                )
            }
        ) {

        }
    }
}