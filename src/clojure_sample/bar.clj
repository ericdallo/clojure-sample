(ns clojure-sample.bar
  (:require
   [clojure-sample.foo :as foo]))

(def baz (foo/foo 1 2 3))
