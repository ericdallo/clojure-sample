(ns clojure-sample.client
  (:require
   [clojure.test :refer [deftest is]]))

(defmacro defabctest
  [name [sym] & body]
  `(deftest ~name
     (let [~sym 5]
       ~@body)))

(defabctest my-test [x]
  (is (= x 5)))
