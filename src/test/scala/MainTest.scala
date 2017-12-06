import org.scalatest.Matchers

class MainTest extends org.scalatest.FreeSpec with Matchers {
  "collection commands" - {
    "contains" - {
      "returns true if the search int exists" in {
        Main.contains(1, List(1, 2, 3)) shouldEqual true
      }

      "returns false if the search int exists" in {
        Main.contains(10, List(1, 2, 3)) shouldEqual false
      }
    }
  }
}
