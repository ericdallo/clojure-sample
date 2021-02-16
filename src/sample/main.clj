(ns sample.main
  (:gen-class)
  (:require
    [sample.github-api :as github-api]
    [clojure.pprint :as pprint]))

(defn ^:private fetch-items [type language]
  (case type
    repo (github-api/fetch-trending-repos (name language))
    developer (github-api/fetch-trending-developers (name language))
    (do (println "Inform :type as repo or developer")
        (System/exit 1))))

(defn -main
  "Return the trending projects/developers for the specified
  programming `language` and `type`."
  [{:keys [type language]}]
  (->> (fetch-items type language)
       (take 10)
       pprint/pprint))


(comment
  (github-api/fetch-trending-repos "clojure"))
