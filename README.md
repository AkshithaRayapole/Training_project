# Digital Wallet Management System

## Overview

The Digital Wallet Management System is a Java-based console application that simulates basic digital wallet operations. It allows users to manage balances, perform fund transfers, validate transactions, and display final wallet balances in a sorted order.

---

## Features

* Create users with initial wallet balances
* Perform fund transfers between users
* Validate transactions based on sufficient balance
* Display transaction status (Success / Failure)
* Sort and display users based on remaining balance

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections (HashMap, ArrayList)

---

## Input Format

1. Integer N – number of users
2. Next N lines contain:

   ```
   userID balance
   ```
3. Integer T – number of transactions
4. Next T lines contain:

   ```
   from_userID to_userID amount
   ```

---

## Output Format

* For each transaction:

  * Print "Success" if the transaction is completed
  * Print "Failure" if the transaction fails
* After all transactions:

  * Print all users sorted by remaining balance in ascending order

---

## Sample Input

```
4
1 9000
2 3000
3 7500
4 2000

5
1 2 1000
3 4 3000
2 3 500
4 1 7500
1 4 1500
```

---

## Sample Output

```
Success
Success
Success
Failure
Success

2 3500
3 5000
1 6500
4 6500
```

---

## Logic Used

* User balances are stored using a HashMap
* Each transaction checks whether the sender has sufficient balance
* Balances are updated after every successful transaction
* Users are stored in a list and sorted using a custom comparator

---

## How to Run

```
javac Solution.java
java Solution
```

---

## Author

Rayapole Akshitha
