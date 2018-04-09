import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.simplyusejava.junitex.Address;
import com.simplyusejava.junitex.Person;

@RunWith(MockitoJUnitRunner.class)
public class PersonTest {
	
	Person p;
	
	@Test
	public void testPerName() {
		p = new Person();
		p.setName("Simplyusejava");
		assertEquals("Simplyusejava", p.getName());
	}
	
	@Test
	public void testForNull() {
		p = new Person();
		assertNull(p.getName());
	}
	
	@Test(expected=Exception.class)
	public void testException() {
		p = new Person();
		//we have not set the address object. So it must throw exception.
		assertNull(p.getAddressLineWithPersonId(p));
	}
	
	@Test
	public void testByMock() {
		
		Address address = Mockito.mock(Address.class);
		
		Mockito.when(address.getAddressLine1()).thenReturn("mock Address");
		
		p = new Person();
		p.setId(123);
		p.setAddress(address);
		
		assertEquals("mock Address123", p.getAddressLineWithPersonId(p));
		
	}
	
	@Ignore
	@Test(timeout=1000)
	public void testPerfomance() {
		while(true);
	}

}
