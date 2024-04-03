package com.example.composerecyclerview.Repository

import com.example.composerecyclerview.Model.Person

class PersonRepository(){
    fun getAllData():List<Person>{
        return listOf(
            Person(id=0,
                firstName = "Lalli",
                lastName = "C",
                age=25
            ),
            Person(id=1,
                firstName = "Jacky",
                lastName = "R",
                age=10
            ),
            Person(id=2,
                firstName = "Diana",
                lastName = "R",
                age=10
            ),
            Person(id=3,
                firstName = "Peter",
                lastName = "P",
                age=10
            )
        )
    }


}