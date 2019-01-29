package de.upb.cs.swt.cilrep.assemblycomponents;

import de.upb.cs.swt.cilrep.common.Constants;
import de.upb.cs.swt.cilrep.common.Logging;
import de.upb.cs.swt.cilrep.filecomponents.FileComponents;
import de.upb.cs.swt.cilrep.filecomponents.Headers.SectionHeaders.*;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.LogicalFormatTable;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.MethodDefTable;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.TableBase;
import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.StringsHeap;
import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.TildeStream;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class AssemblyComponents {
    public List<Method> methods = null;
    FileComponents fc = null;

    public AssemblyComponents(FileComponents _fc){
        fc = _fc;
    }

    /**
     * This method goes through the MethodDefTable
     * and make a method entry for each row of the table
     * and every entry of the method contains all the
     * instructions in that method.
     *
     * @param _bytes
     */
    public void populateMethods(byte[] _bytes){
        methods = new ArrayList<Method>();
        TildeStream ts = fc.mdRoot.getTildeStream();
        StringsHeap stringHeap = fc.mdRoot.getStringsHeap();

        LogicalFormatTable table = ts.tablesMap.get(Constants.TableIndexes.METHODDEFTABLE);
        if (table == null){
            Logging.log(this.getClass().getName(), Level.INFO, "No .");
            return;
        }

        MethodDefTable mdt = (MethodDefTable) table;
        ArrayList<MethodDefTable.MethodDefTableRow> rows = mdt.rows;
        for (MethodDefTable.MethodDefTableRow row:
            rows){
            Method method = new Method();
            //TextSection textSection = TextSection.getInstance();

            method.Name = stringHeap.strings.get(row.NameIndex);

            // populate method stuff from the file
            method.populate(row, _bytes);

            methods.add(method);
        }
        methods = methods;
    }
}
