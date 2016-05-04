package edu.cmu.hcii.whyline.bytecode;

/**
 * @author Andrew J. Ko
 *
 */ 
public final class IFGT extends CompareIntegerToZeroBranch {

	public IFGT(CodeAttribute method, int offset) {
		super(method, offset);
	}

	public final int getOpcode() { return 157; }
	public int byteLength() { return 3; }

	public String getReadableDescription() { return ">"; }

}
