package com.garcilomanuel.cleangames.app.di;

import com.garcilomanuel.cleangames.data.GameDataSource;
import com.garcilomanuel.cleangames.data.giantbomb.GiantBombRetrofitSource;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by Manuel García.
 */

@Module(
    complete = false,
    library = true)
public class DataSourceModule {

  @Provides
  @Singleton
  GameDataSource providesGameDataSource() {
    return new GiantBombRetrofitSource();
  }
}