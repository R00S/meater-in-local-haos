package M0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: ImeAction.kt */
@Aa.b
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"LM0/p;", "", "", "value", "j", "(I)I", "", "n", "(I)Ljava/lang/String;", "m", "other", "", "k", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f11928c = j(-1);

    /* renamed from: d, reason: collision with root package name */
    private static final int f11929d = j(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f11930e = j(0);

    /* renamed from: f, reason: collision with root package name */
    private static final int f11931f = j(2);

    /* renamed from: g, reason: collision with root package name */
    private static final int f11932g = j(3);

    /* renamed from: h, reason: collision with root package name */
    private static final int f11933h = j(4);

    /* renamed from: i, reason: collision with root package name */
    private static final int f11934i = j(5);

    /* renamed from: j, reason: collision with root package name */
    private static final int f11935j = j(6);

    /* renamed from: k, reason: collision with root package name */
    private static final int f11936k = j(7);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: ImeAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"LM0/p$a;", "", "<init>", "()V", "LM0/p;", "Default", "I", "a", "()I", "getDefault-eUduSuo$annotations", "None", "e", "getNone-eUduSuo$annotations", "Go", "c", "getGo-eUduSuo$annotations", "Search", "g", "getSearch-eUduSuo$annotations", "Send", "h", "getSend-eUduSuo$annotations", "Previous", "f", "getPrevious-eUduSuo$annotations", "Next", "d", "getNext-eUduSuo$annotations", "Done", "b", "getDone-eUduSuo$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: M0.p$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final int a() {
            return p.f11929d;
        }

        public final int b() {
            return p.f11936k;
        }

        public final int c() {
            return p.f11931f;
        }

        public final int d() {
            return p.f11935j;
        }

        public final int e() {
            return p.f11930e;
        }

        public final int f() {
            return p.f11934i;
        }

        public final int g() {
            return p.f11932g;
        }

        public final int h() {
            return p.f11933h;
        }

        private Companion() {
        }
    }

    private /* synthetic */ p(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ p i(int i10) {
        return new p(i10);
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof p) && i10 == ((p) obj).getValue();
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return l(i10, f11928c) ? "Unspecified" : l(i10, f11930e) ? "None" : l(i10, f11929d) ? "Default" : l(i10, f11931f) ? "Go" : l(i10, f11932g) ? "Search" : l(i10, f11933h) ? "Send" : l(i10, f11934i) ? "Previous" : l(i10, f11935j) ? "Next" : l(i10, f11936k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.value, obj);
    }

    public int hashCode() {
        return m(this.value);
    }

    /* renamed from: o, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return n(this.value);
    }

    private static int j(int i10) {
        return i10;
    }
}
