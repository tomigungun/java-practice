package primenumber;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberCounterTest {

	private PrimeNumberCounter pnc;

	@Before
	public void init() {
		pnc = new PrimeNumberCounter();
	}

	@Test
	public void 素数判定メソッドのテスト() {
		assertThat(pnc.isPrimeNumber(3), is(true));
		assertThat(pnc.isPrimeNumber(4), is(false));
	}

	@Test
	public void 素数カウントメソッドのテスト() {
		assertThat(pnc.getPrimeNumberCount(-1), is(0));
		assertThat(pnc.getPrimeNumberCount(2), is(0));
		assertThat(pnc.getPrimeNumberCount(5), is(2));
	}

}
