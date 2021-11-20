(ns clojure-sample.datomic.sample
  (:require [datomic.api :as d]))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn sample []
  (d/create-database))
