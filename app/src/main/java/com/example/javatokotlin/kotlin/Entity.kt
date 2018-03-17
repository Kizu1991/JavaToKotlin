package com.example.javatokotlin.kotlin

import android.util.Log

/**
 * Entity
 * Created by pdc-k-kamiya on 2018/03/17.
 */
data class Entity(var id: Int = 0,
                  var title:String = "",
                  var description:String = "")

class EntityControl{
    init {
        val entity = Entity(id = 1, description = "description")
        entity.title = null
        Log.d("DESCRIPTION", entity.description)
    }
}