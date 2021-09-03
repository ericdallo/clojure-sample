(ns clojure-sample.api
  (:require
   [clojure-sample.impl.foo]
   [potemkin :refer [import-vars]]))

(import-vars
  clojure-sample.impl.foo/some-func)
