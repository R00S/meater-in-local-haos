package kotlin;

import Ba.l;
import Ba.p;
import Xb.C1841i;
import Xb.I;
import Xb.J;
import Xb.K;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.C1488A;
import kotlin.C1491B0;
import kotlin.C1509K0;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1547h0;
import kotlin.C1560o;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1555l0;
import kotlin.InterfaceC1559n0;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.f1;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.m1;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.h;
import ua.C4696b;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003/1\"B1\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001f\u0010\u0010J)\u0010\"\u001a\u00020\u00182\u0018\u0010!\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030 R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\u00020\u000e2\u0018\u0010!\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030 R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00028\u0000H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010&\u001a\u00028\u0000H\u0001¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000bH\u0000¢\u0006\u0004\b,\u0010\u001dJ\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u00105\u001a\u0004\b6\u0010.R+\u0010&\u001a\u00028\u00002\u0006\u00107\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010(R7\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000<2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000<8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u00108\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010F\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\r\"\u0004\bE\u0010\u001dR+\u0010J\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010C\u001a\u0004\bH\u0010\r\"\u0004\bI\u0010\u001dR+\u0010P\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u00108\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR,\u0010S\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030 R\b\u0012\u0004\u0012\u00028\u00000\u00000Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010RR\u001e\u0010T\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010RR+\u0010W\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u00188G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00108\u001a\u0004\bU\u0010M\"\u0004\bV\u0010OR\"\u0010\\\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010\r\"\u0004\b[\u0010\u001dR\u001b\u0010^\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010]\u001a\u0004\bX\u0010\rR\u0011\u0010_\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bG\u0010:R\u0011\u0010a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b`\u0010MR$\u0010+\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u000b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\r\"\u0004\bc\u0010\u001dR)\u0010f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030 R\b\u0012\u0004\u0012\u00028\u00000\u00000d8F¢\u0006\u0006\u001a\u0004\bB\u0010e¨\u0006g"}, d2 = {"Lv/m0;", "S", "", "Lv/o0;", "transitionState", "parentTransition", "", "label", "<init>", "(Lv/o0;Lv/m0;Ljava/lang/String;)V", "(Lv/o0;Ljava/lang/String;)V", "", "e", "()J", "Loa/F;", "x", "()V", "q", "frameTimeNanos", "", "durationScale", "s", "(JF)V", "scaledPlayTimeNanos", "", "scaleToEnd", "t", "(JZ)V", "v", "(J)V", "r", "u", "Lv/m0$c;", "animation", "c", "(Lv/m0$c;)Z", "w", "(Lv/m0$c;)V", "targetState", "F", "(Ljava/lang/Object;)V", "d", "(Ljava/lang/Object;LO/l;I)V", "playTimeNanos", "y", "toString", "()Ljava/lang/String;", "a", "Lv/o0;", "b", "Lv/m0;", "getParentTransition", "()Lv/m0;", "Ljava/lang/String;", "getLabel", "<set-?>", "LO/p0;", "k", "()Ljava/lang/Object;", "C", "Lv/m0$a;", "i", "()Lv/m0$a;", "A", "(Lv/m0$a;)V", "segment", "f", "LO/n0;", "n", "E", "_playTimeNanos", "g", "j", "B", "startTimeNanos", "h", "m", "()Z", "D", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/k;", "Landroidx/compose/runtime/snapshots/k;", "_animations", "_transitions", "p", "setSeeking$animation_core_release", "isSeeking", "l", "J", "getLastSeekedTimeNanos$animation_core_release", "setLastSeekedTimeNanos$animation_core_release", "lastSeekedTimeNanos", "LO/x1;", "totalDurationNanos", "currentState", "o", "isRunning", "value", "z", "", "()Ljava/util/List;", "animations", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4762m0<S> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC4766o0<S> transitionState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4762m0<?> parentTransition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 targetState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 segment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1559n0 _playTimeNanos;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1559n0 startTimeNanos;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 updateChildrenNeeded;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<C4762m0<S>.c<?, ?>> _animations;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<C4762m0<?>> _transitions;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 isSeeking;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long lastSeekedTimeNanos;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final x1 totalDurationNanos;

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lv/m0$a;", "S", "", "targetState", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "()Ljava/lang/Object;", "initialState", "c", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.m0$a */
    public interface a<S> {
        S a();

        default boolean b(S s10, S s11) {
            return C3862t.b(s10, a()) && C3862t.b(s11, c());
        }

        S c();
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0004\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lv/m0$b;", "S", "Lv/m0$a;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "c", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.m0$b */
    private static final class b<S> implements a<S> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final S initialState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final S targetState;

        public b(S s10, S s11) {
            this.initialState = s10;
            this.targetState = s11;
        }

        @Override // kotlin.C4762m0.a
        public S a() {
            return this.initialState;
        }

        @Override // kotlin.C4762m0.a
        public S c() {
            return this.targetState;
        }

        public boolean equals(Object other) {
            if (other instanceof a) {
                a aVar = (a) other;
                if (C3862t.b(a(), aVar.a()) && C3862t.b(c(), aVar.c())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            S sA = a();
            int iHashCode = (sA != null ? sA.hashCode() : 0) * 31;
            S sC = c();
            return iHashCode + (sC != null ? sC.hashCode() : 0);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0000¢\u0006\u0004\b \u0010!J-\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00028\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0000¢\u0006\u0004\b\"\u0010#R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\u001cR+\u0010\u001d\u001a\u00028\u00012\u0006\u0010*\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00102R7\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010,\u001a\u0004\b4\u00105\"\u0004\b6\u00107RC\u0010>\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002082\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002088F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010,\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R+\u0010G\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010,\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR+\u0010O\u001a\u00020H2\u0006\u0010*\u001a\u00020H8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR+\u0010U\u001a\u00028\u00012\u0006\u0010*\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010,\u001a\u0004\bT\u0010.\"\u0004\b$\u00100R\u0016\u0010X\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR+\u0010^\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010\u0018R\u0016\u0010`\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010QR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006d"}, d2 = {"Lv/m0$c;", "T", "Lv/q;", "V", "LO/x1;", "initialValue", "initialVelocityVector", "Lv/q0;", "typeConverter", "", "label", "<init>", "(Lv/m0;Ljava/lang/Object;Lv/q;Lv/q0;Ljava/lang/String;)V", "", "isInterrupted", "Loa/F;", "C", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "scaleToEnd", "s", "(JZ)V", "u", "(J)V", "t", "()V", "toString", "()Ljava/lang/String;", "targetValue", "Lv/G;", "animationSpec", "F", "(Ljava/lang/Object;Lv/G;)V", "E", "(Ljava/lang/Object;Ljava/lang/Object;Lv/G;)V", "B", "Lv/q0;", "getTypeConverter", "()Lv/q0;", "Ljava/lang/String;", "getLabel", "<set-?>", "D", "LO/p0;", "q", "()Ljava/lang/Object;", "A", "(Ljava/lang/Object;)V", "Lv/f0;", "Lv/f0;", "defaultSpring", "i", "()Lv/G;", "w", "(Lv/G;)V", "Lv/l0;", "G", "h", "()Lv/l0;", "v", "(Lv/l0;)V", "animation", "H", "Lv/l0;", "initialValueAnimation", "I", "r", "()Z", "y", "(Z)V", "isFinished", "", "J", "LO/l0;", "p", "()F", "z", "(F)V", "resetSnapValue", "K", "Z", "useOnlyInitialValue", "L", "getValue", "value", "M", "Lv/q;", "velocityVector", "N", "LO/n0;", "j", "()J", "x", "durationNanos", "O", "isSeeking", "P", "Lv/G;", "interruptionSpec", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.m0$c */
    public final class c<T, V extends AbstractC4769q> implements x1<T> {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4770q0<T, V> typeConverter;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final String label;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1563p0 targetValue;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final C4748f0<T> defaultSpring;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1563p0 animationSpec;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1563p0 animation;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private C4760l0<T, V> initialValueAnimation;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1563p0 isFinished;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1555l0 resetSnapValue;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private boolean useOnlyInitialValue;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1563p0 value;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata */
        private V velocityVector;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1559n0 durationNanos;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata */
        private boolean isSeeking;

        /* renamed from: P, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4718G<T> interruptionSpec;

        public c(T t10, V v10, InterfaceC4770q0<T, V> interfaceC4770q0, String str) {
            T tInvoke;
            this.typeConverter = interfaceC4770q0;
            this.label = str;
            this.targetValue = r1.c(t10, null, 2, null);
            C4748f0<T> c4748f0H = C4755j.h(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = c4748f0H;
            this.animationSpec = r1.c(c4748f0H, null, 2, null);
            this.animation = r1.c(new C4760l0(i(), interfaceC4770q0, t10, q(), v10), null, 2, null);
            this.isFinished = r1.c(Boolean.TRUE, null, 2, null);
            this.resetSnapValue = C1491B0.a(-1.0f);
            this.value = r1.c(t10, null, 2, null);
            this.velocityVector = v10;
            this.durationNanos = f1.a(h().getDurationNanos());
            Float f10 = C4717F0.h().get(interfaceC4770q0);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                V vInvoke = interfaceC4770q0.a().invoke(t10);
                int size = vInvoke.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    vInvoke.e(i10, fFloatValue);
                }
                tInvoke = this.typeConverter.b().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.interruptionSpec = C4755j.h(0.0f, 0.0f, tInvoke, 3, null);
        }

        private final void A(T t10) {
            this.targetValue.setValue(t10);
        }

        private final void C(T initialValue, boolean isInterrupted) {
            C4760l0<T, V> c4760l0 = this.initialValueAnimation;
            if (C3862t.b(c4760l0 != null ? c4760l0.g() : null, q())) {
                v(new C4760l0<>(this.interruptionSpec, this.typeConverter, initialValue, initialValue, C4771r.g(this.velocityVector)));
                this.useOnlyInitialValue = true;
                x(h().getDurationNanos());
                return;
            }
            InterfaceC4753i interfaceC4753iI = (!isInterrupted || this.isSeeking || (i() instanceof C4748f0)) ? i() : this.interruptionSpec;
            if (C4762m0.this.h() > 0) {
                interfaceC4753iI = C4755j.c(interfaceC4753iI, C4762m0.this.h());
            }
            v(new C4760l0<>(interfaceC4753iI, this.typeConverter, initialValue, q(), this.velocityVector));
            x(h().getDurationNanos());
            this.useOnlyInitialValue = false;
            C4762m0.this.q();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void D(c cVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = cVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            cVar.C(obj, z10);
        }

        private final T q() {
            return this.targetValue.getValue();
        }

        private final void v(C4760l0<T, V> c4760l0) {
            this.animation.setValue(c4760l0);
        }

        private final void w(InterfaceC4718G<T> interfaceC4718G) {
            this.animationSpec.setValue(interfaceC4718G);
        }

        public void B(T t10) {
            this.value.setValue(t10);
        }

        public final void E(T initialValue, T targetValue, InterfaceC4718G<T> animationSpec) {
            A(targetValue);
            w(animationSpec);
            if (C3862t.b(h().i(), initialValue) && C3862t.b(h().g(), targetValue)) {
                return;
            }
            D(this, initialValue, false, 2, null);
        }

        public final void F(T targetValue, InterfaceC4718G<T> animationSpec) {
            if (this.useOnlyInitialValue) {
                C4760l0<T, V> c4760l0 = this.initialValueAnimation;
                if (C3862t.b(targetValue, c4760l0 != null ? c4760l0.g() : null)) {
                    return;
                }
            }
            if (C3862t.b(q(), targetValue) && p() == -1.0f) {
                return;
            }
            A(targetValue);
            w(animationSpec);
            C(p() == -3.0f ? targetValue : getValue(), !r());
            y(p() == -3.0f);
            if (p() >= 0.0f) {
                B(h().f((long) (h().getDurationNanos() * p())));
            } else if (p() == -3.0f) {
                B(targetValue);
            }
            this.useOnlyInitialValue = false;
            z(-1.0f);
        }

        @Override // kotlin.x1
        public T getValue() {
            return this.value.getValue();
        }

        public final C4760l0<T, V> h() {
            return (C4760l0) this.animation.getValue();
        }

        public final InterfaceC4718G<T> i() {
            return (InterfaceC4718G) this.animationSpec.getValue();
        }

        public final long j() {
            return this.durationNanos.a();
        }

        public final float p() {
            return this.resetSnapValue.b();
        }

        public final boolean r() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void s(long playTimeNanos, boolean scaleToEnd) {
            if (scaleToEnd) {
                playTimeNanos = h().getDurationNanos();
            }
            B(h().f(playTimeNanos));
            this.velocityVector = (V) h().d(playTimeNanos);
            if (h().e(playTimeNanos)) {
                y(true);
            }
        }

        public final void t() {
            z(-2.0f);
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + q() + ", spec: " + i();
        }

        public final void u(long playTimeNanos) {
            if (p() == -1.0f) {
                this.isSeeking = true;
                if (C3862t.b(h().g(), h().i())) {
                    B(h().g());
                } else {
                    B(h().f(playTimeNanos));
                    this.velocityVector = (V) h().d(playTimeNanos);
                }
            }
        }

        public final void x(long j10) {
            this.durationNanos.k(j10);
        }

        public final void y(boolean z10) {
            this.isFinished.setValue(Boolean.valueOf(z10));
        }

        public final void z(float f10) {
            this.resetSnapValue.f(f10);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.m0$e */
    static final class e extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C4762m0<S> f50862B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ S f50863C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f50864D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C4762m0<S> c4762m0, S s10, int i10) {
            super(2);
            this.f50862B = c4762m0;
            this.f50863C = s10;
            this.f50864D = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            this.f50862B.d(this.f50863C, interfaceC1554l, C1509K0.a(this.f50864D | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.m0$f */
    static final class f extends AbstractC3864v implements Ba.a<Long> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C4762m0<S> f50865B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C4762m0<S> c4762m0) {
            super(0);
            this.f50865B = c4762m0;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f50865B.e());
        }
    }

    public C4762m0(AbstractC4766o0<S> abstractC4766o0, C4762m0<?> c4762m0, String str) {
        this.transitionState = abstractC4766o0;
        this.parentTransition = c4762m0;
        this.label = str;
        this.targetState = r1.c(g(), null, 2, null);
        this.segment = r1.c(new b(g(), g()), null, 2, null);
        this._playTimeNanos = f1.a(0L);
        this.startTimeNanos = f1.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.updateChildrenNeeded = r1.c(bool, null, 2, null);
        this._animations = m1.f();
        this._transitions = m1.f();
        this.isSeeking = r1.c(bool, null, 2, null);
        this.totalDurationNanos = m1.d(new f(this));
        abstractC4766o0.f(this);
    }

    private final void A(a<S> aVar) {
        this.segment.setValue(aVar);
    }

    private final void D(boolean z10) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z10));
    }

    private final void E(long j10) {
        this._playTimeNanos.k(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long e() {
        SnapshotStateList<C4762m0<S>.c<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, snapshotStateList.get(i10).j());
        }
        SnapshotStateList<C4762m0<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i11).e());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean m() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    private final long n() {
        return this._playTimeNanos.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        D(true);
        if (p()) {
            SnapshotStateList<C4762m0<S>.c<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C4762m0<S>.c<?, ?> cVar = snapshotStateList.get(i10);
                jMax = Math.max(jMax, cVar.j());
                cVar.u(this.lastSeekedTimeNanos);
            }
            D(false);
        }
    }

    private final void x() {
        SnapshotStateList<C4762m0<S>.c<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).t();
        }
        SnapshotStateList<C4762m0<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).x();
        }
    }

    public final void B(long j10) {
        this.startTimeNanos.k(j10);
    }

    public final void C(S s10) {
        this.targetState.setValue(s10);
    }

    public final void F(S targetState) {
        if (C3862t.b(k(), targetState)) {
            return;
        }
        A(new b(k(), targetState));
        if (!C3862t.b(g(), k())) {
            this.transitionState.d(k());
        }
        C(targetState);
        if (!o()) {
            D(true);
        }
        x();
    }

    public final boolean c(C4762m0<S>.c<?, ?> animation) {
        return this._animations.add(animation);
    }

    public final void d(S s10, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC1554lR.R(s10) : interfaceC1554lR.l(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.R(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (p()) {
                interfaceC1554lR.S(1823992347);
                interfaceC1554lR.I();
            } else {
                interfaceC1554lR.S(1822507602);
                F(s10);
                if (!C3862t.b(s10, g()) || o() || m()) {
                    interfaceC1554lR.S(1822738893);
                    Object objF = interfaceC1554lR.f();
                    InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
                    if (objF == companion.a()) {
                        C1488A c1488a = new C1488A(C1516O.i(h.f50000B, interfaceC1554lR));
                        interfaceC1554lR.J(c1488a);
                        objF = c1488a;
                    }
                    I coroutineScope = ((C1488A) objF).getCoroutineScope();
                    int i12 = i11 & 112;
                    boolean zL = (i12 == 32) | interfaceC1554lR.l(coroutineScope);
                    Object objF2 = interfaceC1554lR.f();
                    if (zL || objF2 == companion.a()) {
                        objF2 = new d(coroutineScope, this);
                        interfaceC1554lR.J(objF2);
                    }
                    C1516O.b(coroutineScope, this, (l) objF2, interfaceC1554lR, i12);
                    interfaceC1554lR.I();
                } else {
                    interfaceC1554lR.S(1823982427);
                    interfaceC1554lR.I();
                }
                interfaceC1554lR.I();
            }
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new e(this, s10, i10));
        }
    }

    public final List<C4762m0<S>.c<?, ?>> f() {
        return this._animations;
    }

    public final S g() {
        return this.transitionState.a();
    }

    public final long h() {
        C4762m0<?> c4762m0 = this.parentTransition;
        return c4762m0 != null ? c4762m0.h() : n();
    }

    public final a<S> i() {
        return (a) this.segment.getValue();
    }

    public final long j() {
        return this.startTimeNanos.a();
    }

    public final S k() {
        return (S) this.targetState.getValue();
    }

    public final long l() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    public final boolean o() {
        return j() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void r() {
        u();
        this.transitionState.g();
    }

    public final void s(long frameTimeNanos, float durationScale) {
        if (j() == Long.MIN_VALUE) {
            v(frameTimeNanos);
        }
        long j10 = frameTimeNanos - j();
        if (durationScale != 0.0f) {
            j10 = Da.a.d(j10 / durationScale);
        }
        z(j10);
        t(j10, durationScale == 0.0f);
    }

    public final void t(long scaledPlayTimeNanos, boolean scaleToEnd) {
        boolean z10 = true;
        if (j() == Long.MIN_VALUE) {
            v(scaledPlayTimeNanos);
        } else if (!this.transitionState.c()) {
            this.transitionState.e(true);
        }
        D(false);
        SnapshotStateList<C4762m0<S>.c<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4762m0<S>.c<?, ?> cVar = snapshotStateList.get(i10);
            if (!cVar.r()) {
                cVar.s(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!cVar.r()) {
                z10 = false;
            }
        }
        SnapshotStateList<C4762m0<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C4762m0<?> c4762m0 = snapshotStateList2.get(i11);
            if (!C3862t.b(c4762m0.k(), c4762m0.g())) {
                c4762m0.t(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!C3862t.b(c4762m0.k(), c4762m0.g())) {
                z10 = false;
            }
        }
        if (z10) {
            u();
        }
    }

    public String toString() {
        List<C4762m0<S>.c<?, ?>> listF = f();
        int size = listF.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + listF.get(i10) + ", ";
        }
        return str;
    }

    public final void u() {
        B(Long.MIN_VALUE);
        AbstractC4766o0<S> abstractC4766o0 = this.transitionState;
        if (abstractC4766o0 instanceof C4732V) {
            abstractC4766o0.d(k());
        }
        z(0L);
        this.transitionState.e(false);
        SnapshotStateList<C4762m0<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).u();
        }
    }

    public final void v(long frameTimeNanos) {
        B(frameTimeNanos);
        this.transitionState.e(true);
    }

    public final void w(C4762m0<S>.c<?, ?> animation) {
        this._animations.remove(animation);
    }

    public final void y(long playTimeNanos) {
        if (j() == Long.MIN_VALUE) {
            B(playTimeNanos);
        }
        z(playTimeNanos);
        D(false);
        SnapshotStateList<C4762m0<S>.c<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).u(playTimeNanos);
        }
        SnapshotStateList<C4762m0<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C4762m0<?> c4762m0 = snapshotStateList2.get(i11);
            if (!C3862t.b(c4762m0.k(), c4762m0.g())) {
                c4762m0.y(playTimeNanos);
            }
        }
    }

    public final void z(long j10) {
        if (this.parentTransition == null) {
            E(j10);
        }
    }

    public C4762m0(AbstractC4766o0<S> abstractC4766o0, String str) {
        this(abstractC4766o0, null, str);
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.m0$d */
    static final class d extends AbstractC3864v implements l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ I f50854B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4762m0<S> f50855C;

        /* compiled from: Transition.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1227}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v.m0$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            float f50856B;

            /* renamed from: C, reason: collision with root package name */
            int f50857C;

            /* renamed from: D, reason: collision with root package name */
            private /* synthetic */ Object f50858D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C4762m0<S> f50859E;

            /* compiled from: Transition.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: v.m0$d$a$a, reason: collision with other inner class name */
            static final class C0727a extends AbstractC3864v implements l<Long, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ C4762m0<S> f50860B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ float f50861C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0727a(C4762m0<S> c4762m0, float f10) {
                    super(1);
                    this.f50860B = c4762m0;
                    this.f50861C = f10;
                }

                public final void a(long j10) {
                    if (this.f50860B.p()) {
                        return;
                    }
                    this.f50860B.s(j10, this.f50861C);
                }

                @Override // Ba.l
                public /* bridge */ /* synthetic */ C4153F invoke(Long l10) {
                    a(l10.longValue());
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4762m0<S> c4762m0, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f50859E = c4762m0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f50859E, interfaceC4588d);
                aVar.f50858D = obj;
                return aVar;
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                float fN;
                I i10;
                Object objE = C4696b.e();
                int i11 = this.f50857C;
                if (i11 == 0) {
                    C4173r.b(obj);
                    I i12 = (I) this.f50858D;
                    fN = C4758k0.n(i12.getCoroutineContext());
                    i10 = i12;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fN = this.f50856B;
                    i10 = (I) this.f50858D;
                    C4173r.b(obj);
                }
                while (J.f(i10)) {
                    C0727a c0727a = new C0727a(this.f50859E, fN);
                    this.f50858D = i10;
                    this.f50856B = fN;
                    this.f50857C = 1;
                    if (C1547h0.b(c0727a, this) == objE) {
                        return objE;
                    }
                }
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(I i10, C4762m0<S> c4762m0) {
            super(1);
            this.f50854B = i10;
            this.f50855C = c4762m0;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            C1841i.d(this.f50854B, null, K.f19033E, new a(this.f50855C, null), 1, null);
            return new b();
        }

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"v/m0$d$b", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: v.m0$d$b */
        public static final class b implements InterfaceC1508K {
            @Override // kotlin.InterfaceC1508K
            public void c() {
            }
        }
    }
}
