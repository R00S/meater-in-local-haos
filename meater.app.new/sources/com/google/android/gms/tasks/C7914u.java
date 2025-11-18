package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.u */
/* loaded from: classes2.dex */
final class C7914u {

    /* renamed from: a */
    private final Object f29561a = new Object();

    /* renamed from: b */
    private Queue f29562b;

    /* renamed from: c */
    private boolean f29563c;

    C7914u() {
    }

    /* renamed from: a */
    public final void m23686a(InterfaceC7913t interfaceC7913t) {
        synchronized (this.f29561a) {
            if (this.f29562b == null) {
                this.f29562b = new ArrayDeque();
            }
            this.f29562b.add(interfaceC7913t);
        }
    }

    /* renamed from: b */
    public final void m23687b(Task task) {
        InterfaceC7913t interfaceC7913t;
        synchronized (this.f29561a) {
            if (this.f29562b != null && !this.f29563c) {
                this.f29563c = true;
                while (true) {
                    synchronized (this.f29561a) {
                        interfaceC7913t = (InterfaceC7913t) this.f29562b.poll();
                        if (interfaceC7913t == null) {
                            this.f29563c = false;
                            return;
                        }
                    }
                    interfaceC7913t.mo23674a(task);
                }
            }
        }
    }
}
