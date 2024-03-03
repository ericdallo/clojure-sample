(ns clojure-sample.foo)

(defonce
  ^{:doc "All registered rules, grouped by :init-type and full-name"}
  global-rules
  (atom {:rules {} :genres #{}}))
