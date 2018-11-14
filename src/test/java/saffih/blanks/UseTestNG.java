package saffih.blanks;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class UseTestNG {

    public void canIncTest(){
        int cnt = 0;
        cnt++;
        Assert.assertEquals(cnt, 1);
    }
}
