package kotlin.reflect.p371y.internal.p374j0.p415l;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10403n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k;
import okhttp3.HttpUrl;

/* compiled from: StubTypes.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u0 */
/* loaded from: classes3.dex */
public final class C10416u0 extends AbstractC10343e implements InterfaceC10444k {

    /* renamed from: k */
    private final InterfaceC10345e1 f40225k;

    /* renamed from: l */
    private final InterfaceC10251h f40226l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10416u0(InterfaceC10403n interfaceC10403n, boolean z, InterfaceC10345e1 interfaceC10345e1) {
        super(interfaceC10403n, z);
        C9801m.m32346f(interfaceC10403n, "originalTypeVariable");
        C9801m.m32346f(interfaceC10345e1, "constructor");
        this.f40225k = interfaceC10345e1;
        this.f40226l = interfaceC10403n.mo36004o().m32791i().mo33553q();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: O0 */
    public InterfaceC10345e1 mo35993O0() {
        return this.f40225k;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10343e
    /* renamed from: Y0 */
    public AbstractC10343e mo36632Y0(boolean z) {
        return new C10416u0(m36631X0(), z, mo35993O0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10343e, kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0
    /* renamed from: q */
    public InterfaceC10251h mo33553q() {
        return this.f40226l;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stub (BI): ");
        sb.append(m36631X0());
        sb.append(mo33691P0() ? "?" : HttpUrl.FRAGMENT_ENCODE_SET);
        return sb.toString();
    }
}
