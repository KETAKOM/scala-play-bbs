package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class SampleController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    println("iiiii")
    Ok(views.html.index())
  }

  def page() = Action { implicit request: Request[AnyContent] =>
    println("aaaaa")
    Ok("Sample Page")
  }


  //jsonを返したい場合は、playはplayjsonというライブラリが基本で含まれている
  def jsonSample() = Action { implicit request: Request[AnyContent] =>
    import play.api.libs.json._

    val json = Json.obj(
      "key" -> "val"
    )

    Ok(json)
  }
}
