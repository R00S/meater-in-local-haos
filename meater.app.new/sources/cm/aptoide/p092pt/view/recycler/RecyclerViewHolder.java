package cm.aptoide.p092pt.view.recycler;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p456rx.InterfaceC11246k;
import p456rx.p474t.C11426b;

/* loaded from: classes.dex */
public abstract class RecyclerViewHolder<T> extends RecyclerView.AbstractC0590c0 {
    private C11426b compositeSubscription;
    private Context context;
    private T viewModel;

    protected RecyclerViewHolder(View view) {
        super(view);
        this.compositeSubscription = new C11426b();
        this.context = view.getContext();
    }

    protected void addSubscription(InterfaceC11246k interfaceC11246k) {
        this.compositeSubscription.m40667a(interfaceC11246k);
    }

    protected T getViewModel() {
        return this.viewModel;
    }

    public abstract int getViewResource();

    public final void releaseSubscriptions() {
        if (!this.compositeSubscription.m40669c() || this.compositeSubscription.isUnsubscribed()) {
            return;
        }
        this.compositeSubscription.unsubscribe();
    }

    protected abstract void update(Context context, T t);

    public final void updateViewModel(T t) {
        this.viewModel = t;
        update(this.context, t);
    }
}
