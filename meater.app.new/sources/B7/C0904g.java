package B7;

import A7.AbstractC0851e;
import A7.InterfaceC0849c;
import A7.InterfaceC0850d;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: B7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0904g implements InterfaceC0850d.a {

    /* renamed from: B, reason: collision with root package name */
    private final AbstractC0851e.b f1828B;

    public C0904g(AbstractC0851e.b bVar) {
        this.f1828B = bVar;
    }

    @Override // A7.InterfaceC0850d.a
    public final void a(InterfaceC0849c interfaceC0849c, int i10, int i11) {
        this.f1828B.c(C0907h.p(interfaceC0849c), i10, i11);
    }

    @Override // A7.InterfaceC0850d.a
    public final void b(InterfaceC0849c interfaceC0849c) {
        this.f1828B.b(C0907h.p(interfaceC0849c));
    }

    @Override // A7.InterfaceC0850d.a
    public final void d(InterfaceC0849c interfaceC0849c, int i10, int i11) {
        this.f1828B.a(C0907h.p(interfaceC0849c), i10, i11);
    }

    @Override // A7.InterfaceC0850d.a
    public final void e(InterfaceC0849c interfaceC0849c, int i10, int i11) {
        this.f1828B.d(C0907h.p(interfaceC0849c), i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0904g.class != obj.getClass()) {
            return false;
        }
        return this.f1828B.equals(((C0904g) obj).f1828B);
    }

    public final int hashCode() {
        return this.f1828B.hashCode();
    }
}
