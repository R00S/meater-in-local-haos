package com.google.firebase.installations;

import m9.AbstractC4014d;
import z7.C5209k;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes2.dex */
class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final h f38202a;

    /* renamed from: b, reason: collision with root package name */
    private final C5209k<f> f38203b;

    public d(h hVar, C5209k<f> c5209k) {
        this.f38202a = hVar;
        this.f38203b = c5209k;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        this.f38203b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(AbstractC4014d abstractC4014d) {
        if (!abstractC4014d.k() || this.f38202a.f(abstractC4014d)) {
            return false;
        }
        this.f38203b.c(f.a().b(abstractC4014d.b()).d(abstractC4014d.c()).c(abstractC4014d.h()).a());
        return true;
    }
}
