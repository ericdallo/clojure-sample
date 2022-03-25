(ns build
  (:require
   [clojure.java.io :as io]
   [clojure.string :as string]
   [clojure.tools.build.api :as b]))

(def my-class-dir "target/my-classes")
(def class-dir "target/classes")
(def basis {:project "deps.edn"})

(defn clean [_]
  (b/delete {:path "target"}))

(defn javac [opts]
  (clean opts)
  (println "Compiling java classes...")
  (b/javac {:src-dirs ["src-java"]
            :class-dir my-class-dir
            :basis (b/create-basis basis)})
  (b/copy-dir {:src-dirs [my-class-dir]
               :target-dir class-dir}))
