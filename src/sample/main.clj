(ns sample.main
  (:gen-class)
  (:require
    [sample.github-api :as github-api]
    [clojure.pprint :as pprint]))

(defn ^:private fetch-items [type language]
  (case type
    repo (github-api/fetch-trending-repos (name language))
    developer (github-api/fetch-trending-developers (name language))
    (println "Inform :type as repo or developer")))

(defn -main
  "Return the trending projects for the specified programming `language`."
  [{:keys [type language]}]
  (->> (fetch-items type language)
       (take 10)
       pprint/pprint))
