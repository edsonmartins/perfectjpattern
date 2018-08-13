//----------------------------------------------------------------------
// 
// PerfectJPattern: "Design patterns are good but components are better!" 
// NullTransactionStrategy.java Copyright (c) 2012 Giovanni Azua Garcia
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

import org.perfectjpattern.jee.api.integration.dao.*;

/**
 * Null Object Pattern implementation of {@link ITransactionStrategy}. 
 * 
 * @author <a href="mailto:bravegag@hotmail.com">Giovanni Azua</a>
 * @version $Revision: 1.0 $Date: Mar 2, 2009 9:40:52 PM $
 */
public final 
class NullTransactionStrategy
implements ITransactionStrategy
{
    //------------------------------------------------------------------------
    // public
    //------------------------------------------------------------------------
    /** 
     * {@inheritDoc}
     */
    public ITransaction 
    getTransaction()
    {
        throw new IllegalStateException("Dao TransactionStrategy has not " +
            "been initialized properly");
    }

    //------------------------------------------------------------------------
    /** 
     * {@inheritDoc}
     */
    public boolean 
    isManaged()
    {
        return false;
    }
}
