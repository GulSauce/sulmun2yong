package com.sbl.sulmun2yong

import com.sbl.sulmun2yong.board.EmptyBoard
import com.sbl.sulmun2yong.board.Board
import com.sbl.sulmun2yong.reward.Reward

fun GetCurrentBoard() {
    val rewardName1 = "스타벅스 아이스 아메리카노 벤티"
    val totalCount1 = 3
    val reward1 = Reward(rewardName1, totalCount1)

    val rewardName2 = "닌텐도 스위치"
    val totalCount2 = 3
    val reward2 = Reward(rewardName2, totalCount2)

    val rewards = mutableListOf<Reward>()
    rewards.add(reward1)
    rewards.add(reward2)

    val winningNumbers = listOf(1, 5, 7)
    val totalPaperCount = 100
    val emptyBoard = EmptyBoard(winningNumbers, totalPaperCount)

    val board = Board(emptyBoard, rewards)

    return
}