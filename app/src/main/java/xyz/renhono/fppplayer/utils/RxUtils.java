package xyz.renhono.fppplayer.utils;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by RenHono on 2017/4/24 0024.
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength.
 * The only way is up.
 */

public class RxUtils {

    private CompositeSubscription compositeSubscription = new CompositeSubscription();

    private RxUtils() {
    }

    public static RxUtils getInstance() {
        return new RxUtils();
    }

    public void clearSubscription() {
        if (compositeSubscription != null && !compositeSubscription.isUnsubscribed()) {
            compositeSubscription.clear();
        }
    }

    public void unSubscription() {
        if (compositeSubscription != null && !compositeSubscription.isUnsubscribed()) {
            compositeSubscription.unsubscribe();
        }
    }

    public void addSubscription(Subscription subscription) {
        if (compositeSubscription != null) {
            compositeSubscription.add(subscription);
        }
    }
}
