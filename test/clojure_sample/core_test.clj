(ns clojure-sample.core-test
  (:require [midje.sweet :refer :all]))

(facts ""
  (+ 1 2) throws 3)

(tabular "bla"
  (fact ""
    (+ ?a ?b) => (+ ?c))
  ?a ?b ?c
  1  2  (+ 1 2))

(tabular "as"
  (fact ""
    (+ ?a ?b) => (+ ?c))
  ?a ?b ?c
  1  2  (+ 1 2))

(tabular "asd"
  (fact ""
    (+ ?a ?b) => (+ ?c))
  [?a ?b ?c]
  1  2  (+ 1 2))

(facts "asdsad"
  (tabular "asd"
    (+ ?a ?b) => (+ ?c)
    ?a ?b ?c
    1  2  (+ 1 2)))

(facts "asdsad"
  (tabular "asd"
    (+ ?a ?b) => (+ ?c)
    [?a ?b ?c]
    1  2  (+ 1 2)))
