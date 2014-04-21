(ns decoder.decode)

(defn decode [input]
	(char (- (int input) 4))
)

(defn decode-string [input]
	(map input decode)
	)