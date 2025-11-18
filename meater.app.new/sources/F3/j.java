package F3;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: WindowLayoutInfo.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LF3/j;", "", "", "LF3/a;", "displayFeatures", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/util/List;", "()Ljava/util/List;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<a> displayFeatures;

    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends a> displayFeatures) {
        C3862t.g(displayFeatures, "displayFeatures");
        this.displayFeatures = displayFeatures;
    }

    public final List<a> a() {
        return this.displayFeatures;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !C3862t.b(j.class, other.getClass())) {
            return false;
        }
        return C3862t.b(this.displayFeatures, ((j) other).displayFeatures);
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return r.s0(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
