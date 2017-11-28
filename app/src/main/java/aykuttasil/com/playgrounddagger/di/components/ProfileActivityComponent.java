package aykuttasil.com.playgrounddagger.di.components;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import aykuttasil.com.playgrounddagger.di.modules.ActivityModule;
import aykuttasil.com.playgrounddagger.di.modules.AppModule;
import aykuttasil.com.playgrounddagger.di.modules.ProfileActivityModule;
import aykuttasil.com.playgrounddagger.ui.ProfileActivity;
import dagger.Component;

/**
 * Created by aykutasil on 28.11.2017.
 */

@Singleton
@Component(modules = {AppModule.class, ActivityModule.class, ProfileActivityModule.class})
public interface ProfileActivityComponent {
    void inject(ProfileActivity profileActivity);

    SharedPreferences sharedPreferences();
}
