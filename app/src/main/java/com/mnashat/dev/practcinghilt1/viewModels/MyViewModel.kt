package com.mnashat.dev.practcinghilt1.viewModels

import androidx.lifecycle.ViewModel
import com.mnashat.dev.practcinghilt1.repo.DataRepoImp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class MyViewModel @Inject constructor(
     private val repo: DataRepoImp
) : ViewModel() {



    fun retrieveData(){
        repo.fetchData()
    }
}