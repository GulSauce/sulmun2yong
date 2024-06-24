package com.sbl.sulmun2yong.drawings

class Board(
    val winingNumbers: List<Int>,
    val alreadySelectedNumber: List<Int>,
    val totalPaperCount: Int,
)

class Drawing (
    private val userSelectedNumber: Int,
    private val board: Board
) {
    class DrawingResult(
        val isWon: Boolean,
        val message: String
    )

    fun startDraw(): DrawingResult {
        // 이미 선택한 번호임
        val isAlreadySelected = board.alreadySelectedNumber.contains(userSelectedNumber)
        if(isAlreadySelected){
            return DrawingResult(false, "이미 선택한 번호입니다")
        }

        // 남은 추첨권이 없음
        val remainingPaperCount = board.totalPaperCount - board.alreadySelectedNumber.size
        if(remainingPaperCount == 0){
            return DrawingResult(false, "남은 추첨권이 없습니다")
        }

        // 당첨
        val winingNumbers = board.winingNumbers
        val isWon = winingNumbers.contains(userSelectedNumber)
        if (isWon) {
           return DrawingResult(true, "당첨되었습니다!")
        }

        // 꽝
        return DrawingResult(false, "다음 기회에!")
    }
}

