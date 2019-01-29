package de.upb.cs.swt.cilrep.instructions.ParameterTypes;

public class ClassParam extends TypesBase {
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