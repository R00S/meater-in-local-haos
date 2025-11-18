package cm.aptoide.p092pt.view.recycler.widget;

import android.view.View;
import androidx.fragment.app.ActivityC0468d;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import p456rx.p474t.C11426b;

/* loaded from: classes.dex */
public abstract class Widget<T extends Displayable> extends RecyclerView.AbstractC0590c0 {
    private ActivityNavigator activityNavigator;
    protected C11426b compositeSubscription;
    private final FragmentNavigator fragmentNavigator;

    public Widget(View view) {
        super(view);
        this.fragmentNavigator = ((ActivityResultNavigator) getContext()).getFragmentNavigator();
        this.activityNavigator = ((ActivityResultNavigator) getContext()).getActivityNavigator();
        try {
            assignViews(view);
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
        }
    }

    protected abstract void assignViews(View view);

    public abstract void bindView(T t, int i2);

    protected ActivityNavigator getActivityNavigator() {
        return this.activityNavigator;
    }

    public ActivityC0468d getContext() {
        return (ActivityC0468d) this.itemView.getContext();
    }

    protected FragmentNavigator getFragmentNavigator() {
        return this.fragmentNavigator;
    }

    public View getRootView() {
        return getFragmentNavigator().peekLast().getView();
    }

    public void internalBindView(T t, int i2) {
        if (this.compositeSubscription == null) {
            this.compositeSubscription = new C11426b();
        }
        t.setVisible(true);
        bindView(t, i2);
    }

    public void unbindView() {
        C11426b c11426b = this.compositeSubscription;
        if (c11426b == null || c11426b.isUnsubscribed()) {
            return;
        }
        this.compositeSubscription.m40668b();
    }
}
