(ns clojure-sample.simple
  "A simple namespace with basic Clojure examples.")

(def greeting "Hello, World!")

(defn add
  "Adds two numbers together."
  [a b]
  (+ a b))

(defn multiply
  "Multiplies two numbers."
  [a b]
  (* a b))

(defn greet
  "Returns a personalized greeting."
  [name]
  (str "Hello, " name "!"))

(defn factorial
  "Calculates the factorial of n."
  [n]
  (if (<= n 1)
    1
    (* n (factorial (dec n)))))

(comment
  ;; Try these in the REPL:
  (add 2 3)
  (multiply 4 5)
  (greet "Alice")
  (factorial 5))
