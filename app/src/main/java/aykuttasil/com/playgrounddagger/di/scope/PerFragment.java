package aykuttasil.com.playgrounddagger.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by aykutasil on 28.11.2017.
 */

/**
 * Her fragment için oluşturduğumuz modüllere bu scope u ekleyerek
 * inject edilen nesnelerin ömürlerini fragment ile aynı olmasını sağlıyoruz.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerFragment {
}