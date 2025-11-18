package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: classes2.dex */
abstract class AbstractC6400w {

    /* renamed from: a */
    private final zabd f17467a;

    protected AbstractC6400w(zabd zabdVar) {
        this.f17467a = zabdVar;
    }

    /* renamed from: a */
    protected abstract void mo14060a();

    /* renamed from: b */
    public final void m14105b(zabe zabeVar) {
        zabeVar.f17533f.lock();
        try {
            if (zabeVar.f17543p != this.f17467a) {
                return;
            }
            mo14060a();
        } finally {
            zabeVar.f17533f.unlock();
        }
    }
}
