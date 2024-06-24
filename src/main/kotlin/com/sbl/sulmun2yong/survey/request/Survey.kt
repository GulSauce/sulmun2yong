package com.sbl.sulmun2yong.survey.request

class Survey(
    private val surveyId: Int,
    private val createUserId: Int,
    private val title: String,
    private val createdDate: String,
    private val endDate: String,
) {
    val sections = mutableListOf<Section>()
}