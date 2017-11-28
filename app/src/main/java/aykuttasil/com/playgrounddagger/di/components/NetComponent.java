package aykuttasil.com.playgrounddagger.di.components;

import javax.inject.Singleton;

import aykuttasil.com.playgrounddagger.di.modules.AppModule;
import aykuttasil.com.playgrounddagger.di.modules.NetModule;
import dagger.Component;

/**
 * Created by aykutasil on 28.11.2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {


}
