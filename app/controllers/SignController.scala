package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class SignController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def top() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.sign.index())
  }

  def signUp() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.sign.up())
  }

  def signOut() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.sign.out())
  }
}
