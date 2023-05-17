import com.tcoded.legacycolorcodeparser.LegacyColorCodeParser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorCodeTests {

    @Test
    @DisplayName("Test converting hex color code to legacy color code")
    void testConvert() {
        assertEquals(LegacyColorCodeParser.convertHexToLegacy('&', "&#FF0000"), "&x&F&F&0&0&0&0");
        assertEquals(LegacyColorCodeParser.convertHexToLegacy('&', "&#ff0000"), "&x&f&f&0&0&0&0");
    }

    @Test
    @DisplayName("Test not converting invalid hex color code to legacy color code")
    void testDontConvertInvalid() {
        assertEquals(LegacyColorCodeParser.convertHexToLegacy('&', "&#ff000"), "&#ff000");
    }

}
