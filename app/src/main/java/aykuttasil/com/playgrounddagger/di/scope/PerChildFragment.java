package aykuttasil.com.playgrounddagger.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by aykutasil on 28.11.2017.
 */

/**
 * Her child fragment için oluşturduğumuz modüllere bu scope u ekleyerek
 * inject edilen nesnelerin ömürlerini child fragment ile aynı olmasını sağlıyoruz.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerChildFragment {
}