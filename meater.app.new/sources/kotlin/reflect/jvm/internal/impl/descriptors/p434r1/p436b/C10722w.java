package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10019a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* compiled from: ReflectJavaPackage.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.w */
/* loaded from: classes2.dex */
public final class C10722w extends AbstractC10715p implements InterfaceC10044u {

    /* renamed from: a */
    private final C10160c f41210a;

    public C10722w(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        this.f41210a = c10160c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u
    /* renamed from: A */
    public Collection<InterfaceC10044u> mo33624A() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10019a> getAnnotations() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u
    /* renamed from: d */
    public C10160c mo33625d() {
        return this.f41210a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10722w) && C9801m.m32341a(mo33625d(), ((C10722w) obj).mo33625d());
    }

    public int hashCode() {
        return mo33625d().hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: l */
    public InterfaceC10019a mo33582l(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10025d
    /* renamed from: m */
    public boolean mo33583m() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u
    /* renamed from: q */
    public Collection<InterfaceC10030g> mo33626q(Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(function1, "nameFilter");
        return C10817u.m38888j();
    }

    public String toString() {
        return C10722w.class.getName() + ": " + mo33625d();
    }
}
