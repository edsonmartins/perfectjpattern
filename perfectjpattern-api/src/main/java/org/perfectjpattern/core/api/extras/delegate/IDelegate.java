//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// IDelegate.java Copyright (c) 2012 Giovanni Azua Garcia
// bravegag@hotmail.com
//  
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//    http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
//----------------------------------------------------------------------
package org.perfectjpattern.core.api.extras.delegate;

/**
 * <b>Delegates Design Pattern</b>: Allows multiple objects implementing 
 * methods with different names but compatible signatures to be used 
 * interchangeably. It will also work with or without a target interface 
 * to implement i.e. using <code>IDelegate</code>.
 * <br/><br/> 
 * The <code>IDelegator</code> interface simplifies and generalizes the 
 * steps in creating an Adapter. Delegates are simple to use, and 
 * a single delegate instance may be reused multiple times.
 * <br/><br/>
 * <b>Responsibility</b>: Definition of "Delegate" interface. 
 * Default target interface that should be used when there is no 
 * an explicitly defined target interface.
 * <br/><br/>
 * <b>Notes</b>: Base source code implemented by Steve Lewis and Wilhelm 
 * Fitzpatrick and adapted to fit PerfectJPattern componentization 
 * criteria and code conventions.
 * 
 * <br/><br/>
 * Example usage:
 * <pre><code>
 *    //
 *    // Example class that defines two methods that match in signature 
 *    // 
 *    class Example
 *    {
 *        //--------------------------------------------------------------------
 *        public static void
 *        staticMethod(String aValue) 
 *        {
 *            System.out.println(aValue);
 *        }
 *        
 *        //--------------------------------------------------------------------
 *        public void
 *        memberMethod(String aValue) 
 *        {
 *            System.out.println(aValue);
 *        }        
 *    }
 *    
 *    //
 *    // Defines a common interface with method printValue
 *    //
 *    interface IPrinter
 *    {
 *        //--------------------------------------------------------------------
 *        public void
 *        printValue(String aValue); 
 *    }
 *
 *    //
 *    // Create instance of example class
 *    //     
 *    Example myInstance = new Example();
 *    
 *    //
 *    // Example using DynamicDelegator without well defined target interface
 *    //
 *    IDelegator&lt;IDelegate&gt; myDynamicDelegator = new DynamicDelegator(
 *        Void.TYPE, String.class);
 *        
 *    //
 *    // Build appropriate IDelegate references
 *    // 
 *    IDelegate myDelegate1 = myDynamicDelegator.build(Example.class, 
 *        "staticMethod");
 *    IDelegate myDelegate2 = myDynamicDelegator.build(myInstance, 
 *        "memberMethod"); 
 *    
 *    //
 *    // Use the Delegate references to invoke the target methods.
 *    //
 *    myDelegate1.invoke("Value1");
 *    myDelegate2.invoke("Value2");
 *
 *    //
 *    // Example using well defined target interface
 *    //
 *    IDelegator&lt;IPrinter&gt; myPrinterDelegator = new Delegator(
 *        IPrinter.class);
 *    
 *    //
 *    // Build appropriate IPrinter references
 *    // 
 *    IPrinter myPrinter1 = myPrinterDelegator.build(Example.class, 
 *        "staticMethod");
 *    IPrinter myPrinter2 = myPrinterDelegator.build(myInstance, 
 *        "memberMethod");
 *    
 *    //
 *    // Use the IPrinter interface reference.
 *    //
 *    myPrinter1.printValue("Value1");
 *    myPrinter2.printValue("Value2");
 * </code></pre>
 * 
 * @see <a href="http://www.onjava.com/pub/a/onjava/2003/05/21/delegates.html">
 * Article: A Java Programmer Looks at C-Sharp Delegates</a>
 * 
 * @author <a href="mailto:smlewis@lordjoe.com">Steve Lewis</a>
 * @author <a href="mailto:wilhelmf@agileinformatics.com">Wilhelm 
 * Fitzpatrick</a>
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 2.0 $ $Date: Jun 24, 2007 12:28:16 PM $
 */
public interface
IDelegate 
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Returns the Result of the target call; primitive types are wrapped;
     * may return void result.
     * 
     * Executes the target method using the input arguments and returns the 
     * appropriate result if any.
     * 
     * @param anArguments List of input arguments.
     * @return Result of the target call; primitive types are wrapped;
     *         may return void result.
     */
    public Object 
    invoke(Object... anArguments);
}
