package jb;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import yb.EnumC5149e;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final b f43668a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final d f43669b = new d(EnumC5149e.BOOLEAN);

    /* renamed from: c, reason: collision with root package name */
    private static final d f43670c = new d(EnumC5149e.CHAR);

    /* renamed from: d, reason: collision with root package name */
    private static final d f43671d = new d(EnumC5149e.BYTE);

    /* renamed from: e, reason: collision with root package name */
    private static final d f43672e = new d(EnumC5149e.SHORT);

    /* renamed from: f, reason: collision with root package name */
    private static final d f43673f = new d(EnumC5149e.INT);

    /* renamed from: g, reason: collision with root package name */
    private static final d f43674g = new d(EnumC5149e.FLOAT);

    /* renamed from: h, reason: collision with root package name */
    private static final d f43675h = new d(EnumC5149e.LONG);

    /* renamed from: i, reason: collision with root package name */
    private static final d f43676i = new d(EnumC5149e.DOUBLE);

    /* compiled from: methodSignatureMapping.kt */
    public static final class a extends s {

        /* renamed from: j, reason: collision with root package name */
        private final s f43677j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s elementType) {
            super(null);
            C3862t.g(elementType, "elementType");
            this.f43677j = elementType;
        }

        public final s i() {
            return this.f43677j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        public final d a() {
            return s.f43669b;
        }

        public final d b() {
            return s.f43671d;
        }

        public final d c() {
            return s.f43670c;
        }

        public final d d() {
            return s.f43676i;
        }

        public final d e() {
            return s.f43674g;
        }

        public final d f() {
            return s.f43673f;
        }

        public final d g() {
            return s.f43675h;
        }

        public final d h() {
            return s.f43672e;
        }

        private b() {
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class c extends s {

        /* renamed from: j, reason: collision with root package name */
        private final String f43678j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String internalName) {
            super(null);
            C3862t.g(internalName, "internalName");
            this.f43678j = internalName;
        }

        public final String i() {
            return this.f43678j;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class d extends s {

        /* renamed from: j, reason: collision with root package name */
        private final EnumC5149e f43679j;

        public d(EnumC5149e enumC5149e) {
            super(null);
            this.f43679j = enumC5149e;
        }

        public final EnumC5149e i() {
            return this.f43679j;
        }
    }

    public /* synthetic */ s(C3854k c3854k) {
        this();
    }

    public String toString() {
        return u.f43680a.a(this);
    }

    private s() {
    }
}
