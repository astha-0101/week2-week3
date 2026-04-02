#  Client Risk Score Ranking

##  Overview

A simple system to sort client risk scores for prioritizing high-risk accounts.



##  Features

*  Bubble Sort → riskScore (ascending)
*  Insertion Sort → riskScore DESC + accountBalance
*  Top 10 highest risk clients



##  Concepts

* In-place sorting (O(1) space)
* Bubble & Insertion Sort
* Adaptive sorting



##Input


clientC:80, clientA:20, clientB:50


---

## Output


Bubble: [A:20, B:50, C:80]
Insertion: [C:80, B:50, A:20]
Top Risks: C(80), B(50), A(20)


---

## Use Cases

* KYC risk analysis
* Loan approval priority
* Fraud detection




