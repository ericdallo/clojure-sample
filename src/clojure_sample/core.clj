(ns clojure-sample.core)


[1 [2 3] 4]

(map #(inc %) [1 2 3])

(defn |fob []
  {:a 2 :b 2})


(let [a (+ 1 2)
      b (+ 2 3)]
  (+ a b))
