package com.garcilomanuel.cleangames.app.di;

import com.garcilomanuel.cleangames.app.executor.InteractorExecutor;
import com.garcilomanuel.cleangames.app.executor.MainThreadExecutor;
import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatform;
import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatformImp;
import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatforms;
import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatformsImp;
import com.garcilomanuel.cleangames.domain.interactor.platform.LoadPlatforms;
import com.garcilomanuel.cleangames.domain.interactor.platform.LoadPlatformsImp;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepository;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Manuel García.
 */
@Module(
    complete = false,
    library = true)
public class InteractorModule {

  @Provides
  @Singleton
  GetPlatforms providerGetPlatforms(MainThreadExecutor mainThreadExecutor,
      InteractorExecutor interactorExecutor, PlatformRepository platformRepository) {
    return new GetPlatformsImp(interactorExecutor, mainThreadExecutor, platformRepository);
  }

  @Provides
  @Singleton
  GetPlatform providerGetPlatform(MainThreadExecutor mainThreadExecutor,
      InteractorExecutor interactorExecutor, PlatformRepository platformRepository) {
    return new GetPlatformImp(interactorExecutor, mainThreadExecutor, platformRepository);
  }

  @Provides
  @Singleton
  LoadPlatforms providerLoadPlatforms(MainThreadExecutor mainThreadExecutor,
      InteractorExecutor interactorExecutor, PlatformRepository platformRepository) {
    return new LoadPlatformsImp(interactorExecutor, mainThreadExecutor, platformRepository);
  }
}
