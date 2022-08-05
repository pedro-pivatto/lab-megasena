package controllers

import play.api._
import play.api.mvc._
import scala.io._
import java.io._
import java.io.{File, FileOutputStream, BufferedOutputStream, FileInputStream, BufferedInputStream}
import play.api.libs.iteratee._
import play.api.libs._
import scala.concurrent.ExecutionContext.Implicits.global


class Application extends Controller {

  def index = Action {
    Ok(views.html.mega())
  }
  
  def getInfo = Action { 
      //InputStream
      val filename = "app/controllers/sorteios.txt"
      val stream = ((new FileInputStream(filename)))

      Ok.chunked(Enumerator.fromStream(stream))
  }
}
