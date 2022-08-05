
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mega_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class mega extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Red+Hat+Display&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.51*/routes/*10.57*/.Assets.versioned("stylesheets/style.css")),format.raw/*10.99*/("""">
    <title>Mega Sena</title>
</head>
<body>

    <div class="top-container">
        <h1 class="info-title">Informe de 6 a 15 números e descubra em quantos jogos da Mega Sena eles foram sorteados</h1>

        <img src=""""),_display_(/*18.20*/routes/*18.26*/.Assets.versioned("./images/Mega-Sena-Cabecalho.png")),format.raw/*18.79*/("""" alt="" class="mega-img">

        <form name="megasena" method="post" class="form-container">

            <div class="inputs">
                <input type="number" name="num1" id="num1">
                <br>
                <input type="number" name="num2" id="num2">
                <br>
                <input type="number" name="num3" id="num3">
                <br>
                <input type="number" name="num4" id="num4">
                <br>
                <input type="number" name="num5" id="num5">
                <br>
                <input type="number" name="num6" id="num6">
                <br>
                <input type="number" name="num7" id="num7">
                <br>
                <input type="number" name="num8" id="num8">
                <br>
                <input type="number" name="num9" id="num9">
                <br>
                <input type="number" name="num10" id="num10">
                <br>
                <input type="number" name="num11" id="num11">
                <br>
                <input type="number" name="num12" id="num12">
                <br>
                <input type="number" name="num13" id="num13">
                <br>
                <input type="number" name="num14" id="num14">
                <br>
                <input type="number" name="num15" id="num15">
            </div>

            <div class="buttons">
                <button id="button-send" class="form-button">Enviar</button>
                <button id="button-reset" type="reset" class="form-buttton">Reiniciar</button>
            </div>
        </form>
    </div>

    <hr>

    <h2 id="result">Resultado</h2>

    <div id="msg"></div>

    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("javascripts/script.js")),format.raw/*67.67*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*68.19*/routes/*68.25*/.Assets.versioned("javascripts/underscore.js")),format.raw/*68.71*/("""" type="text/javascript"></script>

</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object mega extends mega_Scope0.mega
              /*
                  -- GENERATED --
                  DATE: Fri Aug 05 11:34:43 BRT 2022
                  SOURCE: D:/works/Spread/workspace.211/lab-megasena/app/views/mega.scala.html
                  HASH: 899a0c5c7289a80ed1a2f7bc4659b84bc51335d7
                  MATRIX: 607->0|1135->501|1150->507|1213->549|1472->781|1487->787|1561->840|3336->2588|3351->2594|3414->2636|3495->2690|3510->2696|3577->2742
                  LINES: 25->1|34->10|34->10|34->10|42->18|42->18|42->18|91->67|91->67|91->67|92->68|92->68|92->68
                  -- GENERATED --
              */
          