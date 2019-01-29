package de.upb.cs.swt.cilrep.instructions.ParameterTypes;

import de.upb.cs.swt.cilrep.common.Constants;
import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.TildeStream;

public class MemberRef extends TypesBase {
    /**
     * Returns the size of MemberRef argument
     * @return
     */
    public Integer getSizeInBytes(){
        // TODO: check if it's always 4, if not then change logic
        Integer size = 4;
        return size;
    }
}