package aykuttasil.com.playgrounddagger.di.components;

import aykuttasil.com.playgrounddagger.di.modules.ActivityModule;
import aykuttasil.com.playgrounddagger.di.scope.PerActivity;
import dagger.Component;

/**
 * Created by aykutasil on 28.11.2017.
 */

@PerActivity
@Component(dependencies = {AppComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {
}
