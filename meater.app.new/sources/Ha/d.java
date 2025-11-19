package Ha;

import kotlin.Metadata;
import kotlin.collections.J;
import kotlin.jvm.internal.C3854k;
import wa.C5013c;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0013¨\u0006\""}, d2 = {"LHa/d;", "", "", "start", "endInclusive", "step", "<init>", "(III)V", "Lkotlin/collections/J;", "x", "()Lkotlin/collections/J;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "B", "I", "i", "first", "C", "j", "last", "D", "w", "E", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class d implements Iterable<Integer>, Ca.a {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int first;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int last;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final int step;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LHa/d$a;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "LHa/d;", "a", "(III)LHa/d;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ha.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final d a(int rangeStart, int rangeEnd, int step) {
            return new d(rangeStart, rangeEnd, step);
        }

        private Companion() {
        }
    }

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i10;
        this.last = C5013c.b(i10, i11, i12);
        this.step = i12;
    }

    public boolean equals(Object other) {
        if (other instanceof d) {
            if (!isEmpty() || !((d) other).isEmpty()) {
                d dVar = (d) other;
                if (this.first != dVar.first || this.last != dVar.last || this.step != dVar.step) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    /* renamed from: i, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            if (this.first <= this.last) {
                return false;
            }
        } else if (this.first >= this.last) {
            return false;
        }
        return true;
    }

    /* renamed from: j, reason: from getter */
    public final int getLast() {
        return this.last;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.step > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.first);
            sb2.append("..");
            sb2.append(this.last);
            sb2.append(" step ");
            i10 = this.step;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.first);
            sb2.append(" downTo ");
            sb2.append(this.last);
            sb2.append(" step ");
            i10 = -this.step;
        }
        sb2.append(i10);
        return sb2.toString();
    }

    /* renamed from: w, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public J iterator() {
        return new e(this.first, this.last, this.step);
    }
}
