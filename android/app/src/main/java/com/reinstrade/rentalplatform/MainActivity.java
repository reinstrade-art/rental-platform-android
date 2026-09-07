package com.reinstrade.rentalplatform;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Android's default Activity/WebView state restoration resumes the
        // last page you were on (e.g. deep inside /dashboard after signing
        // in) instead of reloading capacitor.config.json's server.url from
        // scratch -- which is exactly why the new Home landing screen never
        // showed up again after the very first sign-in. Passing null here
        // is the standard way to force a true cold start on every launch,
        // so the app always reloads /home first, same as a fresh install.
        super.onCreate(null);
    }
}
