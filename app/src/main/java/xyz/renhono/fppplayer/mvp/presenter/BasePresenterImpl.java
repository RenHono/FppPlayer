package xyz.renhono.fppplayer.mvp.presenter;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class BasePresenterImpl<T> {

    T view;

    public BasePresenterImpl(T view) {
        this.view = view;
    }
}
