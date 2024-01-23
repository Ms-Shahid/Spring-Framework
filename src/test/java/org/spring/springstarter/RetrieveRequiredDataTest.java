package org.spring.springstarter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.spring.springstarter.stubs.DataService;
import org.spring.springstarter.stubs.RetrieveRequiredData;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RetrieveRequiredDataMockTest {

    @Mock
    /*
    The mock to be created upon, by default it mock provides null, add
    @ExtendWith(MockitoExtension.class) at class level
    */
    private DataService getServiceMock;

    @InjectMocks
    /*
     * To Inject the mock into a constructor/class*/
    private RetrieveRequiredData retrieveRequiredData;


    @Test
    void validateHighestValueFromData() {

        //we have to tell mockito to return serviceMock.retrieveData() return val
        when(getServiceMock.retrieveData()).thenReturn(new int[]{25, 12, 35});
        assertEquals(35, retrieveRequiredData.getHighestValueFromData());
    }

    @Test
    void handleSingleValueFromData() {

        when(getServiceMock.retrieveData()).thenReturn(new int[]{100});
        assertEquals(100, retrieveRequiredData.getHighestValueFromData());
    }
    @Test
    void handleSNullValueFromData() {

        when(getServiceMock.retrieveData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, retrieveRequiredData.getHighestValueFromData());
    }
}
