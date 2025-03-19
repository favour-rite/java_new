import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    private Television television;

    @BeforeEach
    public void setup(){
        television = new Television();
    }

    @Test
    public void testThat_TVSet_IsOffByDefault(){
        assertFalse(television.getIsOn());
    }
    @Test
    public void testThat_TVSet_IsTurnOne(){
        television.turnOn();
        assertTrue(television.getIsOn());
    }
    @Test
    public void testThat_TVSet_IsTurnOff(){
        television.turnOn();
        television.turnOff();
        assertFalse(television.getIsOn());
    }
    @Test
    public void testThat_TVSet_VolumeIsIncrease(){
        television.turnOn();
        assertTrue(television.getIsOn());
        int initialVolume = television.getVolume();
        television.increaseVolume();
        assertEquals(initialVolume + 1,television.getVolume());

    }
    @Test
    public void testThat_TVSet_VolumeIsDecrease(){
        television.turnOn();
        assertTrue(television.getIsOn());
        int initialVolume = television.getVolume();
        television.decreaseVolume();
        assertEquals(0, television.getVolume());

    }
    @Test
    public void testThat_TVSet_ChannelCanBeIncrease(){
        television.turnOn();
        assertTrue(television.getIsOn());
        television.increaseVolume();
        int initialVolume = television.getVolume();
        assertEquals(9,initialVolume + 1,television.getVolume());

        television.channelUp();
        int initialChannel = television.getChannelUp();
        assertEquals(6,initialChannel + 1,television.getChannelUp());

    }
    @Test
    public void testThat_TVSet_ChannelIsDecrease(){
        television.turnOn();
        assertTrue(television.getIsOn());
        television.increaseVolume();
        int initialVolume = television.getVolume();
        assertEquals(0,initialVolume - 1,television.getVolume());

        television.channelUp();
        int initialChannel = television.getChannelUp();
        assertEquals(8,initialChannel - 1,television.getChannelUp());
    }






}
