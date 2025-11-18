package H0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Placeholder.kt */
@Aa.b
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"LH0/x;", "", "", "value", "h", "(I)I", "", "k", "(I)Ljava/lang/String;", "j", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f5443b = h(1);

    /* renamed from: c, reason: collision with root package name */
    private static final int f5444c = h(2);

    /* renamed from: d, reason: collision with root package name */
    private static final int f5445d = h(3);

    /* renamed from: e, reason: collision with root package name */
    private static final int f5446e = h(4);

    /* renamed from: f, reason: collision with root package name */
    private static final int f5447f = h(5);

    /* renamed from: g, reason: collision with root package name */
    private static final int f5448g = h(6);

    /* renamed from: h, reason: collision with root package name */
    private static final int f5449h = h(7);

    /* compiled from: Placeholder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"LH0/x$a;", "", "<init>", "()V", "LH0/x;", "AboveBaseline", "I", "a", "()I", "Top", "g", "Bottom", "b", "Center", "c", "TextTop", "f", "TextBottom", "d", "TextCenter", "e", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H0.x$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final int a() {
            return x.f5443b;
        }

        public final int b() {
            return x.f5445d;
        }

        public final int c() {
            return x.f5446e;
        }

        public final int d() {
            return x.f5448g;
        }

        public final int e() {
            return x.f5449h;
        }

        public final int f() {
            return x.f5447f;
        }

        public final int g() {
            return x.f5444c;
        }

        private Companion() {
        }
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f5443b) ? "AboveBaseline" : i(i10, f5444c) ? "Top" : i(i10, f5445d) ? "Bottom" : i(i10, f5446e) ? "Center" : i(i10, f5447f) ? "TextTop" : i(i10, f5448g) ? "TextBottom" : i(i10, f5449h) ? "TextCenter" : "Invalid";
    }

    public static int h(int i10) {
        return i10;
    }
}
