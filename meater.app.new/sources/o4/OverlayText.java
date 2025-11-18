package o4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: OverlayText.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\f¨\u0006\u0016"}, d2 = {"Lo4/j;", "", "", "text", "", "startTime", "endTime", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.j, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class OverlayText {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int startTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int endTime;

    public OverlayText(String text, int i10, int i11) {
        C3862t.g(text, "text");
        this.text = text;
        this.startTime = i10;
        this.endTime = i11;
    }

    /* renamed from: a, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* renamed from: b, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayText)) {
            return false;
        }
        OverlayText overlayText = (OverlayText) other;
        return C3862t.b(this.text, overlayText.text) && this.startTime == overlayText.startTime && this.endTime == overlayText.endTime;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Integer.hashCode(this.startTime)) * 31) + Integer.hashCode(this.endTime);
    }

    public String toString() {
        return "OverlayText(text=" + this.text + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }
}
