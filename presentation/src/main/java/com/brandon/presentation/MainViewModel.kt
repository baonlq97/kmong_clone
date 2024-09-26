package com.brandon.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.brandon.domain.sample.model.Example
import com.brandon.domain.sample.usecases.GetExamplesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    // Sample for getting the example usecase
    private val getExamplesUseCase: GetExamplesUseCase) : ViewModel() {

    private val _examples = MutableStateFlow<List<Example>>(emptyList())
    val examples: StateFlow<List<Example>> = _examples

    fun loadExamples() {
        viewModelScope.launch {
            _examples.value = getExamplesUseCase()
        }
    }
}