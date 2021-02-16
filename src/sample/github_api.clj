(ns sample.github-api
  (:require
   [clojure.data.json :as json]
   [clojure.walk :as walk]
   [clojure.string :as string]
   [clojure.string :as string2]
   [clojure.string :as string3]
   [clojure.string :as string4]
   [clojure.string :as string5]
   [org.httpkit.client :as http]))

(def base-api-url
  "https://trendings.herokuapp.com")

(def repo-api-url
  (str base-api-url "/repo"))

(def developer-api-url
  (str base-api-url "/developer"))

(defn ^:private request [url language]
  (-> {:url url
       :method :get
       :query-params {:lang language
                      :since "daily"}}
      http/request
      deref
      :body
      json/read-str
      walk/keywordize-keys
      :items))

(defn fetch-trending-repos [language]
  (request repo-api-url language))

(defn fetch-trending-developers [language]
  (request developer-api-url language))
