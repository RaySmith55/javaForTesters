package com.tutorialspoint.examples.codeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class countingSheepTests {
    @Test
    public void testSomething() {
        assertEquals("1 sheep...", countingSheepKata.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", countingSheepKata.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", countingSheepKata.countingSheep(3));
    }
}
