package com.dakuinternational.crown_casino

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dakuinternational.common.base.SingleLiveEvent
import com.dakuinternational.common.event.UiEvent

class ActivityViewModel: ViewModel() {


    private val _uiEvent = SingleLiveEvent<UiEvent>()
    val activityEvent: LiveData<UiEvent> get() = _uiEvent


}