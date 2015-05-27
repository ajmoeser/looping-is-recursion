(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc b x]
                 (if (= x 0)
                   acc
                   (recur (* acc b) b (- x 1))))]
    (helper 1 base exp)))

(defn last-element [a-seq]
  (let [helper (fn [lst acc]
                 (if (empty? lst)
                   acc
                   (recur (rest lst) (first lst))))]
    (helper a-seq nil)))

(defn seq= [seq1 seq2]
  (cond
   (and (empty? seq1) (empty? seq2)) true
   (or (empty? seq1) (empty? seq2)) false
   (= (first seq1) (first seq2)) (seq= (rest seq1) (rest seq2))
   :else false))

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

