// @GENERATOR:play-routes-compiler
// @SOURCE:/home/juancho/Programing/juanchodb/conf/routes
// @DATE:Thu Mar 15 14:23:53 COT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:9
  Assets_2: controllers.Assets,
  // @LINE:13
  PrestamosController_0: controllers.PrestamosController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:9
    Assets_2: controllers.Assets,
    // @LINE:13
    PrestamosController_0: controllers.PrestamosController
  ) = this(errorHandler, HomeController_1, Assets_2, PrestamosController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_2, PrestamosController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """welcome/""" + "$" + """name<[^/]+>""", """controllers.HomeController.welcome(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """prestamos""", """controllers.PrestamosController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """prestamos""", """controllers.PrestamosController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """prestamos/""" + "$" + """id<[^/]+>""", """controllers.PrestamosController.show(id:Integer)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """prestamos/""" + "$" + """id<[^/]+>""", """controllers.PrestamosController.update(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """prestamos/""" + "$" + """id<[^/]+>""", """controllers.PrestamosController.destroy(id:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_welcome2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("welcome/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_welcome2_invoker = createInvoker(
    HomeController_1.welcome(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "welcome",
      Seq(classOf[String]),
      "GET",
      this.prefix + """welcome/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_PrestamosController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("prestamos")))
  )
  private[this] lazy val controllers_PrestamosController_index3_invoker = createInvoker(
    PrestamosController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PrestamosController",
      "index",
      Nil,
      "GET",
      this.prefix + """prestamos""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PrestamosController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("prestamos")))
  )
  private[this] lazy val controllers_PrestamosController_create4_invoker = createInvoker(
    PrestamosController_0.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PrestamosController",
      "create",
      Nil,
      "POST",
      this.prefix + """prestamos""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_PrestamosController_show5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("prestamos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrestamosController_show5_invoker = createInvoker(
    PrestamosController_0.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PrestamosController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """prestamos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PrestamosController_update6_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("prestamos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrestamosController_update6_invoker = createInvoker(
    PrestamosController_0.update(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PrestamosController",
      "update",
      Seq(classOf[Integer]),
      "PATCH",
      this.prefix + """prestamos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PrestamosController_destroy7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("prestamos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrestamosController_destroy7_invoker = createInvoker(
    PrestamosController_0.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PrestamosController",
      "destroy",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """prestamos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_HomeController_welcome2_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HomeController_welcome2_invoker.call(HomeController_1.welcome(name))
      }
  
    // @LINE:13
    case controllers_PrestamosController_index3_route(params@_) =>
      call { 
        controllers_PrestamosController_index3_invoker.call(PrestamosController_0.index)
      }
  
    // @LINE:14
    case controllers_PrestamosController_create4_route(params@_) =>
      call { 
        controllers_PrestamosController_create4_invoker.call(PrestamosController_0.create)
      }
  
    // @LINE:15
    case controllers_PrestamosController_show5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PrestamosController_show5_invoker.call(PrestamosController_0.show(id))
      }
  
    // @LINE:16
    case controllers_PrestamosController_update6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PrestamosController_update6_invoker.call(PrestamosController_0.update(id))
      }
  
    // @LINE:17
    case controllers_PrestamosController_destroy7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_PrestamosController_destroy7_invoker.call(PrestamosController_0.destroy(id))
      }
  }
}
