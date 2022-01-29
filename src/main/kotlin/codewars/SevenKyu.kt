package codewars

fun printerError(s: String): String = "${s.toCharArray().count { it.code !in 97..109 }}/${s.length}"

fun nbDig(n:Int, d:Int):Int = (0..n).map { (it * it) }.sumOf { it.toString().count { it == d.toString()[0] } }
