package com.sbl.sulmun2yong.survey.response

class Answer (
    private val id: Int,
    private val type: Int,
) {
    val content = mutableListOf<String>()
}