package e6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"Le6/j;", "", "Lo4/j;", "a", "()Lo4/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getEndTime", "endTime", "b", "getStartTime", "startTime", "c", "Ljava/lang/String;", "getText", "text", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: e6.j, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class OverlayText {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("end_time")
    private final int endTime;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("start_time")
    private final int startTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("text")
    private final String text;

    public final o4.OverlayText a() {
        int i10 = this.endTime;
        return new o4.OverlayText(this.text, this.startTime, i10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayText)) {
            return false;
        }
        OverlayText overlayText = (OverlayText) other;
        return this.endTime == overlayText.endTime && this.startTime == overlayText.startTime && C3862t.b(this.text, overlayText.text);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.endTime) * 31) + Integer.hashCode(this.startTime)) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "OverlayText(endTime=" + this.endTime + ", startTime=" + this.startTime + ", text=" + this.text + ")";
    }
}
