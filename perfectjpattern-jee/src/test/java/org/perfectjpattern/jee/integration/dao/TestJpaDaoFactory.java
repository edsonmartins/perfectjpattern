//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// TestJpaDaoFactory.java Copyright (c) 2012 Giovanni Azua Garcia
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
package org.perfectjpattern.jee.integration.dao;

import org.perfectjpattern.support.test.*;

/**
 * Test suite for the {@link JpaDaoFactory} implementation
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $Date: Mar 1, 2009 1:20:27 PM $
 */
public 
class TestJpaDaoFactory
extends AbstractTestSingleton<JpaDaoFactory>
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    public 
    TestJpaDaoFactory()
    {
        super(JpaDaoFactory.class, JpaDaoFactory.getInstance());
    }
}
