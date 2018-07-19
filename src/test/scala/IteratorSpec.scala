import org.scalatest.{MustMatchers, WordSpec}
import Iterator._

class IteratorSpec extends WordSpec with MustMatchers {

  "Iterator" should {

    "return true when List is not empty" in {

      hasNext(List(1,2,3)) mustEqual true
    }
  }
}
