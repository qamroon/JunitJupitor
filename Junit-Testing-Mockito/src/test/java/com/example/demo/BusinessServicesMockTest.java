package com.example.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mycomp.service.BusinessService;
import com.mycomp.service.DataService;

@SpringBootTest
public class BusinessServicesMockTest {

	/*
	 * @Mock DataService dataServiceMock; - Create a mock for DataService.
	 */
	@Mock
	DataService dataServiceMock;

	/*
	 * @InjectMocks SomeBusinessImpl businessImpl; - Inject the mocks as dependencies into businessImpl.
	 */
	@InjectMocks
	BusinessService businessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });// here we are putting some dummy data
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}

	/*
	 * @Test public void testFindTheGreatestFromAllData_ForOneValue() {
	 * when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
	 * assertEquals(15, businessImpl.findTheGreatestFromAllData()); }
	 * 
	 * @Test public void testFindTheGreatestFromAllData_NoValues() {
	 * when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
	 * assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData()); }
	 */
	
}
