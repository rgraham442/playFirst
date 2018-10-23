package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def escape = Action {implicit request: Request[AnyContent] =>
    Redirect("http://bbc.co.uk")
  }

  def hello(name: String) = Action {implicit request: Request[AnyContent] =>
    Ok("Hello " + name + "!")
  }

  def redirectable = Action {implicit request: Request[AnyContent] =>
    Redirect(routes.Application.hello("Hugh Mann"))
  }



}