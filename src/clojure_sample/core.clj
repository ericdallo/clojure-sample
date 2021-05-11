(ns clojure-sample.core)

(defmacro foo [name & body]
  `(def ~@name ~@body))

(defmacro bar [name & body]
  `(def ~@name ~@body))

(foo bla)


(bar blo)
