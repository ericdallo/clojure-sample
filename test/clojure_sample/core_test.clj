(ns clojure-sample.core-test
  (:require
   [clojure.test :as clojure.test :refer [deftest is testing]]
   [matcher-combinators.parser]
   [state-flow.assertions.matcher-combinators :refer [match?]]
   ;; [matcher-combinators.test :refer [match?]]
   [state-flow.api :refer [defflow flow]]))

;; This one prints perfectly
(deftest matcher-test
  (testing "testing matcher report"
    (is (match?
         {:bla 1 :blow {:f 2}}
         {:blow {:bla {:a 2}}}))))

;; This one doesn't print perfectly
(defflow matcher-test-bla
  (flow "testing matcher report"
        (match?
         {:bla 1 :blow {:f 2}}
         {:blow {:bla {:a (+ 1 2)}}})))
