
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
 * Generated on May 28, 2012 19:55:23 CDT using version 0.2
 * 
 */
@Generated(value = "unquietcode.tools.flapi", date = "May 28, 2012 19:55:23 CDT", comments = "generated using Flapi, the fluent API generator for Java")
public class ImplMethodBuilder_addBlockChain
    implements MethodBuilder_addBlockChain
{

    private final MethodHelper _helper;
    private final Object _returnValue;

    ImplMethodBuilder_addBlockChain(MethodHelper helper, Object returnValue) {
        _helper = helper;
        _returnValue = returnValue;
    }

    private void _transferInvocations(Object next) {
        // nothing
    }

    private void _checkInvocations() {
        // nothing
    }

    public Object any() {
        _checkInvocations();
        _helper.any();
         
        return _returnValue;
    }

    public Object atLeast(int num) {
        _checkInvocations();
        _helper.atLeast(num);
         
        return _returnValue;
    }

    public Object atMost(int num) {
        _checkInvocations();
        _helper.atMost(num);
         
        return _returnValue;
    }

    public Object between(int atLeast, int atMost) {
        _checkInvocations();
        _helper.between(atLeast, atMost);
         
        return _returnValue;
    }

    public Object exactly(int num) {
        _checkInvocations();
        _helper.exactly(num);
         
        return _returnValue;
    }

    public Object last() {
        _checkInvocations();
        _helper.last();
         
        return _returnValue;
    }

    public Object last(Class returnType) {
        _checkInvocations();
        _helper.last(returnType);
         
        return _returnValue;
    }

    public BlockChainBuilder_addBlockChain addBlockChain() {
        ObjectWrapper<BlockChainHelper> helper1 = new ObjectWrapper<BlockChainHelper>();
        _helper.addBlockChain(helper1);
         
        BlockChainBuilder_addBlockChain step1 = new ImplBlockChainBuilder_addBlockChain(helper1 .get(), new ImplMethodBuilder(_helper, _returnValue));
        _transferInvocations(step1);
        return step1;
    }

}
