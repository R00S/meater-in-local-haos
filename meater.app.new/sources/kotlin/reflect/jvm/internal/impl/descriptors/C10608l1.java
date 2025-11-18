package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;
import kotlin.collections.C10808p0;
import kotlin.jvm.internal.C9801m;

/* compiled from: Visibilities.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1 */
/* loaded from: classes2.dex */
public final class C10608l1 {

    /* renamed from: a */
    public static final C10608l1 f40770a = new C10608l1();

    /* renamed from: b */
    private static final Map<AbstractC10611m1, Integer> f40771b;

    /* renamed from: c */
    private static final h f40772c;

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$a */
    public static final class a extends AbstractC10611m1 {

        /* renamed from: c */
        public static final a f40773c = new a();

        private a() {
            super("inherited", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$b */
    public static final class b extends AbstractC10611m1 {

        /* renamed from: c */
        public static final b f40774c = new b();

        private b() {
            super("internal", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$c */
    public static final class c extends AbstractC10611m1 {

        /* renamed from: c */
        public static final c f40775c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$d */
    public static final class d extends AbstractC10611m1 {

        /* renamed from: c */
        public static final d f40776c = new d();

        private d() {
            super("local", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$e */
    public static final class e extends AbstractC10611m1 {

        /* renamed from: c */
        public static final e f40777c = new e();

        private e() {
            super("private", false);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$f */
    public static final class f extends AbstractC10611m1 {

        /* renamed from: c */
        public static final f f40778c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10611m1
        /* renamed from: b */
        public String mo37717b() {
            return "private/*private to this*/";
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$g */
    public static final class g extends AbstractC10611m1 {

        /* renamed from: c */
        public static final g f40779c = new g();

        private g() {
            super("protected", true);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$h */
    public static final class h extends AbstractC10611m1 {

        /* renamed from: c */
        public static final h f40780c = new h();

        private h() {
            super("public", true);
        }
    }

    /* compiled from: Visibilities.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1$i */
    public static final class i extends AbstractC10611m1 {

        /* renamed from: c */
        public static final i f40781c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map mapM38791c = C10808p0.m38791c();
        mapM38791c.put(f.f40778c, 0);
        mapM38791c.put(e.f40777c, 0);
        mapM38791c.put(b.f40774c, 1);
        mapM38791c.put(g.f40779c, 1);
        h hVar = h.f40780c;
        mapM38791c.put(hVar, 2);
        f40771b = C10808p0.m38790b(mapM38791c);
        f40772c = hVar;
    }

    private C10608l1() {
    }

    /* renamed from: a */
    public final Integer m37715a(AbstractC10611m1 abstractC10611m1, AbstractC10611m1 abstractC10611m12) {
        C9801m.m32346f(abstractC10611m1, "first");
        C9801m.m32346f(abstractC10611m12, "second");
        if (abstractC10611m1 == abstractC10611m12) {
            return 0;
        }
        Map<AbstractC10611m1, Integer> map = f40771b;
        Integer num = map.get(abstractC10611m1);
        Integer num2 = map.get(abstractC10611m12);
        if (num == null || num2 == null || C9801m.m32341a(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public final boolean m37716b(AbstractC10611m1 abstractC10611m1) {
        C9801m.m32346f(abstractC10611m1, "visibility");
        return abstractC10611m1 == e.f40777c || abstractC10611m1 == f.f40778c;
    }
}
