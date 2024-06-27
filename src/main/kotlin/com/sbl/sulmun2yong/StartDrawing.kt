package com.sbl.sulmun2yong

import com.sbl.sulmun2yong.drawing.DrawingInfo
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class RequestData(val surveyId: Int, val phoneNumber: String)

@RestController
@RequestMapping("/api/v1")
class StartDrawingController {

    @PostMapping("/startDrawing")
    fun checkIsDrawingSurvey(@RequestBody surveyId: Int) {
        // if 설문조사가 boardId를 가지고 있으면
        val boardId = 1
        val phoneNumber = "010-1234-5678"
        val drawingInfo = DrawingInfo(boardId, phoneNumber)
        rewardDrawing(drawingInfo)
    }
}