import org.scalatest.{MustMatchers, WordSpec}

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" when {

    "part is called" must {

      "return 'Lynn, I've pierced my foot on a spike!!' if empty args" in {
        Partridge.part(Array("")) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }

      "return 'Lynn, I've pierced my foot on a spike!!' if no keywords" in {
        Partridge.part(Array("cheese", "dog")) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }

      "Mines a Pint!' if one keyword matched" in {
        Partridge.part(Array("AlphaPapa")) mustEqual "Mines a Pint!"
      }

      "Mines a Pint!!' if two keywords matched" in {
        Partridge.part(Array("AlphaPapa", "Nomad", "cheese")) mustEqual "Mines a Pint!!"
      }

      "Mines a Pint!!!' if three keywords matched" in {
        Partridge.part(Array("AlphaPapa", "Nomad", "Partridge")) mustEqual "Mines a Pint!!!"
      }

      "Mines a Pint!!!!' if four keywords matched" in {
        Partridge.part(Array("AlphaPapa", "Nomad", "Partridge", "PearTree")) mustEqual "Mines a Pint!!!!"
      }

      "Mines a Pint!!!!!' if five keywords matched" in {
        Partridge.part(Array("AlphaPapa", "Nomad", "Partridge", "PearTree", "Chat")) mustEqual "Mines a Pint!!!!!"
      }

      "Mines a Pint!!!!!!' if six keywords matched" in {
        Partridge.part(Array("AlphaPapa", "Nomad", "Partridge", "PearTree", "Chat", "Toblerone")) mustEqual "Mines a Pint!!!!!!"
      }

      "Mines a Pint!!!!!!!' if seven keywords matched" in {
        Partridge.part(Array("AlphaPapa", "Nomad", "Partridge", "PearTree", "Chat", "Toblerone", "Dan")) mustEqual "Mines a Pint!!!!!!!"
      }

      "Mines a Pint!!!!!!!!' if eight keywords matched with a including a duplicate" in {
        Partridge.part(Array("AlphaPapa", "Nomad", "Partridge", "PearTree", "Chat", "Toblerone", "Dan", "Nomad")) mustEqual "Mines a Pint!!!!!!!!"
      }

    }
  }
}
