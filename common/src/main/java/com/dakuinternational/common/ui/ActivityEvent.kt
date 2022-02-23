package com.dakuinternational.common.ui

import com.dakuinternational.common.event.UiEvent

sealed class ActivityEvent: UiEvent() {

    object MainPage: UiEvent()
    object SplashDone : UiEvent()
}