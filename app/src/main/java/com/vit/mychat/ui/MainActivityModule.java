package com.vit.mychat.ui;

import com.vit.mychat.di.scope.PerFragment;
import com.vit.mychat.ui.base.module.BaseActivityModule;
import com.vit.mychat.ui.bot.BotFragment;
import com.vit.mychat.ui.bot.module.BotModule;
import com.vit.mychat.ui.chat.ChatFragment;
import com.vit.mychat.ui.chat.module.ChatModule;
import com.vit.mychat.ui.friends.FriendsFragment;
import com.vit.mychat.ui.friends.module.FriendsModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = ChatModule.class)
    abstract ChatFragment chatFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector(modules = FriendsModule.class)
    abstract FriendsFragment friendFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector(modules = BotModule.class)
    abstract BotFragment botFragmentInjector();
}
