/*
 * Copyright 2015 joelauer.
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
package controllers;

import java.io.UnsupportedEncodingException;
import javax.inject.Singleton;
import ninja.Result;
import ninja.Results;

@Singleton
public class ApplicationController {
    
    //private final Cache cache;
    //private final Postoffice postoffice;
    
    /**
    @Inject
    public ApplicationController(Cache cache, Postoffice postoffice) {
        this.cache = cache;
        this.postoffice = postoffice;
    }
    */
    
    public Result index() throws UnsupportedEncodingException {
        return Results
            .ok()
            //.json()
            //.render("Dude");
            .html()
            .renderRaw("Hello World!".getBytes("UTF-8"));
    }
    
}
