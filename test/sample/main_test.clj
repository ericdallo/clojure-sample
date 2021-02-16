(ns sample.main-test
  (:require
    [clojure.test :refer [deftest testing is]]
    [sample.main :as main]))

(deftest main
  (testing "entrypoint test"
    (is (= 3 (main/main)))))
