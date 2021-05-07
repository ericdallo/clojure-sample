(ns clojure-sample.core-test
  (:require [midje.sweet :refer :all]))

(tabular
  (fact "foo"
    (+ ?a ?b) => ?res)
  ?a ?b ?res
  1  (+ 1 2)  3)
