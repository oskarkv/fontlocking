(ns fontlocking.core
  (:require
   [clojure.core.async]
   [clojure.core.reducers]
   [clojure.data]
   [clojure.edn]
   [clojure.pprint]
   [clojure.repl]
   [clojure.set]
   [clojure.string]
   [clojure.test]
   [clojure.walk]
   [clojure.zip]
   [com.rpl.specter]
   [com.rpl.specter.impl]
   [com.rpl.specter.navs]
   [com.rpl.specter.protocols]
   [com.rpl.specter.transients]
   [com.rpl.specter.zipper]
   [garden.core]
   [garden.selectors]
   ))

(defn ffff [] 1)
;; This ffff below should be font locked, if using cider-font-lock-dynamically,
;; but it fails if requiring too many namespaces.  Comment out a few namespaces
;; above and it will start working again.
ffff
