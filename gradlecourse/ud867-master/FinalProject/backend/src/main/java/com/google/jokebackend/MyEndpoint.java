/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.google.jokebackend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.jokelibrary.JokeLibrary;

/**
 * An endpoint class we are exposing
 */
@Api(name = "myApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "jokebackend.google.com", ownerName = "jokebackend.google.com", packagePath = ""))
public class MyEndpoint {

    /**
     * A simple endpoint method that retrieves a joke
     */
    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        MyBean response = new MyBean();

        JokeLibrary joke = new JokeLibrary();
        response.setData(joke.getJoke());
        return response;
    }

}
