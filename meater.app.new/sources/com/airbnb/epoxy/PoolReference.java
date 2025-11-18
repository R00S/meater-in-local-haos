package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0514j;
import androidx.lifecycle.InterfaceC0523s;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;

/* compiled from: ActivityRecyclerPool.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u000fR\u0019\u0010\u0015\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m32267d2 = {"Lcom/airbnb/epoxy/PoolReference;", "Landroidx/lifecycle/j;", "Lkotlin/u;", "b", "()V", "onContextDestroyed", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "a", "Ljava/lang/ref/WeakReference;", "contextReference", "Lcom/airbnb/epoxy/a;", "c", "Lcom/airbnb/epoxy/a;", "parent", "()Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView$u;", "d", "()Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$u;Lcom/airbnb/epoxy/a;)V", "epoxy-adapter_release"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class PoolReference implements InterfaceC0514j {

    /* renamed from: a, reason: from kotlin metadata */
    private final WeakReference<Context> contextReference;

    /* renamed from: b, reason: from kotlin metadata */
    private final RecyclerView.C0608u viewPool;

    /* renamed from: c, reason: from kotlin metadata */
    private final C5127a parent;

    public PoolReference(Context context, RecyclerView.C0608u c0608u, C5127a c5127a) {
        C9801m.m32347g(context, "context");
        C9801m.m32347g(c0608u, "viewPool");
        C9801m.m32347g(c5127a, "parent");
        this.viewPool = c0608u;
        this.parent = c5127a;
        this.contextReference = new WeakReference<>(context);
    }

    /* renamed from: b */
    public final void m9182b() {
        this.parent.m9195a(this);
    }

    /* renamed from: c */
    public final Context m9183c() {
        return this.contextReference.get();
    }

    /* renamed from: d, reason: from getter */
    public final RecyclerView.C0608u getViewPool() {
        return this.viewPool;
    }

    @InterfaceC0523s(AbstractC0511g.b.ON_DESTROY)
    public final void onContextDestroyed() {
        m9182b();
    }
}
