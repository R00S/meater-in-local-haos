package P5;

import F3.c;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: WindowStateUtils.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH×\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LP5/m;", "", "Landroid/graphics/Rect;", "hingePosition", "LF3/c$a;", "orientation", "<init>", "(Landroid/graphics/Rect;LF3/c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Rect;", "getHingePosition", "()Landroid/graphics/Rect;", "b", "LF3/c$a;", "getOrientation", "()LF3/c$a;", "setOrientation", "(LF3/c$a;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: P5.m, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class Separating {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rect hingePosition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private c.a orientation;

    public Separating(Rect hingePosition, c.a orientation) {
        C3862t.g(hingePosition, "hingePosition");
        C3862t.g(orientation, "orientation");
        this.hingePosition = hingePosition;
        this.orientation = orientation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Separating)) {
            return false;
        }
        Separating separating = (Separating) other;
        return C3862t.b(this.hingePosition, separating.hingePosition) && C3862t.b(this.orientation, separating.orientation);
    }

    public int hashCode() {
        return (this.hingePosition.hashCode() * 31) + this.orientation.hashCode();
    }

    public String toString() {
        return "Separating(hingePosition=" + this.hingePosition + ", orientation=" + this.orientation + ")";
    }
}
