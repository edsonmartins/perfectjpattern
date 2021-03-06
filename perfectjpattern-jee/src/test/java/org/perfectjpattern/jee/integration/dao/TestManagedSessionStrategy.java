//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// TestManagedSessionStrategy.java Copyright (c) 2012 Giovanni Azua Garcia
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

import javax.persistence.*;

import junit.framework.*;

import org.easymock.*;
import org.perfectjpattern.jee.api.integration.dao.*;

/**
 * Test suite for the {@link ManagedDaoSessionStrategy} implementation
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $Date: Feb 12, 2009 9:38:07 PM $
 */
public 
class TestManagedSessionStrategy
extends TestCase
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    public void
    testShutdown()
    {
        ISessionStrategy mySessionStrategy = new ManagedSessionStrategy();
        
        try
        {
            mySessionStrategy.shutdown();
            
            fail("ManagedDaoSessionStrategy did not work as expected");
        }
        catch (UnsupportedOperationException anException)
        {
            // ok
        }
    }

    //------------------------------------------------------------------------
    public void
    testGetSession()
    {
        EntityManager myEntityManager = EasyMock.createNiceMock(
            EntityManager.class); 
            
        ManagedSessionStrategy mySessionStrategy = 
            new ManagedSessionStrategy();
        mySessionStrategy.setEntityManager(myEntityManager);
        
        ISession mySession = mySessionStrategy.getSession();
        
        assertNotNull("Session is expected not to be null", mySession);
    }
}
