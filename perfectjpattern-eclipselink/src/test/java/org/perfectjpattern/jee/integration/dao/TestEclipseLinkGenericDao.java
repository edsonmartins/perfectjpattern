//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// TestEclipseLinkGenericDao.java Copyright (c) 2012 Giovanni Azua Garcia
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

import org.eclipse.persistence.sessions.*;
import org.eclipse.persistence.sessions.factories.*;
import org.eclipse.persistence.tools.schemaframework.*;
import org.perfectjpattern.support.test.*;

/**
 * Test Suite for the {@link EclipseLinkGenericDao} implementation.
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $ $Date: Nov 26, 2007 9:31:46 PM $
 */
public 
class TestEclipseLinkGenericDao
extends AbstractTestBaseDao
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /**
     * Default {@link TestEclipseLinkGenericDao} constructor
     */
    public 
    TestEclipseLinkGenericDao()
    {
        super(EclipseLinkDaoFactory.getInstance());
    }        
    
    //------------------------------------------------------------------------
    // protected
    //------------------------------------------------------------------------
    @Override
    protected void 
    setUp() 
    throws Exception
    {        
        if (theTableCreator == null)
        {
            DatabaseSession mySession = null;
            try 
            {                
                mySession = (DatabaseSession) SessionManager.getManager().
                    getDefaultSession();

                SchemaManager mySchemaManager = new SchemaManager(mySession);
                
                theTableCreator = new PersonTableCreator(); 
                theTableCreator.replaceTables(mySession, mySchemaManager);
            }
            // CHECKSTYLE:OFF
            catch (Throwable anException) 
            // CHECKSTYLE:ON
            {
                anException.printStackTrace();
                
                fail(anException.getMessage());

                if (mySession != null) 
                {
                    mySession.logout();
                }                
            }
        }        

        super.setUp();
    }
    
    //------------------------------------------------------------------------
    // members
    //------------------------------------------------------------------------
    private static PersonTableCreator theTableCreator;    
}
