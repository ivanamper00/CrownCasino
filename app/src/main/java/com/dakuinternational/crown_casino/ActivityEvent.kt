package com.dakuinternational.crown_casino

import com.dakuinternational.common.event.UiEvent

sealed class ActivityEvent: UiEvent() {

    object MainPage: UiEvent()
}