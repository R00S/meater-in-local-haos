package Ob;

import Ob.g;
import Ra.InterfaceC1712z;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final qb.f f13534a;

    /* renamed from: b, reason: collision with root package name */
    private final Ub.k f13535b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<qb.f> f13536c;

    /* renamed from: d, reason: collision with root package name */
    private final Ba.l<InterfaceC1712z, String> f13537d;

    /* renamed from: e, reason: collision with root package name */
    private final f[] f13538e;

    /* compiled from: modifierChecks.kt */
    static final class a implements Ba.l {

        /* renamed from: B, reason: collision with root package name */
        public static final a f13539B = new a();

        a() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1712z interfaceC1712z) {
            C3862t.g(interfaceC1712z, "<this>");
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    static final class b implements Ba.l {

        /* renamed from: B, reason: collision with root package name */
        public static final b f13540B = new b();

        b() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1712z interfaceC1712z) {
            C3862t.g(interfaceC1712z, "<this>");
            return null;
        }
    }

    /* compiled from: modifierChecks.kt */
    static final class c implements Ba.l {

        /* renamed from: B, reason: collision with root package name */
        public static final c f13541B = new c();

        c() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC1712z interfaceC1712z) {
            C3862t.g(interfaceC1712z, "<this>");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(qb.f fVar, Ub.k kVar, Collection<qb.f> collection, Ba.l<? super InterfaceC1712z, String> lVar, f... fVarArr) {
        this.f13534a = fVar;
        this.f13535b = kVar;
        this.f13536c = collection;
        this.f13537d = lVar;
        this.f13538e = fVarArr;
    }

    public final g a(InterfaceC1712z functionDescriptor) {
        C3862t.g(functionDescriptor, "functionDescriptor");
        for (f fVar : this.f13538e) {
            String strD = fVar.d(functionDescriptor);
            if (strD != null) {
                return new g.b(strD);
            }
        }
        String strInvoke = this.f13537d.invoke(functionDescriptor);
        return strInvoke != null ? new g.b(strInvoke) : g.c.f13533b;
    }

    public final boolean b(InterfaceC1712z functionDescriptor) {
        C3862t.g(functionDescriptor, "functionDescriptor");
        if (this.f13534a != null && !C3862t.b(functionDescriptor.getName(), this.f13534a)) {
            return false;
        }
        if (this.f13535b != null) {
            String strJ = functionDescriptor.getName().j();
            C3862t.f(strJ, "asString(...)");
            if (!this.f13535b.b(strJ)) {
                return false;
            }
        }
        Collection<qb.f> collection = this.f13536c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ h(qb.f fVar, f[] fVarArr, Ba.l lVar, int i10, C3854k c3854k) {
        this(fVar, fVarArr, (Ba.l<? super InterfaceC1712z, String>) ((i10 & 4) != 0 ? a.f13539B : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(qb.f name, f[] checks, Ba.l<? super InterfaceC1712z, String> additionalChecks) {
        this(name, (Ub.k) null, (Collection<qb.f>) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        C3862t.g(name, "name");
        C3862t.g(checks, "checks");
        C3862t.g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Ub.k kVar, f[] fVarArr, Ba.l lVar, int i10, C3854k c3854k) {
        this(kVar, fVarArr, (Ba.l<? super InterfaceC1712z, String>) ((i10 & 4) != 0 ? b.f13540B : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Ub.k regex, f[] checks, Ba.l<? super InterfaceC1712z, String> additionalChecks) {
        this((qb.f) null, regex, (Collection<qb.f>) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        C3862t.g(regex, "regex");
        C3862t.g(checks, "checks");
        C3862t.g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, Ba.l lVar, int i10, C3854k c3854k) {
        this((Collection<qb.f>) collection, fVarArr, (Ba.l<? super InterfaceC1712z, String>) ((i10 & 4) != 0 ? c.f13541B : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection<qb.f> nameList, f[] checks, Ba.l<? super InterfaceC1712z, String> additionalChecks) {
        this((qb.f) null, (Ub.k) null, nameList, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        C3862t.g(nameList, "nameList");
        C3862t.g(checks, "checks");
        C3862t.g(additionalChecks, "additionalChecks");
    }
}
