package Vb;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: measureTime.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0018"}, d2 = {"LVb/i;", "T", "", "value", "LVb/a;", "duration", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "J", "()J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vb.i, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class TimedValue<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long duration;

    public /* synthetic */ TimedValue(Object obj, long j10, C3854k c3854k) {
        this(obj, j10);
    }

    /* renamed from: a, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final T b() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return C3862t.b(this.value, timedValue.value) && a.x(this.duration, timedValue.duration);
    }

    public int hashCode() {
        T t10 = this.value;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + a.L(this.duration);
    }

    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) a.V(this.duration)) + ')';
    }

    private TimedValue(T t10, long j10) {
        this.value = t10;
        this.duration = j10;
    }
}
