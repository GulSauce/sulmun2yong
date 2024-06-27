package com.sbl.sulmun2yong.reward

class Reward(
    private val name: String,
    private val totalCount: Int,

) {
    private var remainingCount = totalCount
    fun decreaseRemainingCount() {
        remainingCount--
   }
}