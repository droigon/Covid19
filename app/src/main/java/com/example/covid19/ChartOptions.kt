package com.example.covid19

enum class Metric{
    NEGATIVE,POSITIVE, DEATH
}

enum class TimeScale(val numDays:Int){
    WEEK(7),
    MONTH(30),
    MAX(-1)

}