package mc;

import ic.InterfaceC3693a;
import kc.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: BuiltInSerializers.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lmc/n;", "Lic/a;", "LVb/a;", "<init>", "()V", "Llc/c;", "encoder", "value", "Loa/F;", "e", "(Llc/c;J)V", "Lkc/f;", "b", "Lkc/f;", "c", "()Lkc/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4034n implements InterfaceC3693a<Vb.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C4034n f45504a = new C4034n();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final kc.f descriptor = new PrimitiveDescriptor("kotlin.time.Duration", e.i.f43895a);

    private C4034n() {
    }

    @Override // ic.InterfaceC3698f
    public /* bridge */ /* synthetic */ void a(lc.c cVar, Object obj) {
        e(cVar, ((Vb.a) obj).getRawValue());
    }

    @Override // ic.InterfaceC3693a, ic.InterfaceC3698f
    /* renamed from: c */
    public kc.f getDescriptor() {
        return descriptor;
    }

    public void e(lc.c encoder, long value) {
        C3862t.g(encoder, "encoder");
        encoder.z(Vb.a.T(value));
    }
}
