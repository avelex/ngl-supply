(ns ngl-supply.core
  (:require [compojure.route :as route]
            [compojure.core :refer :all]
            [org.httpkit.server :as http]
            [ngl-supply.handler :as handler]))

(defroutes app-routes
           (GET "/getTotalSupply" [] handler/get-total-supply)
           (route/not-found "Not Found"))

(defn start-server [port]
  (http/run-server app-routes {:port port})
  (println (str "Server running on http://localhost:" port)))

(defn -main []
  (start-server 8090))