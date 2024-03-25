(ns clojure-sample.events
  (:require
   [re-frame.core :as re-frame]
   [clojure-sample.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
