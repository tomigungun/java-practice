package primenumber;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumberCounter {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("primenumber\\primenumber.txt"));
			bw = new BufferedWriter(new FileWriter("primenumber\\answer1.txt"));
			PrimeNumberCounter pnc = new PrimeNumberCounter();

			String str;
			while ((str = br.readLine()) != null) {
				int givenNumber = Integer.parseInt(str);
				int count = pnc.getPrimeNumberCount(givenNumber);
				bw.write(Integer.toString(count));
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 素数カウントメソッド
	 *
	 * @param givenNumber
	 * @return
	 */
	public int getPrimeNumberCount(int givenNumber) {
		int count = 0;
		for (int i = 2; i < givenNumber; i++) {
			if (isPrimeNumber(i)) {
				count += 1;
			}
		}
		return count;
	}

	/**
	 * 素数判定メソッド
	 *
	 * @param number
	 * @return
	 */
	private boolean isPrimeNumber(int number) {
		// 素数は1とその数自身以外で割り切れない数
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
