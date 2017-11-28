package aykuttasil.com.playgrounddagger.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

import aykuttasil.com.playgrounddagger.data.remote.ApiManager;
import aykuttasil.com.playgrounddagger.di.components.DaggerMainActivityComponent;
import aykuttasil.com.playgrounddagger.di.modules.ActivityModule;
import aykuttasil.com.playgrounddagger.di.modules.AppModule;
import aykuttasil.com.playgrounddagger.di.modules.NetModule;
import aykuttasil.com.playgrounddagger.di.scope.ActivityContext;
import aykuttasil.com.playgrounddagger.di.scope.ApplicationContext;
import aykuttasil.com.playgrounddagger.model.User;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by aykutasil on 28.11.2017.
 */

public class MainActivity extends BaseActivity {

    @Inject
    SharedPreferences sharedPreferences;

    @Inject
    ApiManager apiManager;

    @ActivityContext
    @Inject
    Context context;

    @ApplicationContext
    @Inject
    Context context1;

    @Inject
    OkHttpClient okHttpClient;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerMainActivityComponent.builder()
                .appModule(new AppModule(getApplication()))
                .activityModule(new ActivityModule(this))
                .netModule(new NetModule("baseUrl"))
                .build()
                .inject(this);


        Log.i("aaa", okHttpClient.toString());

        Log.i("aaa", context.getClass().getSimpleName());

        Log.i("aaa", context1.getClass().getSimpleName());

        if (sharedPreferences != null) {
            String ad = sharedPreferences.getString("Ad", "...");
            Log.i("aaa", ad);
        } else {
            Log.i("aaa", "sharedpreference is null");
        }

        apiManager.getUser("aykuttasil")
                .enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        Log.i("aaa", response.body().getLogin());
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Log.e("aaa", t.getMessage());
                    }
                });

    }
}
