package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.snapshots.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C1544g;
import kotlin.E1;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.s1;
import oa.C4153F;
import s.C4389K;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aI\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a1\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$\u001a-\u0010%\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020\n2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)\u001a'\u0010,\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b,\u0010-\u001a'\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a3\u00103\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020.2\u0006\u00102\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00107\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108\u001a\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0019\u0010<\u001a\u0004\u0018\u00010.2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b\u001c\u0010>\u001a\u000f\u0010?\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010$\u001a\u0017\u0010@\u001a\u00020\u00072\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b@\u0010A\u001a-\u0010B\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\nH\u0001¢\u0006\u0004\bB\u0010C\u001a5\u0010E\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\n2\u0006\u0010D\u001a\u00028\u0000H\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010G\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\nH\u0000¢\u0006\u0004\bG\u0010C\u001a-\u0010H\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u0002052\u0006\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\bH\u0010C\u001a%\u0010I\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.*\u00028\u00002\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\bI\u00108\u001a\u001f\u0010J\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\bJ\u0010K\u001a5\u0010P\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.\u0018\u00010O2\u0006\u0010*\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u0002H\u0002¢\u0006\u0004\bP\u0010Q\u001a\u000f\u0010R\u001a\u000209H\u0002¢\u0006\u0004\bR\u0010;\u001a)\u0010S\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.2\u0006\u00102\u001a\u00028\u00002\u0006\u0010'\u001a\u00020\nH\u0001¢\u0006\u0004\bS\u0010T\u001a!\u0010U\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020.2\u0006\u00102\u001a\u00028\u0000H\u0001¢\u0006\u0004\bU\u0010V\u001a#\u0010Y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u0000H\u0000¢\u0006\u0004\bY\u0010Z\" \u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\"\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`\" \u0010g\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bb\u0010c\u0012\u0004\bf\u0010$\u001a\u0004\bd\u0010e\"\u0016\u0010j\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010i\"\u0016\u0010l\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010d\"\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o\"\u001a\u0010t\u001a\b\u0012\u0004\u0012\u0002050q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s\"4\u0010z\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0w\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070v0u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010y\"(\u0010|\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000e0u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010y\"8\u0010\u0083\u0001\u001a#\u0012\f\u0012\n \u007f*\u0004\u0018\u00010~0~0}j\u0011\u0012\f\u0012\n \u007f*\u0004\u0018\u00010~0~`\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001\"%\u0010\u0088\u0001\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0016\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0012\u0005\b\u0087\u0001\u0010$\u001a\u0005\b\u0086\u0001\u0010\f\"\u001a\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008d\u0001"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "c0", "(ILandroidx/compose/runtime/snapshots/i;)I", "handle", "Loa/F;", "Y", "(I)V", "Landroidx/compose/runtime/snapshots/g;", "H", "()Landroidx/compose/runtime/snapshots/g;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "D", "(Landroidx/compose/runtime/snapshots/g;LBa/l;Z)Landroidx/compose/runtime/snapshots/g;", "parentObserver", "mergeReadObserver", "K", "(LBa/l;LBa/l;Z)LBa/l;", "writeObserver", "M", "(LBa/l;LBa/l;)LBa/l;", "T", "previousGlobalSnapshot", "block", "a0", "(Landroidx/compose/runtime/snapshots/g;LBa/l;)Ljava/lang/Object;", "A", "(LBa/l;)Ljava/lang/Object;", "B", "()V", "b0", "(LBa/l;)Landroidx/compose/runtime/snapshots/g;", "snapshot", "g0", "(Landroidx/compose/runtime/snapshots/g;)V", "currentSnapshot", "candidateSnapshot", "e0", "(IILandroidx/compose/runtime/snapshots/i;)Z", "Landroidx/compose/runtime/snapshots/n;", "data", "f0", "(Landroidx/compose/runtime/snapshots/n;ILandroidx/compose/runtime/snapshots/i;)Z", "r", "W", "(Landroidx/compose/runtime/snapshots/n;ILandroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/n;", "LZ/k;", "state", "X", "(Landroidx/compose/runtime/snapshots/n;LZ/k;)Landroidx/compose/runtime/snapshots/n;", "", "V", "()Ljava/lang/Void;", "d0", "(LZ/k;)Landroidx/compose/runtime/snapshots/n;", "(LZ/k;)Z", "C", "U", "(LZ/k;)V", "h0", "(Landroidx/compose/runtime/snapshots/n;LZ/k;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;", "candidate", "S", "(Landroidx/compose/runtime/snapshots/n;LZ/k;Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;", "O", "P", "N", "Q", "(Landroidx/compose/runtime/snapshots/g;LZ/k;)V", "Landroidx/compose/runtime/snapshots/b;", "applyingSnapshot", "invalidSnapshots", "", "R", "(Landroidx/compose/runtime/snapshots/b;Landroidx/compose/runtime/snapshots/b;Landroidx/compose/runtime/snapshots/i;)Ljava/util/Map;", "Z", "G", "(Landroidx/compose/runtime/snapshots/n;Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/n;", "F", "(Landroidx/compose/runtime/snapshots/n;)Landroidx/compose/runtime/snapshots/n;", "from", "until", "z", "(Landroidx/compose/runtime/snapshots/i;II)Landroidx/compose/runtime/snapshots/i;", "a", "LBa/l;", "emptyLambda", "LO/s1;", "b", "LO/s1;", "threadSnapshot", "c", "Ljava/lang/Object;", "I", "()Ljava/lang/Object;", "getLock$annotations", "lock", "d", "Landroidx/compose/runtime/snapshots/i;", "openSnapshots", "e", "nextSnapshotId", "LZ/e;", "f", "LZ/e;", "pinningTable", "LZ/j;", "g", "LZ/j;", "extraStateObjects", "", "Lkotlin/Function2;", "", "h", "Ljava/util/List;", "applyObservers", "i", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/a;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "j", "Ljava/util/concurrent/atomic/AtomicReference;", "currentGlobalSnapshot", "k", "Landroidx/compose/runtime/snapshots/g;", "J", "getSnapshotInitializer$annotations", "snapshotInitializer", "LO/g;", "l", "LO/g;", "pendingApplyObserverCount", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Ba.l<i, C4153F> f22610a = b.f22623B;

    /* renamed from: b, reason: collision with root package name */
    private static final s1<g> f22611b = new s1<>();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f22612c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static i f22613d;

    /* renamed from: e, reason: collision with root package name */
    private static int f22614e;

    /* renamed from: f, reason: collision with root package name */
    private static final Z.e f22615f;

    /* renamed from: g, reason: collision with root package name */
    private static final Z.j<Z.k> f22616g;

    /* renamed from: h, reason: collision with root package name */
    private static List<? extends Ba.p<? super Set<? extends Object>, ? super g, C4153F>> f22617h;

    /* renamed from: i, reason: collision with root package name */
    private static List<? extends Ba.l<Object, C4153F>> f22618i;

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReference<androidx.compose.runtime.snapshots.a> f22619j;

    /* renamed from: k, reason: collision with root package name */
    private static final g f22620k;

    /* renamed from: l, reason: collision with root package name */
    private static C1544g f22621l;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Loa/F;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<Object, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<Object, C4153F> f22624B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<Object, C4153F> f22625C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ba.l<Object, C4153F> lVar, Ba.l<Object, C4153F> lVar2) {
            super(1);
            this.f22624B = lVar;
            this.f22625C = lVar2;
        }

        public final void a(Object obj) {
            this.f22624B.invoke(obj);
            this.f22625C.invoke(obj);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
            a(obj);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Loa/F;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<Object, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<Object, C4153F> f22626B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<Object, C4153F> f22627C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ba.l<Object, C4153F> lVar, Ba.l<Object, C4153F> lVar2) {
            super(1);
            this.f22626B = lVar;
            this.f22627C = lVar2;
        }

        public final void a(Object obj) {
            this.f22626B.invoke(obj);
            this.f22627C.invoke(obj);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
            a(obj);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "T", "Landroidx/compose/runtime/snapshots/i;", "invalid", "a", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/g;"}, k = 3, mv = {1, 8, 0})
    static final class e<T> extends AbstractC3864v implements Ba.l<i, T> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<i, T> f22628B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Ba.l<? super i, ? extends T> lVar) {
            super(1);
            this.f22628B = lVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/i;)TT; */
        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke(i iVar) {
            g gVar = (g) this.f22628B.invoke(iVar);
            synchronized (j.I()) {
                j.f22613d = j.f22613d.D(gVar.getId());
                C4153F c4153f = C4153F.f46609a;
            }
            return gVar;
        }
    }

    static {
        i.Companion aVar = i.INSTANCE;
        f22613d = aVar.a();
        f22614e = 2;
        f22615f = new Z.e();
        f22616g = new Z.j<>();
        f22617h = r.m();
        f22618i = r.m();
        int i10 = f22614e;
        f22614e = i10 + 1;
        androidx.compose.runtime.snapshots.a aVar2 = new androidx.compose.runtime.snapshots.a(i10, aVar.a());
        f22613d = f22613d.D(aVar2.getId());
        AtomicReference<androidx.compose.runtime.snapshots.a> atomicReference = new AtomicReference<>(aVar2);
        f22619j = atomicReference;
        f22620k = atomicReference.get();
        f22621l = new C1544g(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T A(Ba.l<? super androidx.compose.runtime.snapshots.i, ? extends T> r17) {
        /*
            r0 = 1
            androidx.compose.runtime.snapshots.g r1 = androidx.compose.runtime.snapshots.j.f22620k
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot"
            kotlin.jvm.internal.C3862t.e(r1, r2)
            androidx.compose.runtime.snapshots.a r1 = (androidx.compose.runtime.snapshots.a) r1
            java.lang.Object r1 = I()
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.a> r2 = androidx.compose.runtime.snapshots.j.f22619j     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L24
            r3 = r2
            androidx.compose.runtime.snapshots.a r3 = (androidx.compose.runtime.snapshots.a) r3     // Catch: java.lang.Throwable -> L24
            s.K r3 = r3.E()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L27
            O.g r4 = androidx.compose.runtime.snapshots.j.f22621l     // Catch: java.lang.Throwable -> L24
            r4.a(r0)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            goto Lb0
        L27:
            r4 = r2
            androidx.compose.runtime.snapshots.g r4 = (androidx.compose.runtime.snapshots.g) r4     // Catch: java.lang.Throwable -> L24
            r5 = r17
            java.lang.Object r4 = a0(r4, r5)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)
            r1 = 0
            if (r3 == 0) goto L5b
            r5 = -1
            java.util.List<? extends Ba.p<? super java.util.Set<? extends java.lang.Object>, ? super androidx.compose.runtime.snapshots.g, oa.F>> r6 = androidx.compose.runtime.snapshots.j.f22617h     // Catch: java.lang.Throwable -> L4d
            int r7 = r6.size()     // Catch: java.lang.Throwable -> L4d
            r8 = r1
        L3c:
            if (r8 >= r7) goto L4f
            java.lang.Object r9 = r6.get(r8)     // Catch: java.lang.Throwable -> L4d
            Ba.p r9 = (Ba.p) r9     // Catch: java.lang.Throwable -> L4d
            java.util.Set r10 = Q.e.a(r3)     // Catch: java.lang.Throwable -> L4d
            r9.invoke(r10, r2)     // Catch: java.lang.Throwable -> L4d
            int r8 = r8 + r0
            goto L3c
        L4d:
            r0 = move-exception
            goto L55
        L4f:
            O.g r2 = androidx.compose.runtime.snapshots.j.f22621l
            r2.a(r5)
            goto L5b
        L55:
            O.g r1 = androidx.compose.runtime.snapshots.j.f22621l
            r1.a(r5)
            throw r0
        L5b:
            java.lang.Object r2 = I()
            monitor-enter(r2)
            C()     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto Lac
            java.lang.Object[] r5 = r3.elements     // Catch: java.lang.Throwable -> L9f
            long[] r3 = r3.metadata     // Catch: java.lang.Throwable -> L9f
            int r6 = r3.length     // Catch: java.lang.Throwable -> L9f
            int r6 = r6 + (-2)
            if (r6 < 0) goto Laa
            r7 = r1
        L6f:
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L9f
            long r10 = ~r8     // Catch: java.lang.Throwable -> L9f
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto La6
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L9f
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r1
        L89:
            if (r12 >= r10) goto La4
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto La1
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L9f
            Z.k r13 = (Z.k) r13     // Catch: java.lang.Throwable -> L9f
            U(r13)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r0 = move-exception
            goto Lae
        La1:
            long r8 = r8 >> r11
            int r12 = r12 + r0
            goto L89
        La4:
            if (r10 != r11) goto Laa
        La6:
            if (r7 == r6) goto Laa
            int r7 = r7 + r0
            goto L6f
        Laa:
            oa.F r0 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L9f
        Lac:
            monitor-exit(r2)
            return r4
        Lae:
            monitor-exit(r2)
            throw r0
        Lb0:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.j.A(Ba.l):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B() {
        A(a.f22622B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        Z.j<Z.k> jVar = f22616g;
        int iE = jVar.getSize();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iE) {
                break;
            }
            E1<Z.k> e12 = jVar.f()[i10];
            Z.k kVar = e12 != null ? e12.get() : null;
            if (kVar != null && T(kVar)) {
                if (i11 != i10) {
                    jVar.f()[i11] = e12;
                    jVar.getHashes()[i11] = jVar.getHashes()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iE; i12++) {
            jVar.f()[i12] = null;
            jVar.getHashes()[i12] = 0;
        }
        if (i11 != iE) {
            jVar.g(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g D(g gVar, Ba.l<Object, C4153F> lVar, boolean z10) {
        boolean z11 = gVar instanceof androidx.compose.runtime.snapshots.b;
        if (z11 || gVar == null) {
            return new p(z11 ? (androidx.compose.runtime.snapshots.b) gVar : null, lVar, null, false, z10);
        }
        return new q(gVar, lVar, false, z10);
    }

    static /* synthetic */ g E(g gVar, Ba.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return D(gVar, lVar, z10);
    }

    public static final <T extends n> T F(T t10) {
        T t11;
        g.Companion companion = g.INSTANCE;
        g gVarC = companion.c();
        T t12 = (T) W(t10, gVarC.getId(), gVarC.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (I()) {
            g gVarC2 = companion.c();
            t11 = (T) W(t10, gVarC2.getId(), gVarC2.getInvalid());
        }
        if (t11 != null) {
            return t11;
        }
        V();
        throw new KotlinNothingValueException();
    }

    public static final <T extends n> T G(T t10, g gVar) {
        T t11 = (T) W(t10, gVar.getId(), gVar.getInvalid());
        if (t11 != null) {
            return t11;
        }
        V();
        throw new KotlinNothingValueException();
    }

    public static final g H() {
        g gVarA = f22611b.a();
        return gVarA == null ? f22619j.get() : gVarA;
    }

    public static final Object I() {
        return f22612c;
    }

    public static final g J() {
        return f22620k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ba.l<Object, C4153F> K(Ba.l<Object, C4153F> lVar, Ba.l<Object, C4153F> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new c(lVar, lVar2);
    }

    static /* synthetic */ Ba.l L(Ba.l lVar, Ba.l lVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return K(lVar, lVar2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ba.l<Object, C4153F> M(Ba.l<Object, C4153F> lVar, Ba.l<Object, C4153F> lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new d(lVar, lVar2);
    }

    public static final <T extends n> T N(T t10, Z.k kVar) {
        T t11 = (T) d0(kVar);
        if (t11 != null) {
            t11.h(Integer.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.d();
        t12.h(Integer.MAX_VALUE);
        t12.g(kVar.getFirstStateRecord());
        C3862t.e(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$16");
        kVar.h(t12);
        C3862t.e(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t12;
    }

    public static final <T extends n> T O(T t10, Z.k kVar, g gVar) {
        T t11;
        synchronized (I()) {
            t11 = (T) P(t10, kVar, gVar);
        }
        return t11;
    }

    private static final <T extends n> T P(T t10, Z.k kVar, g gVar) {
        T t11 = (T) N(t10, kVar);
        t11.c(t10);
        t11.h(gVar.getId());
        return t11;
    }

    public static final void Q(g gVar, Z.k kVar) {
        gVar.w(gVar.j() + 1);
        Ba.l<Object, C4153F> lVarK = gVar.k();
        if (lVarK != null) {
            lVarK.invoke(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<n, n> R(androidx.compose.runtime.snapshots.b bVar, androidx.compose.runtime.snapshots.b bVar2, i iVar) {
        long[] jArr;
        int i10;
        HashMap map;
        long[] jArr2;
        int i11;
        HashMap map2;
        int i12;
        n nVarW;
        C4389K<Z.k> c4389kE = bVar2.E();
        int id2 = bVar.getId();
        HashMap map3 = null;
        if (c4389kE == null) {
            return null;
        }
        i iVarB = bVar2.getInvalid().D(bVar2.getId()).B(bVar2.F());
        Object[] objArr = c4389kE.elements;
        long[] jArr3 = c4389kE.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            HashMap map4 = null;
            int i13 = 0;
            while (true) {
                long j10 = jArr3[i13];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j10) < 128) {
                            Z.k kVar = (Z.k) objArr[(i13 << 3) + i16];
                            n nVarI = kVar.getFirstStateRecord();
                            n nVarW2 = W(nVarI, id2, iVar);
                            if (nVarW2 == null || (nVarW = W(nVarI, id2, iVarB)) == null || C3862t.b(nVarW2, nVarW)) {
                                jArr2 = jArr3;
                                i11 = id2;
                            } else {
                                jArr2 = jArr3;
                                i11 = id2;
                                n nVarW3 = W(nVarI, bVar2.getId(), bVar2.getInvalid());
                                if (nVarW3 == null) {
                                    V();
                                    throw new KotlinNothingValueException();
                                }
                                n nVarJ = kVar.j(nVarW, nVarW2, nVarW3);
                                if (nVarJ == null) {
                                    return null;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(nVarW2, nVarJ);
                                map4 = map4;
                            }
                            map2 = null;
                            i12 = 8;
                        } else {
                            jArr2 = jArr3;
                            i11 = id2;
                            map2 = map3;
                            i12 = i14;
                        }
                        j10 >>= i12;
                        i16++;
                        map3 = map2;
                        i14 = i12;
                        jArr3 = jArr2;
                        id2 = i11;
                    }
                    jArr = jArr3;
                    i10 = id2;
                    map = map3;
                    if (i15 != i14) {
                        return map4;
                    }
                } else {
                    jArr = jArr3;
                    i10 = id2;
                    map = map3;
                }
                if (i13 == length) {
                    map3 = map4;
                    break;
                }
                i13++;
                map3 = map;
                jArr3 = jArr;
                id2 = i10;
            }
        }
        return map3;
    }

    public static final <T extends n> T S(T t10, Z.k kVar, g gVar, T t11) {
        T t12;
        if (gVar.i()) {
            gVar.p(kVar);
        }
        int id2 = gVar.getId();
        if (t11.getSnapshotId() == id2) {
            return t11;
        }
        synchronized (I()) {
            t12 = (T) N(t10, kVar);
        }
        t12.h(id2);
        if (t11.getSnapshotId() != 1) {
            gVar.p(kVar);
        }
        return t12;
    }

    private static final boolean T(Z.k kVar) {
        n nVar;
        int iE = f22615f.e(f22614e);
        n nVar2 = null;
        n nVarI = null;
        int i10 = 0;
        for (n nVarI2 = kVar.getFirstStateRecord(); nVarI2 != null; nVarI2 = nVarI2.getNext()) {
            int iF = nVarI2.getSnapshotId();
            if (iF != 0) {
                if (iF >= iE) {
                    i10++;
                } else if (nVar2 == null) {
                    i10++;
                    nVar2 = nVarI2;
                } else {
                    if (nVarI2.getSnapshotId() < nVar2.getSnapshotId()) {
                        nVar = nVar2;
                        nVar2 = nVarI2;
                    } else {
                        nVar = nVarI2;
                    }
                    if (nVarI == null) {
                        nVarI = kVar.getFirstStateRecord();
                        n nVar3 = nVarI;
                        while (true) {
                            if (nVarI == null) {
                                nVarI = nVar3;
                                break;
                            }
                            if (nVarI.getSnapshotId() >= iE) {
                                break;
                            }
                            if (nVar3.getSnapshotId() < nVarI.getSnapshotId()) {
                                nVar3 = nVarI;
                            }
                            nVarI = nVarI.getNext();
                        }
                    }
                    nVar2.h(0);
                    nVar2.c(nVarI);
                    nVar2 = nVar;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(Z.k kVar) {
        if (T(kVar)) {
            f22616g.a(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends n> T W(T t10, int i10, i iVar) {
        T t11 = null;
        while (t10 != null) {
            if (f0(t10, i10, iVar) && (t11 == null || t11.getSnapshotId() < t10.getSnapshotId())) {
                t11 = t10;
            }
            t10 = (T) t10.getNext();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public static final <T extends n> T X(T t10, Z.k kVar) {
        T t11;
        g.Companion companion = g.INSTANCE;
        g gVarC = companion.c();
        Ba.l<Object, C4153F> lVarH = gVarC.h();
        if (lVarH != null) {
            lVarH.invoke(kVar);
        }
        T t12 = (T) W(t10, gVarC.getId(), gVarC.getInvalid());
        if (t12 != null) {
            return t12;
        }
        synchronized (I()) {
            g gVarC2 = companion.c();
            n nVarI = kVar.getFirstStateRecord();
            C3862t.e(nVarI, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            t11 = (T) W(nVarI, gVarC2.getId(), gVarC2.getInvalid());
            if (t11 == null) {
                V();
                throw new KotlinNothingValueException();
            }
        }
        return t11;
    }

    public static final void Y(int i10) {
        f22615f.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T a0(g gVar, Ba.l<? super i, ? extends T> lVar) {
        T tInvoke = lVar.invoke(f22613d.y(gVar.getId()));
        synchronized (I()) {
            int i10 = f22614e;
            f22614e = i10 + 1;
            f22613d = f22613d.y(gVar.getId());
            f22619j.set(new androidx.compose.runtime.snapshots.a(i10, f22613d));
            gVar.d();
            f22613d = f22613d.D(i10);
            C4153F c4153f = C4153F.f46609a;
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends g> T b0(Ba.l<? super i, ? extends T> lVar) {
        return (T) A(new e(lVar));
    }

    public static final int c0(int i10, i iVar) {
        int iA;
        int iA2 = iVar.A(i10);
        synchronized (I()) {
            iA = f22615f.a(iA2);
        }
        return iA;
    }

    private static final n d0(Z.k kVar) {
        int iE = f22615f.e(f22614e) - 1;
        i iVarA = i.INSTANCE.a();
        n nVar = null;
        for (n nVarI = kVar.getFirstStateRecord(); nVarI != null; nVarI = nVarI.getNext()) {
            if (nVarI.getSnapshotId() == 0) {
                return nVarI;
            }
            if (f0(nVarI, iE, iVarA)) {
                if (nVar != null) {
                    return nVarI.getSnapshotId() < nVar.getSnapshotId() ? nVarI : nVar;
                }
                nVar = nVarI;
            }
        }
        return null;
    }

    private static final boolean e0(int i10, int i11, i iVar) {
        return (i11 == 0 || i11 > i10 || iVar.z(i11)) ? false : true;
    }

    private static final boolean f0(n nVar, int i10, i iVar) {
        return e0(i10, nVar.getSnapshotId(), iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(g gVar) {
        int iE;
        if (f22613d.z(gVar.getId())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: id=");
        sb2.append(gVar.getId());
        sb2.append(", disposed=");
        sb2.append(gVar.getDisposed());
        sb2.append(", applied=");
        androidx.compose.runtime.snapshots.b bVar = gVar instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) gVar : null;
        sb2.append(bVar != null ? Boolean.valueOf(bVar.D()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (I()) {
            iE = f22615f.e(-1);
        }
        sb2.append(iE);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final <T extends n> T h0(T t10, Z.k kVar, g gVar) {
        T t11;
        if (gVar.i()) {
            gVar.p(kVar);
        }
        int id2 = gVar.getId();
        T t12 = (T) W(t10, id2, gVar.getInvalid());
        if (t12 == null) {
            V();
            throw new KotlinNothingValueException();
        }
        if (t12.getSnapshotId() == gVar.getId()) {
            return t12;
        }
        synchronized (I()) {
            t11 = (T) W(kVar.getFirstStateRecord(), id2, gVar.getInvalid());
            if (t11 == null) {
                V();
                throw new KotlinNothingValueException();
            }
            if (t11.getSnapshotId() != id2) {
                t11 = (T) P(t11, kVar, gVar);
            }
        }
        C3862t.e(t11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t12.getSnapshotId() != 1) {
            gVar.p(kVar);
        }
        return t11;
    }

    public static final i z(i iVar, int i10, int i11) {
        while (i10 < i11) {
            iVar = iVar.D(i10);
            i10++;
        }
        return iVar;
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "it", "Loa/F;", "a", "(Landroidx/compose/runtime/snapshots/i;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<i, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22622B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(i iVar) {
            a(iVar);
            return C4153F.f46609a;
        }

        public final void a(i iVar) {
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "it", "Loa/F;", "a", "(Landroidx/compose/runtime/snapshots/i;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<i, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f22623B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(i iVar) {
            a(iVar);
            return C4153F.f46609a;
        }

        public final void a(i iVar) {
        }
    }
}
