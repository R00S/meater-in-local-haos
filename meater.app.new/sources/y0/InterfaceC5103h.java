package y0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: BeyondBoundsLayout.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\n\u000bJ8\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ly0/h;", "", "T", "Ly0/h$b;", "direction", "Lkotlin/Function1;", "Ly0/h$a;", "block", "m", "(ILBa/l;)Ljava/lang/Object;", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5103h {

    /* compiled from: BeyondBoundsLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Ly0/h$a;", "", "", "a", "()Z", "hasMoreContent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.h$a */
    public interface a {
        boolean a();
    }

    <T> T m(int direction, Ba.l<? super a, ? extends T> block);

    /* compiled from: BeyondBoundsLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Ly0/h$b;", "", "", "value", "g", "(I)I", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Aa.b
    /* renamed from: y0.h$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f53040b = g(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f53041c = g(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f53042d = g(3);

        /* renamed from: e, reason: collision with root package name */
        private static final int f53043e = g(4);

        /* renamed from: f, reason: collision with root package name */
        private static final int f53044f = g(5);

        /* renamed from: g, reason: collision with root package name */
        private static final int f53045g = g(6);

        /* compiled from: BeyondBoundsLayout.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Ly0/h$b$a;", "", "<init>", "()V", "Ly0/h$b;", "Before", "I", "c", "()I", "After", "b", "Left", "e", "Right", "f", "Above", "a", "Below", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: y0.h$b$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final int a() {
                return b.f53044f;
            }

            public final int b() {
                return b.f53041c;
            }

            public final int c() {
                return b.f53040b;
            }

            public final int d() {
                return b.f53045g;
            }

            public final int e() {
                return b.f53042d;
            }

            public final int f() {
                return b.f53043e;
            }

            private Companion() {
            }
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }

        public static int g(int i10) {
            return i10;
        }
    }
}
