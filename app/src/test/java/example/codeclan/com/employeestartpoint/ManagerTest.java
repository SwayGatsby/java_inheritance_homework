package example.codeclan.com.employeestartpoint;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 31/10/2017.
 */

public class ManagerTest {
    Manager manager;


    @Before
    public void before() {
        manager = new Manager(1, "Wilma", "AB123456C", 30000.00, "Engineering");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Engineering", manager.getDeptName());
    }


}
