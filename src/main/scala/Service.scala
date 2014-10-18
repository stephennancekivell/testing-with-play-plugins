
import play.api.{Plugin, Application}

class Service(app: Application) extends Plugin {

	def serviceIt(): String = "Service"
}

class FakeServiceA(app: Application) extends Service(app) {
	override def serviceIt(): String = "FakeServiceA"
}

class FakeServiceB(app: Application) extends Service(app) {
	override def serviceIt(): String = "FakeServiceB"
}