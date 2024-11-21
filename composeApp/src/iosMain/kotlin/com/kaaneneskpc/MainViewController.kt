package com.kaaneneskpc

import androidx.compose.ui.window.ComposeUIViewController
import com.kaaneneskpc.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) { App() }