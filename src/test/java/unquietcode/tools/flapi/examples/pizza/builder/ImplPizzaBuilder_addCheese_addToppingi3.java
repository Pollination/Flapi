
package unquietcode.tools.flapi.examples.pizza.builder;

import unquietcode.tools.flapi.examples.pizza.DisappearingPizzaExample.Topping;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit http://www.unquietcode.com/flapi for more information.
 * 
 * 
 * Generated on May 28, 2012 10:15:25 CDT using version 0.2
 * 
 */
public class ImplPizzaBuilder_addCheese_addToppingi3
    implements PizzaBuilder_addCheese_addToppingi3
{

    private final PizzaHelper _helper;
    private final Object _returnValue;

    ImplPizzaBuilder_addCheese_addToppingi3(PizzaHelper helper, Object returnValue) {
        _helper = helper;
        _returnValue = returnValue;
    }

    private void _transferInvocations(Object next) {
        // nothing
    }

    private void _checkInvocations() {
        // nothing
    }

    public Object bake() {
        _checkInvocations();
        _helper.bake();
         
        Object retval = _returnValue;
        return retval;
    }

    public PizzaBuilder_addToppingi3 addCheese() {
        _helper.addCheese();
         
        PizzaBuilder_addToppingi3 retval = new ImplPizzaBuilder_addToppingi3(_helper, _returnValue);
        _transferInvocations(retval);
        return retval;
    }

    public PizzaBuilder_addCheese_addToppingi2 addTopping(Topping topping) {
        _helper.addTopping(topping);
         
        PizzaBuilder_addCheese_addToppingi2 retval = new ImplPizzaBuilder_addCheese_addToppingi2(_helper, _returnValue);
        _transferInvocations(retval);
        return retval;
    }

}
