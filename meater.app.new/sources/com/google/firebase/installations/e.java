package com.google.firebase.installations;

import m9.AbstractC4014d;
import z7.C5209k;

/* compiled from: GetIdListener.java */
/* loaded from: classes2.dex */
class e implements g {

    /* renamed from: a, reason: collision with root package name */
    final C5209k<String> f38204a;

    public e(C5209k<String> c5209k) {
        this.f38204a = c5209k;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(AbstractC4014d abstractC4014d) {
        if (!abstractC4014d.l() && !abstractC4014d.k() && !abstractC4014d.i()) {
            return false;
        }
        this.f38204a.e(abstractC4014d.d());
        return true;
    }
}
