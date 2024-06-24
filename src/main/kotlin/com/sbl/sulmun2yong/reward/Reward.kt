package com.sbl.sulmun2yong.reward

class Reward(
    private val name: String,
    private val totalCount: Int,
    var remainingCount: Int
) {
    fun decreaseRemaining() {
        remainingCount--
   }
}