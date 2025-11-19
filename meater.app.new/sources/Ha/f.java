package Ha;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: PrimitiveRanges.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0018B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"LHa/f;", "LHa/d;", "LHa/c;", "", "", "start", "endInclusive", "<init>", "(II)V", "", "isEmpty", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "A", "()Ljava/lang/Integer;", "z", "F", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends d implements c<Integer> {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: G, reason: collision with root package name */
    private static final f f5638G = new f(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHa/f$a;", "", "<init>", "()V", "LHa/f;", "EMPTY", "LHa/f;", "a", "()LHa/f;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ha.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final f a() {
            return f.f5638G;
        }

        private Companion() {
        }
    }

    public f(int i10, int i11) {
        super(i10, i11, 1);
    }

    public Integer A() {
        return Integer.valueOf(getFirst());
    }

    @Override // Ha.d
    public boolean equals(Object other) {
        if (other instanceof f) {
            if (!isEmpty() || !((f) other).isEmpty()) {
                f fVar = (f) other;
                if (getFirst() != fVar.getFirst() || getLast() != fVar.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Ha.d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // Ha.d
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // Ha.d
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    public Integer z() {
        return Integer.valueOf(getLast());
    }
}
