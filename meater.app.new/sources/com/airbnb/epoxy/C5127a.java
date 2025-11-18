package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0515k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;

/* compiled from: ActivityRecyclerPool.kt */
/* renamed from: com.airbnb.epoxy.a */
/* loaded from: classes.dex */
public final class C5127a {

    /* renamed from: a */
    private final ArrayList<PoolReference> f12187a = new ArrayList<>(5);

    /* renamed from: a */
    public final void m9195a(PoolReference poolReference) {
        C9801m.m32347g(poolReference, "pool");
        if (C5129b.m9201a(poolReference.m9183c())) {
            poolReference.getViewPool().mo4249b();
            this.f12187a.remove(poolReference);
        }
    }

    /* renamed from: b */
    public final PoolReference m9196b(Context context, Function0<? extends RecyclerView.C0608u> function0) {
        AbstractC0511g lifecycle;
        C9801m.m32347g(context, "context");
        C9801m.m32347g(function0, "poolFactory");
        Iterator<PoolReference> it = this.f12187a.iterator();
        C9801m.m32342b(it, "pools.iterator()");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            PoolReference next = it.next();
            C9801m.m32342b(next, "iterator.next()");
            PoolReference poolReference2 = next;
            if (poolReference2.m9183c() == context) {
                if (poolReference != null) {
                    throw new IllegalStateException("A pool was already found");
                }
                poolReference = poolReference2;
            } else if (C5129b.m9201a(poolReference2.m9183c())) {
                poolReference2.getViewPool().mo4249b();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(context, function0.invoke(), this);
            boolean z = context instanceof InterfaceC0515k;
            Object obj = context;
            if (!z) {
                obj = null;
            }
            InterfaceC0515k interfaceC0515k = (InterfaceC0515k) obj;
            if (interfaceC0515k != null && (lifecycle = interfaceC0515k.getLifecycle()) != null) {
                lifecycle.mo3861a(poolReference);
            }
            this.f12187a.add(poolReference);
        }
        return poolReference;
    }
}
