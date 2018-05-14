package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class PostController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.post.index())
  }

  def create() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.post.create())
  }

  def edit() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.post.edit())
  }

  def update() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.post.update())
  }

  def delete() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.post.delete())
  }
}
