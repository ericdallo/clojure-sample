(ns clojure-sample.foo
  (:refer-clojure :exclude [reify]))

(defmacro reify
  {:style/indent :defn}
  [_varname])

(defmacro reify2
  {:style/indent :defn}
  [_varname])

(defmacro reify3
  {:style/indent [1 [1]]}
  [_varname])

(defmacro reify4
  {:style/indent [1 [:defn]]}
  [_varname])

(comment

  nil)
