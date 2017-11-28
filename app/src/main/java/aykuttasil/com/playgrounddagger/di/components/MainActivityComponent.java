package aykuttasil.com.playgrounddagger.di.components;

import javax.inject.Singleton;

import aykuttasil.com.playgrounddagger.di.modules.ActivityModule;
import aykuttasil.com.playgrounddagger.di.modules.ApiManagerModule;
import aykuttasil.com.playgrounddagger.di.modules.AppModule;
import aykuttasil.com.playgrounddagger.di.modules.MainActivityModule;
import aykuttasil.com.playgrounddagger.di.modules.NetModule;
import aykuttasil.com.playgrounddagger.ui.MainActivity;
import dagger.Component;

/**
 * Created by aykutasil on 28.11.2017.
 */

@Singleton
@Component(
        modules = {
                AppModule.class,
                ActivityModule.class,
                MainActivityModule.class,
                ApiManagerModule.class,
                NetModule.class
        })
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
