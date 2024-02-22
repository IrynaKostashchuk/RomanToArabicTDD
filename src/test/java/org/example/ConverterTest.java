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
            Converter.convertRomanToArabic("VIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
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
    void whenRomanXXIIIThenArabic23() {
        Assertions.assertEquals(23, Converter.convertRomanToArabic("XXIII"));
    }

    @Test
    void whenRomanLIIIThenArabic53() {
        Assertions.assertEquals(53, Converter.convertRomanToArabic("LIII"));
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
    void whenRomanCDXLIXThenArabic449() {
        Assertions.assertEquals(449, Converter.convertRomanToArabic("CDXLIX"));
    }

    @Test
    void whenRomanCDLThenArabic450() {
        Assertions.assertEquals(450, Converter.convertRomanToArabic("CDL"));
    }

    @Test
    void whenRomanDThenArabic500() {
        Assertions.assertEquals(500, Converter.convertRomanToArabic("D"));
    }
    @Test
    void whenRomanDCThenArabic600() {
        Assertions.assertEquals(600, Converter.convertRomanToArabic("DC"));
    }

    @Test
    void whenRomanCMThenArabic900() {
        Assertions.assertEquals(900, Converter.convertRomanToArabic("CM"));
    }

    @Test
    void whenRomanCMXLVThenArabic945() {
        Assertions.assertEquals(945, Converter.convertRomanToArabic("CMXLV"));
    }

    @Test
    void whenRomanCMXLIXThenArabic949() {
        Assertions.assertEquals(949, Converter.convertRomanToArabic("CMXLIX"));
    }

    @Test
    void whenRomanCMXCTHenArabic990() {
        Assertions.assertEquals(990, Converter.convertRomanToArabic("CMXC"));
    }

    @Test
    void whenRomanMCDXCIVThenArabic1494() {
        Assertions.assertEquals(1494, Converter.convertRomanToArabic("MCDXCIV"));
    }

    @Test
    void whenRomanMCDXCIXThenArabic1499() {
        Assertions.assertEquals(1499, Converter.convertRomanToArabic("MCDXCIX"));
    }

    @Test
    void whenRomanMThenArabic1000() {
        Assertions.assertEquals(1000, Converter.convertRomanToArabic("M"));
    }
    @Test
    void whenRomanMMMCMXCIXThenArabic3999() {
        Assertions.assertEquals(3999, Converter.convertRomanToArabic("MMMCMXCIX"));
    }

    @Test
    void whenRomanMMMMThenException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("MMMM");
        });
    }

    @Test
    void whenRomanIIIIThenException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("IIII");
        });
    }

    @Test
    void whenRomanVVThenException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("VV");
        });
    }

    @Test
    void whenRomanLLThenException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("LL");
        });
    }

    @Test
    void whenRomanDDThenException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("DD");
        });
    }

    @Test
    void whenRomanMMMMCMXCIXThenException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("MMMMCMXCIX");
        });
    }

    @Test
    void whenRomanIIIIIXThenException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("IIIIIX");
        });
    }


}