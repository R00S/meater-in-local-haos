package Ob;

import Hb.AbstractC1082f0;
import Hb.U;
import Ob.f;
import Ra.InterfaceC1712z;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public abstract class v implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f13623a;

    /* renamed from: b, reason: collision with root package name */
    private final Ba.l<Oa.j, U> f13624b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13625c;

    /* compiled from: modifierChecks.kt */
    public static final class a extends v {

        /* renamed from: d, reason: collision with root package name */
        public static final a f13626d = new a();

        private a() {
            super("Boolean", u.f13622B, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final U a(Oa.j jVar) {
            C3862t.g(jVar, "<this>");
            AbstractC1082f0 abstractC1082f0N = jVar.n();
            C3862t.f(abstractC1082f0N, "getBooleanType(...)");
            return abstractC1082f0N;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends v {

        /* renamed from: d, reason: collision with root package name */
        public static final b f13627d = new b();

        private b() {
            super("Int", w.f13629B, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final U a(Oa.j jVar) {
            C3862t.g(jVar, "<this>");
            AbstractC1082f0 abstractC1082f0D = jVar.D();
            C3862t.f(abstractC1082f0D, "getIntType(...)");
            return abstractC1082f0D;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends v {

        /* renamed from: d, reason: collision with root package name */
        public static final c f13628d = new c();

        private c() {
            super("Unit", x.f13630B, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final U a(Oa.j jVar) {
            C3862t.g(jVar, "<this>");
            AbstractC1082f0 abstractC1082f0Z = jVar.Z();
            C3862t.f(abstractC1082f0Z, "getUnitType(...)");
            return abstractC1082f0Z;
        }
    }

    public /* synthetic */ v(String str, Ba.l lVar, C3854k c3854k) {
        this(str, lVar);
    }

    @Override // Ob.f
    public String c() {
        return this.f13625c;
    }

    @Override // Ob.f
    public String d(InterfaceC1712z interfaceC1712z) {
        return f.a.a(this, interfaceC1712z);
    }

    @Override // Ob.f
    public boolean e(InterfaceC1712z functionDescriptor) {
        C3862t.g(functionDescriptor, "functionDescriptor");
        return C3862t.b(functionDescriptor.getReturnType(), this.f13624b.invoke(C5087e.m(functionDescriptor)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v(String str, Ba.l<? super Oa.j, ? extends U> lVar) {
        this.f13623a = str;
        this.f13624b = lVar;
        this.f13625c = "must return " + str;
    }
}
