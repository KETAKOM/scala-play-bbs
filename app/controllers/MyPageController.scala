package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class MyPageController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.mypage.index())
  }

  def edit() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.mypage.edit())
  }

  def update() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.mypage.update())
  }
}
