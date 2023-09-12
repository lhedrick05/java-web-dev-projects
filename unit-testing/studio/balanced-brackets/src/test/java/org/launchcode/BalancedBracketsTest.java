package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    // Test 1
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // Test 2
    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    // Test 3
    @Test
    public void doesNotHaveBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    // Test 4
    @Test
    public void hasBalancedBracketsWithStringTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    // Test 5
    @Test
    public void hasBalancedBracketsWithNumbersTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[12345]"));
    }

    // Test 6
    @Test
    public void hasBalancedBracketsWithStringFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }

    // Test 7
    @Test
    public void hasBalancedBracketsWithNumbersFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[12345"));
    }

    // Test 8
    @Test
    public void hasNoBracketsWithString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("TestString"));
    }

    // Test 9
    @Test
    public void hasNoBracketsWithNum() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("12345"));
    }

    // Test 10
    @Test
    public void hasWrongFacingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // Test 11
    @Test
    public void hasBalancedBracketsWithStringAndOppFacingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    // Test 12
    @Test
    public void hasBalancedBracketsNotSurroundingString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    // Test 13
    @Test
    public void hasBalancedBracketsWithStringAndBracketsInMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]Code"));
    }

    // Test 14
    @Test
    public void doesntHave() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[]][Code"));
    }
}