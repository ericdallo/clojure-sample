(ns lint
  (:require [clojure-lsp.main :as lsp]))

(defn ^:private lsp! [& command-and-options]
  (let [result (apply lsp/run! command-and-options)]
    (when-let [message-fn (:message-fn result)]
      (println (message-fn)))
    (when (not= 0 (:result-code result))
      (System/exit (:result-code result)))))

(defn lint-clean-ns [_]
  (lsp! "clean-ns" "--dry"))

(defn lint-clean-ns-fix [_]
  (lsp! "clean-ns"))

(defn lint-format [_]
  (lsp! "format" "--dry"))

(defn lint-format-fix [_]
  (lsp! "format"))

(defn lint-diagnostics [_]
  (lsp! "diagnostics"))

(defn lint [options]
  (lint-diagnostics options)
  (lint-format options)
  (lint-clean-ns options))

(defn lint-fix [options]
  (lint-format-fix options)
  (lint-clean-ns-fix options))
