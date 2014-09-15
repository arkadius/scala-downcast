import org.scalatest.{Matchers, FlatSpec}

class ShCastingBoxTest extends FlatSpec with Matchers {

  it should "String -> Int" in {
    an[ClassCastException] should be thrownBy {
      val boxWithListOfInts = new ShCastingBox[Int] {
        val value = "123"
      }
      println(s"value: ${boxWithListOfInts.casted}")
    }
  }

  it should "List[String] -> List[Int]" in {
    an[ClassCastException] should be thrownBy {
      val boxWithListOfInts = new ShCastingBox[List[Int]] {
        val value = List("123")
      }
      println(s"value: ${boxWithListOfInts.casted}")
    }
  }

}
