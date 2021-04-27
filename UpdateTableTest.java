import org.junit.Test; 
import static org.junit.Assert.*;  

public class UpdateTableTest {

	UpdateTable upt=new UpdateTable();
	
	
	@Test
	public void testupdate() {
		assertEquals(1,upt.update(107, "Jai", "Chennai", 140000));
		
		//update id which doesn't exist
		//assertEquals(1,upt.update(110, "Jai", "Chennai", 40000));
	}
}
