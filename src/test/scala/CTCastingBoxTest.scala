import org.scalatest.{Matchers, FlatSpec}

class CTCastingBoxTest extends FlatSpec with Matchers {

  it should "String -> Int" in {
    an[ClassCastException] should be thrownBy {
      val boxWithListOfInts = new CTCastingBox[Int] {
        val value = "123"
      }
      println(s"value: ${boxWithListOfInts.casted}")
    }
  }

  ignore should "List[String] -> List[Int]" in {
    an[ClassCastException] should be thrownBy {
      val boxWithListOfInts = new CTCastingBox[List[Int]] {
        val value = List("123")
      }
      println(s"value: ${boxWithListOfInts.casted}")
    }
  }

}
