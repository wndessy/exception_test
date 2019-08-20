package myTestPackage;

//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.function.Executable;
//import org.junit.jupiter.api.Assertions;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class myTestCase {
// this test should pass because my arraylist has 3 items but the selected index is five
	
	@Test
	  void testExpectedException() {
	 
	    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			fruits.testException(5);
	    });
	  }
	 
// this test should fail because my arraylist has three items so one is within the range
	  @Test
	  void testExpectedExceptionFail() {
	
	    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			fruits.testException(1);
	    });
	  }
	
	
	
	

}	
