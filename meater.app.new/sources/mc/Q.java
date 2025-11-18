package mc;

import ic.InterfaceC3693a;
import kc.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Primitives.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lmc/Q;", "Lic/a;", "", "<init>", "()V", "Llc/c;", "encoder", "value", "Loa/F;", "e", "(Llc/c;Ljava/lang/String;)V", "Lkc/f;", "b", "Lkc/f;", "c", "()Lkc/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Q implements InterfaceC3693a<String> {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f45475a = new Q();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final kc.f descriptor = new PrimitiveDescriptor("kotlin.String", e.i.f43895a);

    private Q() {
    }

    @Override // ic.InterfaceC3693a, ic.InterfaceC3698f
    public kc.f c() {
        return descriptor;
    }

    @Override // ic.InterfaceC3698f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(lc.c encoder, String value) {
        C3862t.g(encoder, "encoder");
        C3862t.g(value, "value");
        encoder.z(value);
    }
}
