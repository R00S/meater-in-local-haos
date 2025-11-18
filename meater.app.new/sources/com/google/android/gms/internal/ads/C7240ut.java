package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.ut */
/* loaded from: classes2.dex */
final class C7240ut {

    /* renamed from: a */
    private final ConcurrentHashMap<C7277vt, List<Throwable>> f20655a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f20656b = new ReferenceQueue<>();

    C7240ut() {
    }

    /* renamed from: a */
    public final List<Throwable> m15931a(Throwable th, boolean z) {
        Reference<? extends Throwable> referencePoll = this.f20656b.poll();
        while (referencePoll != null) {
            this.f20655a.remove(referencePoll);
            referencePoll = this.f20656b.poll();
        }
        List<Throwable> list = this.f20655a.get(new C7277vt(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f20655a.putIfAbsent(new C7277vt(th, this.f20656b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
