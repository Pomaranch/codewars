object Solution {

  def duplicateEncode(word: String) = {
    val o = letterOccasion(word)
    replace(word.toList, o).mkString
  }

  def letterOccasion(word: String): Map[Char, Int] =
    for (
      (c, o) <- word.toLowerCase groupBy (c => c)
    ) yield (c, o.length)


  def replace(word: List[Char], occ: Map[Char, Int]): List[Char] = {
    if (word.nonEmpty) {
      val o = occ(word.head)
      o match {
        case 1 => '(' :: replace(word.tail, occ)
        case _ => ')' :: replace(word.tail, occ)
      }
    } else Nil
  }
}

class DuplicateEncoder {


}

object Main {
  def main(args: Array[String]): Unit = {
    println(Solution.duplicateEncode("DBRKCEd3LpvzxClQiDicz"))
  }
}
