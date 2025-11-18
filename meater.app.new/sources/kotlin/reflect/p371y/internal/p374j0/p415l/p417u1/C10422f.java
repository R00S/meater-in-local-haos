package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.collections.C10820v0;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;

/* compiled from: ErrorScope.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.f */
/* loaded from: classes3.dex */
public class C10422f implements InterfaceC10251h {

    /* renamed from: b */
    private final EnumC10423g f40244b;

    /* renamed from: c */
    private final String f40245c;

    public C10422f(EnumC10423g enumC10423g, String... strArr) {
        C9801m.m32346f(enumC10423g, "kind");
        C9801m.m32346f(strArr, "formatParams");
        this.f40244b = enumC10423g;
        String strM37042k = enumC10423g.m37042k();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strM37042k, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C9801m.m32345e(str, "format(this, *args)");
        this.f40245c = str;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        return C10822w0.m38917d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        return C10822w0.m38917d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        return C10822w0.m38917d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        String str = String.format(EnumC10418b.ERROR_CLASS.m36988k(), Arrays.copyOf(new Object[]{c10163f}, 1));
        C9801m.m32345e(str, "format(this, *args)");
        C10163f c10163fM35451D = C10163f.m35451D(str);
        C9801m.m32345e(c10163fM35451D, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new C10417a(c10163fM35451D);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return C10820v0.m38916c(new C10419c(C10427k.f40355a.m37061h()));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return C10427k.f40355a.m37063j();
    }

    /* renamed from: j */
    protected final String m37040j() {
        return this.f40245c;
    }

    public String toString() {
        return "ErrorScope{" + this.f40245c + '}';
    }
}
