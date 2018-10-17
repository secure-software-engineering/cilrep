import de.upb.cs.swt.cilrep.DllReader;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class DllReaderTest {
    @Test public void testReader() {
        DllReader reader = new DllReader();

        assertNotNull(reader.readProject(new File("src/resources/newtonsoft.json.11.0.2/net45/Newtonsoft.Json.dll")));
    }
}
