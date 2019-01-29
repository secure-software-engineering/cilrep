package de.upb.cs.swt.cilrep.instructions.ParameterTypes;

import java.util.List;

public class SwitchStmtMultipleParams extends TypesBase {
    public List<Integer> params;
    /**
     * Returns the size of MemberRef argument
     * @return
     */
    public Integer getSizeInBytes(){
        // TODO: check if it's always 4, if not then change logic

        Integer size = 2 // 2 bytes for num of params
                + (this.params.size() * 4) // every param is 4 bytes
                 ;
        return size;
    }
}