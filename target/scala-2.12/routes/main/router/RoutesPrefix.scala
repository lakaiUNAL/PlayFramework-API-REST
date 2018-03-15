// @GENERATOR:play-routes-compiler
// @SOURCE:/home/juancho/Programing/juanchodb/conf/routes
// @DATE:Thu Mar 15 14:23:53 COT 2018


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
