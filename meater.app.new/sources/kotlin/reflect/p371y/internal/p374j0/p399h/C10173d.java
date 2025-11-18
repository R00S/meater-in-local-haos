package kotlin.reflect.p371y.internal.p374j0.p399h;

import cm.aptoide.p092pt.downloadmanager.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10550i;
import kotlin.C10775u;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10824x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10590f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10601j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10683r0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10588f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10597i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10731u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10733v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10734w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.EnumC10618e;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9913g;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10165h;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10204a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10206b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10221q;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10381q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10387s1;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10458y;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10331a;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10341d0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10372n1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10376p;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10380q0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10416u0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10424h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10425i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10427k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;
import kotlin.reflect.p371y.internal.p374j0.p422m.p423u.C10485a;
import kotlin.text.C10527b;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import kotlin.text.C10549x;
import okhttp3.HttpUrl;

/* compiled from: DescriptorRendererImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.h.d */
/* loaded from: classes3.dex */
public final class C10173d extends AbstractC10172c implements InterfaceC10175f {

    /* renamed from: l */
    private final C10176g f39394l;

    /* renamed from: m */
    private final Lazy f39395m;

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.d$a */
    private final class a implements InterfaceC10628o<C10775u, StringBuilder> {

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: kotlin.f0.y.e.j0.h.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C11559a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f39397a;

            static {
                int[] iArr = new int[EnumC10181l.values().length];
                iArr[EnumC10181l.PRETTY.ordinal()] = 1;
                iArr[EnumC10181l.DEBUG.ordinal()] = 2;
                iArr[EnumC10181l.NONE.ordinal()] = 3;
                f39397a = iArr;
            }
        }

        public a() {
        }

        /* renamed from: t */
        private final void m35672t(InterfaceC10727s0 interfaceC10727s0, StringBuilder sb, String str) {
            int i2 = C11559a.f39397a[C10173d.this.m35654m0().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                m35686p(interfaceC10727s0, sb);
                return;
            }
            C10173d.this.m35563S0(interfaceC10727s0, sb);
            sb.append(str + " for ");
            C10173d c10173d = C10173d.this;
            InterfaceC10729t0 interfaceC10729t0Mo37763B0 = interfaceC10727s0.mo37763B0();
            C9801m.m32345e(interfaceC10729t0Mo37763B0, "descriptor.correspondingProperty");
            c10173d.m35527B1(interfaceC10729t0Mo37763B0, sb);
        }

