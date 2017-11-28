package aykuttasil.com.playgrounddagger;

import android.app.Application;
import android.content.SharedPreferences;

import javax.inject.Inject;

import aykuttasil.com.playgrounddagger.di.components.AppComponent;
import aykuttasil.com.playgrounddagger.di.components.DaggerAppComponent;
import aykuttasil.com.playgrounddagger.di.modules.AppModule;

/**
 * Created by aykutasil on 28.11.2017.
 */

public class App extends Application {

    @Inject
    SharedPreferences sharedPreferences;

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

        appComponent.inject(this);

        sharedPreferences.edit().putString("Ad", "Aykut").commit();
    }

}
