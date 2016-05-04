package edu.cmu.hcii.whyline.bytecode;

import edu.cmu.hcii.whyline.trace.EventKind;

/**
 * @author Andrew J. Ko
 *
 */ 
public final class DDIV extends BinaryComputation {

	public DDIV(CodeAttribute method) {
		super(method);
	}

	public final int getOpcode() { return 111; }
	public int byteLength() { return 1; }

	public String getPastTenseVerb() { return "divided"; }

	public EventKind getTypeProduced() { return EventKind.DOUBLE_PRODUCED; }

	public String getOperator() { return "/"; }

	public String getTypeDescriptorOfArgument(int argIndex) { return "D"; }

}
