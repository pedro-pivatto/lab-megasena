package controllers

import play.api._
import play.api.mvc._
import scala.io.Source



class Application extends Controller {

  def index = Action {
    Ok(views.html.mega())
  }
  
  def getInfo = Action {

    val filename = "app/controllers/sorteios.txt"
    val lines = Source.fromFile(filename).getLines.mkString
    
    Ok(lines)
  }

}
