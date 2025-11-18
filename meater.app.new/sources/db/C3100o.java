package db;

import Ra.InterfaceC1692e;
import hb.InterfaceC3514g;
import kotlin.jvm.internal.C3862t;
import yb.C5147c;

/* compiled from: ModuleClassResolver.kt */
/* renamed from: db.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3100o implements InterfaceC3099n {

    /* renamed from: a, reason: collision with root package name */
    public C5147c f39924a;

    @Override // db.InterfaceC3099n
    public InterfaceC1692e a(InterfaceC3514g javaClass) {
        C3862t.g(javaClass, "javaClass");
        return b().b(javaClass);
    }

    public final C5147c b() {
        C5147c c5147c = this.f39924a;
        if (c5147c != null) {
            return c5147c;
        }
        C3862t.u("resolver");
        return null;
    }

    public final void c(C5147c c5147c) {
        C3862t.g(c5147c, "<set-?>");
        this.f39924a = c5147c;
    }
}
