package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
public final class B7 extends AbstractC2535n {

    /* renamed from: D, reason: collision with root package name */
    private final Callable<Object> f33674D;

    public B7(String str, Callable<Object> callable) {
        super(str);
        this.f33674D = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2535n
    public final InterfaceC2574s a(Z2 z22, List<InterfaceC2574s> list) {
        try {
            return C2432a4.b(this.f33674D.call());
        } catch (Exception unused) {
            return InterfaceC2574s.f34292p;
        }
    }
}
