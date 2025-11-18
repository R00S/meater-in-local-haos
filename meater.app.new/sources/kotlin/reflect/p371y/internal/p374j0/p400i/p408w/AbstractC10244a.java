package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: AbstractScopeAdapter.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10244a implements InterfaceC10251h {
    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return mo36122i().mo33311a(c10163f, interfaceC9939b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        return mo36122i().mo33312b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return mo36122i().mo33313c(c10163f, interfaceC9939b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        return mo36122i().mo33314d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        return mo36122i().mo33315e();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return mo36122i().mo33316f(c10163f, interfaceC9939b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        return mo36122i().mo33317g(c10247d, function1);
    }

    /* renamed from: h */
    public final InterfaceC10251h m36121h() {
        if (!(mo36122i() instanceof AbstractC10244a)) {
            return mo36122i();
        }
        InterfaceC10251h interfaceC10251hMo36122i = mo36122i();
        C9801m.m32344d(interfaceC10251hMo36122i, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC10244a) interfaceC10251hMo36122i).m36121h();
    }

    /* renamed from: i */
    protected abstract InterfaceC10251h mo36122i();
}
