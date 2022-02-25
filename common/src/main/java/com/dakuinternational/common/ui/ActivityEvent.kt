package com.dakuinternational.common.ui

import com.dakuinternational.common.event.UiEvent

sealed class ActivityEvent: UiEvent() {

    object SplashDone : UiEvent()
    object ProcedurePage: UiEvent()
}