package com.apptionlabs.meater_app.app;

import android.view.InterfaceC0391e;
import android.view.f0;
import android.view.t;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import wh.m;

/* compiled from: MEATERAPPLifeCycleObserver.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/apptionlabs/meater_app/app/MEATERAPPLifeCycleObserver;", "Landroidx/lifecycle/e;", "Landroidx/lifecycle/t;", "owner", "Lih/u;", "onStop", "onStart", "Ljava/lang/ref/WeakReference;", "Lcom/apptionlabs/meater_app/app/MEATERAPPLifeCycleObserver$a;", "q", "Ljava/lang/ref/WeakReference;", "listener", "<init>", "(Ljava/lang/ref/WeakReference;)V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class MEATERAPPLifeCycleObserver implements InterfaceC0391e {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<a> listener;

    /* compiled from: MEATERAPPLifeCycleObserver.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/apptionlabs/meater_app/app/MEATERAPPLifeCycleObserver$a;", "", "", "wentBackground", "Lih/u;", "s", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface a {
        void s(boolean z10);
    }

    public MEATERAPPLifeCycleObserver(WeakReference<a> weakReference) {
        m.f(weakReference, "listener");
        this.listener = weakReference;
        f0.INSTANCE.a().getLifecycle().a(this);
    }

    @Override // android.view.InterfaceC0391e
    public void onStart(t tVar) {
        m.f(tVar, "owner");
        a aVar = this.listener.get();
        if (aVar != null) {
            aVar.s(false);
        }
    }

    @Override // android.view.InterfaceC0391e
    public void onStop(t tVar) {
        m.f(tVar, "owner");
        a aVar = this.listener.get();
        if (aVar != null) {
            aVar.s(true);
        }
    }
}
