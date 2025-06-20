(ns my-clojure-template.core
  (:require
   [ring.adapter.jetty :refer [run-jetty]]
   [compojure.core :refer [defroutes routes]]

   [my-clojure-template.routes.home :refer [home-routes]])
  (:gen-class))

(defroutes app-routes
  (routes home-routes))

#_{:clj-kondo/ignore [:unused-binding]}
(defn -main [& args]
  (run-jetty #'app-routes {:port 3000}))