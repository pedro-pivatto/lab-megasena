
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/works/Spread/workspace.211/lab-megasena/conf/routes
// @DATE:Tue Aug 02 13:46:51 BRT 2022


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
