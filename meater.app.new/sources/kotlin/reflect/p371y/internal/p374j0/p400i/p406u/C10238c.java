package kotlin.reflect.p371y.internal.p374j0.p400i.p406u;

import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9969g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9989f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.C10002h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.EnumC10026d0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;

/* compiled from: JavaDescriptorResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.i.u.c */
/* loaded from: classes3.dex */
public final class C10238c {

    /* renamed from: a */
    private final C9989f f39598a;

    /* renamed from: b */
    private final InterfaceC9969g f39599b;

    public C10238c(C9989f c9989f, InterfaceC9969g interfaceC9969g) {
        C9801m.m32346f(c9989f, "packageFragmentProvider");
        C9801m.m32346f(interfaceC9969g, "javaResolverCache");
        this.f39598a = c9989f;
        this.f39599b = interfaceC9969g;
    }

    /* renamed from: a */
    public final C9989f m36104a() {
        return this.f39598a;
    }

    /* renamed from: b */
    public final InterfaceC10585e m36105b(InterfaceC10030g interfaceC10030g) {
        C9801m.m32346f(interfaceC10030g, "javaClass");
        C10160c c10160cMo33596d = interfaceC10030g.mo33596d();
        if (c10160cMo33596d != null && interfaceC10030g.mo33591I() == EnumC10026d0.SOURCE) {
            return this.f39599b.mo33178a(c10160cMo33596d);
        }
        InterfaceC10030g interfaceC10030gMo33597i = interfaceC10030g.mo33597i();
        if (interfaceC10030gMo33597i != null) {
            InterfaceC10585e interfaceC10585eM36105b = m36105b(interfaceC10030gMo33597i);
            InterfaceC10251h interfaceC10251hMo33348y0 = interfaceC10585eM36105b != null ? interfaceC10585eM36105b.mo33348y0() : null;
            InterfaceC10594h interfaceC10594hMo33316f = interfaceC10251hMo33348y0 != null ? interfaceC10251hMo33348y0.mo33316f(interfaceC10030g.getName(), EnumC9941d.FROM_JAVA_LOADER) : null;
            if (interfaceC10594hMo33316f instanceof InterfaceC10585e) {
                return (InterfaceC10585e) interfaceC10594hMo33316f;
            }
            return null;
        }
        if (c10160cMo33596d == null) {
            return null;
        }
        C9989f c9989f = this.f39598a;
        C10160c c10160cM35423e = c10160cMo33596d.m35423e();
        C9801m.m32345e(c10160cM35423e, "fqName.parent()");
        C10002h c10002h = (C10002h) C10813s.m38832W(c9989f.mo33276a(c10160cM35423e));
        if (c10002h != null) {
            return c10002h.m33426M0(interfaceC10030g);
        }
        return null;
    }
}
