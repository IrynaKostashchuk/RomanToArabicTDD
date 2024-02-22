package org.example;

import org.junit.jupiter.api.*;


/*
  @author   kosta
  @project   RomanToArabic
  @class  ConverterTest
  @version  1.0.0 
  @since 22.02.2024 - 17.22
*/class ConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenRomanIThenArabic1() {
        Assertions.assertEquals(1, Converter.convertRomanToArabic("I"));
    }

    @Test
    void whenRomanNumberEmptyThenException(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.convertRomanToArabic("");
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals("Roman number is empty",exception.getMessage());
    }

    @Test
    void whenRomanNumberHasIllegalCharactersThenException(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.convertRomanToArabic("AVI");
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals("Roman number has illegal characters",exception.getMessage());

    }

    @Test
    void whenRomanNumberIsNullThenException(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.convertRomanToArabic(null);
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals("Roman number is null",exception.getMessage());
    }

    @Test
    void whenRomanNumberIsTooLongThenException(){
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            Converter.convertRomanToArabic("VIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        });
        Assertions.assertSame(exception.getClass(), IllegalArgumentException.class);
        Assertions.assertEquals("Roman number is too long",exception.getMessage());
    }

    @Test
    void whenRomanNumberIsOkayThenNoException(){
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertEquals(3,  Converter.convertRomanToArabic("III"));
        });
    }

    @Test
    void whenRomanNumberIsLowerCaseThenNoException(){
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertEquals(10,  Converter.convertRomanToArabic("x"));
        });
    }

    @Test
    void whenRomanIIIThenArabic3() {
        Assertions.assertEquals(3, Converter.convertRomanToArabic("III"));
    }

    @Test
    void whenRomanVIThenArabic4() {
        Assertions.assertEquals(4, Converter.convertRomanToArabic("IV"));
    }

    @Test
    void whenRomanVThenArabic5() {
        Assertions.assertEquals(5, Converter.convertRomanToArabic("V"));
    }

    @Test
    void whenRomanIXThenArabic9() {
        Assertions.assertEquals(9, Converter.convertRomanToArabic("IX"));
    }
    @Test
    void whenRomanXThenArabic10() {
        Assertions.assertEquals(10, Converter.convertRomanToArabic("X"));
    }

    @Test
    void whenRomanXIVThenArabic14() {
        Assertions.assertEquals(14, Converter.convertRomanToArabic("XIV"));
    }

    @Test
    void whenRomanXXThenArabic20() {
        Assertions.assertEquals(20, Converter.convertRomanToArabic("XX"));
    }

    @Test
    void whenRomanXLThenArabic40() {
        Assertions.assertEquals(40, Converter.convertRomanToArabic("XL"));
    }

    @Test
    void whenRomanLThenArabic50() {
        Assertions.assertEquals(50, Converter.convertRomanToArabic("L"));
    }

    @Test
    void whenRomanXCThenArabic90() {
        Assertions.assertEquals(90, Converter.convertRomanToArabic("XC"));
    }

    @Test
    void whenRomanCThenArabic100() {
        Assertions.assertEquals(100, Converter.convertRomanToArabic("C"));
    }

    @Test
    void whenRomanCDThenArabic400() {
        Assertions.assertEquals(400, Converter.convertRomanToArabic("CD"));
    }

    @Test
    void whenRomanDThenArabic500() {
        Assertions.assertEquals(500, Converter.convertRomanToArabic("D"));
    }

    @Test
    void whenRomanCMThenArabic900() {
        Assertions.assertEquals(900, Converter.convertRomanToArabic("CM"));
    }

    @Test
    void whenRomanMThenArabic1000() {
        Assertions.assertEquals(1000, Converter.convertRomanToArabic("M"));
    }
}