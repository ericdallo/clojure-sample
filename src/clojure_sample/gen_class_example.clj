(ns clojure-sample.gen-class-example
  (:gen-class
   :name nu.MyClass
   :implements [nu.MoneyMovement]
   :state state
   :init init))

(defn -init []
  [[] (atom {:foo 1})])

(defn -transfer [_this from to]
  (println (format "Making a pix from %s to %s!" from to)))

(defn -toString [this]
  (str "-->" @(.state this)))
