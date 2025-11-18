package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0;

import kotlin.Lazy;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10078x;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m.C10010c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: context.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.g */
/* loaded from: classes2.dex */
public final class C9990g {

    /* renamed from: a */
    private final C9985b f37998a;

    /* renamed from: b */
    private final InterfaceC9994k f37999b;

    /* renamed from: c */
    private final Lazy<C10078x> f38000c;

    /* renamed from: d */
    private final Lazy f38001d;

    /* renamed from: e */
    private final C10010c f38002e;

    public C9990g(C9985b c9985b, InterfaceC9994k interfaceC9994k, Lazy<C10078x> lazy) {
        C9801m.m32346f(c9985b, "components");
        C9801m.m32346f(interfaceC9994k, "typeParameterResolver");
        C9801m.m32346f(lazy, "delegateForDefaultTypeQualifiers");
        this.f37998a = c9985b;
        this.f37999b = interfaceC9994k;
        this.f38000c = lazy;
        this.f38001d = lazy;
        this.f38002e = new C10010c(this, interfaceC9994k);
    }

    /* renamed from: a */
    public final C9985b m33282a() {
        return this.f37998a;
    }

    /* renamed from: b */
    public final C10078x m33283b() {
        return (C10078x) this.f38001d.getValue();
    }

    /* renamed from: c */
    public final Lazy<C10078x> m33284c() {
        return this.f38000c;
    }

    /* renamed from: d */
    public final InterfaceC10592g0 m33285d() {
        return this.f37998a.m33253m();
    }

    /* renamed from: e */
    public final InterfaceC10330n m33286e() {
        return this.f37998a.m33261u();
    }

    /* renamed from: f */
    public final InterfaceC9994k m33287f() {
        return this.f37999b;
    }

    /* renamed from: g */
    public final C10010c m33288g() {
        return this.f38002e;
    }
}
