package ua.lviv.iot.springBootProject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodRepositoryTest {
    @Autowired
    private GoodRepository goodRepository;
    @Before
    public void setUp() throws Exception {
        MacBook retina13 = new MacBook("Retina13",13000,13,2013);
        MacBook retina15 = new MacBook("Retina15",15000,15,2017);

        assertNull(retina13.getId());
        assertNull(retina15.getId());
        this.goodRepository.save(retina13);
        this.goodRepository.save(retina15);
        assertNotNull(retina13.getId());
        assertNotNull(retina15.getId());
    }

    @Test
    public void testFetchData(){
        MacBook testMacBook = (MacBook)(goodRepository.findByName("Retina13"));
        assertNotNull(testMacBook);
        assertEquals(13, testMacBook.getDisplayDiagonal());
        /*Get all products, list should only have two*/
        Iterable<Good> goods = goodRepository.findAll();
        int count = 0;
        for(Good good : goods){
            count++;
        }
        assertEquals(count, 2);
    }
}