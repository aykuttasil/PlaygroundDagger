package aykuttasil.com.playgrounddagger.di.components;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import aykuttasil.com.playgrounddagger.App;
import aykuttasil.com.playgrounddagger.di.modules.AppModule;
import dagger.Component;

/**
 * Created by aykutasil on 28.11.2017.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(App app);

    SharedPreferences sharedPreferences();

}
