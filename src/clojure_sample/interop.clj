(ns clojure-sample.interop)

;; basic interop
(comment
  nu.Account

  (import '[nu Account])

  ;; instantiate

  (new Account)
  (new Account "123")

  (Account.)
  (Account. "123")

  ;; methods

  (def a (Account. "123"))

  (. a (getNumber))

  (.getNumber a)

  Account/DELIMITER
  (System/getProperty "os.name")

  (let [acc (doto (Account.)
              (.setNumber "123"))]
    acc))

;; reify
(comment

  (def pix-movement
    (reify nu.MoneyMovement
      (transfer [this from to]
        (println "fazendo seu pix!" from to this))))

  (.transfer pix-movement "asd" "asd"))

;; proxy
(comment
  (import '[nu Account])
  (def my-account (proxy [Account] ["123"]
                    (getNumber []
                      "456")))

  (.getNumber my-account))

;; gen-class
(comment
  (gen-class :name "nu.MyClass"
             :implements [nu.MoneyMovement])

  (compile 'clojure-sample.gen-class-example)

  (def abc (nu.MyClass.))
  (.transfer abc "asd" "xcio"))

;; type hints
(comment
  (defn len [x]
    (.length x))

  (defn len2 [^String x]
    (.length x))

  (time (count (mapv len (repeat 1000000 "asdf"))))

  (time (count (mapv len2 (repeat 1000000 "asdf"))))

  (set! *warn-on-reflection* true))

;; java -> clojure
(comment
  (nu.Interop/callSum)

  (defn my-print []
    (println "Hey from java!")))

;; ref: https://clojure.org/reference/java_interop
