package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10813s;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9908b;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9912f;
import kotlin.reflect.p371y.internal.p374j0.p375b.p376p.EnumC9924c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.text.C10546u;
import kotlin.text.C10547v;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.a */
/* loaded from: classes2.dex */
public final class C9922a implements InterfaceC10631b {

    /* renamed from: a */
    private final InterfaceC10330n f37635a;

    /* renamed from: b */
    private final InterfaceC10592g0 f37636b;

    public C9922a(InterfaceC10330n interfaceC10330n, InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10592g0, "module");
        this.f37635a = interfaceC10330n;
        this.f37636b = interfaceC10592g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b
    /* renamed from: a */
    public Collection<InterfaceC10585e> mo32848a(C10160c c10160c) {
        C9801m.m32346f(c10160c, "packageFqName");
        return C10822w0.m38917d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b
    /* renamed from: b */
    public boolean mo32849b(C10160c c10160c, C10163f c10163f) {
        C9801m.m32346f(c10160c, "packageFqName");
        C9801m.m32346f(c10163f, "name");
        String strM35455k = c10163f.m35455k();
        C9801m.m32345e(strM35455k, "name.asString()");
        return (C10546u.m37511E(strM35455k, "Function", false, 2, null) || C10546u.m37511E(strM35455k, "KFunction", false, 2, null) || C10546u.m37511E(strM35455k, "SuspendFunction", false, 2, null) || C10546u.m37511E(strM35455k, "KSuspendFunction", false, 2, null)) && EnumC9924c.f37649f.m32900c(strM35455k, c10160c) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b
    /* renamed from: c */
    public InterfaceC10585e mo32850c(C10159b c10159b) {
        C9801m.m32346f(c10159b, "classId");
        if (c10159b.m35416k() || c10159b.m35417l()) {
            return null;
        }
        String strM35420b = c10159b.m35414i().m35420b();
        C9801m.m32345e(strM35420b, "classId.relativeClassName.asString()");
        if (!C10547v.m37538J(strM35420b, "Function", false, 2, null)) {
            return null;
        }
        C10160c c10160cM35413h = c10159b.m35413h();
        C9801m.m32345e(c10160cM35413h, "classId.packageFqName");
        EnumC9924c.a.C11542a c11542aM32900c = EnumC9924c.f37649f.m32900c(strM35420b, c10160cM35413h);
        if (c11542aM32900c == null) {
            return null;
        }
        EnumC9924c enumC9924cM32901a = c11542aM32900c.m32901a();
        int iM32902b = c11542aM32900c.m32902b();
        List<InterfaceC10604k0> listMo37749I = this.f37636b.mo37018N(c10160cM35413h).mo37749I();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo37749I) {
            if (obj instanceof InterfaceC9908b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof InterfaceC9912f) {
                arrayList2.add(obj2);
            }
        }
        InterfaceC10604k0 interfaceC10604k0 = (InterfaceC9912f) C10813s.m38832W(arrayList2);
        if (interfaceC10604k0 == null) {
            interfaceC10604k0 = (InterfaceC9908b) C10813s.m38830U(arrayList);
        }
        return new C9923b(this.f37635a, interfaceC10604k0, enumC9924cM32901a, iM32902b);
    }
}
