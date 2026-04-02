# week2-week3
# Transaction Fee Sorting System

## Overview

A simple banking audit system that sorts transactions by fee and detects high-fee outliers.

---

## Features

* 🔹 Bubble Sort → sort by fee (ascending) for small datasets
* 🔹 Insertion Sort → sort by fee + timestamp
* 🔹 Stable sorting (handles duplicates)
* 🔹 Detects high-fee transactions (> $50)

---

## Concept

* Bubble Sort & Insertion Sort
* Time Complexity: O(n²)
* Stable sorting

---

## Input

```
id1, fee=10.5, ts=10:00  
id2, fee=25.0, ts=09:30  
id3, fee=5.0, ts=10:15  
```

---

## Output

```
Bubble: [id3, id1, id2]  
Insertion: [id3, id1, id2]  
Outliers: None  
```

---

## Use Cases

* Audit reports
* Fraud detection
* Compliance analysis

