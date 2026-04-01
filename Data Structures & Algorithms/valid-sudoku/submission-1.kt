class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { HashSet<Char>() }
        val columns = Array(9) { HashSet<Char>() }
        val boxes = Array(9) { HashSet<Char>() }

        for (r in 0..8) {
            for (c in 0..8) {
                val cellValue = board[r][c]
                if (cellValue == '.') continue

                if (!rows[r].add(cellValue)) return false
                
                if (!columns[c].add(cellValue)) return false
                
                val boxIndex = (r / 3) * 3 + (c / 3)
                if (!boxes[boxIndex].add(cellValue)) return false
            }
        }

        return true
    }
}
