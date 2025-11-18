package u0;

import h0.C3476g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJz\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0086\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b5\u0010*R\u001d\u0010\r\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b8\u00100R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b<\u0010*R$\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b7\u0010=\u0012\u0004\b>\u0010\u001cR(\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b6\u0010*\"\u0004\b@\u0010AR*\u0010H\u001a\u00020B2\u0006\u0010C\u001a\u00020B8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010D\u0012\u0004\bG\u0010\u001c\u001a\u0004\bE\u0010FR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u001c\u001a\u0004\b1\u0010IR\u0017\u0010M\u001a\u00020\b8F¢\u0006\f\u0012\u0004\bL\u0010\u001c\u001a\u0004\bK\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Lu0/z;", "", "Lu0/y;", "id", "", "uptimeMillis", "Lh0/g;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Lu0/M;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/k;)V", "", "Lu0/e;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/k;)V", "Loa/F;", "a", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "b", "(JJJZJJZILjava/util/List;J)Lu0/z;", "d", "(JJJZFJJZILjava/util/List;J)Lu0/z;", "", "toString", "()Ljava/lang/String;", "J", "f", "()J", "o", "c", "h", "Z", "i", "()Z", "e", "F", "j", "()F", "getPreviousUptimeMillis", "g", "k", "l", "I", "n", "()I", "m", "Ljava/util/List;", "get_historical$annotations", "_historical", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "Lu0/d;", "<set-?>", "Lu0/d;", "getConsumed", "()Lu0/d;", "getConsumed$annotations", "consumed", "()Ljava/util/List;", "getHistorical$annotations", "p", "isConsumed$annotations", "isConsumed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.z, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class PointerInputChange {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long uptimeMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pressed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float pressure;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousUptimeMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long previousPosition;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean previousPressed;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int type;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long scrollDelta;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<HistoricalChange> _historical;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long originalEventPosition;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private C4638d consumed;

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, C3854k c3854k) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    public final void a() {
        this.consumed.c(true);
        this.consumed.d(true);
    }

    public final PointerInputChange b(long id2, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        return d(id2, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
    }

    public final PointerInputChange d(long id2, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id2, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.originalEventPosition, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    public final List<HistoricalChange> e() {
        List<HistoricalChange> list = this._historical;
        return list == null ? kotlin.collections.r.m() : list;
    }

    /* renamed from: f, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* renamed from: h, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    /* renamed from: j, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: k, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    /* renamed from: m, reason: from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* renamed from: n, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: o, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean p() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) C4659y.f(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) C3476g.t(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) C3476g.t(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + p() + ", type=" + ((Object) C4627M.i(this.type)) + ", historical=" + e() + ",scrollDelta=" + ((Object) C3476g.t(this.scrollDelta)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, C3854k c3854k) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, (List<HistoricalChange>) list, j15, j16);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.id = j10;
        this.uptimeMillis = j11;
        this.position = j12;
        this.pressed = z10;
        this.pressure = f10;
        this.previousUptimeMillis = j13;
        this.previousPosition = j14;
        this.previousPressed = z11;
        this.type = i10;
        this.scrollDelta = j15;
        this.originalEventPosition = C3476g.INSTANCE.c();
        this.consumed = new C4638d(z12, z12);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, C3854k c3854k) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? C4627M.INSTANCE.d() : i10, (i11 & 1024) != 0 ? C3476g.INSTANCE.c() : j15, null);
    }

    private PointerInputChange(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<HistoricalChange> list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, null);
        this._historical = list;
        this.originalEventPosition = j16;
    }
}
