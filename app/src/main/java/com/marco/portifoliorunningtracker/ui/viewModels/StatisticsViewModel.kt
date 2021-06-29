package com.marco.portifoliorunningtracker.ui.viewModels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.marco.portifoliorunningtracker.repositories.MainRepository


class StatisticsViewModel @ViewModelInject constructor(
        val mainRepository: MainRepository
) : ViewModel() {

        val totalTimeRun = mainRepository.getTotalTimeInMillis()
        val totalDistance = mainRepository.getTotalDistance()
        val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()
        val totalAvgSpeed = mainRepository.getTotalAvgSpeed()

        val runsSortedByDate = mainRepository.getAllRunsSortedByDate()

}