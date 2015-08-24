package com.rnfsoft.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by taehee on 8/19/15.
 */
public class ChatApplication extends Application {

    public static final String YOUR_APPLICATION_ID = "";
    public static final String YOUR_CLIENT_KEY = "";
    @Override
    public void onCreate() {
        super.onCreate();
        //Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Message.class);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);

    }
}
