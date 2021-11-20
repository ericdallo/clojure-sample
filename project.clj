(defproject clojure-sample "0.0.1"
  description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot clojure-sample.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[com.github.clojure-lsp/lein-clojure-lsp "1.1.3"]]
  :clojure-lsp {:settings {:clean {:ns-inner-blocks-indentation :same-line}}}
  :aliases {"clean-ns" ["clojure-lsp" "clean-ns" "--dry"]
            "format" ["clojure-lsp" "format" "--dry"]
            "lint" ["do" ["clean-ns"] ["format"]]

            "clean-ns-fix" ["clojure-lsp" "clean-ns"]
            "format-fix" ["clojure-lsp" "format"]
            "lint-fix" ["do" ["clean-ns-fix"] ["format-fix"]]})
