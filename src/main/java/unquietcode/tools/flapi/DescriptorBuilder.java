package unquietcode.tools.flapi;


/**
 * @author Benjamin Fagin
 * @version 12-30-2011
 */
public interface DescriptorBuilder<_ReturnValue>   {
	// default methods should go here:
	void build();


	// generated
	DescriptorInterfaces.Method<_ReturnValue> startBlock(String blockName, String methodSignature);
}