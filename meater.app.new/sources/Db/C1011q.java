package Db;

import kotlin.jvm.internal.C3862t;

/* compiled from: DeserializedClassDataFinder.kt */
/* renamed from: Db.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1011q implements InterfaceC1004j {

    /* renamed from: a, reason: collision with root package name */
    private final Ra.O f3723a;

    public C1011q(Ra.O packageFragmentProvider) {
        C3862t.g(packageFragmentProvider, "packageFragmentProvider");
        this.f3723a = packageFragmentProvider;
    }

    @Override // Db.InterfaceC1004j
    public C1003i a(qb.b classId) {
        C1003i c1003iA;
        C3862t.g(classId, "classId");
        for (Ra.N n10 : Ra.T.c(this.f3723a, classId.f())) {
            if ((n10 instanceof r) && (c1003iA = ((r) n10).F0().a(classId)) != null) {
                return c1003iA;
            }
        }
        return null;
    }
}
