package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: com.google.android.gms.tasks.c */
/* loaded from: classes2.dex */
final class C7897c<T> implements InterfaceC7896b<T> {

    /* renamed from: a */
    private final Object f29518a = new Object();

    /* renamed from: b */
    private final int f29519b;

    /* renamed from: c */
    private final C7917x f29520c;

    /* renamed from: d */
    private int f29521d;

    /* renamed from: e */
    private int f29522e;

    /* renamed from: f */
    private int f29523f;

    /* renamed from: g */
    private Exception f29524g;

    /* renamed from: h */
    private boolean f29525h;

    public C7897c(int i2, C7917x c7917x) {
        this.f29519b = i2;
        this.f29520c = c7917x;
    }

    /* renamed from: a */
    private final void m23670a() {
        if (this.f29521d + this.f29522e + this.f29523f == this.f29519b) {
            if (this.f29524g == null) {
                if (this.f29525h) {
                    this.f29520c.m23694s();
                    return;
                } else {
                    this.f29520c.m23693r(null);
                    return;
                }
            }
            this.f29520c.m23692q(new ExecutionException(this.f29522e + " out of " + this.f29519b + " underlying tasks failed", this.f29524g));
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* renamed from: b */
    public final void mo23636b() {
        synchronized (this.f29518a) {
            this.f29523f++;
            this.f29525h = true;
            m23670a();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: c */
    public final void mo23637c(Exception exc) {
        synchronized (this.f29518a) {
            this.f29522e++;
            this.f29524g = exc;
            m23670a();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T t) {
        synchronized (this.f29518a) {
            this.f29521d++;
            m23670a();
        }
    }
}
