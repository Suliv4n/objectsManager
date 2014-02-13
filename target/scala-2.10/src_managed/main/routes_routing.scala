// @SOURCE:/home/bochant/play/samples/java/objman/conf/routes
// @HASH:6badf79d88de6520365fa0e180c7f460c9c5d8f8
// @DATE:Thu Feb 13 14:23:28 CET 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_inventaire1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("inventaire"))))
        

// @LINE:8
private[this] lazy val controllers_Application_interactionObjets2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("interaction/"),DynamicPart("action", """[^/]+""",true),StaticPart("/"),DynamicPart("target", """[^/]+""",true))))
        

// @LINE:9
private[this] lazy val controllers_Application_deplacerObjet3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deplacer/"),DynamicPart("i", """[^/]+""",true),StaticPart("/"),DynamicPart("j", """[^/]+""",true))))
        

// @LINE:10
private[this] lazy val controllers_Application_deplacerObjetCoffre4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deplacer/"),DynamicPart("i", """[^/]+""",true),StaticPart("/"),DynamicPart("j", """[^/]+""",true),StaticPart("/"),DynamicPart("coffre", """[^/]+""",true))))
        

// @LINE:13
private[this] lazy val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """inventaire""","""controllers.Application.inventaire()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """interaction/$action<[^/]+>/$target<[^/]+>""","""controllers.Application.interactionObjets(action:Integer, target:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deplacer/$i<[^/]+>/$j<[^/]+>""","""controllers.Application.deplacerObjet(i:Integer, j:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deplacer/$i<[^/]+>/$j<[^/]+>/$coffre<[^/]+>""","""controllers.Application.deplacerObjetCoffre(i:Integer, j:Integer, coffre:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_inventaire1(params) => {
   call { 
        invokeHandler(controllers.Application.inventaire(), HandlerDef(this, "controllers.Application", "inventaire", Nil,"GET", """""", Routes.prefix + """inventaire"""))
   }
}
        

// @LINE:8
case controllers_Application_interactionObjets2(params) => {
   call(params.fromPath[Integer]("action", None), params.fromPath[String]("target", None)) { (action, target) =>
        invokeHandler(controllers.Application.interactionObjets(action, target), HandlerDef(this, "controllers.Application", "interactionObjets", Seq(classOf[Integer], classOf[String]),"GET", """""", Routes.prefix + """interaction/$action<[^/]+>/$target<[^/]+>"""))
   }
}
        

// @LINE:9
case controllers_Application_deplacerObjet3(params) => {
   call(params.fromPath[Integer]("i", None), params.fromPath[Integer]("j", None)) { (i, j) =>
        invokeHandler(controllers.Application.deplacerObjet(i, j), HandlerDef(this, "controllers.Application", "deplacerObjet", Seq(classOf[Integer], classOf[Integer]),"GET", """""", Routes.prefix + """deplacer/$i<[^/]+>/$j<[^/]+>"""))
   }
}
        

// @LINE:10
case controllers_Application_deplacerObjetCoffre4(params) => {
   call(params.fromPath[Integer]("i", None), params.fromPath[Integer]("j", None), params.fromPath[Integer]("coffre", None)) { (i, j, coffre) =>
        invokeHandler(controllers.Application.deplacerObjetCoffre(i, j, coffre), HandlerDef(this, "controllers.Application", "deplacerObjetCoffre", Seq(classOf[Integer], classOf[Integer], classOf[Integer]),"GET", """""", Routes.prefix + """deplacer/$i<[^/]+>/$j<[^/]+>/$coffre<[^/]+>"""))
   }
}
        

// @LINE:13
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     