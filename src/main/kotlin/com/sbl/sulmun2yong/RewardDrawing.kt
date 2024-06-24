package com.sbl.sulmun2yong
import com.sbl.sulmun2yong.drawings.Drawing
import com.sbl.sulmun2yong.drawings.Board
import com.sbl.sulmun2yong.reward.Reward

fun main() {
    val userResponse = """{
        "userId": 1,
        "surveyId": 1,
        "userSelectedNumber": 47
    }"""

    // surveyId를 활용 DB 통신하여 board 정보 가져오기
    val dbResponseForBoard = """{
        "winningNumbers": [1,5,7],
        "alreadySelectedNumbers": [1, 2, 3, 4, 10, 11, 12],
        "totalPaperCount": 100
    }"""
    val winningNumbers = listOf(1, 5, 7)
    val alreadySelectedNumbers = listOf(1, 2, 3, 4, 10, 11, 12)
    val totalPaperCount = 100

    // surveyId를 활용 DB 통신하여 리워드 정보 가져오기
    val dbResponseForReward = """{
        "rewardName": "스타벅스 아이스 아메리카노 벤티",
        "totalCount": 3,
        "remainingCount": 2
    }"""
    val rewardName = "스타벅스 아이스 아메리카노 벤티"
    val totalCount = 3
        val remainingCount = 2
    val reward = Reward(rewardName, totalCount, remainingCount)

    val paperBoard = Board(winningNumbers, alreadySelectedNumbers, totalPaperCount)
    val paperDrawing = Drawing(12, paperBoard)

    val drawingResult = paperDrawing.startDraw()
    println(drawingResult.message)

    val isWon = drawingResult.isWon
    if(isWon){
        reward.decreaseRemaining()
    }

    return
}