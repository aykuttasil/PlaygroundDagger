package aykuttasil.com.playgrounddagger.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import aykuttasil.com.playgrounddagger.App;
import aykuttasil.com.playgrounddagger.di.components.AppComponent;

/**
 * Created by aykutasil on 28.11.2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    AppComponent getAppComponent() {
        return App.getAppComponent();
    }
}
