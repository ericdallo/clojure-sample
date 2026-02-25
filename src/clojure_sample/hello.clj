(ns clojure-sample.hello)

(defn greet
  "Returns a greeting message for the given name."
  [name]
  (str "Hello, " name "!"))

(defn add
  "Adds two numbers together."
  [a b]
  (+ a b))

(defn factorial
  "Calculates the factorial of n."
  [n]
  (reduce * 1 (range 1 (inc n))))

(comment
  ;; Try these in the REPL:
  (greet "World")
  (add 2 3)
  (factorial 5))
