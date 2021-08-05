package RBCCoding;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateElementTest {

	@Test
	public void test() {
		Assert.assertEquals(-1, DuplicateElement.duplicatenumber(new int[] {1,2,3,4,5}));
		Assert.assertEquals(2, DuplicateElement.duplicatenumber(new int[] {1,3,4,2,2}));
		Assert.assertEquals(3, DuplicateElement.duplicatenumber(new int[] {3,1,3,4,2}));
		Assert.assertEquals(1, DuplicateElement.duplicatenumber(new int[] {1,1}));
		Assert.assertEquals(1, DuplicateElement.duplicatenumber(new int[] {1,1,2}));
		Assert.assertEquals(-1, DuplicateElement.duplicatenumber(new int[] {}));
	}

}
