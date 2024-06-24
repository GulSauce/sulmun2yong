package com.sbl.sulmun2yong.survey.response

public class Section(
    private val id: Int,
    private val elapsedTime: Int,
){
    val answers = mutableListOf<Answer>()
}
