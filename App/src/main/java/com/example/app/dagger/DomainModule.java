package com.example.app.dagger;

import com.example.domain.interactor.GetUserDetailsUseCase;
import com.example.domain.interactor.GetUserDetailsUseCaseImpl;
import com.example.domain.interactor.GetUserListUseCase;
import com.example.domain.interactor.GetUserListUseCaseImpl;
import com.example.presentation.page.userdetails.presenter.UserDetailsPresenter_;
import com.example.presentation.userlist.UserListPresenter_;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {UserDetailsPresenter_.class, UserListPresenter_.class},
        complete = false
)
public class DomainModule {

    @Provides
    public GetUserDetailsUseCase provideGetUserDetailsUseCase() {
        return new GetUserDetailsUseCaseImpl();
    }

    @Provides
    public GetUserListUseCase provideGetUserListUseCase() {
        return new GetUserListUseCaseImpl();
    }
}
