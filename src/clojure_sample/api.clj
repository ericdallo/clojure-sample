(ns clojure-sample.api
  (:require
   [clojure-sample.impl.foo]
   [com.fulcrologic.guardrails.core :refer [=> >defn]]
   [potemkin :refer [import-vars]]))

(import-vars
  clojure-sample.impl.foo/some-func)

(import-vars
  [clojure-sample.impl.foo other-func])

(>defn f [i]
  [::thing => int?]
  (if (string? i)
    0
    (inc i)))


(defn foo []
  (+ 2 1))
