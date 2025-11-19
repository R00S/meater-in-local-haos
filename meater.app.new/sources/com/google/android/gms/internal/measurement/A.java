package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    final List<Z> f33564a = new ArrayList();

    protected A() {
    }

    final InterfaceC2574s a(String str) {
        if (!this.f33564a.contains(Y1.c(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    public abstract InterfaceC2574s b(String str, Z2 z22, List<InterfaceC2574s> list);
}
