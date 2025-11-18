package Xb;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import ta.AbstractC4585a;
import ta.g;

/* compiled from: CoroutineName.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0013"}, d2 = {"LXb/H;", "Lta/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "C", "Ljava/lang/String;", "p0", "name", "D", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.H, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class CoroutineName extends AbstractC4585a {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* compiled from: CoroutineName.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LXb/H$a;", "Lta/g$c;", "LXb/H;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.H$a, reason: from kotlin metadata */
    public static final class Companion implements g.c<CoroutineName> {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoroutineName) && C3862t.b(this.name, ((CoroutineName) other).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    /* renamed from: p0, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public String toString() {
        return "CoroutineName(" + this.name + ')';
    }
}
