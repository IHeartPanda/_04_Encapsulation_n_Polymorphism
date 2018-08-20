import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _01_introduction_to_encapsulation.EncapsulateTheData;

class textTheData {
	EncapsulateTheData data = new EncapsulateTheData();
	@Test
	void test() {
		data.setItemsReceived(-10);
		assertEquals(0, data.getitemsReceived());
		data.setDegreesTurned(50);
		assertEquals(50, data.getdegreesTurned());
		data.setNomenclature("hello");
		assertEquals("hello", data.getNomenclature());
		data.setMemberObj(3);
		assertEquals(3, data.getMemberObj());
	}

}
