(ns clojure-sample.foo
  (:gen-class
   :name clojure_sample.Foo
   :implements [clojure_sample.Bar]))

(defn -something [_] 1)
