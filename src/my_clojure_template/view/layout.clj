(ns my-clojure-template.view.layout
  (:require
   [hiccup2.core :as h]
   [hiccup.page :refer [include-css include-js]])
  (:gen-class))

  (defn guest-nav
    []
    (h/html
     [:li.nav-item
      [:a.nav-link {:href "/"} "Вход"]]
     [:li.nav-item
      [:a.nav-link {:href "/"} "Регистрация"]]))
  
  (defn common
    [& content]
    (str
     (h/html (h/raw "<!DOCTYPE html>")
             [:html {:lang "ru"}
              [:head
               [:meta {:charset "UTF-8"}]
               [:meta {:name "viewport" :content "width=device-width, initial-scale=1, shrink-to-fit=no"}]
               [:title "My Webapp"]
               (include-css "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css")
               (include-js "https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js")]
              [:body.d-flex.flex-column.min-vh-100.bg-light
               [:nav.navbar.navbar-expand-lg.navbar-light.bg-white
                [:div.container
                 [:a.navbar-brand {:href "/"} "Моё приложение"]
                 [:button.navbar-toggler {:data-bs-toggle "collapse" :data-bs-target "#navbarToggleExternalContent"}
                  [:span.navbar-toggler-icon]]
                 [:div#navbarToggleExternalContent.collapse.navbar-collapse
                  [:ul.navbar-nav.justify-content-end.w-100
                   [:li.nav-item.me-auto
                    [:a.nav-link {:href "/"} "Пользователи"]]
                    (guest-nav)]]]]
               [:div.container.wrapper.flex-grow-1
                content]
               [:footer.bg-dark.text-light
                [:div.container.py-3
                 [:p.lead.mb-0 "© Hexlet Ltd, 2021"]]]]])))