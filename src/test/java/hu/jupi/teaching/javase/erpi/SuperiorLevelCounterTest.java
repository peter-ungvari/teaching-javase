package hu.jupi.teaching.javase.erpi;

import hu.jupi.teaching.javase.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

public class SuperiorLevelCounterTest {
    
    @Test
    public void testCountLevel() {
        Employee a = new Employee();
        Employee b = new Employee();
        Employee c = new Employee();
        Employee d = new Employee();
        a.setSuperiors(new Employee[] {c, d});
        b.setSuperiors(new Employee[] {c });
        c.setSuperiors(new Employee[] { });
        d.setSuperiors(new Employee[] {c });
        SuperiorLevelCounter slc = new SuperiorLevelCounter(new Employee[] {a,b,c,d});
        assertEquals(2, slc.getSuperiorLevel(c));
        assertEquals(1, slc.getSuperiorLevel(d));
        assertEquals(0, slc.getSuperiorLevel(a));
        assertEquals(0, slc.getSuperiorLevel(b));
    }
}
