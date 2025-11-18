package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e;

/* compiled from: methodSignatureMapping.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.l */
/* loaded from: classes3.dex */
public abstract class AbstractC10096l {

    /* renamed from: a */
    public static final b f38463a = new b(null);

    /* renamed from: b */
    private static final d f38464b = new d(EnumC10240e.BOOLEAN);

    /* renamed from: c */
    private static final d f38465c = new d(EnumC10240e.CHAR);

    /* renamed from: d */
    private static final d f38466d = new d(EnumC10240e.BYTE);

    /* renamed from: e */
    private static final d f38467e = new d(EnumC10240e.SHORT);

    /* renamed from: f */
    private static final d f38468f = new d(EnumC10240e.INT);

    /* renamed from: g */
    private static final d f38469g = new d(EnumC10240e.FLOAT);

    /* renamed from: h */
    private static final d f38470h = new d(EnumC10240e.LONG);

    /* renamed from: i */
    private static final d f38471i = new d(EnumC10240e.DOUBLE);

    /* compiled from: methodSignatureMapping.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.l$a */
    public static final class a extends AbstractC10096l {

        /* renamed from: j */
        private final AbstractC10096l f38472j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC10096l abstractC10096l) {
            super(null);
            C9801m.m32346f(abstractC10096l, "elementType");
            this.f38472j = abstractC10096l;
        }

        /* renamed from: i */
        public final AbstractC10096l m33995i() {
            return this.f38472j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.l$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final d m33996a() {
            return AbstractC10096l.f38464b;
        }

        /* renamed from: b */
        public final d m33997b() {
            return AbstractC10096l.f38466d;
        }

        /* renamed from: c */
        public final d m33998c() {
            return AbstractC10096l.f38465c;
        }

        /* renamed from: d */
        public final d m33999d() {
            return AbstractC10096l.f38471i;
        }

        /* renamed from: e */
        public final d m34000e() {
            return AbstractC10096l.f38469g;
        }

        /* renamed from: f */
        public final d m34001f() {
            return AbstractC10096l.f38468f;
        }

        /* renamed from: g */
        public final d m34002g() {
            return AbstractC10096l.f38470h;
        }

        /* renamed from: h */
        public final d m34003h() {
            return AbstractC10096l.f38467e;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.l$c */
    public static final class c extends AbstractC10096l {

        /* renamed from: j */
        private final String f38473j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            C9801m.m32346f(str, "internalName");
            this.f38473j = str;
        }

        /* renamed from: i */
        public final String m34004i() {
            return this.f38473j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.l$d */
    public static final class d extends AbstractC10096l {

        /* renamed from: j */
        private final EnumC10240e f38474j;

        public d(EnumC10240e enumC10240e) {
            super(null);
            this.f38474j = enumC10240e;
        }

        /* renamed from: i */
        public final EnumC10240e m34005i() {
            return this.f38474j;
        }
    }

    private AbstractC10096l() {
    }

    public /* synthetic */ AbstractC10096l(C9789g c9789g) {
        this();
    }

    public String toString() {
        return C10098n.f38475a.mo34006a(this);
    }
}
