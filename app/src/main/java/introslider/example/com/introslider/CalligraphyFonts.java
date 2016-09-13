package introslider.example.com.introslider;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by ngondo on 9/13/16.
 */

public class CalligraphyFonts extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-ThinItalic.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
