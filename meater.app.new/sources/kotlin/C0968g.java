package kotlin;

import Q.b;
import kotlin.Metadata;

/* compiled from: LazyLayoutBeyondBoundsInfo.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LC/g;", "", "<init>", "()V", "", "start", "end", "LC/g$a;", "a", "(II)LC/g$a;", "interval", "Loa/F;", "e", "(LC/g$a;)V", "", "d", "()Z", "LQ/b;", "LQ/b;", "beyondBoundsItems", "c", "()I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968g {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2037b = b.f14177E;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<Interval> beyondBoundsItems = new b<>(new Interval[16], 0);

    /* compiled from: LazyLayoutBeyondBoundsInfo.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"LC/g$a;", "", "", "start", "end", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.g$a, reason: from toString */
    public static final /* data */ class Interval {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        public Interval(int i10, int i11) {
            this.start = i10;
            this.end = i11;
            if (i10 < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) other;
            return this.start == interval.start && this.end == interval.end;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    public final Interval a(int start, int end) {
        Interval interval = new Interval(start, end);
        this.beyondBoundsItems.c(interval);
        return interval;
    }

    public final int b() {
        int end = this.beyondBoundsItems.r().getEnd();
        b<Interval> bVar = this.beyondBoundsItems;
        int size = bVar.getSize();
        if (size > 0) {
            Interval[] intervalArrT = bVar.t();
            int i10 = 0;
            do {
                Interval interval = intervalArrT[i10];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i10++;
            } while (i10 < size);
        }
        return end;
    }

    public final int c() {
        int start = this.beyondBoundsItems.r().getStart();
        b<Interval> bVar = this.beyondBoundsItems;
        int size = bVar.getSize();
        if (size > 0) {
            Interval[] intervalArrT = bVar.t();
            int i10 = 0;
            do {
                Interval interval = intervalArrT[i10];
                if (interval.getStart() < start) {
                    start = interval.getStart();
                }
                i10++;
            } while (i10 < size);
        }
        if (start >= 0) {
            return start;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean d() {
        return this.beyondBoundsItems.y();
    }

    public final void e(Interval interval) {
        this.beyondBoundsItems.B(interval);
    }
}
