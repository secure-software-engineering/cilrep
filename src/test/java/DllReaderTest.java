import de.upb.cs.swt.cilrep.DllReader;
import org.junit.Test;

import java.io.File;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class DllReaderTest {
    @Test public void testReader() {
        DllReader reader = new DllReader();
        assertNotNull(reader.readProject(Paths.get("C:\\Users\\nij\\Desktop\\CIL Work\\cilrep\\src\\test\\resources\\newtonsoft.json.11.0.2\\netstandard1.0\\Newtonsoft.Json.dll")));
    }
}
