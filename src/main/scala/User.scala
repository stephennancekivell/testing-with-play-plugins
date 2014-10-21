
import play.api.{Play, Logger}
import play.api.Play.current
import play.api.mvc._

object UserController extends Controller {
	def service = Play.application.plugin[Service]
    	.getOrElse(throw new RuntimeException("Service not loaded"))

	def doit() = service.serviceIt()
}