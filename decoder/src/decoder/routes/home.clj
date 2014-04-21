(ns decoder.routes.home
  (:use compojure.core)
  (:require [decoder.views.layout :as layout]
            [decoder.util :as util]
            [decoder.decode :as decode]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"))

(defn decoder-page []
	(layout/render
		"decoder.html"))

(defn decoder-page-calculated [message]
	(layout/render
		"decoder.html" {:result (decode/decode-string message)}))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/decoder" [] (decoder-page))
  (POST "/decoder" [message] (decoder-page-calculated message)))
