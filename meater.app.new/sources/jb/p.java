package jb;

import Db.InterfaceC1017x;
import Hb.AbstractC1082f0;
import Hb.U;
import Hb.X;
import fb.C3364k;
import kotlin.jvm.internal.C3862t;
import lb.C3937q;
import ob.C4176a;

/* compiled from: JavaFlexibleTypeDeserializer.kt */
/* loaded from: classes3.dex */
public final class p implements InterfaceC1017x {

    /* renamed from: a, reason: collision with root package name */
    public static final p f43660a = new p();

    private p() {
    }

    @Override // Db.InterfaceC1017x
    public U a(C3937q proto, String flexibleId, AbstractC1082f0 lowerBound, AbstractC1082f0 upperBound) {
        C3862t.g(proto, "proto");
        C3862t.g(flexibleId, "flexibleId");
        C3862t.g(lowerBound, "lowerBound");
        C3862t.g(upperBound, "upperBound");
        return !C3862t.b(flexibleId, "kotlin.jvm.PlatformType") ? Jb.l.d(Jb.k.f7772k0, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.y(C4176a.f46662g) ? new C3364k(lowerBound, upperBound) : X.e(lowerBound, upperBound);
    }
}
