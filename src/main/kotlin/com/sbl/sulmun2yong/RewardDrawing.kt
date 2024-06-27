package com.sbl.sulmun2yong

import com.sbl.sulmun2yong.drawing.Drawing
import com.sbl.sulmun2yong.drawing.DrawingInfo

fun rewardDrawing(drawingInfo: DrawingInfo) {
    val paperDrawing = Drawing(paperBoard)

    val drawingResult = paperDrawing.startDraw(12)
    println(drawingResult.message)

    val isWon = drawingResult.isWon
    if (isWon) {
        reward.decreaseRemainingCount()
    }
}