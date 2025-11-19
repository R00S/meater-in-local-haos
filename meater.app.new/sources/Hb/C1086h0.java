package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinTypeFactory.kt */
/* renamed from: Hb.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1086h0 extends C {

    /* renamed from: D, reason: collision with root package name */
    private final u0 f5752D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1086h0(AbstractC1082f0 delegate, u0 attributes) {
        super(delegate);
        C3862t.g(delegate, "delegate");
        C3862t.g(attributes, "attributes");
        this.f5752D = attributes;
    }

    @Override // Hb.B, Hb.U
    public u0 N0() {
        return this.f5752D;
    }

    @Override // Hb.B
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C1086h0 Z0(AbstractC1082f0 delegate) {
        C3862t.g(delegate, "delegate");
        return new C1086h0(delegate, N0());
    }
}
