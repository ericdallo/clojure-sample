(ns clojure-sample.bar)

(defprotocol Example
  (call [x])
  (defcall [x]))

(reify Example
  (call [_x]
    1) ;; This is now aligned to the second element instead of by 2 spaces
  (defcall [_x]
    1)) ;; This is still formatted correctly, as it starts with `def` I assume.
