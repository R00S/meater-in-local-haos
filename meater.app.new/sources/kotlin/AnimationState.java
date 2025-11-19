package kotlin;

import kotlin.AbstractC4769q;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.r1;
import kotlin.x1;

/* compiled from: AnimationState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b'\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u00106\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b5\u0010\u001b¨\u00067"}, d2 = {"Lv/k;", "T", "Lv/q;", "V", "LO/x1;", "Lv/q0;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Lv/q0;Ljava/lang/Object;Lv/q;JJZ)V", "", "toString", "()Ljava/lang/String;", "B", "Lv/q0;", "j", "()Lv/q0;", "<set-?>", "C", "LO/p0;", "getValue", "()Ljava/lang/Object;", "v", "(Ljava/lang/Object;)V", "value", "D", "Lv/q;", "q", "()Lv/q;", "w", "(Lv/q;)V", "velocityVector", "E", "J", "i", "()J", "t", "(J)V", "F", "h", "s", "G", "Z", "r", "()Z", "u", "(Z)V", "p", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.k, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AbstractC4769q> implements x1<T> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4770q0<T, V> typeConverter;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 value;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private long lastFrameTimeNanos;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private long finishedTimeNanos;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isRunning;

    public AnimationState(InterfaceC4770q0<T, V> interfaceC4770q0, T t10, V v10, long j10, long j11, boolean z10) {
        V v11;
        this.typeConverter = interfaceC4770q0;
        this.value = r1.c(t10, null, 2, null);
        this.velocityVector = (v10 == null || (v11 = (V) C4771r.e(v10)) == null) ? (V) C4759l.e(interfaceC4770q0, t10) : v11;
        this.lastFrameTimeNanos = j10;
        this.finishedTimeNanos = j11;
        this.isRunning = z10;
    }

    @Override // kotlin.x1
    public T getValue() {
        return this.value.getValue();
    }

    /* renamed from: h, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* renamed from: i, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final InterfaceC4770q0<T, V> j() {
        return this.typeConverter;
    }

    public final T p() {
        return this.typeConverter.b().invoke(this.velocityVector);
    }

    public final V q() {
        return this.velocityVector;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final void s(long j10) {
        this.finishedTimeNanos = j10;
    }

    public final void t(long j10) {
        this.lastFrameTimeNanos = j10;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + p() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    public final void u(boolean z10) {
        this.isRunning = z10;
    }

    public void v(T t10) {
        this.value.setValue(t10);
    }

    public final void w(V v10) {
        this.velocityVector = v10;
    }

    public /* synthetic */ AnimationState(InterfaceC4770q0 interfaceC4770q0, Object obj, AbstractC4769q abstractC4769q, long j10, long j11, boolean z10, int i10, C3854k c3854k) {
        this(interfaceC4770q0, obj, (i10 & 4) != 0 ? null : abstractC4769q, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
