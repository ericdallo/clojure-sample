(require '[clj-kondo.core :as k])

(k/run! {:cache true
         :config {:output {:analysis {:arglists true
                                      :locals false
                                      :keywords true}
                           :canonical-paths true}}
         :copy-configs true
         :lint ["src"]
         :custom-lint-fn
         (fn [{:keys [reg-finding!]}]
           (reg-finding! {:filename "src/clojure_sample/foo.clj"
                          :row 1
                          :col 2
                          :end-row 1
                          :end-col 4
                          :level :info
                          :message "some custom lint"
                          :type :my/custom-lint}))})
