class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramGroups = HashMap<String, MutableList<String>>()

        for(word in strs){
            val sortedWord = word.toCharArray().sorted().joinToString("")
            val group = anagramGroups.getOrPut(sortedWord) {mutableListOf()}

            group.add(word)
        }

        return anagramGroups.values.toList()
    }
}
