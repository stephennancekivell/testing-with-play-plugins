import play.api.test._
import play.api.test.Helpers._
import org.specs2.mutable._

class UserSpec extends Specification {
	"User" should {
		val fakeAppA = new FakeApplication(
			additionalPlugins = Seq(
      			"FakeServiceA"
      		)
      	)

      	"have FakeServiceA " in running(fakeAppA) {
			UserController.doit() === "FakeServiceA"
		}

		val fakeAppB = new FakeApplication(
			additionalPlugins = Seq(
      			"FakeServiceB"
      		)
      	)

      	"have FakeServiceB" in running(fakeAppA) {
      		// doesnt work gets FakeServiceA
			UserController.doit() === "FakeServiceB"
		}
	}
}