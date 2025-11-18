package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
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
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;

/* compiled from: ThrowingScope.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.l */
/* loaded from: classes3.dex */
public final class C10428l extends C10422f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10428l(EnumC10423g enumC10423g, String... strArr) {
        super(enumC10423g, (String[]) Arrays.copyOf(strArr, strArr.length));
        C9801m.m32346f(enumC10423g, "kind");
        C9801m.m32346f(strArr, "formatParams");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10422f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10422f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10422f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10422f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        throw new IllegalStateException(m37040j() + ", required name: " + c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10422f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        throw new IllegalStateException(m37040j());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10422f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: h */
    public Set<InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        throw new IllegalStateException(m37040j() + ", required name: " + c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10422f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: i */
    public Set<InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        throw new IllegalStateException(m37040j() + ", required name: " + c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10422f
    public String toString() {
        return "ThrowingScope{" + m37040j() + '}';
    }
}
