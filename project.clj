(defproject conductor "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :resource-paths ["resources/jsapi.jar" "resources/sphinx4.jar" "resources/WSJ_8gau_13dCep_16k_40mel_130Hz_6800Hz.jar" "resources/"]
  :main ^:skip-aot conductor.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
