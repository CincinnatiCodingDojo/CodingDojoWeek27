(ns decoder.test.decode
  (:use clojure.test
        decoder.decode))


(deftest test-decode
	(testing "decode" 
		(is (decode \e) \a)
		)
	(testing "decode-string"
		(is (decode-string "efg") "abc")
		)
	)
