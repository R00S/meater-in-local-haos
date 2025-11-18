package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import kotlin.C10773s;
import kotlin.collections.C10810q0;
import kotlin.collections.C10817u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10204a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10206b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10214j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10226v;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import okhttp3.HttpUrl;

/* compiled from: annotationUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.f */
/* loaded from: classes2.dex */
public final class C10619f {

    /* renamed from: a */
    private static final C10163f f40802a;

    /* renamed from: b */
    private static final C10163f f40803b;

    /* renamed from: c */
    private static final C10163f f40804c;

    /* renamed from: d */
    private static final C10163f f40805d;

    /* renamed from: e */
    private static final C10163f f40806e;

    /* compiled from: annotationUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.f$a */
    static final class a extends Lambda implements Function1<InterfaceC10592g0, AbstractC10344e0> {

        /* renamed from: f */
        final /* synthetic */ AbstractC9914h f40807f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC9914h abstractC9914h) {
            super(1);
            this.f40807f = abstractC9914h;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10344e0 invoke(InterfaceC10592g0 interfaceC10592g0) {
            C9801m.m32346f(interfaceC10592g0, "module");
            AbstractC10368m0 abstractC10368m0M32794l = interfaceC10592g0.mo37021o().m32794l(EnumC10384r1.INVARIANT, this.f40807f.m32784W());
            C9801m.m32345e(abstractC10368m0M32794l, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return abstractC10368m0M32794l;
        }
    }

    static {
        C10163f c10163fM35454x = C10163f.m35454x("message");
        C9801m.m32345e(c10163fM35454x, "identifier(\"message\")");
        f40802a = c10163fM35454x;
        C10163f c10163fM35454x2 = C10163f.m35454x("replaceWith");
        C9801m.m32345e(c10163fM35454x2, "identifier(\"replaceWith\")");
        f40803b = c10163fM35454x2;
        C10163f c10163fM35454x3 = C10163f.m35454x("level");
        C9801m.m32345e(c10163fM35454x3, "identifier(\"level\")");
        f40804c = c10163fM35454x3;
        C10163f c10163fM35454x4 = C10163f.m35454x("expression");
        C9801m.m32345e(c10163fM35454x4, "identifier(\"expression\")");
        f40805d = c10163fM35454x4;
        C10163f c10163fM35454x5 = C10163f.m35454x("imports");
        C9801m.m32345e(c10163fM35454x5, "identifier(\"imports\")");
        f40806e = c10163fM35454x5;
    }

    /* renamed from: a */
    public static final InterfaceC10616c m37731a(AbstractC9914h abstractC9914h, String str, String str2, String str3) {
        C9801m.m32346f(abstractC9914h, "<this>");
        C9801m.m32346f(str, "message");
        C9801m.m32346f(str2, "replaceWith");
        C9801m.m32346f(str3, "level");
        C10623j c10623j = new C10623j(abstractC9914h, C9917k.a.f37526B, C10810q0.m38800l(C10773s.m38547a(f40805d, new C10226v(str2)), C10773s.m38547a(f40806e, new C10206b(C10817u.m38888j(), new a(abstractC9914h)))));
        C10160c c10160c = C9917k.a.f37608y;
        C10163f c10163f = f40804c;
        C10159b c10159bM35408m = C10159b.m35408m(C9917k.a.f37524A);
        C9801m.m32345e(c10159bM35408m, "topLevel(StandardNames.FqNames.deprecationLevel)");
        C10163f c10163fM35454x = C10163f.m35454x(str3);
        C9801m.m32345e(c10163fM35454x, "identifier(level)");
        return new C10623j(abstractC9914h, c10160c, C10810q0.m38800l(C10773s.m38547a(f40802a, new C10226v(str)), C10773s.m38547a(f40803b, new C10204a(c10623j)), C10773s.m38547a(c10163f, new C10214j(c10159bM35408m, c10163fM35454x))));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10616c m37732b(AbstractC9914h abstractC9914h, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i2 & 4) != 0) {
            str3 = "WARNING";
        }
        return m37731a(abstractC9914h, str, str2, str3);
    }
}
