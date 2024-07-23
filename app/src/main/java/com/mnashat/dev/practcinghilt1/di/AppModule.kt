package com.mnashat.dev.practcinghilt1.di

import com.mnashat.dev.practcinghilt1.di.qualifiers.AlternativeString
import com.mnashat.dev.practcinghilt1.di.qualifiers.DefaultString
import com.mnashat.dev.practcinghilt1.repo.DataRepoImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDataRepoImp( ): DataRepoImp {
      return  DataRepoImp()
    }


    @Provides
    @Singleton
    @AlternativeString
    fun provideAlternativeString() : String{
        return "Alternative String"
    }

    @Provides
    @Singleton
    @DefaultString
    fun provideDefaultString() : String{
        return "Default String"
    }


}