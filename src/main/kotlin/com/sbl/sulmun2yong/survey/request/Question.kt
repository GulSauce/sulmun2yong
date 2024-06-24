package com.sbl.sulmun2yong.survey.request

class Question (
    private val id: Int,
    private val type: Int,
    private val title: String,
) {
    val content = mutableListOf<String>()
}