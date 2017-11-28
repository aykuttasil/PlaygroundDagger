package aykuttasil.com.playgrounddagger.di.modules;

import android.app.Activity;
import android.content.Context;

import aykuttasil.com.playgrounddagger.di.scope.ActivityContext;
import aykuttasil.com.playgrounddagger.di.scope.ApplicationContext;
import dagger.Module;
import dagger.Provides;

/**
 * Created by aykutasil on 28.11.2017.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    @ApplicationContext
    Context provideAppContext() {
        return mActivity.getApplicationContext();
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}