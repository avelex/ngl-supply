(ns ngl-supply.handler
  (:require [jsonista.core :as json]
            [ngl-supply.util :as util]))

(defn get-entangle-token-supply [url]
  (slurp url))

(defn fetch-token-amount [json-str]
  (let [parsed (json/read-value json-str)
        amount (get-in parsed ["supply" 0 "amount"])]
    amount))

(defn convert-json [amount]
  (json/write-value-as-string {"amount" amount}))

(defn get-total-supply [_]
  (-> (get-entangle-token-supply "https://cosmos.entangle.fi/cosmos/bank/v1beta1/supply")
      (fetch-token-amount)
      (convert-json)
      (util/render-ok)))