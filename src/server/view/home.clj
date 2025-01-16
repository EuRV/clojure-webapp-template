(ns server.view.home
  (:require [hiccup2.core :as h]))

(defn home-page
  [& content]
  (str 
   (h/html (h/raw "<!DOCTYPE html>") 
           [:html {:lang "ru"}
            [:head
             [:meta {:charset "UTF-8"}]
             [:meta {:name "viewport" :content "width=device-width, initial-scale=1, shrink-to-fit=no"}]
             [:title "My Webapp"]]
            [:body content]])))