(defproject clojure-sample "0.0.1"
  description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot clojure-sample.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :clojure-lsp {:souce-paths ["src" "classes" "resources"]
                           :dependencies [[com.github.clojure-lsp/clojure-lsp "2021.08.05-19.36.09"]]}}
  :aliases {"clean-ns" ["with-profile" "+clojure-lsp" "run" "-m" "clojure-lsp.main" "clean-ns"]})
