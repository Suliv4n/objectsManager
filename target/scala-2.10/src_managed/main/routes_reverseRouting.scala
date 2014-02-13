// @SOURCE:/home/bochant/play/samples/java/objman/conf/routes
// @HASH:ff89b37b295bf4cde230fa325d04b0e535c982ca
// @DATE:Thu Feb 13 13:10:07 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def deplacerObjet(i:Integer, j:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deplacer/" + implicitly[PathBindable[Integer]].unbind("i", i) + "/" + implicitly[PathBindable[Integer]].unbind("j", j))
}
                                                

// @LINE:8
def interactionObjets(action:Integer, target:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "interaction/" + implicitly[PathBindable[Integer]].unbind("action", action) + "/" + implicitly[PathBindable[String]].unbind("target", dynamicString(target)))
}
                                                

// @LINE:7
def inventaire(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "inventaire")
}
                                                

// @LINE:10
def deplacerObjetCoffre(i:Integer, j:Integer, coffre:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deplacer/" + implicitly[PathBindable[Integer]].unbind("i", i) + "/" + implicitly[PathBindable[Integer]].unbind("j", j) + "/" + implicitly[PathBindable[Integer]].unbind("coffre", coffre))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def deplacerObjet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deplacerObjet",
   """
      function(i,j) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deplacer/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("i", i) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("j", j)})
      }
   """
)
                        

// @LINE:8
def interactionObjets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.interactionObjets",
   """
      function(action,target) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "interaction/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("action", action) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("target", encodeURIComponent(target))})
      }
   """
)
                        

// @LINE:7
def inventaire : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.inventaire",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inventaire"})
      }
   """
)
                        

// @LINE:10
def deplacerObjetCoffre : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deplacerObjetCoffre",
   """
      function(i,j,coffre) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deplacer/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("i", i) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("j", j) + "/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("coffre", coffre)})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def deplacerObjet(i:Integer, j:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deplacerObjet(i, j), HandlerDef(this, "controllers.Application", "deplacerObjet", Seq(classOf[Integer], classOf[Integer]), "GET", """""", _prefix + """deplacer/$i<[^/]+>/$j<[^/]+>""")
)
                      

// @LINE:8
def interactionObjets(action:Integer, target:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.interactionObjets(action, target), HandlerDef(this, "controllers.Application", "interactionObjets", Seq(classOf[Integer], classOf[String]), "GET", """""", _prefix + """interaction/$action<[^/]+>/$target<[^/]+>""")
)
                      

// @LINE:7
def inventaire(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.inventaire(), HandlerDef(this, "controllers.Application", "inventaire", Seq(), "GET", """""", _prefix + """inventaire""")
)
                      

// @LINE:10
def deplacerObjetCoffre(i:Integer, j:Integer, coffre:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deplacerObjetCoffre(i, j, coffre), HandlerDef(this, "controllers.Application", "deplacerObjetCoffre", Seq(classOf[Integer], classOf[Integer], classOf[Integer]), "GET", """""", _prefix + """deplacer/$i<[^/]+>/$j<[^/]+>/$coffre<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    