        /* renamed from: A */
        public void m35673A(InterfaceC10599i1 interfaceC10599i1, StringBuilder sb) {
            C9801m.m32346f(interfaceC10599i1, "descriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35566T1(interfaceC10599i1, true, sb, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10775u mo35674a(InterfaceC10585e interfaceC10585e, StringBuilder sb) {
            m35684n(interfaceC10585e, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: b */
        public /* bridge */ /* synthetic */ C10775u mo35675b(InterfaceC10731u0 interfaceC10731u0, StringBuilder sb) {
            m35691v(interfaceC10731u0, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C10775u mo35676c(InterfaceC10636p0 interfaceC10636p0, StringBuilder sb) {
            m35689s(interfaceC10636p0, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C10775u mo32473d(InterfaceC10729t0 interfaceC10729t0, StringBuilder sb) {
            m35690u(interfaceC10729t0, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: e */
        public /* bridge */ /* synthetic */ C10775u mo35677e(InterfaceC10584d1 interfaceC10584d1, StringBuilder sb) {
            m35694y(interfaceC10584d1, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: f */
        public /* bridge */ /* synthetic */ C10775u mo35678f(InterfaceC10604k0 interfaceC10604k0, StringBuilder sb) {
            m35688r(interfaceC10604k0, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: g */
        public /* bridge */ /* synthetic */ C10775u mo32474g(InterfaceC10738y interfaceC10738y, StringBuilder sb) {
            m35686p(interfaceC10738y, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: h */
        public /* bridge */ /* synthetic */ C10775u mo32635h(InterfaceC10606l interfaceC10606l, StringBuilder sb) {
            m35685o(interfaceC10606l, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: i */
        public /* bridge */ /* synthetic */ C10775u mo35679i(InterfaceC10733v0 interfaceC10733v0, StringBuilder sb) {
            m35692w(interfaceC10733v0, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: j */
        public /* bridge */ /* synthetic */ C10775u mo35680j(InterfaceC10592g0 interfaceC10592g0, StringBuilder sb) {
            m35687q(interfaceC10592g0, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: k */
        public /* bridge */ /* synthetic */ C10775u mo35681k(InterfaceC10599i1 interfaceC10599i1, StringBuilder sb) {
            m35673A(interfaceC10599i1, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: l */
        public /* bridge */ /* synthetic */ C10775u mo35682l(InterfaceC10735w0 interfaceC10735w0, StringBuilder sb) {
            m35693x(interfaceC10735w0, sb);
            return C10775u.f41439a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o
        /* renamed from: m */
        public /* bridge */ /* synthetic */ C10775u mo35683m(InterfaceC10587e1 interfaceC10587e1, StringBuilder sb) {
            m35695z(interfaceC10587e1, sb);
            return C10775u.f41439a;
        }

        /* renamed from: n */
        public void m35684n(InterfaceC10585e interfaceC10585e, StringBuilder sb) {
            C9801m.m32346f(interfaceC10585e, "descriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35575Y0(interfaceC10585e, sb);
        }

        /* renamed from: o */
        public void m35685o(InterfaceC10606l interfaceC10606l, StringBuilder sb) {
            C9801m.m32346f(interfaceC10606l, "constructorDescriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35583d1(interfaceC10606l, sb);
        }

        /* renamed from: p */
        public void m35686p(InterfaceC10738y interfaceC10738y, StringBuilder sb) {
            C9801m.m32346f(interfaceC10738y, "descriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35589j1(interfaceC10738y, sb);
        }

        /* renamed from: q */
        public void m35687q(InterfaceC10592g0 interfaceC10592g0, StringBuilder sb) {
            C9801m.m32346f(interfaceC10592g0, "descriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35598t1(interfaceC10592g0, sb, true);
        }

        /* renamed from: r */
        public void m35688r(InterfaceC10604k0 interfaceC10604k0, StringBuilder sb) {
            C9801m.m32346f(interfaceC10604k0, "descriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35602x1(interfaceC10604k0, sb);
        }

        /* renamed from: s */
        public void m35689s(InterfaceC10636p0 interfaceC10636p0, StringBuilder sb) {
            C9801m.m32346f(interfaceC10636p0, "descriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35605z1(interfaceC10636p0, sb);
        }

        /* renamed from: u */
        public void m35690u(InterfaceC10729t0 interfaceC10729t0, StringBuilder sb) {
            C9801m.m32346f(interfaceC10729t0, "descriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35527B1(interfaceC10729t0, sb);
        }

        /* renamed from: v */
        public void m35691v(InterfaceC10731u0 interfaceC10731u0, StringBuilder sb) {
            C9801m.m32346f(interfaceC10731u0, "descriptor");
            C9801m.m32346f(sb, "builder");
            m35672t(interfaceC10731u0, sb, "getter");
        }

        /* renamed from: w */
        public void m35692w(InterfaceC10733v0 interfaceC10733v0, StringBuilder sb) {
            C9801m.m32346f(interfaceC10733v0, "descriptor");
            C9801m.m32346f(sb, "builder");
            m35672t(interfaceC10733v0, sb, "setter");
        }

        /* renamed from: x */
        public void m35693x(InterfaceC10735w0 interfaceC10735w0, StringBuilder sb) {
            C9801m.m32346f(interfaceC10735w0, "descriptor");
            C9801m.m32346f(sb, "builder");
            sb.append(interfaceC10735w0.getName());
        }

        /* renamed from: y */
        public void m35694y(InterfaceC10584d1 interfaceC10584d1, StringBuilder sb) {
            C9801m.m32346f(interfaceC10584d1, "descriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35543J1(interfaceC10584d1, sb);
        }

        /* renamed from: z */
        public void m35695z(InterfaceC10587e1 interfaceC10587e1, StringBuilder sb) {
            C9801m.m32346f(interfaceC10587e1, "descriptor");
            C9801m.m32346f(sb, "builder");
            C10173d.this.m35555O1(interfaceC10587e1, sb, true);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.d$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39398a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39399b;

        static {
            int[] iArr = new int[EnumC10182m.values().length];
            iArr[EnumC10182m.PLAIN.ordinal()] = 1;
            iArr[EnumC10182m.HTML.ordinal()] = 2;
            f39398a = iArr;
            int[] iArr2 = new int[EnumC10180k.values().length];
            iArr2[EnumC10180k.ALL.ordinal()] = 1;
            iArr2[EnumC10180k.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr2[EnumC10180k.NONE.ordinal()] = 3;
            f39399b = iArr2;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.d$c */
    static final class c extends Lambda implements Function1<InterfaceC10351g1, CharSequence> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC10351g1 interfaceC10351g1) {
            C9801m.m32346f(interfaceC10351g1, "it");
            if (interfaceC10351g1.mo36710c()) {
                return "*";
            }
            C10173d c10173d = C10173d.this;
            AbstractC10344e0 type = interfaceC10351g1.getType();
            C9801m.m32345e(type, "it.type");
            String strMo35505w = c10173d.mo35505w(type);
            if (interfaceC10351g1.mo36708a() == EnumC10384r1.INVARIANT) {
                return strMo35505w;
            }
            return interfaceC10351g1.mo36708a() + ' ' + strMo35505w;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.d$d */
    static final class d extends Lambda implements Function0<C10173d> {

        /* compiled from: DescriptorRendererImpl.kt */
        /* renamed from: kotlin.f0.y.e.j0.h.d$d$a */
        static final class a extends Lambda implements Function1<InterfaceC10175f, C10775u> {

            /* renamed from: f */
            public static final a f39402f = new a();

            a() {
                super(1);
            }

            /* renamed from: b */
            public final void m35698b(InterfaceC10175f interfaceC10175f) {
                C9801m.m32346f(interfaceC10175f, "$this$withOptions");
                interfaceC10175f.mo35628a(C10824x0.m38925l(interfaceC10175f.mo35653m(), C10817u.m38891m(C9917k.a.f37528C, C9917k.a.f37530D)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C10775u invoke(InterfaceC10175f interfaceC10175f) {
                m35698b(interfaceC10175f);
                return C10775u.f41439a;
            }
        }

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10173d invoke() {
            AbstractC10172c abstractC10172cM35507y = C10173d.this.m35507y(a.f39402f);
            C9801m.m32344d(abstractC10172cM35507y, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
            return (C10173d) abstractC10172cM35507y;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.d$e */
    static final class e extends Lambda implements Function1<AbstractC10211g<?>, CharSequence> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC10211g<?> abstractC10211g) {
            C9801m.m32346f(abstractC10211g, "it");
            return C10173d.this.m35582c1(abstractC10211g);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.d$f */
    static final class f extends Lambda implements Function1<InterfaceC10599i1, CharSequence> {

        /* renamed from: f */
        public static final f f39404f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(InterfaceC10599i1 interfaceC10599i1) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.d$g */
    static final class g extends Lambda implements Function1<AbstractC10344e0, CharSequence> {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(AbstractC10344e0 abstractC10344e0) {
            C10173d c10173d = C10173d.this;
            C9801m.m32345e(abstractC10344e0, "it");
            return c10173d.mo35505w(abstractC10344e0);
        }
    }

    /* compiled from: DescriptorRendererImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.d$h */
    static final class h extends Lambda implements Function1<AbstractC10344e0, Object> {

        /* renamed from: f */
        public static final h f39406f = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC10344e0 abstractC10344e0) {
            C9801m.m32346f(abstractC10344e0, "it");
            return abstractC10344e0 instanceof C10416u0 ? ((C10416u0) abstractC10344e0).m36631X0() : abstractC10344e0;
        }
    }

    public C10173d(C10176g c10176g) {
        C9801m.m32346f(c10176g, "options");
        this.f39394l = c10176g;
        c10176g.m35743k0();
        this.f39395m = C10550i.m37594b(new d());
    }

    /* renamed from: A1 */
    private final void m35525A1(StringBuilder sb, C10683r0 c10683r0) {
        C10683r0 c10683r0M38012c = c10683r0.m38012c();
        if (c10683r0M38012c != null) {
            m35525A1(sb, c10683r0M38012c);
            sb.append('.');
            C10163f name = c10683r0.m38011b().getName();
            C9801m.m32345e(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(mo35504v(name, false));
        } else {
            InterfaceC10345e1 interfaceC10345e1Mo32877h = c10683r0.m38011b().mo32877h();
            C9801m.m32345e(interfaceC10345e1Mo32877h, "possiblyInnerType.classi…escriptor.typeConstructor");
            sb.append(m35618L1(interfaceC10345e1Mo32877h));
        }
        sb.append(m35617K1(c10683r0.m38010a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m35527B1(InterfaceC10729t0 interfaceC10729t0, StringBuilder sb) {
        if (!m35671z0()) {
            if (!m35670y0()) {
                m35529C1(interfaceC10729t0, sb);
                List<InterfaceC10735w0> listMo37035r0 = interfaceC10729t0.mo37035r0();
                C9801m.m32345e(listMo37035r0, "property.contextReceiverParameters");
                m35584e1(listMo37035r0, sb);
                AbstractC10730u visibility = interfaceC10729t0.getVisibility();
                C9801m.m32345e(visibility, "property.visibility");
                m35572W1(visibility, sb);
                boolean z = false;
                m35597s1(sb, m35640f0().contains(EnumC10174e.CONST) && interfaceC10729t0.isConst(), "const");
                m35594o1(interfaceC10729t0, sb);
                m35596r1(interfaceC10729t0, sb);
                m35601w1(interfaceC10729t0, sb);
                if (m35640f0().contains(EnumC10174e.LATEINIT) && interfaceC10729t0.mo37036s0()) {
                    z = true;
                }
                m35597s1(sb, z, "lateinit");
                m35593n1(interfaceC10729t0, sb);
            }
            m35564S1(this, interfaceC10729t0, sb, false, 4, null);
            List<InterfaceC10587e1> typeParameters = interfaceC10729t0.getTypeParameters();
            C9801m.m32345e(typeParameters, "property.typeParameters");
            m35560Q1(typeParameters, sb, true);
            m35531D1(interfaceC10729t0, sb);
        }
        m35598t1(interfaceC10729t0, sb, true);
        sb.append(": ");
        AbstractC10344e0 type = interfaceC10729t0.getType();
        C9801m.m32345e(type, "property.type");
        sb.append(mo35505w(type));
        m35533E1(interfaceC10729t0, sb);
        m35591l1(interfaceC10729t0, sb);
        List<InterfaceC10587e1> typeParameters2 = interfaceC10729t0.getTypeParameters();
        C9801m.m32345e(typeParameters2, "property.typeParameters");
        m35574X1(typeParameters2, sb);
    }

    /* renamed from: C1 */
    private final void m35529C1(InterfaceC10729t0 interfaceC10729t0, StringBuilder sb) {
        if (m35640f0().contains(EnumC10174e.ANNOTATIONS)) {
            m35571W0(this, sb, interfaceC10729t0, null, 2, null);
            InterfaceC10734w interfaceC10734wMo37034q0 = interfaceC10729t0.mo37034q0();
            if (interfaceC10734wMo37034q0 != null) {
                m35569V0(sb, interfaceC10734wMo37034q0, EnumC10618e.FIELD);
            }
            InterfaceC10734w interfaceC10734wMo37033n0 = interfaceC10729t0.mo37033n0();
            if (interfaceC10734wMo37033n0 != null) {
                m35569V0(sb, interfaceC10734wMo37033n0, EnumC10618e.PROPERTY_DELEGATE_FIELD);
            }
            if (m35654m0() == EnumC10181l.NONE) {
                InterfaceC10731u0 getter = interfaceC10729t0.getGetter();
                if (getter != null) {
                    m35569V0(sb, getter, EnumC10618e.PROPERTY_GETTER);
                }
                InterfaceC10733v0 setter = interfaceC10729t0.getSetter();
                if (setter != null) {
                    m35569V0(sb, setter, EnumC10618e.PROPERTY_SETTER);
                    List<InterfaceC10599i1> listMo37028f = setter.mo37028f();
                    C9801m.m32345e(listMo37028f, "setter.valueParameters");
                    InterfaceC10599i1 interfaceC10599i1 = (InterfaceC10599i1) C10813s.m38866s0(listMo37028f);
                    C9801m.m32345e(interfaceC10599i1, "it");
                    m35569V0(sb, interfaceC10599i1, EnumC10618e.SETTER_PARAMETER);
                }
            }
        }
    }

    /* renamed from: D1 */
    private final void m35531D1(InterfaceC10573a interfaceC10573a, StringBuilder sb) {
        InterfaceC10735w0 interfaceC10735w0Mo37032m0 = interfaceC10573a.mo37032m0();
        if (interfaceC10735w0Mo37032m0 != null) {
            m35569V0(sb, interfaceC10735w0Mo37032m0, EnumC10618e.RECEIVER);
            AbstractC10344e0 type = interfaceC10735w0Mo37032m0.getType();
            C9801m.m32345e(type, "receiver.type");
            sb.append(m35587h1(type));
            sb.append(".");
        }
    }

    /* renamed from: E1 */
    private final void m35533E1(InterfaceC10573a interfaceC10573a, StringBuilder sb) {
        InterfaceC10735w0 interfaceC10735w0Mo37032m0;
        if (m35656n0() && (interfaceC10735w0Mo37032m0 = interfaceC10573a.mo37032m0()) != null) {
            sb.append(" on ");
            AbstractC10344e0 type = interfaceC10735w0Mo37032m0.getType();
            C9801m.m32345e(type, "receiver.type");
            sb.append(mo35505w(type));
        }
    }

    /* renamed from: F1 */
    private final void m35535F1(StringBuilder sb, AbstractC10368m0 abstractC10368m0) {
        if (C9801m.m32341a(abstractC10368m0, C10372n1.f40153b) || C10372n1.m36778k(abstractC10368m0)) {
            sb.append("???");
            return;
        }
        if (C10427k.m37056o(abstractC10368m0)) {
            if (!m35608C0()) {
                sb.append("???");
                return;
            }
            InterfaceC10345e1 interfaceC10345e1Mo35993O0 = abstractC10368m0.mo35993O0();
            C9801m.m32344d(interfaceC10345e1Mo35993O0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb.append(m35586g1(((C10425i) interfaceC10345e1Mo35993O0).m37047h(0)));
            return;
        }
        if (C10350g0.m36706a(abstractC10368m0)) {
            m35585f1(sb, abstractC10368m0);
        } else if (m35579Z1(abstractC10368m0)) {
            m35590k1(sb, abstractC10368m0);
        } else {
            m35585f1(sb, abstractC10368m0);
        }
    }

    /* renamed from: G1 */
    private final void m35537G1(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* renamed from: H1 */
    private final void m35539H1(InterfaceC10585e interfaceC10585e, StringBuilder sb) {
        if (m35615J0() || AbstractC9914h.m32750m0(interfaceC10585e.mo36400s())) {
            return;
        }
        Collection<AbstractC10344e0> collectionMo35998a = interfaceC10585e.mo32877h().mo35998a();
        C9801m.m32345e(collectionMo35998a, "klass.typeConstructor.supertypes");
        if (collectionMo35998a.isEmpty()) {
            return;
        }
        if (collectionMo35998a.size() == 1 && AbstractC9914h.m32736b0(collectionMo35998a.iterator().next())) {
            return;
        }
        m35537G1(sb);
        sb.append(": ");
        C10782c0.m38597c0(collectionMo35998a, sb, ", ", null, null, 0, null, new g(), 60, null);
    }

    /* renamed from: I1 */
    private final void m35541I1(InterfaceC10738y interfaceC10738y, StringBuilder sb) {
        m35597s1(sb, interfaceC10738y.isSuspend(), "suspend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m35543J1(InterfaceC10584d1 interfaceC10584d1, StringBuilder sb) {
        m35571W0(this, sb, interfaceC10584d1, null, 2, null);
        AbstractC10730u visibility = interfaceC10584d1.getVisibility();
        C9801m.m32345e(visibility, "typeAlias.visibility");
        m35572W1(visibility, sb);
        m35594o1(interfaceC10584d1, sb);
        sb.append(m35592m1("typealias"));
        sb.append(" ");
        m35598t1(interfaceC10584d1, sb, true);
        List<InterfaceC10587e1> listMo32884w = interfaceC10584d1.mo32884w();
        C9801m.m32345e(listMo32884w, "typeAlias.declaredTypeParameters");
        m35560Q1(listMo32884w, sb, false);
        m35573X0(interfaceC10584d1, sb);
        sb.append(" = ");
        sb.append(mo35505w(interfaceC10584d1.mo36397g0()));
    }

    /* renamed from: L */
    private final void m35545L(StringBuilder sb, InterfaceC10609m interfaceC10609m) {
        InterfaceC10609m interfaceC10609mMo32876b;
        String name;
        if ((interfaceC10609m instanceof InterfaceC10604k0) || (interfaceC10609m instanceof InterfaceC10636p0) || (interfaceC10609mMo32876b = interfaceC10609m.mo32876b()) == null || (interfaceC10609mMo32876b instanceof InterfaceC10592g0)) {
            return;
        }
        sb.append(" ");
        sb.append(m35661p1("defined in"));
        sb.append(" ");
        C10161d c10161dM35825m = C10187d.m35825m(interfaceC10609mMo32876b);
        C9801m.m32345e(c10161dM35825m, "getFqName(containingDeclaration)");
        sb.append(c10161dM35825m.m35434e() ? "root package" : mo35503u(c10161dM35825m));
        if (m35613H0() && (interfaceC10609mMo32876b instanceof InterfaceC10604k0) && (interfaceC10609m instanceof InterfaceC10635p) && (name = ((InterfaceC10635p) interfaceC10609m).mo32883t().mo33980a().getName()) != null) {
            sb.append(" ");
            sb.append(m35661p1("in file"));
            sb.append(" ");
            sb.append(name);
        }
    }

    /* renamed from: L0 */
    private final String m35546L0() {
        return m35556P(">");
    }

    /* renamed from: M */
    private final void m35547M(StringBuilder sb, List<? extends InterfaceC10351g1> list) {
        C10782c0.m38597c0(list, sb, ", ", null, null, 0, null, new c(), 60, null);
    }

    /* renamed from: M0 */
    private final boolean m35548M0(AbstractC10344e0 abstractC10344e0) {
        return C9913g.m32721q(abstractC10344e0) || !abstractC10344e0.getAnnotations().isEmpty();
    }

    /* renamed from: M1 */
    private final void m35549M1(StringBuilder sb, AbstractC10344e0 abstractC10344e0, InterfaceC10345e1 interfaceC10345e1) {
        C10683r0 c10683r0M37682a = C10590f1.m37682a(abstractC10344e0);
        if (c10683r0M37682a != null) {
            m35525A1(sb, c10683r0M37682a);
        } else {
            sb.append(m35618L1(interfaceC10345e1));
            sb.append(m35617K1(abstractC10344e0.mo35991M0()));
        }
    }

    /* renamed from: N */
    private final String m35550N() {
        int i2 = b.f39398a[m35606A0().ordinal()];
        if (i2 == 1) {
            return m35556P("->");
        }
        if (i2 == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: N0 */
    private final EnumC10583d0 m35551N0(InterfaceC10580c0 interfaceC10580c0) {
        if (interfaceC10580c0 instanceof InterfaceC10585e) {
            return ((InterfaceC10585e) interfaceC10580c0).mo32878i() == EnumC10588f.INTERFACE ? EnumC10583d0.ABSTRACT : EnumC10583d0.FINAL;
        }
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10580c0.mo32876b();
        InterfaceC10585e interfaceC10585e = interfaceC10609mMo32876b instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10609mMo32876b : null;
        if (interfaceC10585e != null && (interfaceC10580c0 instanceof InterfaceC10576b)) {
            InterfaceC10576b interfaceC10576b = (InterfaceC10576b) interfaceC10580c0;
            C9801m.m32345e(interfaceC10576b.mo37027e(), "this.overriddenDescriptors");
            if ((!r1.isEmpty()) && interfaceC10585e.mo32879j() != EnumC10583d0.FINAL) {
                return EnumC10583d0.OPEN;
            }
            if (interfaceC10585e.mo32878i() != EnumC10588f.INTERFACE || C9801m.m32341a(interfaceC10576b.getVisibility(), C10728t.f41216a)) {
                return EnumC10583d0.FINAL;
            }
            EnumC10583d0 enumC10583d0Mo32879j = interfaceC10576b.mo32879j();
            EnumC10583d0 enumC10583d0 = EnumC10583d0.ABSTRACT;
            return enumC10583d0Mo32879j == enumC10583d0 ? enumC10583d0 : EnumC10583d0.OPEN;
        }
        return EnumC10583d0.FINAL;
    }

    /* renamed from: N1 */
    static /* synthetic */ void m35552N1(C10173d c10173d, StringBuilder sb, AbstractC10344e0 abstractC10344e0, InterfaceC10345e1 interfaceC10345e1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC10345e1 = abstractC10344e0.mo35993O0();
        }
        c10173d.m35549M1(sb, abstractC10344e0, interfaceC10345e1);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m35553O(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r1 = "?"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            java.lang.String r0 = kotlin.text.C10537l.m37445A(r0, r1, r2, r3, r4, r5)
            boolean r0 = kotlin.jvm.internal.C9801m.m32341a(r7, r0)
            r1 = 0
            if (r0 != 0) goto L50
            r0 = 2
            r2 = 0
            java.lang.String r3 = "?"
            boolean r0 = kotlin.text.C10537l.m37482p(r8, r3, r1, r0, r2)
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r2 = 63
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.C9801m.m32341a(r0, r8)
            if (r0 != 0) goto L50
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 40
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = ")?"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.C9801m.m32341a(r7, r8)
            if (r7 == 0) goto L51
        L50:
            r1 = 1
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p399h.C10173d.m35553O(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: O0 */
    private final boolean m35554O0(InterfaceC10616c interfaceC10616c) {
        return C9801m.m32341a(interfaceC10616c.mo33162d(), C9917k.a.f37532E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O1 */
    public final void m35555O1(InterfaceC10587e1 interfaceC10587e1, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(m35557P0());
        }
        if (m35611F0()) {
            sb.append("/*");
            sb.append(interfaceC10587e1.mo37670g());
            sb.append("*/ ");
        }
        m35597s1(sb, interfaceC10587e1.mo37669F(), "reified");
        String strM36820q = interfaceC10587e1.mo37672n().m36820q();
        boolean z2 = true;
        m35597s1(sb, strM36820q.length() > 0, strM36820q);
        m35571W0(this, sb, interfaceC10587e1, null, 2, null);
        m35598t1(interfaceC10587e1, sb, z);
        int size = interfaceC10587e1.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC10344e0 next = interfaceC10587e1.getUpperBounds().iterator().next();
            if (!AbstractC9914h.m32746i0(next)) {
                sb.append(" : ");
                C9801m.m32345e(next, "upperBound");
                sb.append(mo35505w(next));
            }
        } else if (z) {
            for (AbstractC10344e0 abstractC10344e0 : interfaceC10587e1.getUpperBounds()) {
                if (!AbstractC9914h.m32746i0(abstractC10344e0)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    C9801m.m32345e(abstractC10344e0, "upperBound");
                    sb.append(mo35505w(abstractC10344e0));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m35546L0());
        }
    }

    /* renamed from: P */
    private final String m35556P(String str) {
        return m35606A0().mo35762k(str);
    }

    /* renamed from: P0 */
    private final String m35557P0() {
        return m35556P("<");
    }

    /* renamed from: P1 */
    private final void m35558P1(StringBuilder sb, List<? extends InterfaceC10587e1> list) {
        Iterator<? extends InterfaceC10587e1> it = list.iterator();
        while (it.hasNext()) {
            m35555O1(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* renamed from: Q0 */
    private final boolean m35559Q0(InterfaceC10576b interfaceC10576b) {
        return !interfaceC10576b.mo37027e().isEmpty();
    }

    /* renamed from: Q1 */
    private final void m35560Q1(List<? extends InterfaceC10587e1> list, StringBuilder sb, boolean z) {
        if (!m35616K0() && (!list.isEmpty())) {
            sb.append(m35557P0());
            m35558P1(sb, list);
            sb.append(m35546L0());
            if (z) {
                sb.append(" ");
            }
        }
    }

    /* renamed from: R0 */
    private final void m35561R0(StringBuilder sb, C10331a c10331a) {
        EnumC10182m enumC10182mM35606A0 = m35606A0();
        EnumC10182m enumC10182m = EnumC10182m.HTML;
        if (enumC10182mM35606A0 == enumC10182m) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        m35600v1(sb, c10331a.m36557W());
        sb.append(" */");
        if (m35606A0() == enumC10182m) {
            sb.append("</i></font>");
        }
    }

    /* renamed from: R1 */
    private final void m35562R1(InterfaceC10602j1 interfaceC10602j1, StringBuilder sb, boolean z) {
        if (z || !(interfaceC10602j1 instanceof InterfaceC10599i1)) {
            sb.append(m35592m1(interfaceC10602j1.mo37031j0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public final void m35563S0(InterfaceC10727s0 interfaceC10727s0, StringBuilder sb) {
        m35594o1(interfaceC10727s0, sb);
    }

    /* renamed from: S1 */
    static /* synthetic */ void m35564S1(C10173d c10173d, InterfaceC10602j1 interfaceC10602j1, StringBuilder sb, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        c10173d.m35562R1(interfaceC10602j1, sb, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m35565T0(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y r6, java.lang.StringBuilder r7) {
        /*
            r5 = this;
            boolean r0 = r6.mo37772Q()
            java.lang.String r1 = "functionDescriptor.overriddenDescriptors"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3a
            java.util.Collection r0 = r6.mo37027e()
            kotlin.jvm.internal.C9801m.m32345e(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L19
        L17:
            r0 = 1
            goto L30
        L19:
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L17
            java.lang.Object r4 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y) r4
            boolean r4 = r4.mo37772Q()
            if (r4 == 0) goto L1d
            r0 = 0
        L30:
            if (r0 != 0) goto L38
            boolean r0 = r5.m35620R()
            if (r0 == 0) goto L3a
        L38:
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            boolean r4 = r6.mo37765H0()
            if (r4 == 0) goto L70
            java.util.Collection r4 = r6.mo37027e()
            kotlin.jvm.internal.C9801m.m32345e(r4, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L50
        L4e:
            r1 = 1
            goto L67
        L50:
            java.util.Iterator r1 = r4.iterator()
        L54:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y) r4
            boolean r4 = r4.mo37765H0()
            if (r4 == 0) goto L54
            r1 = 0
        L67:
            if (r1 != 0) goto L6f
            boolean r1 = r5.m35620R()
            if (r1 == 0) goto L70
        L6f:
            r2 = 1
        L70:
            boolean r1 = r6.mo32908P()
            java.lang.String r3 = "tailrec"
            r5.m35597s1(r7, r1, r3)
            r5.m35541I1(r6, r7)
            boolean r6 = r6.isInline()
            java.lang.String r1 = "inline"
            r5.m35597s1(r7, r6, r1)
            java.lang.String r6 = "infix"
            r5.m35597s1(r7, r2, r6)
            java.lang.String r6 = "operator"
            r5.m35597s1(r7, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p399h.C10173d.m35565T0(kotlin.reflect.jvm.internal.impl.descriptors.y, java.lang.StringBuilder):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* renamed from: T1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m35566T1(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L10
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.m35592m1(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L10:
            boolean r0 = r9.m35611F0()
            if (r0 == 0) goto L27
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.mo37696g()
            r12.append(r0)
        */
        //  java.lang.String r0 = "*/ "
        /*
            r12.append(r0)
        L27:
            r4 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r12
            r3 = r10
            m35571W0(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.mo37695b0()
            java.lang.String r1 = "crossinline"
            r9.m35597s1(r12, r0, r1)
            boolean r0 = r10.mo37694Y()
            java.lang.String r1 = "noinline"
            r9.m35597s1(r12, r0, r1)
            boolean r0 = r9.m35666u0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L65
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r10.mo32876b()
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d
            if (r3 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10582d) r0
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L60
            boolean r0 = r0.mo37713B()
            if (r0 != r1) goto L60
            r0 = 1
            goto L61
        L60:
            r0 = 0
        L61:
            if (r0 == 0) goto L65
            r8 = 1
            goto L66
        L65:
            r8 = 0
        L66:
            if (r8 == 0) goto L71
            boolean r0 = r9.m35619Q()
            java.lang.String r3 = "actual"
            r9.m35597s1(r12, r0, r3)
        L71:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.m35570V1(r4, r5, r6, r7, r8)
            kotlin.a0.c.l r11 = r9.m35625W()
            if (r11 == 0) goto L91
            boolean r11 = r9.mo35655n()
            if (r11 == 0) goto L8a
            boolean r11 = r10.mo37698u0()
            goto L8e
        L8a:
            boolean r11 = kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a.m36067a(r10)
        L8e:
            if (r11 == 0) goto L91
            goto L92
        L91:
            r1 = 0
        L92:
            if (r1 == 0) goto Lb5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = " = "
            r11.append(r13)
            kotlin.a0.c.l r13 = r9.m35625W()
            kotlin.jvm.internal.C9801m.m32343c(r13)
            java.lang.Object r10 = r13.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r12.append(r10)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p399h.C10173d.m35566T1(kotlin.reflect.jvm.internal.impl.descriptors.i1, boolean, java.lang.StringBuilder, boolean):void");
    }

    /* renamed from: U0 */
    private final List<String> m35567U0(InterfaceC10616c interfaceC10616c) {
        InterfaceC10582d interfaceC10582dMo32864R;
        List<InterfaceC10599i1> listMo37028f;
        Map<C10163f, AbstractC10211g<?>> mapMo33159a = interfaceC10616c.mo33159a();
        List listM38888j = null;
        InterfaceC10585e interfaceC10585eM36071e = m35663r0() ? C10235a.m36071e(interfaceC10616c) : null;
        if (interfaceC10585eM36071e != null && (interfaceC10582dMo32864R = interfaceC10585eM36071e.mo32864R()) != null && (listMo37028f = interfaceC10582dMo32864R.mo37028f()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo37028f) {
                if (((InterfaceC10599i1) obj).mo37698u0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C10819v.m38911u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC10599i1) it.next()).getName());
            }
            listM38888j = arrayList2;
        }
        if (listM38888j == null) {
            listM38888j = C10817u.m38888j();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM38888j) {
            C9801m.m32345e((C10163f) obj2, "it");
            if (!mapMo33159a.containsKey(r5)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C10819v.m38911u(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C10163f) it2.next()).m35455k() + " = ...");
        }
        Set<Map.Entry<C10163f, AbstractC10211g<?>>> setEntrySet = mapMo33159a.entrySet();
        ArrayList arrayList5 = new ArrayList(C10819v.m38911u(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C10163f c10163f = (C10163f) entry.getKey();
            AbstractC10211g<?> abstractC10211g = (AbstractC10211g) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(c10163f.m35455k());
            sb.append(" = ");
            sb.append(!listM38888j.contains(c10163f) ? m35582c1(abstractC10211g) : "...");
            arrayList5.add(sb.toString());
        }
        return C10782c0.m38617w0(C10782c0.m38609o0(arrayList4, arrayList5));
    }

    /* renamed from: U1 */
    private final void m35568U1(Collection<? extends InterfaceC10599i1> collection, boolean z, StringBuilder sb) {
        boolean zM35580a2 = m35580a2(z);
        int size = collection.size();
        m35610E0().mo35521b(size, sb);
        int i2 = 0;
        for (InterfaceC10599i1 interfaceC10599i1 : collection) {
            m35610E0().mo35520a(interfaceC10599i1, i2, size, sb);
            m35566T1(interfaceC10599i1, zM35580a2, sb, false);
            m35610E0().mo35523d(interfaceC10599i1, i2, size, sb);
            i2++;
        }
        m35610E0().mo35522c(size, sb);
    }

    /* renamed from: V0 */
    private final void m35569V0(StringBuilder sb, InterfaceC10614a interfaceC10614a, EnumC10618e enumC10618e) {
        if (m35640f0().contains(EnumC10174e.ANNOTATIONS)) {
            Set<C10160c> setMo35653m = interfaceC10614a instanceof AbstractC10344e0 ? mo35653m() : m35627Y();
            Function1<InterfaceC10616c, Boolean> function1M35621S = m35621S();
            for (InterfaceC10616c interfaceC10616c : interfaceC10614a.getAnnotations()) {
                if (!C10782c0.m38577K(setMo35653m, interfaceC10616c.mo33162d()) && !m35554O0(interfaceC10616c) && (function1M35621S == null || function1M35621S.invoke(interfaceC10616c).booleanValue())) {
                    sb.append(mo35501r(interfaceC10616c, enumC10618e));
                    if (m35626X()) {
                        sb.append('\n');
                        C9801m.m32345e(sb, "append('\\n')");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    /* renamed from: V1 */
    private final void m35570V1(InterfaceC10602j1 interfaceC10602j1, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        AbstractC10344e0 type = interfaceC10602j1.getType();
        C9801m.m32345e(type, "variable.type");
        InterfaceC10599i1 interfaceC10599i1 = interfaceC10602j1 instanceof InterfaceC10599i1 ? (InterfaceC10599i1) interfaceC10602j1 : null;
        AbstractC10344e0 abstractC10344e0Mo37697l0 = interfaceC10599i1 != null ? interfaceC10599i1.mo37697l0() : null;
        AbstractC10344e0 abstractC10344e0 = abstractC10344e0Mo37697l0 == null ? type : abstractC10344e0Mo37697l0;
        m35597s1(sb, abstractC10344e0Mo37697l0 != null, "vararg");
        if (z3 || (z2 && !m35671z0())) {
            m35562R1(interfaceC10602j1, sb, z3);
        }
        if (z) {
            m35598t1(interfaceC10602j1, sb, z2);
            sb.append(": ");
        }
        sb.append(mo35505w(abstractC10344e0));
        m35591l1(interfaceC10602j1, sb);
        if (!m35611F0() || abstractC10344e0Mo37697l0 == null) {
            return;
        }
        sb.append(" /*");
        sb.append(mo35505w(type));
        sb.append("*/");
    }

    /* renamed from: W0 */
    static /* synthetic */ void m35571W0(C10173d c10173d, StringBuilder sb, InterfaceC10614a interfaceC10614a, EnumC10618e enumC10618e, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            enumC10618e = null;
        }
        c10173d.m35569V0(sb, interfaceC10614a, enumC10618e);
    }

    /* renamed from: W1 */
    private final boolean m35572W1(AbstractC10730u abstractC10730u, StringBuilder sb) {
        if (!m35640f0().contains(EnumC10174e.VISIBILITY)) {
            return false;
        }
        if (m35642g0()) {
            abstractC10730u = abstractC10730u.mo38009f();
        }
        if (!m35665t0() && C9801m.m32341a(abstractC10730u, C10728t.f41227l)) {
            return false;
        }
        sb.append(m35592m1(abstractC10730u.mo38008c()));
        sb.append(" ");
        return true;
    }

    /* renamed from: X0 */
    private final void m35573X0(InterfaceC10597i interfaceC10597i, StringBuilder sb) {
        List<InterfaceC10587e1> listMo32884w = interfaceC10597i.mo32884w();
        C9801m.m32345e(listMo32884w, "classifier.declaredTypeParameters");
        List<InterfaceC10587e1> parameters = interfaceC10597i.mo32877h().getParameters();
        C9801m.m32345e(parameters, "classifier.typeConstructor.parameters");
        if (m35611F0() && interfaceC10597i.mo32882m() && parameters.size() > listMo32884w.size()) {
            sb.append(" /*captured type parameters: ");
            m35558P1(sb, parameters.subList(listMo32884w.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* renamed from: X1 */
    private final void m35574X1(List<? extends InterfaceC10587e1> list, StringBuilder sb) {
        if (m35616K0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC10587e1 interfaceC10587e1 : list) {
            List<AbstractC10344e0> upperBounds = interfaceC10587e1.getUpperBounds();
            C9801m.m32345e(upperBounds, "typeParameter.upperBounds");
            for (AbstractC10344e0 abstractC10344e0 : C10782c0.m38581M(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                C10163f name = interfaceC10587e1.getName();
                C9801m.m32345e(name, "typeParameter.name");
                sb2.append(mo35504v(name, false));
                sb2.append(" : ");
                C9801m.m32345e(abstractC10344e0, "it");
                sb2.append(mo35505w(abstractC10344e0));
                arrayList.add(sb2.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb.append(" ");
            sb.append(m35592m1("where"));
            sb.append(" ");
            C10782c0.m38597c0(arrayList, sb, ", ", null, null, 0, null, null, 124, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public final void m35575Y0(InterfaceC10585e interfaceC10585e, StringBuilder sb) {
        InterfaceC10582d interfaceC10582dMo32864R;
        boolean z = interfaceC10585e.mo32878i() == EnumC10588f.ENUM_ENTRY;
        if (!m35671z0()) {
            m35571W0(this, sb, interfaceC10585e, null, 2, null);
            List<InterfaceC10735w0> listMo36281F0 = interfaceC10585e.mo36281F0();
            C9801m.m32345e(listMo36281F0, "klass.contextReceivers");
            m35584e1(listMo36281F0, sb);
            if (!z) {
                AbstractC10730u visibility = interfaceC10585e.getVisibility();
                C9801m.m32345e(visibility, "klass.visibility");
                m35572W1(visibility, sb);
            }
            if ((interfaceC10585e.mo32878i() != EnumC10588f.INTERFACE || interfaceC10585e.mo32879j() != EnumC10583d0.ABSTRACT) && (!interfaceC10585e.mo32878i().m37681k() || interfaceC10585e.mo32879j() != EnumC10583d0.FINAL)) {
                EnumC10583d0 enumC10583d0Mo32879j = interfaceC10585e.mo32879j();
                C9801m.m32345e(enumC10583d0Mo32879j, "klass.modality");
                m35595q1(enumC10583d0Mo32879j, sb, m35551N0(interfaceC10585e));
            }
            m35594o1(interfaceC10585e, sb);
            m35597s1(sb, m35640f0().contains(EnumC10174e.INNER) && interfaceC10585e.mo32882m(), "inner");
            m35597s1(sb, m35640f0().contains(EnumC10174e.DATA) && interfaceC10585e.mo32862J0(), "data");
            m35597s1(sb, m35640f0().contains(EnumC10174e.INLINE) && interfaceC10585e.isInline(), "inline");
            m35597s1(sb, m35640f0().contains(EnumC10174e.VALUE) && interfaceC10585e.mo32881l(), "value");
            m35597s1(sb, m35640f0().contains(EnumC10174e.FUN) && interfaceC10585e.mo32858D(), "fun");
            m35578Z0(interfaceC10585e, sb);
        }
        if (C10187d.m35836x(interfaceC10585e)) {
            m35581b1(interfaceC10585e, sb);
        } else {
            if (!m35671z0()) {
                m35537G1(sb);
            }
            m35598t1(interfaceC10585e, sb, true);
        }
        if (z) {
            return;
        }
        List<InterfaceC10587e1> listMo32884w = interfaceC10585e.mo32884w();
        C9801m.m32345e(listMo32884w, "klass.declaredTypeParameters");
        m35560Q1(listMo32884w, sb, false);
        m35573X0(interfaceC10585e, sb);
        if (!interfaceC10585e.mo32878i().m37681k() && m35623U() && (interfaceC10582dMo32864R = interfaceC10585e.mo32864R()) != null) {
            sb.append(" ");
            m35571W0(this, sb, interfaceC10582dMo32864R, null, 2, null);
            AbstractC10730u visibility2 = interfaceC10582dMo32864R.getVisibility();
            C9801m.m32345e(visibility2, "primaryConstructor.visibility");
            m35572W1(visibility2, sb);
            sb.append(m35592m1("constructor"));
            List<InterfaceC10599i1> listMo37028f = interfaceC10582dMo32864R.mo37028f();
            C9801m.m32345e(listMo37028f, "primaryConstructor.valueParameters");
            m35568U1(listMo37028f, interfaceC10582dMo32864R.mo33204G(), sb);
        }
        m35539H1(interfaceC10585e, sb);
        m35574X1(listMo32884w, sb);
    }

    /* renamed from: Y1 */
    private final String m35576Y1(String str, String str2, String str3, String str4, String str5) {
        if (C10546u.m37511E(str, str2, false, 2, null) && C10546u.m37511E(str3, str4, false, 2, null)) {
            String strSubstring = str.substring(str2.length());
            C9801m.m32345e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String strSubstring2 = str3.substring(str4.length());
            C9801m.m32345e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            String str6 = str5 + strSubstring;
            if (C9801m.m32341a(strSubstring, strSubstring2)) {
                return str6;
            }
            if (m35553O(strSubstring, strSubstring2)) {
                return str6 + '!';
            }
        }
        return null;
    }

    /* renamed from: Z */
    private final C10173d m35577Z() {
        return (C10173d) this.f39395m.getValue();
    }

    /* renamed from: Z0 */
    private final void m35578Z0(InterfaceC10585e interfaceC10585e, StringBuilder sb) {
        sb.append(m35592m1(AbstractC10172c.f39371a.m35518a(interfaceC10585e)));
    }

    /* renamed from: Z1 */
    private final boolean m35579Z1(AbstractC10344e0 abstractC10344e0) {
        boolean z;
        if (!C9913g.m32719o(abstractC10344e0)) {
            return false;
        }
        List<InterfaceC10351g1> listMo35991M0 = abstractC10344e0.mo35991M0();
        if ((listMo35991M0 instanceof Collection) && listMo35991M0.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = listMo35991M0.iterator();
            while (it.hasNext()) {
                if (((InterfaceC10351g1) it.next()).mo36710c()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: a2 */
    private final boolean m35580a2(boolean z) {
        int i2 = b.f39399b[m35648j0().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b1 */
    private final void m35581b1(InterfaceC10609m interfaceC10609m, StringBuilder sb) {
        if (m35658o0()) {
            if (m35671z0()) {
                sb.append("companion object");
            }
            m35537G1(sb);
            InterfaceC10609m interfaceC10609mMo32876b = interfaceC10609m.mo32876b();
            if (interfaceC10609mMo32876b != null) {
                sb.append("of ");
                C10163f name = interfaceC10609mMo32876b.getName();
                C9801m.m32345e(name, "containingDeclaration.name");
                sb.append(mo35504v(name, false));
            }
        }
        if (m35611F0() || !C9801m.m32341a(interfaceC10609m.getName(), C10165h.f39268d)) {
            if (!m35671z0()) {
                m35537G1(sb);
            }
            C10163f name2 = interfaceC10609m.getName();
            C9801m.m32345e(name2, "descriptor.name");
            sb.append(mo35504v(name2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public final String m35582c1(AbstractC10211g<?> abstractC10211g) {
        if (abstractC10211g instanceof C10206b) {
            return C10782c0.m38599e0(((C10206b) abstractC10211g).mo36023b(), ", ", "{", "}", 0, null, new e(), 24, null);
        }
        if (abstractC10211g instanceof C10204a) {
            return C10547v.m37573m0(AbstractC10172c.m35499s(this, ((C10204a) abstractC10211g).mo36023b(), null, 2, null), "@");
        }
        if (!(abstractC10211g instanceof C10221q)) {
            return abstractC10211g.toString();
        }
        C10221q.b bVarMo36023b = ((C10221q) abstractC10211g).mo36023b();
        if (bVarMo36023b instanceof C10221q.b.a) {
            return ((C10221q.b.a) bVarMo36023b).m36054a() + "::class";
        }
        if (!(bVarMo36023b instanceof C10221q.b.C11561b)) {
            throw new NoWhenBranchMatchedException();
        }
        C10221q.b.C11561b c11561b = (C10221q.b.C11561b) bVarMo36023b;
        String strM35420b = c11561b.m36056b().m35409b().m35420b();
        C9801m.m32345e(strM35420b, "classValue.classId.asSingleFqName().asString()");
        for (int i2 = 0; i2 < c11561b.m36055a(); i2++) {
            strM35420b = "kotlin.Array<" + strM35420b + '>';
        }
        return strM35420b + "::class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m35583d1(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10606l r18, java.lang.StringBuilder r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p399h.C10173d.m35583d1(kotlin.reflect.jvm.internal.impl.descriptors.l, java.lang.StringBuilder):void");
    }

    /* renamed from: e1 */
    private final void m35584e1(List<? extends InterfaceC10735w0> list, StringBuilder sb) {
        if (!list.isEmpty()) {
            sb.append("context(");
            int i2 = 0;
            for (InterfaceC10735w0 interfaceC10735w0 : list) {
                int i3 = i2 + 1;
                m35569V0(sb, interfaceC10735w0, EnumC10618e.RECEIVER);
                AbstractC10344e0 type = interfaceC10735w0.getType();
                C9801m.m32345e(type, "contextReceiver.type");
                sb.append(m35587h1(type));
                if (i2 == C10817u.m38890l(list)) {
                    sb.append(") ");
                } else {
                    sb.append(", ");
                }
                i2 = i3;
            }
        }
    }

    /* renamed from: f1 */
    private final void m35585f1(StringBuilder sb, AbstractC10344e0 abstractC10344e0) {
        m35571W0(this, sb, abstractC10344e0, null, 2, null);
        C10376p c10376p = abstractC10344e0 instanceof C10376p ? (C10376p) abstractC10344e0 : null;
        AbstractC10368m0 abstractC10368m0M36794a1 = c10376p != null ? c10376p.m36794a1() : null;
        if (C10350g0.m36706a(abstractC10344e0)) {
            if (C10457a.m37152r(abstractC10344e0) && m35652l0()) {
                sb.append(((C10424h) abstractC10344e0).m37043X0());
            } else if (!(abstractC10344e0 instanceof C10424h) || m35638e0()) {
                sb.append(abstractC10344e0.mo35993O0().toString());
            } else {
                sb.append(((C10424h) abstractC10344e0).m37043X0());
            }
            sb.append(m35617K1(abstractC10344e0.mo35991M0()));
        } else if (abstractC10344e0 instanceof C10416u0) {
            sb.append(((C10416u0) abstractC10344e0).m36631X0().toString());
        } else if (abstractC10368m0M36794a1 instanceof C10416u0) {
            sb.append(((C10416u0) abstractC10368m0M36794a1).m36631X0().toString());
        } else {
            m35552N1(this, sb, abstractC10344e0, null, 2, null);
        }
        if (abstractC10344e0.mo33691P0()) {
            sb.append("?");
        }
        if (C10380q0.m36809c(abstractC10344e0)) {
            sb.append(" & Any");
        }
    }

    /* renamed from: g1 */
    private final String m35586g1(String str) {
        int i2 = b.f39398a[m35606A0().ordinal()];
        if (i2 == 1) {
            return str;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    /* renamed from: h1 */
    private final String m35587h1(AbstractC10344e0 abstractC10344e0) {
        String strMo35505w = mo35505w(abstractC10344e0);
        if (!m35579Z1(abstractC10344e0) || C10372n1.m36779l(abstractC10344e0)) {
            return strMo35505w;
        }
        return '(' + strMo35505w + ')';
    }

    /* renamed from: i1 */
    private final String m35588i1(List<C10163f> list) {
        return m35556P(C10183n.m35765c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public final void m35589j1(InterfaceC10738y interfaceC10738y, StringBuilder sb) {
        if (!m35671z0()) {
            if (!m35670y0()) {
                m35571W0(this, sb, interfaceC10738y, null, 2, null);
                List<InterfaceC10735w0> listMo37035r0 = interfaceC10738y.mo37035r0();
                C9801m.m32345e(listMo37035r0, "function.contextReceiverParameters");
                m35584e1(listMo37035r0, sb);
                AbstractC10730u visibility = interfaceC10738y.getVisibility();
                C9801m.m32345e(visibility, "function.visibility");
                m35572W1(visibility, sb);
                m35596r1(interfaceC10738y, sb);
                if (m35629a0()) {
                    m35594o1(interfaceC10738y, sb);
                }
                m35601w1(interfaceC10738y, sb);
                if (m35629a0()) {
                    m35565T0(interfaceC10738y, sb);
                } else {
                    m35541I1(interfaceC10738y, sb);
                }
                m35593n1(interfaceC10738y, sb);
                if (m35611F0()) {
                    if (interfaceC10738y.mo37775w0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC10738y.mo37764C0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(m35592m1("fun"));
            sb.append(" ");
            List<InterfaceC10587e1> typeParameters = interfaceC10738y.getTypeParameters();
            C9801m.m32345e(typeParameters, "function.typeParameters");
            m35560Q1(typeParameters, sb, true);
            m35531D1(interfaceC10738y, sb);
        }
        m35598t1(interfaceC10738y, sb, true);
        List<InterfaceC10599i1> listMo37028f = interfaceC10738y.mo37028f();
        C9801m.m32345e(listMo37028f, "function.valueParameters");
        m35568U1(listMo37028f, interfaceC10738y.mo33204G(), sb);
        m35533E1(interfaceC10738y, sb);
        AbstractC10344e0 returnType = interfaceC10738y.getReturnType();
        if (!m35614I0() && (m35609D0() || returnType == null || !AbstractC9914h.m32727B0(returnType))) {
            sb.append(": ");
            sb.append(returnType == null ? "[NULL]" : mo35505w(returnType));
        }
        List<InterfaceC10587e1> typeParameters2 = interfaceC10738y.getTypeParameters();
        C9801m.m32345e(typeParameters2, "function.typeParameters");
        m35574X1(typeParameters2, sb);
    }

    /* renamed from: k1 */
    private final void m35590k1(StringBuilder sb, AbstractC10344e0 abstractC10344e0) {
        C10163f c10163fM32708d;
        int length = sb.length();
        m35571W0(m35577Z(), sb, abstractC10344e0, null, 2, null);
        boolean z = sb.length() != length;
        AbstractC10344e0 abstractC10344e0M32714j = C9913g.m32714j(abstractC10344e0);
        List<AbstractC10344e0> listM32709e = C9913g.m32709e(abstractC10344e0);
        if (!listM32709e.isEmpty()) {
            sb.append("context(");
            Iterator<AbstractC10344e0> it = listM32709e.subList(0, C10817u.m38890l(listM32709e)).iterator();
            while (it.hasNext()) {
                m35599u1(sb, it.next());
                sb.append(", ");
            }
            m35599u1(sb, (AbstractC10344e0) C10813s.m38844g0(listM32709e));
            sb.append(") ");
        }
        boolean zM32721q = C9913g.m32721q(abstractC10344e0);
        boolean zMo33691P0 = abstractC10344e0.mo33691P0();
        boolean z2 = zMo33691P0 || (z && abstractC10344e0M32714j != null);
        if (z2) {
            if (zM32721q) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    C10527b.m37413c(C10549x.m37591Q0(sb));
                    if (sb.charAt(C10547v.m37551Q(sb) - 1) != ')') {
                        sb.insert(C10547v.m37551Q(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        m35597s1(sb, zM32721q, "suspend");
        if (abstractC10344e0M32714j != null) {
            boolean z3 = (m35579Z1(abstractC10344e0M32714j) && !abstractC10344e0M32714j.mo33691P0()) || m35548M0(abstractC10344e0M32714j);
            if (z3) {
                sb.append("(");
            }
            m35599u1(sb, abstractC10344e0M32714j);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!C9913g.m32717m(abstractC10344e0) || abstractC10344e0.mo35991M0().size() > 1) {
            int i2 = 0;
            for (InterfaceC10351g1 interfaceC10351g1 : C9913g.m32716l(abstractC10344e0)) {
                int i3 = i2 + 1;
                if (i2 > 0) {
                    sb.append(", ");
                }
                if (m35650k0()) {
                    AbstractC10344e0 type = interfaceC10351g1.getType();
                    C9801m.m32345e(type, "typeProjection.type");
                    c10163fM32708d = C9913g.m32708d(type);
                } else {
                    c10163fM32708d = null;
                }
                if (c10163fM32708d != null) {
                    sb.append(mo35504v(c10163fM32708d, false));
                    sb.append(": ");
                }
                sb.append(mo35506x(interfaceC10351g1));
                i2 = i3;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(m35550N());
        sb.append(" ");
        m35599u1(sb, C9913g.m32715k(abstractC10344e0));
        if (z2) {
            sb.append(")");
        }
        if (zMo33691P0) {
            sb.append("?");
        }
    }

    /* renamed from: l1 */
    private final void m35591l1(InterfaceC10602j1 interfaceC10602j1, StringBuilder sb) {
        AbstractC10211g<?> abstractC10211gMo37026X;
        if (!m35636d0() || (abstractC10211gMo37026X = interfaceC10602j1.mo37026X()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m35556P(m35582c1(abstractC10211gMo37026X)));
    }

    /* renamed from: m1 */
    private final String m35592m1(String str) {
        int i2 = b.f39398a[m35606A0().ordinal()];
        if (i2 == 1) {
            return str;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (m35622T()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    /* renamed from: n1 */
    private final void m35593n1(InterfaceC10576b interfaceC10576b, StringBuilder sb) {
        if (m35640f0().contains(EnumC10174e.MEMBER_KIND) && m35611F0() && interfaceC10576b.mo37030i() != InterfaceC10576b.a.DECLARATION) {
            sb.append("/*");
            sb.append(C10485a.m37229f(interfaceC10576b.mo37030i().name()));
            sb.append("*/ ");
        }
    }

    /* renamed from: o1 */
    private final void m35594o1(InterfaceC10580c0 interfaceC10580c0, StringBuilder sb) {
        m35597s1(sb, interfaceC10580c0.mo32885z(), "external");
        m35597s1(sb, m35640f0().contains(EnumC10174e.EXPECT) && interfaceC10580c0.mo32863M(), "expect");
        m35597s1(sb, m35640f0().contains(EnumC10174e.ACTUAL) && interfaceC10580c0.mo32859E0(), "actual");
    }

    /* renamed from: q1 */
    private final void m35595q1(EnumC10583d0 enumC10583d0, StringBuilder sb, EnumC10583d0 enumC10583d02) {
        if (m35664s0() || enumC10583d0 != enumC10583d02) {
            m35597s1(sb, m35640f0().contains(EnumC10174e.MODALITY), C10485a.m37229f(enumC10583d0.name()));
        }
    }

    /* renamed from: r1 */
    private final void m35596r1(InterfaceC10576b interfaceC10576b, StringBuilder sb) {
        if (C10187d.m35809J(interfaceC10576b) && interfaceC10576b.mo32879j() == EnumC10583d0.FINAL) {
            return;
        }
        if (m35646i0() == EnumC10179j.RENDER_OVERRIDE && interfaceC10576b.mo32879j() == EnumC10583d0.OPEN && m35559Q0(interfaceC10576b)) {
            return;
        }
        EnumC10583d0 enumC10583d0Mo32879j = interfaceC10576b.mo32879j();
        C9801m.m32345e(enumC10583d0Mo32879j, "callable.modality");
        m35595q1(enumC10583d0Mo32879j, sb, m35551N0(interfaceC10576b));
    }

    /* renamed from: s1 */
    private final void m35597s1(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m35592m1(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m35598t1(InterfaceC10609m interfaceC10609m, StringBuilder sb, boolean z) {
        C10163f name = interfaceC10609m.getName();
        C9801m.m32345e(name, "descriptor.name");
        sb.append(mo35504v(name, z));
    }

    /* renamed from: u1 */
    private final void m35599u1(StringBuilder sb, AbstractC10344e0 abstractC10344e0) {
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        C10331a c10331a = abstractC10381q1Mo36635R0 instanceof C10331a ? (C10331a) abstractC10381q1Mo36635R0 : null;
        if (c10331a == null) {
            m35600v1(sb, abstractC10344e0);
            return;
        }
        if (m35667v0()) {
            m35600v1(sb, c10331a.m36557W());
            return;
        }
        m35600v1(sb, c10331a.m36559a1());
        if (m35668w0()) {
            m35561R0(sb, c10331a);
        }
    }

    /* renamed from: v1 */
    private final void m35600v1(StringBuilder sb, AbstractC10344e0 abstractC10344e0) {
        if ((abstractC10344e0 instanceof AbstractC10387s1) && mo35655n() && !((AbstractC10387s1) abstractC10344e0).mo36714T0()) {
            sb.append("<Not computed yet>");
            return;
        }
        AbstractC10381q1 abstractC10381q1Mo36635R0 = abstractC10344e0.mo36635R0();
        if (abstractC10381q1Mo36635R0 instanceof AbstractC10458y) {
            sb.append(((AbstractC10458y) abstractC10381q1Mo36635R0).mo33549Y0(this, this));
        } else if (abstractC10381q1Mo36635R0 instanceof AbstractC10368m0) {
            m35535F1(sb, (AbstractC10368m0) abstractC10381q1Mo36635R0);
        }
    }

    /* renamed from: w1 */
    private final void m35601w1(InterfaceC10576b interfaceC10576b, StringBuilder sb) {
        if (m35640f0().contains(EnumC10174e.OVERRIDE) && m35559Q0(interfaceC10576b) && m35646i0() != EnumC10179j.RENDER_OPEN) {
            m35597s1(sb, true, "override");
            if (m35611F0()) {
                sb.append("/*");
                sb.append(interfaceC10576b.mo37027e().size());
                sb.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m35602x1(InterfaceC10604k0 interfaceC10604k0, StringBuilder sb) {
        m35603y1(interfaceC10604k0.mo37712d(), "package-fragment", sb);
        if (mo35655n()) {
            sb.append(" in ");
            m35598t1(interfaceC10604k0.mo32876b(), sb, false);
        }
    }

    /* renamed from: y1 */
    private final void m35603y1(C10160c c10160c, String str, StringBuilder sb) {
        sb.append(m35592m1(str));
        C10161d c10161dM35428j = c10160c.m35428j();
        C9801m.m32345e(c10161dM35428j, "fqName.toUnsafe()");
        String strMo35503u = mo35503u(c10161dM35428j);
        if (strMo35503u.length() > 0) {
            sb.append(" ");
            sb.append(strMo35503u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public final void m35605z1(InterfaceC10636p0 interfaceC10636p0, StringBuilder sb) {
        m35603y1(interfaceC10636p0.mo37750d(), Constants.PACKAGE, sb);
        if (mo35655n()) {
            sb.append(" in context of ");
            m35598t1(interfaceC10636p0.mo37752v0(), sb, false);
        }
    }

    /* renamed from: A0 */
    public EnumC10182m m35606A0() {
        return this.f39394l.m35732Z();
    }

    /* renamed from: B0 */
    public Function1<AbstractC10344e0, AbstractC10344e0> m35607B0() {
        return this.f39394l.m35733a0();
    }

    /* renamed from: C0 */
    public boolean m35608C0() {
        return this.f39394l.m35734b0();
    }

    /* renamed from: D0 */
    public boolean m35609D0() {
        return this.f39394l.m35735c0();
    }

    /* renamed from: E0 */
    public AbstractC10172c.l m35610E0() {
        return this.f39394l.m35736d0();
    }

    /* renamed from: F0 */
    public boolean m35611F0() {
        return this.f39394l.m35737e0();
    }

    /* renamed from: G0 */
    public boolean m35612G0() {
        return this.f39394l.m35738f0();
    }

    /* renamed from: H0 */
    public boolean m35613H0() {
        return this.f39394l.m35739g0();
    }

    /* renamed from: I0 */
    public boolean m35614I0() {
        return this.f39394l.m35740h0();
    }

    /* renamed from: J0 */
    public boolean m35615J0() {
        return this.f39394l.m35741i0();
    }

    /* renamed from: K0 */
    public boolean m35616K0() {
        return this.f39394l.m35742j0();
    }

    /* renamed from: K1 */
    public String m35617K1(List<? extends InterfaceC10351g1> list) {
        C9801m.m32346f(list, "typeArguments");
        if (list.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m35557P0());
        m35547M(sb, list);
        sb.append(m35546L0());
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: L1 */
    public String m35618L1(InterfaceC10345e1 interfaceC10345e1) {
        C9801m.m32346f(interfaceC10345e1, "typeConstructor");
        InterfaceC10594h interfaceC10594hMo32891w = interfaceC10345e1.mo32891w();
        if (interfaceC10594hMo32891w instanceof InterfaceC10587e1 ? true : interfaceC10594hMo32891w instanceof InterfaceC10585e ? true : interfaceC10594hMo32891w instanceof InterfaceC10584d1) {
            return m35630a1(interfaceC10594hMo32891w);
        }
        if (interfaceC10594hMo32891w == null) {
            return interfaceC10345e1 instanceof C10341d0 ? ((C10341d0) interfaceC10345e1).m36604j(h.f39406f) : interfaceC10345e1.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC10594hMo32891w.getClass()).toString());
    }

    /* renamed from: Q */
    public boolean m35619Q() {
        return this.f39394l.m35746r();
    }

    /* renamed from: R */
    public boolean m35620R() {
        return this.f39394l.m35747s();
    }

    /* renamed from: S */
    public Function1<InterfaceC10616c, Boolean> m35621S() {
        return this.f39394l.m35748t();
    }

    /* renamed from: T */
    public boolean m35622T() {
        return this.f39394l.m35749u();
    }

    /* renamed from: U */
    public boolean m35623U() {
        return this.f39394l.m35750v();
    }

    /* renamed from: V */
    public InterfaceC10171b m35624V() {
        return this.f39394l.m35751w();
    }

    /* renamed from: W */
    public Function1<InterfaceC10599i1, String> m35625W() {
        return this.f39394l.m35752x();
    }

    /* renamed from: X */
    public boolean m35626X() {
        return this.f39394l.m35753y();
    }

    /* renamed from: Y */
    public Set<C10160c> m35627Y() {
        return this.f39394l.m35754z();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: a */
    public void mo35628a(Set<C10160c> set) {
        C9801m.m32346f(set, "<set-?>");
        this.f39394l.mo35628a(set);
    }

    /* renamed from: a0 */
    public boolean m35629a0() {
        return this.f39394l.m35707A();
    }

    /* renamed from: a1 */
    public String m35630a1(InterfaceC10594h interfaceC10594h) {
        C9801m.m32346f(interfaceC10594h, "klass");
        return C10427k.m37054m(interfaceC10594h) ? interfaceC10594h.mo32877h().toString() : m35624V().mo35496a(interfaceC10594h, this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: b */
    public void mo35631b(boolean z) {
        this.f39394l.mo35631b(z);
    }

    /* renamed from: b0 */
    public boolean m35632b0() {
        return this.f39394l.m35708B();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: c */
    public void mo35633c(Set<? extends EnumC10174e> set) {
        C9801m.m32346f(set, "<set-?>");
        this.f39394l.mo35633c(set);
    }

    /* renamed from: c0 */
    public boolean m35634c0() {
        return this.f39394l.m35709C();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: d */
    public void mo35635d(EnumC10180k enumC10180k) {
        C9801m.m32346f(enumC10180k, "<set-?>");
        this.f39394l.mo35635d(enumC10180k);
    }

    /* renamed from: d0 */
    public boolean m35636d0() {
        return this.f39394l.m35710D();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: e */
    public void mo35637e(boolean z) {
        this.f39394l.mo35637e(z);
    }

    /* renamed from: e0 */
    public boolean m35638e0() {
        return this.f39394l.m35711E();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: f */
    public boolean mo35639f() {
        return this.f39394l.mo35639f();
    }

    /* renamed from: f0 */
    public Set<EnumC10174e> m35640f0() {
        return this.f39394l.m35712F();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: g */
    public void mo35641g(InterfaceC10171b interfaceC10171b) {
        C9801m.m32346f(interfaceC10171b, "<set-?>");
        this.f39394l.mo35641g(interfaceC10171b);
    }

    /* renamed from: g0 */
    public boolean m35642g0() {
        return this.f39394l.m35713G();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: h */
    public void mo35643h(boolean z) {
        this.f39394l.mo35643h(z);
    }

    /* renamed from: h0 */
    public final C10176g m35644h0() {
        return this.f39394l;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: i */
    public void mo35645i(boolean z) {
        this.f39394l.mo35645i(z);
    }

    /* renamed from: i0 */
    public EnumC10179j m35646i0() {
        return this.f39394l.m35714H();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: j */
    public void mo35647j(boolean z) {
        this.f39394l.mo35647j(z);
    }

    /* renamed from: j0 */
    public EnumC10180k m35648j0() {
        return this.f39394l.m35715I();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: k */
    public void mo35649k(boolean z) {
        this.f39394l.mo35649k(z);
    }

    /* renamed from: k0 */
    public boolean m35650k0() {
        return this.f39394l.m35716J();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: l */
    public void mo35651l(EnumC10182m enumC10182m) {
        C9801m.m32346f(enumC10182m, "<set-?>");
        this.f39394l.mo35651l(enumC10182m);
    }

    /* renamed from: l0 */
    public boolean m35652l0() {
        return this.f39394l.m35717K();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: m */
    public Set<C10160c> mo35653m() {
        return this.f39394l.mo35653m();
    }

    /* renamed from: m0 */
    public EnumC10181l m35654m0() {
        return this.f39394l.m35718L();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: n */
    public boolean mo35655n() {
        return this.f39394l.mo35655n();
    }

    /* renamed from: n0 */
    public boolean m35656n0() {
        return this.f39394l.m35719M();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: o */
    public EnumC10170a mo35657o() {
        return this.f39394l.mo35657o();
    }

    /* renamed from: o0 */
    public boolean m35658o0() {
        return this.f39394l.m35720N();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10175f
    /* renamed from: p */
    public void mo35659p(boolean z) {
        this.f39394l.mo35659p(z);
    }

    /* renamed from: p0 */
    public boolean m35660p0() {
        return this.f39394l.m35721O();
    }

    /* renamed from: p1 */
    public String m35661p1(String str) {
        C9801m.m32346f(str, "message");
        int i2 = b.f39398a[m35606A0().ordinal()];
        if (i2 == 1) {
            return str;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + str + "</i>";
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c
    /* renamed from: q */
    public String mo35500q(InterfaceC10609m interfaceC10609m) {
        C9801m.m32346f(interfaceC10609m, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        interfaceC10609m.mo37017L(new a(), sb);
        if (m35612G0()) {
            m35545L(sb, interfaceC10609m);
        }
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: q0 */
    public boolean m35662q0() {
        return this.f39394l.m35722P();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c
    /* renamed from: r */
    public String mo35501r(InterfaceC10616c interfaceC10616c, EnumC10618e enumC10618e) {
        C9801m.m32346f(interfaceC10616c, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC10618e != null) {
            sb.append(enumC10618e.m37730k() + ':');
        }
        AbstractC10344e0 type = interfaceC10616c.getType();
        sb.append(mo35505w(type));
        if (m35632b0()) {
            List<String> listM35567U0 = m35567U0(interfaceC10616c);
            if (m35634c0() || (!listM35567U0.isEmpty())) {
                C10782c0.m38597c0(listM35567U0, sb, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (m35611F0() && (C10350g0.m36706a(type) || (type.mo35993O0().mo32891w() instanceof C10601j0.b))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: r0 */
    public boolean m35663r0() {
        return this.f39394l.m35723Q();
    }

    /* renamed from: s0 */
    public boolean m35664s0() {
        return this.f39394l.m35724R();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c
    /* renamed from: t */
    public String mo35502t(String str, String str2, AbstractC9914h abstractC9914h) {
        C9801m.m32346f(str, "lowerRendered");
        C9801m.m32346f(str2, "upperRendered");
        C9801m.m32346f(abstractC9914h, "builtIns");
        if (m35553O(str, str2)) {
            if (!C10546u.m37511E(str2, "(", false, 2, null)) {
                return str + '!';
            }
            return '(' + str + ")!";
        }
        InterfaceC10171b interfaceC10171bM35624V = m35624V();
        InterfaceC10585e interfaceC10585eM32803w = abstractC9914h.m32803w();
        C9801m.m32345e(interfaceC10585eM32803w, "builtIns.collection");
        String strM37545M0 = C10547v.m37545M0(interfaceC10171bM35624V.mo35496a(interfaceC10585eM32803w, this), "Collection", null, 2, null);
        String strM35576Y1 = m35576Y1(str, strM37545M0 + "Mutable", str2, strM37545M0, strM37545M0 + "(Mutable)");
        if (strM35576Y1 != null) {
            return strM35576Y1;
        }
        String strM35576Y12 = m35576Y1(str, strM37545M0 + "MutableMap.MutableEntry", str2, strM37545M0 + "Map.Entry", strM37545M0 + "(Mutable)Map.(Mutable)Entry");
        if (strM35576Y12 != null) {
            return strM35576Y12;
        }
        InterfaceC10171b interfaceC10171bM35624V2 = m35624V();
        InterfaceC10585e interfaceC10585eM32792j = abstractC9914h.m32792j();
        C9801m.m32345e(interfaceC10585eM32792j, "builtIns.array");
        String strM37545M02 = C10547v.m37545M0(interfaceC10171bM35624V2.mo35496a(interfaceC10585eM32792j, this), "Array", null, 2, null);
        String strM35576Y13 = m35576Y1(str, strM37545M02 + m35556P("Array<"), str2, strM37545M02 + m35556P("Array<out "), strM37545M02 + m35556P("Array<(out) "));
        if (strM35576Y13 != null) {
            return strM35576Y13;
        }
        return '(' + str + ".." + str2 + ')';
    }

    /* renamed from: t0 */
    public boolean m35665t0() {
        return this.f39394l.m35725S();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c
    /* renamed from: u */
    public String mo35503u(C10161d c10161d) {
        C9801m.m32346f(c10161d, "fqName");
        List<C10163f> listM35437h = c10161d.m35437h();
        C9801m.m32345e(listM35437h, "fqName.pathSegments()");
        return m35588i1(listM35437h);
    }

    /* renamed from: u0 */
    public boolean m35666u0() {
        return this.f39394l.m35726T();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c
    /* renamed from: v */
    public String mo35504v(C10163f c10163f, boolean z) {
        C9801m.m32346f(c10163f, "name");
        String strM35556P = m35556P(C10183n.m35764b(c10163f));
        if (!m35622T() || m35606A0() != EnumC10182m.HTML || !z) {
            return strM35556P;
        }
        return "<b>" + strM35556P + "</b>";
    }

    /* renamed from: v0 */
    public boolean m35667v0() {
        return this.f39394l.m35727U();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c
    /* renamed from: w */
    public String mo35505w(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "type");
        StringBuilder sb = new StringBuilder();
        m35599u1(sb, m35607B0().invoke(abstractC10344e0));
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: w0 */
    public boolean m35668w0() {
        return this.f39394l.m35728V();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10172c
    /* renamed from: x */
    public String mo35506x(InterfaceC10351g1 interfaceC10351g1) {
        C9801m.m32346f(interfaceC10351g1, "typeProjection");
        StringBuilder sb = new StringBuilder();
        m35547M(sb, C10815t.m38883e(interfaceC10351g1));
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* renamed from: x0 */
    public boolean m35669x0() {
        return this.f39394l.m35729W();
    }

    /* renamed from: y0 */
    public boolean m35670y0() {
        return this.f39394l.m35730X();
    }

    /* renamed from: z0 */
    public boolean m35671z0() {
        return this.f39394l.m35731Y();
    }
}
