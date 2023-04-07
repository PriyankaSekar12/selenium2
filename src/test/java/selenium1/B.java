package selenium1;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class B {


		@Test
		public void test11() {
			System.out.println("test11");

		}
		@Test
		public void test12() {
			System.out.println("test12");

		}
		@Ignore
		@Test
		public void test13() {
			System.out.println("test13");

		}
		@Test
		public void test4() {
			Assert.assertTrue(true);

		}
	


	}


