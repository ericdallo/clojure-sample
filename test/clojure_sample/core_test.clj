(ns clojure-sample.core-test
  (:require
   [clojure-sample.core :refer :all]
   [clojure.test :refer [deftest is testing]]
   [matcher-combinators.test :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= {:a 2 :b 2}
          {:a 2 :b 2}))))

(deftest b-test
  (testing "FIXME, I fail."
    (is (= {:a 2 :b 2}
          {:a 2 :b 2}))))

(deftest matcher-test
  (testing "testing matcher report"
    (is (match?
          {:bla 1 :blow {:f 2}}
          {:blow {:bla {:a 2}}}))))
