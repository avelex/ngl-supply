(defproject ngl-supply "0.1.0"
  :description "REST API Service for NGL Total Supply"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [http-kit "2.8.0"]
                 [compojure "1.6.3"]
                 [ring "1.12.2"]
                 [metosin/jsonista "0.3.11"]]
  :main ngl-supply.core)