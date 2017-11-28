package aykuttasil.com.playgrounddagger.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import javax.inject.Inject;

import aykuttasil.com.playgrounddagger.R;
import aykuttasil.com.playgrounddagger.di.components.DaggerProfileActivityComponent;
import aykuttasil.com.playgrounddagger.di.components.ProfileActivityComponent;
import aykuttasil.com.playgrounddagger.di.modules.AppModule;

/**
 * Created by aykutasil on 28.11.2017.
 */

public class ProfileActivity extends BaseActivity {

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ProfileActivityComponent daggerProfileActivityComponent = DaggerProfileActivityComponent.builder()
                .appModule(new AppModule(getApplication()))
                .build();

        daggerProfileActivityComponent.inject(this);

        TextView txtDesc = findViewById(R.id.txtDesc);
        txtDesc.setText(sharedPreferences.getString("Ad", "..."));
    }
}
