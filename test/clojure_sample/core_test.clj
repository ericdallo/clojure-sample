(ns clojure-sample.core-test
  (:require
   [clojure-sample.core :refer :all]
   [clojure-sample.foo :as foo]
   [clojure.test :refer [deftest is testing]]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 4
           (foo/foo 2 2)))))
