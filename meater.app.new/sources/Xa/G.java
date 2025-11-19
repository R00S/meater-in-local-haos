package Xa;

import hb.InterfaceC3505B;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectJavaValueParameter.kt */
/* loaded from: classes3.dex */
public final class G extends u implements InterfaceC3505B {

    /* renamed from: a, reason: collision with root package name */
    private final E f18935a;

    /* renamed from: b, reason: collision with root package name */
    private final Annotation[] f18936b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18937c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18938d;

    public G(E type, Annotation[] reflectAnnotations, String str, boolean z10) {
        C3862t.g(type, "type");
        C3862t.g(reflectAnnotations, "reflectAnnotations");
        this.f18935a = type;
        this.f18936b = reflectAnnotations;
        this.f18937c = str;
        this.f18938d = z10;
    }

    @Override // hb.InterfaceC3505B
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public E a() {
        return this.f18935a;
    }

    @Override // hb.InterfaceC3505B
    public qb.f getName() {
        String str = this.f18937c;
        if (str != null) {
            return qb.f.s(str);
        }
        return null;
    }

    @Override // hb.InterfaceC3505B
    public boolean j() {
        return this.f18938d;
    }

    @Override // hb.InterfaceC3511d
    public boolean l() {
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G.class.getName());
        sb2.append(": ");
        sb2.append(j() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(a());
        return sb2.toString();
    }

    @Override // hb.InterfaceC3511d
    public List<C1823g> getAnnotations() {
        return k.b(this.f18936b);
    }

    @Override // hb.InterfaceC3511d
    public C1823g o(qb.c fqName) {
        C3862t.g(fqName, "fqName");
        return k.a(this.f18936b, fqName);
    }
}
