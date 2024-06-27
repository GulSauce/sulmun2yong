package com.sbl.sulmun2yong.board

import com.sbl.sulmun2yong.reward.Reward

class EmptyBoard(
    private val winingNumbers: List<Int>,
    private val totalPaperCount: Int,
)

class Board(
    private val emptyBoard: EmptyBoard,
    private val rewards: MutableList<Reward>
) {
    private val winingNumbers
}
