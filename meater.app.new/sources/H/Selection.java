package H;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Selection.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"LH/e;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "handlesCrossed", "LH/e$a;", "start", "LH/e$a;", "c", "()LH/e$a;", "end", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H.e, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class Selection {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean handlesCrossed;

    /* compiled from: Selection.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LH/e$a;", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H.e$a */
    public static final /* data */ class a {
    }

    public final a a() {
        return null;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final a c() {
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) other;
        selection.getClass();
        return C3862t.b(null, null) && C3862t.b(null, null) && this.handlesCrossed == selection.handlesCrossed;
    }

    public int hashCode() {
        throw null;
    }

    public String toString() {
        return "Selection(start=" + ((Object) null) + ", end=" + ((Object) null) + ", handlesCrossed=" + this.handlesCrossed + ')';
    }
}
