package aykuttasil.com.playgrounddagger.di.components;

import aykuttasil.com.playgrounddagger.di.modules.ActivityModule;
import aykuttasil.com.playgrounddagger.di.modules.AppModule;
import aykuttasil.com.playgrounddagger.di.modules.ProfileActivityModule;
import dagger.Component;

/**
 * Created by aykutasil on 28.11.2017.
 */

@Component(modules = {AppModule.class, ActivityModule.class, ProfileActivityModule.class})
public interface ProfileActivityComponent {

}
