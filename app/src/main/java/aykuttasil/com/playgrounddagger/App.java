package aykuttasil.com.playgrounddagger;

import android.app.Application;

import aykuttasil.com.playgrounddagger.di.components.AppComponent;
import aykuttasil.com.playgrounddagger.di.components.DaggerAppComponent;
import aykuttasil.com.playgrounddagger.di.modules.AppModule;

/**
 * Created by aykutasil on 28.11.2017.
 */

public class App extends Application {

    public static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        appComponent.sharedPreferences().edit().putString("Ad", "Aykut").commit();
    }

}
