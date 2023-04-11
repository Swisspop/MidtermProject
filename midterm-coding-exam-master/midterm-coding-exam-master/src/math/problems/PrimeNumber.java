package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		int limit = 1000000;
		boolean[] isPrime = new boolean[limit + 1];

		// initialize all numbers as prime
		for (int i = 2; i <= limit; i++) {
			isPrime[i] = true;
		}

		// mark multiples of primes as composite
		for (int i = 2; i * i <= limit; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= limit; j += i) {
					isPrime[j] = false;
				}
			}
		}

		// store prime numbers in a list and print the count
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= limit; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		System.out.println("Number of primes from 2 to 1 million: " + primes.size());

		// store prime numbers in a database table
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		try {
			connectToSqlDB.createTable("tbl_primes", "prime");
			connectToSqlDB.insertDataFromArrayListToSqlTable(primes, "tbl_primes", "prime");
			List<String> primeValues = connectToSqlDB.readDataBase("tbl_primes", "prime");
			System.out.println("Prime numbers stored in database:");
			for (String prime : primeValues) {
				System.out.print(prime + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
