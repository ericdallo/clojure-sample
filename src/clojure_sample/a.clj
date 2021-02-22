(ns clojure-sample.a
  (:require [clojure.tools.namespace.file :as tools.ns]))



(println "asd")


(map identity [])


#_(binding [rpc/*parse-anyway* true]
  (z/of-string "(def a 123) asd/ (def b 345)"))
