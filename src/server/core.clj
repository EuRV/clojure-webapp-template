(ns server.core
  (:require [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

(defn app [request]
  (let [{:keys [uri request-method]} request]
    {:status 200
     :headers {"Content-Type" "text/plain"}
     :body (format "You requested %s %s"
                   (-> request-method name .toUpperCase)
                   uri)}))

#_{:clj-kondo/ignore [:unused-binding]}
(defn -main [& args]
  (run-jetty #'app {:port 3000}))

(comment
  (app {:request-method :post :uri "/users"})
  :rcf)