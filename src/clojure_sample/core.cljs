(ns clojure-sample.core
  (:require
    [reagent.dom :as rdom]
    [re-frame.core :as re-frame]
    [clojure-sample.events :as events]
    [clojure-sample.views :as views]
    [clojure-sample.config :as config]
    ))

(println "Hello" :test (reduce +
                               0
                               (range 100)))
(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [views/main-panel] root-el)))

(defn init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
