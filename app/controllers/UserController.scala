package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class UserController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def list() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.user.index())
  }

  def follow() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.user.follow())
  }

  def unFollow() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.user.unfollow())
  }
}
