package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10589f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9911e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ErrorModuleDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.d */
/* loaded from: classes3.dex */
public final class C10420d implements InterfaceC10592g0 {

    /* renamed from: f */
    public static final C10420d f40237f = new C10420d();

    /* renamed from: g */
    private static final C10163f f40238g;

    /* renamed from: h */
    private static final List<InterfaceC10592g0> f40239h;

    /* renamed from: i */
    private static final List<InterfaceC10592g0> f40240i;

    /* renamed from: j */
    private static final Set<InterfaceC10592g0> f40241j;

    /* renamed from: k */
    private static final AbstractC9914h f40242k;

    static {
        C10163f c10163fM35451D = C10163f.m35451D(EnumC10418b.ERROR_MODULE.m36988k());
        C9801m.m32345e(c10163fM35451D, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f40238g = c10163fM35451D;
        f40239h = C10817u.m38888j();
        f40240i = C10817u.m38888j();
        f40241j = C10822w0.m38917d();
        f40242k = C9911e.f37452h.m32704a();
    }

    private C10420d() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: I0 */
    public <T> T mo37016I0(C10589f0<T> c10589f0) {
        C9801m.m32346f(c10589f0, "capability");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        C9801m.m32346f(interfaceC10628o, "visitor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: N */
    public InterfaceC10636p0 mo37018N(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    public InterfaceC10609m mo37019a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: b */
    public InterfaceC10609m mo32876b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: e0 */
    public boolean mo37020e0(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "targetModule");
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        return InterfaceC10620g.f40808c.m37735b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10598i0
    public C10163f getName() {
        return m37024v();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: o */
    public AbstractC9914h mo37021o() {
        return f40242k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: p */
    public Collection<C10160c> mo37022p(C10160c c10160c, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(function1, "nameFilter");
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: t0 */
    public List<InterfaceC10592g0> mo37023t0() {
        return f40240i;
    }

    /* renamed from: v */
    public C10163f m37024v() {
        return f40238g;
    }
}
