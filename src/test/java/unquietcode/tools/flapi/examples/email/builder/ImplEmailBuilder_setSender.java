
package unquietcode.tools.flapi.examples.email.builder;

import java.io.File;
import java.lang.reflect.Field;
import unquietcode.tools.flapi.MinimumInvocationsException;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit http://www.unquietcode.com/flapi for more information.
 * 
 * 
 * Generated on May 13, 2012 24:29:29 CDT using version 0.2
 * 
 */
public class ImplEmailBuilder_setSender
    implements EmailBuilder_setSender
{

    private final EmailHelper _helper;
    private final Object _returnValue;
    int ic_Email_addRecipient$String_emailAddress = 1;
    int ic_Email_setSender$String_emailAddress = 1;

    ImplEmailBuilder_setSender(EmailHelper helper, Object returnValue) {
        _helper = helper;
        _returnValue = returnValue;
    }

    private void _transferInvocations(Object next) {
        Class clazz = next.getClass();
         
        try {
            Field field = clazz.getDeclaredField("ic_Email_addRecipient$String_emailAddress");
            field.setInt(next, ic_Email_addRecipient$String_emailAddress);
        } catch (Exception _x) {
            // nothing
        }
         
        try {
            Field field = clazz.getDeclaredField("ic_Email_setSender$String_emailAddress");
            field.setInt(next, ic_Email_setSender$String_emailAddress);
        } catch (Exception _x) {
            // nothing
        }
    }

    private void _checkInvocations() {
        if (ic_Email_addRecipient$String_emailAddress > 0) {
            throw new MinimumInvocationsException("Expected at least 1 invocations of method 'addRecipient(String emailAddress)'.");
        }
        if (ic_Email_setSender$String_emailAddress > 0) {
            throw new MinimumInvocationsException("Expected at least 1 invocations of method 'setSender(String emailAddress)'.");
        }
    }

    public EmailBuilder_setSender addAttachment(File file) {
        _helper.addAttachment(file);
         
        EmailBuilder_setSender retval = this;
        return retval;
    }

    public EmailBuilder_setSender addBCC(String emailAddress) {
        _helper.addBCC(emailAddress);
         
        EmailBuilder_setSender retval = this;
        return retval;
    }

    public EmailBuilder_setSender addCC(String emailAddress) {
        _helper.addCC(emailAddress);
         
        EmailBuilder_setSender retval = this;
        return retval;
    }

    public EmailBuilder_setSender addRecipient(String emailAddress) {
        _helper.addRecipient(emailAddress);
         
        EmailBuilder_setSender retval = this;
        --ic_Email_addRecipient$String_emailAddress;
        return retval;
    }

    public Object send() {
        _checkInvocations();
        _helper.send();
         
        Object retval = _returnValue;
        return retval;
    }

    public EmailBuilder setSender(String emailAddress) {
        _helper.setSender(emailAddress);
         
        EmailBuilder retval = new ImplEmailBuilder(_helper, _returnValue);
        --ic_Email_setSender$String_emailAddress;
        _transferInvocations(retval);
        return retval;
    }

}