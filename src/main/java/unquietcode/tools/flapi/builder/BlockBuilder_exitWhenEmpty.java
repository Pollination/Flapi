
package unquietcode.tools.flapi.builder;

import javax.annotation.Generated;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit http://www.unquietcode.com/flapi for more information.
 * 
 * 
 * Generated on May 28, 2012 17:01:37 CDT using version 0.2
 * 
 */
@Generated(value = "unquietcode.tools.flapi", date = "May 28, 2012 17:01:37 CDT", comments = "generated using Flapi, the fluent API generator for Java")
public interface BlockBuilder_exitWhenEmpty<_ReturnType >{


    MethodBuilder_addBlockChain<BlockBuilder_exitWhenEmpty<_ReturnType>> addBlockReference(String blockName, String methodSignature);

    MethodBuilder_addBlockChain<BlockBuilder_exitWhenEmpty<_ReturnType>> addMethod(String methodSignature);

    _ReturnType endBlock();

    MethodBuilder_addBlockChain<BlockBuilder_exitWhenEmpty<BlockBuilder_exitWhenEmpty<_ReturnType>>> startBlock(String blockName, String methodSignature);

    BlockBuilder<_ReturnType> exitWhenEmpty(boolean value);

}