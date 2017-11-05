object MainSame{
  def main(args: Array[String]): Unit = {
    val seq1 = Seq(121, 144, 19, 161, 19, 144, 19, 11)
    val seq2 = Seq(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    print(Soln.comp(seq1,seq2))
  }
}
object Soln {
  def comp(seq1: Seq[Int], seq2: Seq[Int]) = {
    if (seq1.isEmpty || seq2.isEmpty){
      false
    }else{
      square(seq1).values.toSet == seq2.toSet
    }
  }

  def square(seq: Seq[Int]) : Map[Int, Int] =
    (for(
      num <- seq
    )yield (num, num*num)).toMap

}