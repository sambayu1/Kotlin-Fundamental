fun main() {
    val text : String? = null
    text?.length
    val text_p : String? = null
    val textLength = text_p?.length ?: 7
    val textLength_p = if (text_p != null) text_p.length  else 7

    val word : String? = null
    val wordLength = word?.length ?: "SMK Telkom".length

    println("Jumlah kata dari string SMK Telkom sebanyak $wordLength")
}