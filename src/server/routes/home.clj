(ns server.routes.home
  (:require [compojure.core :refer [GET defroutes]]
            
            [server.view.home :refer [home-page]])
  (:gen-class))

(defn home
  []
  (home-page))

(defroutes home-routes
  (GET "/" [] (home)))