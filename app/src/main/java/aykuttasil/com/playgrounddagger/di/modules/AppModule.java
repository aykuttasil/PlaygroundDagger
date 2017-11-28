package aykuttasil.com.playgrounddagger.di.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aykutasil on 28.11.2017.
 */

@Module
public class AppModule {

    private final Application app;

    public AppModule(Application aplication) {
        this.app = aplication;
    }

    @Provides
    @Singleton
    Application provideApp() {
        return this.app;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.app;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreference(Context app) {
        return app.getSharedPreferences("AppSharedPreference", Context.MODE_PRIVATE);
    }

}
