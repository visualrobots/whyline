package edu.cmu.hcii.whyline.bytecode;

import edu.cmu.hcii.whyline.trace.EventKind;

/**
 * @author Andrew J. Ko
 *
 */ 
public final class ISHR extends BinaryComputation {

	public ISHR(CodeAttribute method) {
		super(method);
	}

	public final int getOpcode() { return 122; }
	public int byteLength() { return 1; }

	public String getPastTenseVerb() { return "shifted right"; }

	public EventKind getTypeProduced() { return EventKind.INTEGER_PRODUCED; }

	public String getOperator() { return ">>"; }

	public String getTypeDescriptorOfArgument(int argIndex) { return "I"; }

}
