(ns my-clojure-template.routes.home
  (:require [compojure.core :refer [GET defroutes]]
            
            [my-clojure-template.view.home :refer [home-page]])
  (:gen-class))

(defroutes home-routes
  (GET "/" [] (home-page)))