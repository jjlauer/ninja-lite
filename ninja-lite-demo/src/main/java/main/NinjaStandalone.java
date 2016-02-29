/*
 * Copyright 2016 joelauer.
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
package main;

import ninja.standalone.StandaloneHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NinjaStandalone {
    static private final Logger log = LoggerFactory.getLogger(NinjaStandalone.class);
    
    static public void main(String[] args) throws Exception {
        
        // ninja jetty missing & system property not set
        if (!hasClassName("ninja.standalone.NinjaJetty") && System.getProperty("ninja.standalone.class") == null) {
            System.setProperty("ninja.standalone.class", "ninja.undertow.NinjaUndertow");
        }

        StandaloneHelper.resolveStandaloneClass().newInstance()
            .port(StandaloneHelper.findAvailablePort(8000, 9000))
            .start()
            .join();
    }
    
    static public boolean hasClassName(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
