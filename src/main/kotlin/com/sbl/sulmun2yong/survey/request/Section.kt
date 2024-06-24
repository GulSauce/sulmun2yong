package com.sbl.sulmun2yong.survey.request

public class Section(
    private val id: Int,
    private val title: String,
    private val explanation: String
){
    val questions = mutableListOf<Question>()
}
