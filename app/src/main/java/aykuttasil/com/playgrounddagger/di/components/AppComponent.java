package aykuttasil.com.playgrounddagger.di.components;

import android.app.Application;
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
    Application app();

    SharedPreferences sharedPreferences();

}
