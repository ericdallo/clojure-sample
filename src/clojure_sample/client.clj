(ns clojure-sample.client
  (:require
   [compojure.api.core :as api.core]
   [compojure.api.sweet :refer :all]))

(api.core/context "/hello-async" []
  (resource
   {:get
    {:parameters {:query-params {:name String}}
     :responses {200 {:schema {:message String}}
                 404 {}
                 500 {}}
     :handler (fn [{{:keys [name]} :query-params}])}}))
