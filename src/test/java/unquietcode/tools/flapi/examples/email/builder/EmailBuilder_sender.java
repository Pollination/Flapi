
package unquietcode.tools.flapi.examples.email.builder;

import java.io.File;


/**
 * This class was generated using Flapi, the fluent API generator for Java.
 * Modifications to this file will be lost upon regeneration.
 * You have been warned!
 * 
 * Visit http://www.unquietcode.com/flapi for more information.
 * 
 * 
 * Generated on May 28, 2012 10:14:26 CDT using version 0.2
 * 
 */
public interface EmailBuilder_sender<_ReturnType >{


    EmailBuilder_sender<_ReturnType> addAttachment(File file);

    EmailBuilder_sender<_ReturnType> addBCC(String emailAddress);

    EmailBuilder_sender<_ReturnType> addCC(String emailAddress);

    EmailBuilder_sender<_ReturnType> addRecipient(String emailAddress);

    _ReturnType send();

    EmailBuilder<_ReturnType> sender(String emailAddress);

}
