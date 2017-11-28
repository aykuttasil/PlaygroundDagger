package aykuttasil.com.playgrounddagger.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by aykutasil on 28.11.2017.
 */

/**
 * {@link Qualifier} kullanarak dönüş tipi aynı olan (Context)
 * ama farklı nesnelere işaret eden (Activity.Context - Application.Context) durumları belirtiyoruz.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}