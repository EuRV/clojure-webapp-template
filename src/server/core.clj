(ns server.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [compojure.core :refer [defroutes routes]]
            
            [server.routes.home :refer [home-routes]])
  (:gen-class))

(defroutes app-routes
  (routes home-routes))

#_{:clj-kondo/ignore [:unused-binding]}
(defn -main [& args]
  (run-jetty #'app-routes {:port 3000}))

(comment
  (app-routes {:request-method :get :uri "/"})
  :rcf)