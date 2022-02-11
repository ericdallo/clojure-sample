(ns clojure-sample.a
  (:require [re-frame.core :as r]))

(defn foo [])

(r/reg-event-fx
  ::thing
  (fn [_]))


::thing
