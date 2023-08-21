(ns build
  (:require
   [clojure.tools.build.api :as b]))

(def lib 'clojure-sample/clojure-sample)
(def version "0.1.0")
(def class-dir "target/classes")
(def basis (b/create-basis {:project "deps.edn"}))
(def jar-file (format "target/%s-%s.jar" (name lib) version))

(defn clean [_]
  (b/delete {:path "target"}))

(defn compile-java [_]
  (b/javac {:src-dirs ["src/java"]
            :class-dir class-dir
            :basis basis}))

(defn compile-clj [_]
  (b/compile-clj {:class-dir class-dir
                  :ns-compile ['clojure-sample.foo]
                  :basis basis}))

(defn jar [_]
  (clean _)
  (compile-java _)
  (compile-clj _)
  (b/write-pom {:class-dir class-dir
                :lib lib
                :version version
                :basis basis
                :src-dirs ["src/clojure"]})
  (b/copy-dir {:src-dirs ["src/clojure" "resources"]
               :target-dir class-dir})
  (b/jar {:class-dir class-dir
          :jar-file jar-file}))
