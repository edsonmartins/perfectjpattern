//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// Wheel.java Copyright (c) 2012 Giovanni Azua Garcia
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
package org.perfectjpattern.core.behavioral.visitor;

/**
 * Car Wheel. Please note: ZERO relations to Visitor-specific pattern 
 * details e.g. Visitor etc. Makes inclusion of the Visitor pattern easier 
 * in existing designs.
 *
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $Date: Jun 8, 2008 11:56:02 PM $
 */
public 
class Wheel
implements ICarPart
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    public 
    Wheel(String aName) 
    {
        theName = aName;
    }
 
    //------------------------------------------------------------------------
    public String 
    getName() 
    {
        return theName;
    }
 
    //------------------------------------------------------------------------
    // members
    //------------------------------------------------------------------------
    private final String theName;
}
