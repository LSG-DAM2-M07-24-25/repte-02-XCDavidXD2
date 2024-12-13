package com.example.repte_02.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.repte_02.Model.Nombre

class NombreViewModel : ViewModel(){
    private val _nombre = MutableLiveData(Nombre("David"))
    val nombre:LiveData<Nombre> = _nombre

    fun cambioNombre(nombreNuevo: String){
        val currentNombre =_nombre.value ?: Nombre("David")
        _nombre.value = currentNombre.copy(
            nombre = nombreNuevo
        )
    }
}