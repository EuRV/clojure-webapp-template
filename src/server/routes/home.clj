(ns server.routes.home
  (:require [compojure.core :refer [GET defroutes]]
            [ring.util.response :refer [content-type response]])
  (:gen-class))

(defn home
  [req]
  (let [{:keys [uri request-method]} req]
    (content-type (response (format "You requested %s %s"
                                    (-> request-method name .toUpperCase)
                                    uri))
                  "text/plain")))

(defroutes home-routes
  (GET "/" request (home request)))