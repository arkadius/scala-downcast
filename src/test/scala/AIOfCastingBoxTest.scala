import org.scalatest.{Matchers, FlatSpec}

class AIOfCastingBoxTest extends FlatSpec with Matchers {

  ignore should "String -> Int" in {
    an[ClassCastException] should be thrownBy {
      val boxWithListOfInts = new AIOfCastingBox[Int] {
        val value = "123"
      }
      println(s"value: ${boxWithListOfInts.casted}")
    }
  }

  ignore should "List[String] -> List[Int]" in {
    an[ClassCastException] should be thrownBy {
      val boxWithListOfInts = new AIOfCastingBox[List[Int]] {
        val value = List("123")
      }
      println(s"value: ${boxWithListOfInts.casted}")
    }
  }

}
