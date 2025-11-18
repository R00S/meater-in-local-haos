package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10773s;
import kotlin.collections.C10810q0;
import kotlin.collections.C10819v;
import kotlin.collections.C10822w0;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.EnumC10626m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.EnumC10627n;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10021b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10036m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10206b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10214j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10426j;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.d */
/* loaded from: classes2.dex */
public final class C9966d {

    /* renamed from: a */
    public static final C9966d f37912a = new C9966d();

    /* renamed from: b */
    private static final Map<String, EnumSet<EnumC10627n>> f37913b = C10810q0.m38800l(C10773s.m38547a("PACKAGE", EnumSet.noneOf(EnumC10627n.class)), C10773s.m38547a("TYPE", EnumSet.of(EnumC10627n.f40883w, EnumC10627n.f40836J)), C10773s.m38547a("ANNOTATION_TYPE", EnumSet.of(EnumC10627n.f40884x)), C10773s.m38547a("TYPE_PARAMETER", EnumSet.of(EnumC10627n.f40885y)), C10773s.m38547a("FIELD", EnumSet.of(EnumC10627n.f40827A)), C10773s.m38547a("LOCAL_VARIABLE", EnumSet.of(EnumC10627n.f40828B)), C10773s.m38547a("PARAMETER", EnumSet.of(EnumC10627n.f40829C)), C10773s.m38547a("CONSTRUCTOR", EnumSet.of(EnumC10627n.f40830D)), C10773s.m38547a("METHOD", EnumSet.of(EnumC10627n.f40831E, EnumC10627n.f40832F, EnumC10627n.f40833G)), C10773s.m38547a("TYPE_USE", EnumSet.of(EnumC10627n.f40834H)));

    /* renamed from: c */
    private static final Map<String, EnumC10626m> f37914c = C10810q0.m38800l(C10773s.m38547a("RUNTIME", EnumC10626m.RUNTIME), C10773s.m38547a("CLASS", EnumC10626m.BINARY), C10773s.m38547a("SOURCE", EnumC10626m.SOURCE));

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.d$a */
    static final class a extends Lambda implements Function1<InterfaceC10592g0, AbstractC10344e0> {

        /* renamed from: f */
        public static final a f37915f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(InterfaceC10592g0 interfaceC10592g0) {
            C9801m.m32346f(interfaceC10592g0, "module");
            InterfaceC10599i1 interfaceC10599i1M33149b = C9963a.m33149b(C9965c.f37907a.m33170d(), interfaceC10592g0.mo37021o().m32797o(C9917k.a.f37538H));
            AbstractC10344e0 type = interfaceC10599i1M33149b != null ? interfaceC10599i1M33149b.getType() : null;
            return type == null ? C10427k.m37053d(EnumC10426j.f40281G0, new String[0]) : type;
        }
    }

    private C9966d() {
    }

    /* renamed from: a */
    public final AbstractC10211g<?> m33172a(InterfaceC10021b interfaceC10021b) {
        InterfaceC10036m interfaceC10036m = interfaceC10021b instanceof InterfaceC10036m ? (InterfaceC10036m) interfaceC10021b : null;
        if (interfaceC10036m == null) {
            return null;
        }
        Map<String, EnumC10626m> map = f37914c;
        C10163f c10163fMo33612d = interfaceC10036m.mo33612d();
        EnumC10626m enumC10626m = map.get(c10163fMo33612d != null ? c10163fMo33612d.m35455k() : null);
        if (enumC10626m == null) {
            return null;
        }
        C10159b c10159bM35408m = C10159b.m35408m(C9917k.a.f37544K);
        C9801m.m32345e(c10159bM35408m, "topLevel(StandardNames.F…ames.annotationRetention)");
        C10163f c10163fM35454x = C10163f.m35454x(enumC10626m.name());
        C9801m.m32345e(c10163fM35454x, "identifier(retention.name)");
        return new C10214j(c10159bM35408m, c10163fM35454x);
    }

    /* renamed from: b */
    public final Set<EnumC10627n> m33173b(String str) {
        EnumSet<EnumC10627n> enumSet = f37913b.get(str);
        return enumSet != null ? enumSet : C10822w0.m38917d();
    }

    /* renamed from: c */
    public final AbstractC10211g<?> m33174c(List<? extends InterfaceC10021b> list) {
        C9801m.m32346f(list, "arguments");
        ArrayList<InterfaceC10036m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC10036m) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC10627n> arrayList2 = new ArrayList();
        for (InterfaceC10036m interfaceC10036m : arrayList) {
            C9966d c9966d = f37912a;
            C10163f c10163fMo33612d = interfaceC10036m.mo33612d();
            C10827z.m38933z(arrayList2, c9966d.m33173b(c10163fMo33612d != null ? c10163fMo33612d.m35455k() : null));
        }
        ArrayList arrayList3 = new ArrayList(C10819v.m38911u(arrayList2, 10));
        for (EnumC10627n enumC10627n : arrayList2) {
            C10159b c10159bM35408m = C10159b.m35408m(C9917k.a.f37542J);
            C9801m.m32345e(c10159bM35408m, "topLevel(StandardNames.FqNames.annotationTarget)");
            C10163f c10163fM35454x = C10163f.m35454x(enumC10627n.name());
            C9801m.m32345e(c10163fM35454x, "identifier(kotlinTarget.name)");
            arrayList3.add(new C10214j(c10159bM35408m, c10163fM35454x));
        }
        return new C10206b(arrayList3, a.f37915f);
    }
}
