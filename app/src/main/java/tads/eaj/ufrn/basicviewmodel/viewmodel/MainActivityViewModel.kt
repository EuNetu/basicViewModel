package tads.eaj.ufrn.basicviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tads.eaj.ufrn.basicviewmodel.model.Dog

class MainActivityViewModel : ViewModel(){

    private var _dog = MutableLiveData<Dog>()
    var dog:LiveData<Dog> = _dog

    init {
        _dog.value = Dog("Boxer", "10")
    }

    fun handleClickEnvelhercer(){
        _dog.value?.envelhecer()
        _dog.postValue(_dog.value)
    }
}