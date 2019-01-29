package de.upb.cs.swt.cilrep.instructions.ParameterTypes;

public class UnsignedInt16 extends TypesBase {
    /**
     * Returns the size of MemberRef argument
     * @return
     */
    public Integer getSizeInBytes(){
        // TODO: check if it's always 4, if not then change logic
        Integer size = 2;
        return size;
    }
}