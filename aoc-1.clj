(use 'clojure.java.io)

(with-open [rdr (reader "aoc-1-input")]
  (println (reduce + (map read-string (line-seq rdr)))))
