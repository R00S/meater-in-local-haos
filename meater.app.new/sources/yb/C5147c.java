package yb;

import Ab.k;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1695h;
import bb.InterfaceC2284j;
import db.C3095j;
import eb.C3268D;
import hb.EnumC3507D;
import hb.InterfaceC3514g;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaDescriptorResolver.kt */
/* renamed from: yb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5147c {

    /* renamed from: a, reason: collision with root package name */
    private final C3095j f53257a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2284j f53258b;

    public C5147c(C3095j packageFragmentProvider, InterfaceC2284j javaResolverCache) {
        C3862t.g(packageFragmentProvider, "packageFragmentProvider");
        C3862t.g(javaResolverCache, "javaResolverCache");
        this.f53257a = packageFragmentProvider;
        this.f53258b = javaResolverCache;
    }

    public final C3095j a() {
        return this.f53257a;
    }

    public final InterfaceC1692e b(InterfaceC3514g javaClass) {
        C3862t.g(javaClass, "javaClass");
        qb.c cVarF = javaClass.f();
        if (cVarF != null && javaClass.I() == EnumC3507D.f42371B) {
            return this.f53258b.a(cVarF);
        }
        InterfaceC3514g interfaceC3514gH = javaClass.h();
        if (interfaceC3514gH != null) {
            InterfaceC1692e interfaceC1692eB = b(interfaceC3514gH);
            k kVarX0 = interfaceC1692eB != null ? interfaceC1692eB.x0() : null;
            InterfaceC1695h interfaceC1695hG = kVarX0 != null ? kVarX0.g(javaClass.getName(), Za.d.f19643T) : null;
            if (interfaceC1695hG instanceof InterfaceC1692e) {
                return (InterfaceC1692e) interfaceC1695hG;
            }
            return null;
        }
        if (cVarF == null) {
            return null;
        }
        C3095j c3095j = this.f53257a;
        qb.c cVarE = cVarF.e();
        C3862t.f(cVarE, "parent(...)");
        C3268D c3268d = (C3268D) r.l0(c3095j.a(cVarE));
        if (c3268d != null) {
            return c3268d.O0(javaClass);
        }
        return null;
    }
}
