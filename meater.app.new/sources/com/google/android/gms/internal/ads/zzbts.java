package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class zzbts<ListenerT> {

    /* renamed from: f */
    private final Map<ListenerT, Executor> f23551f = new HashMap();

    protected zzbts(Set<zzbuz<ListenerT>> set) {
        m18329X(set);
    }

    /* renamed from: X */
    private final synchronized void m18329X(Set<zzbuz<ListenerT>> set) {
        Iterator<zzbuz<ListenerT>> it = set.iterator();
        while (it.hasNext()) {
            m18331U(it.next());
        }
    }

    /* renamed from: T */
    protected final synchronized void m18330T(final zzbtu<ListenerT> zzbtuVar) {
        for (Map.Entry<ListenerT, Executor> entry : this.f23551f.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(zzbtuVar, key) { // from class: com.google.android.gms.internal.ads.te

                /* renamed from: f */
                private final zzbtu f20567f;

                /* renamed from: g */
                private final Object f20568g;

                {
                    this.f20567f = zzbtuVar;
                    this.f20568g = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f20567f.mo14761a(this.f20568g);
                    } catch (Throwable th) {
                        zzk.zzlk().m17053h(th, "EventEmitter.notify");
                        zzawz.m17081l("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    /* renamed from: U */
    public final synchronized void m18331U(zzbuz<ListenerT> zzbuzVar) {
        m18332V(zzbuzVar.f23593a, zzbuzVar.f23594b);
    }

    /* renamed from: V */
    public final synchronized void m18332V(ListenerT listenert, Executor executor) {
        this.f23551f.put(listenert, executor);
    }
}
