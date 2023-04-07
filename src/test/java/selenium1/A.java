package selenium1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class A {

	@Test
	public void test1() {
		System.out.println("test1");

	}
	@Test
	public void test2() {
		System.out.println("test2");

	}
	@Ignore
	@Test
	public void test3() {
		System.out.println("test3");

	}
	@Test
	public void test4() {
		Assert.assertTrue(false);

	}
}
