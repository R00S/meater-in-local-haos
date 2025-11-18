package kotlin.reflect.p371y.internal.p374j0.p400i;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10740z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10731u0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: inlineClassesUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.i.f */
/* loaded from: classes3.dex */
public final class C10189f {

    /* renamed from: a */
    private static final C10160c f39516a;

    /* renamed from: b */
    private static final C10159b f39517b;

    static {
        C10160c c10160c = new C10160c("kotlin.jvm.JvmInline");
        f39516a = c10160c;
        C10159b c10159bM35408m = C10159b.m35408m(c10160c);
        C9801m.m32345e(c10159bM35408m, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f39517b = c10159bM35408m;
    }

    /* renamed from: a */
    public static final boolean m35839a(InterfaceC10573a interfaceC10573a) {
        C9801m.m32346f(interfaceC10573a, "<this>");
        if (interfaceC10573a instanceof InterfaceC10731u0) {
            InterfaceC10729t0 interfaceC10729t0Mo37763B0 = ((InterfaceC10731u0) interfaceC10573a).mo37763B0();
            C9801m.m32345e(interfaceC10729t0Mo37763B0, "correspondingProperty");
            if (m35842d(interfaceC10729t0Mo37763B0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m35840b(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "<this>");
        return (interfaceC10609m instanceof InterfaceC10585e) && (((InterfaceC10585e) interfaceC10609m).mo32886z0() instanceof C10740z);
    }

    /* renamed from: c */
    public static final boolean m35841c(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "<this>");
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        if (interfaceC10594hMo32891w != null) {
            return m35840b(interfaceC10594hMo32891w);
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m35842d(InterfaceC10602j1 interfaceC10602j1) {
        C10740z<AbstractC10368m0> c10740zM36076j;
        C9801m.m32346f(interfaceC10602j1, "<this>");
        if (interfaceC10602j1.mo37032m0() == null) {
            InterfaceC10609m interfaceC10609mMo32876b = interfaceC10602j1.mo32876b();
            C10163f c10163fM38162c = null;
            InterfaceC10585e interfaceC10585e = interfaceC10609mMo32876b instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10609mMo32876b : null;
            if (interfaceC10585e != null && (c10740zM36076j = C10235a.m36076j(interfaceC10585e)) != null) {
                c10163fM38162c = c10740zM36076j.m38162c();
            }
            if (C9801m.m32341a(c10163fM38162c, interfaceC10602j1.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final AbstractC10344e0 m35843e(AbstractC10344e0 abstractC10344e0) {
        C10740z<AbstractC10368m0> c10740zM36076j;
        C9801m.m32346f(abstractC10344e0, "<this>");
        InterfaceC10594h interfaceC10594hMo32891w = abstractC10344e0.mo35993O0().mo32891w();
        if (!(interfaceC10594hMo32891w instanceof InterfaceC10585e)) {
            interfaceC10594hMo32891w = null;
        }
        InterfaceC10585e interfaceC10585e = (InterfaceC10585e) interfaceC10594hMo32891w;
        if (interfaceC10585e == null || (c10740zM36076j = C10235a.m36076j(interfaceC10585e)) == null) {
            return null;
        }
        return (AbstractC10368m0) c10740zM36076j.m38163d();
    }
}
