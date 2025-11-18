package y0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3860q;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Ly0/a;", "", "position1", "position2", "c", "(Ly0/a;II)I", "Ly0/p;", "a", "Ly0/p;", "()Ly0/p;", "FirstBaseline", "b", "LastBaseline", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5097b {

    /* renamed from: a, reason: collision with root package name */
    private static final C5111p f53010a = new C5111p(a.f53012B);

    /* renamed from: b, reason: collision with root package name */
    private static final C5111p f53011b = new C5111p(C0775b.f53013B);

    /* compiled from: AlignmentLine.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.b$a */
    /* synthetic */ class a extends C3860q implements Ba.p<Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f53012B = new a();

        a() {
            super(2, Da.a.class, "min", "min(II)I", 1);
        }

        public final Integer c(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return c(num.intValue(), num2.intValue());
        }
    }

    /* compiled from: AlignmentLine.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: y0.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0775b extends C3860q implements Ba.p<Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0775b f53013B = new C0775b();

        C0775b() {
            super(2, Da.a.class, "max", "max(II)I", 1);
        }

        public final Integer c(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return c(num.intValue(), num2.intValue());
        }
    }

    public static final C5111p a() {
        return f53010a;
    }

    public static final C5111p b() {
        return f53011b;
    }

    public static final int c(AbstractC5096a abstractC5096a, int i10, int i11) {
        return abstractC5096a.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
