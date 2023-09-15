package com.sanchelo.skyward.presentation.screens.main_screen.view_models

import androidx.lifecycle.ViewModel
import com.sanchelo.skyward.data.local.repository.PlanetsRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val planetsRepository: PlanetsRepositoryImpl
): ViewModel() {

}