/*
 * Copyright 2016 Fizzed, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ninja.lite;

import com.google.inject.ConfigurationException;
import com.google.inject.ProvisionException;
import ninja.NinjaTest;
import ninja.cache.NinjaCache;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import org.junit.Test;

public class ApplicationTest extends NinjaTest {
    
    /**
    @Test
    public void index() {
        String result = ninjaTestBrowser.makeRequest(getServerAddress() + "/");
        
        assertThat(result, is("Hello World!"));
    }
    
    @Test
    public void verifyCacheDisabled() {
        try {
            NinjaCache ninjaCache = getInjector().getInstance(NinjaCache.class);
            fail("Cache should not have been bound");
        } catch (ProvisionException | ConfigurationException e) {
            // expected
        }
    }
    */
    
}
