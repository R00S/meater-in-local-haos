package Ra;

import Ab.k;
import Hb.y0;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import xb.C5087e;

/* compiled from: ScopesHolderForClass.kt */
/* loaded from: classes3.dex */
public final class f0<T extends Ab.k> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1692e f15154a;

    /* renamed from: b, reason: collision with root package name */
    private final Ba.l<Ib.g, T> f15155b;

    /* renamed from: c, reason: collision with root package name */
    private final Ib.g f15156c;

    /* renamed from: d, reason: collision with root package name */
    private final Gb.i f15157d;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f15153f = {kotlin.jvm.internal.P.h(new kotlin.jvm.internal.G(kotlin.jvm.internal.P.b(f0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e, reason: collision with root package name */
    public static final a f15152e = new a(null);

    /* compiled from: ScopesHolderForClass.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final <T extends Ab.k> f0<T> a(InterfaceC1692e classDescriptor, Gb.n storageManager, Ib.g kotlinTypeRefinerForOwnerModule, Ba.l<? super Ib.g, ? extends T> scopeFactory) {
            C3862t.g(classDescriptor, "classDescriptor");
            C3862t.g(storageManager, "storageManager");
            C3862t.g(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            C3862t.g(scopeFactory, "scopeFactory");
            return new f0<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        private a() {
        }
    }

    public /* synthetic */ f0(InterfaceC1692e interfaceC1692e, Gb.n nVar, Ba.l lVar, Ib.g gVar, C3854k c3854k) {
        this(interfaceC1692e, nVar, lVar, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ab.k d(f0 f0Var, Ib.g gVar) {
        return f0Var.f15155b.invoke(gVar);
    }

    private final T e() {
        return (T) Gb.m.a(this.f15157d, this, f15153f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ab.k f(f0 f0Var) {
        return f0Var.f15155b.invoke(f0Var.f15156c);
    }

    public final T c(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(C5087e.s(this.f15154a))) {
            return (T) e();
        }
        y0 y0VarL = this.f15154a.l();
        C3862t.f(y0VarL, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.e(y0VarL) ? (T) e() : (T) kotlinTypeRefiner.c(this.f15154a, new e0(this, kotlinTypeRefiner));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f0(InterfaceC1692e interfaceC1692e, Gb.n nVar, Ba.l<? super Ib.g, ? extends T> lVar, Ib.g gVar) {
        this.f15154a = interfaceC1692e;
        this.f15155b = lVar;
        this.f15156c = gVar;
        this.f15157d = nVar.g(new d0(this));
    }
}
