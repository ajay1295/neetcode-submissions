class Solution {

    fun encode(strs: List<String>): String {
        val op = StringBuilder()
        for(str in strs){
            op.append(str.length).append("#").append(str)
        }
        return op.toString()
    }

    fun decode(str: String): List<String> {
        val list = mutableListOf<String>()
        var i=0
        while(i < str.length){
            val j = str.indexOf('#', i)
            val length = str.substring(i,j).toInt()
            val word = str.substring(j+1, j+1+length)
            list.add(word)
            i = j + 1 + length
        }

        return list
    }
}
