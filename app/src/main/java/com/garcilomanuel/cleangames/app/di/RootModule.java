package com.garcilomanuel.cleangames.app.di;

import android.content.Context;
import com.garcilomanuel.cleangames.app.MVPCleanGamesApplication;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepositoryImp;
import com.garcilomanuel.cleangames.ui.detail.view.DetailContainerActivity;
import com.garcilomanuel.cleangames.ui.detail.view.DetailViewFragment;
import com.garcilomanuel.cleangames.ui.main.presenter.MainPresenterImp;
import com.garcilomanuel.cleangames.ui.main.view.MainActivity;
import com.garcilomanuel.cleangames.ui.platforms.view.PlatformsViewFragment;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Manuel García.
 */

@Module(
    includes = {
        ExecutorModule.class,
        NavigatorModule.class,
        DataSourceModule.class,
        RepositoryModule.class,
        MapperModule.class,
        PresenterModule.class,
        InteractorModule.class
    },
    injects = {
        MVPCleanGamesApplication.class,
        PlatformRepositoryImp.class,
        MainActivity.class,
        MainPresenterImp.class,
        PlatformsViewFragment.class,
        DetailContainerActivity.class,
        DetailViewFragment.class
    },
    library = true)

public class RootModule {

  private final Context context;

  public RootModule(Context context) {
    this.context = context;
  }

  @Provides
  @Singleton
  public Context provideApplicationContext() {
    return context;
  }
}
