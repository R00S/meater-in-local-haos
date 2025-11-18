package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* loaded from: classes2.dex */
final class q40 implements ValueCallback<String> {

    /* renamed from: a */
    private final /* synthetic */ p40 f20373a;

    q40(p40 p40Var) {
        this.f20373a = p40Var;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        p40 p40Var = this.f20373a;
        p40Var.f20278j.m20635c(p40Var.f20275g, p40Var.f20276h, str, p40Var.f20277i);
    }
}
