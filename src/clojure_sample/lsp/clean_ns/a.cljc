;; (ns a
;;   (:require
;;    [c.b]
;;    [c.c :refer [x]]
;;    [c.d :refer [f]]
;;    [c.e :refer [b o]]
;;    [c.f :as cf]
;;    [c.g :as cg]
;;    [c.h :refer [cha] :as ch])
;;   (:import
;;    [d.a A]
;;    [d.b B C]
;;    #?(:clj [d.c D])
;;    #?(:cljs [d.d E F])
;;    [d.e G]))

;; #?(:clj
;;    (do (o)
;;        (f)
;;        cf/asd))

;; #?(:cljs
;;    (do
;;      F
;;      G))

;; A
;; B
;; C

;; (ns foo.bar
;;   (:require
;;    [baz]
;;    [bar :refer [some other] :as b]))

;; #?(:clj
;;    some)

(ns taoensso.sente
  (:require
    #?@(:clj  [[clojure.string :as str]
               [clojure.core.async :as async]
               [taoensso.encore :as enc]
               [taoensso.timbre :as timbre]
               [taoensso.sente.interfaces :as interfaces]]
        :cljs [[clojure.string :as str]
               [cljs.core.async :as async]
               [taoensso.encore :as enc]
               [taoensso.sente.interfaces :as interfaces]]))
  #?(:cljs (:require-macros
             [cljs.core.async.macros :as asyncm :refer (go go-loop)]
             [taoensso.encore :as enc :refer (have? have have-in)])))
