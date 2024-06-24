package com.sbl.sulmun2yong.survey.response

class Survey (
    private val surveyId: Int,
    private val ip: String,
    private val fingerPrint: String,
) {
    val section = mutableListOf<Section>()
}