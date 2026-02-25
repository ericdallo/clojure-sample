(ns simple)

(defn greet
  "Returns a greeting message for the given name."
  [name]
  (str "Hello, " name "!"))

(defn add
  "Adds two numbers together."
  [a b]
  (+ a b))

(defn square
  "Returns the square of a number."
  [n]
  (* n n))

(comment
  ;; Try these in the REPL:
  (greet "World")
  (add 2 3)
  (square 4))
