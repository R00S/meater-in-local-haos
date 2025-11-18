package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@zzard
/* renamed from: com.google.android.gms.internal.ads.c7 */
/* loaded from: classes2.dex */
final class C6552c7 {

    /* renamed from: a */
    private final Object f18412a = new Object();

    /* renamed from: b */
    private final List<Runnable> f18413b = new ArrayList();

    /* renamed from: c */
    private boolean f18414c = false;

    /* renamed from: a */
    public final void m14964a(final Runnable runnable, final Executor executor) {
        synchronized (this.f18412a) {
            if (this.f18414c) {
                executor.execute(runnable);
            } else {
                this.f18413b.add(new Runnable(executor, runnable) { // from class: com.google.android.gms.internal.ads.d7

                    /* renamed from: f */
                    private final Executor f18499f;

                    /* renamed from: g */
                    private final Runnable f18500g;

                    {
                        this.f18499f = executor;
                        this.f18500g = runnable;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18499f.execute(this.f18500g);
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public final void m14965b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f18412a) {
            if (this.f18414c) {
                return;
            }
            arrayList.addAll(this.f18413b);
            this.f18413b.clear();
            this.f18414c = true;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Runnable) obj).run();
            }
        }
    }
}
