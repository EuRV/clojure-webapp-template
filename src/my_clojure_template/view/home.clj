(ns my-clojure-template.view.home
  (:require
   [hiccup2.core :as h]
   [my-clojure-template.view.layout :refer [common]]))

(defn home-page
  []
  (common 
   (h/html [:h1.display-4.fw-bold.mt-4 ""]
           [:div.container
            [:div.row
             [:div.col-12
              [:div.card.shadow.bg-white.rounded-3
               [:div.card-body.p-5
                [:div.display-4.fw-bold.mb-0 "Добро пожаловать"]
                [:p "Пожалуйста, войдите в систему"]
                [:a.btn.btn-primary.btn-lg.px-4.mt-3.fw-bold {:href "/login"} "Вход"]]]]]])))