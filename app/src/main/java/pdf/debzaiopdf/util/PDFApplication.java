package pdf.debzaiopdf.util;

import android.app.Application;
import android.content.Context;
import androidx.multidex.MultiDex;

public class PDFApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
