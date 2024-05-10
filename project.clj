(defproject clojure-sample "0.0.1"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :plugins [[com.github.clojure-lsp/lein-clojure-lsp "1.3.24"]]
  :target-path "target/%s"
  :java-source-paths ["src-java"]
  :profiles {:uberjar {:aot :all}}
  :clojure-lsp {:settings {:clean {:ns-inner-blocks-indentation :next-line}}}
  :pedantic? false
  :aliases {"clean-ns" ["clojure-lsp" "clean-ns"]})


