package kotlin;

import Ba.p;
import Ba.q;
import R.a;
import Xb.C1837g;
import Xb.C1846k0;
import Xb.C1849m;
import Xb.C1873y0;
import Xb.I;
import Xb.InterfaceC1847l;
import Xb.InterfaceC1867v0;
import Xb.InterfaceC1870x;
import a0.InterfaceC1879a;
import ac.C1972g;
import ac.H;
import ac.J;
import ac.t;
import androidx.compose.runtime.ComposeRuntimeError;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.snapshots.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4158c;
import oa.C4170o;
import oa.C4172q;
import oa.C4173r;
import oa.v;
import s.C4389K;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ¶\u00012\u00020\u0001:\u0004CQbeB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0017\u001a\u00020\u00072\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0007H\u0082@¢\u0006\u0004\b \u0010!J:\u0010(\u001a\u00020\u00072(\u0010'\u001a$\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070%\u0012\u0006\u0012\u0004\u0018\u00010&0\"H\u0082@¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u001dJ)\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J3\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140/2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0002¢\u0006\u0004\b4\u0010\u001aJ#\u00106\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0007052\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u00107J3\u00108\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0007052\u0006\u0010\u001b\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b>\u0010!J\r\u0010?\u001a\u00020\u0007¢\u0006\u0004\b?\u0010\u001aJ\u0010\u0010@\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b@\u0010!J%\u0010C\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00142\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00070AH\u0010¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\u001aJ\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\u001aJ\u001d\u0010J\u001a\u00020\u00072\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0GH\u0010¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\bL\u0010\u001dJ\u0017\u0010M\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\bM\u0010\u001dJ\u0017\u0010O\u001a\u00020\u00072\u0006\u0010N\u001a\u000200H\u0010¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u00072\u0006\u0010N\u001a\u000200H\u0010¢\u0006\u0004\bQ\u0010PJ\u001f\u0010T\u001a\u00020\u00072\u0006\u0010N\u001a\u0002002\u0006\u0010S\u001a\u00020RH\u0010¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0010¢\u0006\u0004\bV\u0010\u001dJ\u0019\u0010W\u001a\u0004\u0018\u00010R2\u0006\u0010N\u001a\u000200H\u0010¢\u0006\u0004\bW\u0010XR$\u0010^\u001a\u00020Y2\u0006\u0010Z\u001a\u00020Y8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010[\u001a\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010`R\u0014\u0010d\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010g\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010iR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00140k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001e\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010mR\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020&0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00140t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00140k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010mR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u0002000k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010mR.\u0010~\u001a\u001c\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0|\u0012\n\u0012\b\u0012\u0004\u0012\u0002000k0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010}R \u0010\u007f\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020R0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010}R\u001f\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010mR \u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010\u0081\u0001R!\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bV\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010 R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010 R\u001f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0005\bu\u0010\u009b\u0001R\u001c\u0010\u009f\u0001\u001a\u00070\u009c\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001d\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140/8BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¤\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\fR\u0016\u0010¦\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010\fR\u0016\u0010¨\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\fR\u0016\u0010ª\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010\fR\u0016\u0010¬\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\fR\u001c\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u00ad\u00018F¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0017\u0010²\u0001\u001a\u00030\u0086\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bq\u0010±\u0001R\u0015\u0010³\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\be\u0010\fR\u0015\u0010´\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0015\u0010µ\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\f¨\u0006·\u0001"}, d2 = {"LO/M0;", "LO/q;", "Lta/g;", "effectCoroutineContext", "<init>", "(Lta/g;)V", "LXb/l;", "Loa/F;", "c0", "()LXb/l;", "", "w0", "()Z", "LXb/v0;", "callingJob", "y0", "(LXb/v0;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "LO/E;", "failedInitialComposition", "recoverable", "s0", "(Ljava/lang/Exception;LO/E;Z)V", "b0", "()V", "composition", "z0", "(LO/E;)V", "X", "x0", "Z", "(Lta/d;)Ljava/lang/Object;", "Lkotlin/Function3;", "LXb/I;", "LO/g0;", "Lta/d;", "", "block", "v0", "(LBa/q;Lta/d;)Ljava/lang/Object;", "o0", "Ls/K;", "modifiedValues", "r0", "(LO/E;Ls/K;)LO/E;", "", "LO/k0;", "references", "q0", "(Ljava/util/List;Ls/K;)Ljava/util/List;", "d0", "Lkotlin/Function1;", "u0", "(LO/E;)LBa/l;", "C0", "(LO/E;Ls/K;)LBa/l;", "Landroidx/compose/runtime/snapshots/b;", "snapshot", "Y", "(Landroidx/compose/runtime/snapshots/b;)V", "B0", "a0", "m0", "Lkotlin/Function0;", "content", "a", "(LO/E;LBa/p;)V", "n0", "A0", "", "La0/a;", "table", "o", "(Ljava/util/Set;)V", "t", "l", "reference", "k", "(LO/k0;)V", "b", "LO/j0;", "data", "m", "(LO/k0;LO/j0;)V", "q", "n", "(LO/k0;)LO/j0;", "", "<set-?>", "J", "e0", "()J", "changeCount", "LO/h;", "LO/h;", "broadcastFrameClock", "c", "Ljava/lang/Object;", "stateLock", "d", "LXb/v0;", "runnerJob", "", "Ljava/lang/Throwable;", "closeCause", "", "f", "Ljava/util/List;", "_knownCompositions", "g", "_knownCompositionsCache", "h", "Ls/K;", "snapshotInvalidations", "LQ/b;", "i", "LQ/b;", "compositionInvalidations", "j", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "LO/i0;", "Ljava/util/Map;", "compositionValuesRemoved", "compositionValueStatesAvailable", "failedCompositions", "Ljava/util/Set;", "compositionsRemoved", "p", "LXb/l;", "workContinuation", "", "I", "concurrentCompositionsOutstanding", "r", "isClosed", "LO/M0$b;", "s", "LO/M0$b;", "errorState", "frameClockPaused", "Lac/t;", "LO/M0$d;", "u", "Lac/t;", "_state", "LXb/x;", "v", "LXb/x;", "effectJob", "w", "Lta/g;", "()Lta/g;", "LO/M0$c;", "x", "LO/M0$c;", "recomposerInfo", "k0", "()Ljava/util/List;", "knownCompositions", "h0", "hasBroadcastFrameClockAwaitersLocked", "g0", "hasBroadcastFrameClockAwaiters", "l0", "shouldKeepRecomposing", "j0", "hasSchedulingWork", "i0", "hasFrameWorkLocked", "Lac/H;", "f0", "()Lac/H;", "currentState", "()I", "compoundHashKey", "collectingCallByInformation", "collectingParameterInformation", "collectingSourceInformation", "y", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.M0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513M0 extends AbstractC1564q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long changeCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C1546h broadcastFrameClock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object stateLock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 runnerJob;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Throwable closeCause;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC1496E> _knownCompositions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<? extends InterfaceC1496E> _knownCompositionsCache;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private C4389K<Object> snapshotInvalidations;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Q.b<InterfaceC1496E> compositionInvalidations;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC1496E> compositionsAwaitingApply;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<C1553k0> compositionValuesAwaitingInsert;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Map<C1549i0<Object>, List<C1553k0>> compositionValuesRemoved;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Map<C1553k0, C1551j0> compositionValueStatesAvailable;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private List<InterfaceC1496E> failedCompositions;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Set<InterfaceC1496E> compositionsRemoved;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1847l<? super C4153F> workContinuation;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int concurrentCompositionsOutstanding;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private b errorState;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean frameClockPaused;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final t<d> _state;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1870x effectJob;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final ta.g effectCoroutineContext;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final c recomposerInfo;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f12654z = 8;

    /* renamed from: A, reason: collision with root package name */
    private static final t<R.f<c>> f12651A = J.a(a.b());

    /* renamed from: B, reason: collision with root package name */
    private static final AtomicReference<Boolean> f12652B = new AtomicReference<>(Boolean.FALSE);

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR4\u0010\u000f\u001a\"\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bj\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LO/M0$a;", "", "<init>", "()V", "LO/M0$c;", "LO/M0;", "info", "Loa/F;", "c", "(LO/M0$c;)V", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lac/t;", "LR/f;", "_runningRecomposers", "Lac/t;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.M0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c info) {
            R.f fVar;
            R.f fVarAdd;
            do {
                fVar = (R.f) C1513M0.f12651A.getValue();
                fVarAdd = fVar.add((R.f) info);
                if (fVar == fVarAdd) {
                    return;
                }
            } while (!C1513M0.f12651A.c(fVar, fVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c info) {
            R.f fVar;
            R.f fVarRemove;
            do {
                fVar = (R.f) C1513M0.f12651A.getValue();
                fVarRemove = fVar.remove((R.f) info);
                if (fVar == fVarRemove) {
                    return;
                }
            } while (!C1513M0.f12651A.c(fVar, fVarRemove));
        }

        private Companion() {
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LO/M0$b;", "", "", "recoverable", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(ZLjava/lang/Exception;)V", "a", "Z", "getRecoverable", "()Z", "b", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.M0$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean recoverable;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Exception cause;

        public b(boolean z10, Exception exc) {
            this.recoverable = z10;
            this.cause = exc;
        }

        /* renamed from: a, reason: from getter */
        public Exception getCause() {
            return this.cause;
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LO/M0$c;", "", "<init>", "(LO/M0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.M0$c */
    private final class c {
        public c() {
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LO/M0$d;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "F", "G", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.M0$d */
    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.M0$e */
    static final class e extends AbstractC3864v implements Ba.a<C4153F> {
        e() {
            super(0);
        }

        public final void a() {
            InterfaceC1847l interfaceC1847lC0;
            Object obj = C1513M0.this.stateLock;
            C1513M0 c1513m0 = C1513M0.this;
            synchronized (obj) {
                interfaceC1847lC0 = c1513m0.c0();
                if (((d) c1513m0._state.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw C1846k0.a("Recomposer shutdown; frame clock awaiter will never resume", c1513m0.closeCause);
                }
            }
            if (interfaceC1847lC0 != null) {
                C4172q.Companion companion = C4172q.INSTANCE;
                interfaceC1847lC0.resumeWith(C4172q.a(C4153F.f46609a));
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.M0$f */
    static final class f extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "runnerJobCause", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O.M0$f$a */
        static final class a extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1513M0 f12691B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ Throwable f12692C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1513M0 c1513m0, Throwable th) {
                super(1);
                this.f12691B = c1513m0;
                this.f12692C = th;
            }

            public final void a(Throwable th) {
                Object obj = this.f12691B.stateLock;
                C1513M0 c1513m0 = this.f12691B;
                Throwable th2 = this.f12692C;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                C4158c.a(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    c1513m0.closeCause = th2;
                    c1513m0._state.setValue(d.ShutDown);
                    C4153F c4153f = C4153F.f46609a;
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
                a(th);
                return C4153F.f46609a;
            }
        }

        f() {
            super(1);
        }

        public final void a(Throwable th) {
            InterfaceC1847l interfaceC1847l;
            InterfaceC1847l interfaceC1847l2;
            CancellationException cancellationExceptionA = C1846k0.a("Recomposer effect job completed", th);
            Object obj = C1513M0.this.stateLock;
            C1513M0 c1513m0 = C1513M0.this;
            synchronized (obj) {
                try {
                    InterfaceC1867v0 interfaceC1867v0 = c1513m0.runnerJob;
                    interfaceC1847l = null;
                    if (interfaceC1867v0 != null) {
                        c1513m0._state.setValue(d.ShuttingDown);
                        if (c1513m0.isClosed) {
                            if (c1513m0.workContinuation != null) {
                                interfaceC1847l2 = c1513m0.workContinuation;
                            }
                            c1513m0.workContinuation = null;
                            interfaceC1867v0.q(new a(c1513m0, th));
                            interfaceC1847l = interfaceC1847l2;
                        } else {
                            interfaceC1867v0.e(cancellationExceptionA);
                        }
                        interfaceC1847l2 = null;
                        c1513m0.workContinuation = null;
                        interfaceC1867v0.q(new a(c1513m0, th));
                        interfaceC1847l = interfaceC1847l2;
                    } else {
                        c1513m0.closeCause = cancellationExceptionA;
                        c1513m0._state.setValue(d.ShutDown);
                        C4153F c4153f = C4153F.f46609a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceC1847l != null) {
                C4172q.Companion companion = C4172q.INSTANCE;
                interfaceC1847l.resumeWith(C4172q.a(C4153F.f46609a));
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LO/M0$d;", "it", "", "<anonymous>", "(LO/M0$d;)Z"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.M0$g */
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<d, InterfaceC4588d<? super Boolean>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f12693B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f12694C;

        g(InterfaceC4588d<? super g> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, InterfaceC4588d<? super Boolean> interfaceC4588d) {
            return ((g) create(dVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            g gVar = new g(interfaceC4588d);
            gVar.f12694C = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f12693B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((d) this.f12694C) == d.ShutDown);
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.M0$h */
    static final class h extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C4389K<Object> f12695B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC1496E f12696C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C4389K<Object> c4389k, InterfaceC1496E interfaceC1496E) {
            super(0);
            this.f12695B = c4389k;
            this.f12696C = interfaceC1496E;
        }

        public final void a() {
            C4389K<Object> c4389k = this.f12695B;
            InterfaceC1496E interfaceC1496E = this.f12696C;
            Object[] objArr = c4389k.elements;
            long[] jArr = c4389k.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            interfaceC1496E.p(objArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Loa/F;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.M0$i */
    static final class i extends AbstractC3864v implements Ba.l<Object, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1496E f12697B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC1496E interfaceC1496E) {
            super(1);
            this.f12697B = interfaceC1496E;
        }

        public final void a(Object obj) {
            this.f12697B.a(obj);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
            a(obj);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1054}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.M0$j */
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f12698B;

        /* renamed from: C, reason: collision with root package name */
        int f12699C;

        /* renamed from: D, reason: collision with root package name */
        private /* synthetic */ Object f12700D;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ q<I, InterfaceC1545g0, InterfaceC4588d<? super C4153F>, Object> f12702F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC1545g0 f12703G;

        /* compiled from: Recomposer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {1055}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O.M0$j$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f12704B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f12705C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ q<I, InterfaceC1545g0, InterfaceC4588d<? super C4153F>, Object> f12706D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ InterfaceC1545g0 f12707E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(q<? super I, ? super InterfaceC1545g0, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, InterfaceC1545g0 interfaceC1545g0, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f12706D = qVar;
                this.f12707E = interfaceC1545g0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f12706D, this.f12707E, interfaceC4588d);
                aVar.f12705C = obj;
                return aVar;
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f12704B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    I i11 = (I) this.f12705C;
                    q<I, InterfaceC1545g0, InterfaceC4588d<? super C4153F>, Object> qVar = this.f12706D;
                    InterfaceC1545g0 interfaceC1545g0 = this.f12707E;
                    this.f12704B = 1;
                    if (qVar.g(i11, interfaceC1545g0, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                return C4153F.f46609a;
            }
        }

        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "changed", "Landroidx/compose/runtime/snapshots/g;", "<anonymous parameter 1>", "Loa/F;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O.M0$j$b */
        static final class b extends AbstractC3864v implements p<Set<? extends Object>, androidx.compose.runtime.snapshots.g, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1513M0 f12708B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C1513M0 c1513m0) {
                super(2);
                this.f12708B = c1513m0;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.util.Set<? extends java.lang.Object> r20, androidx.compose.runtime.snapshots.g r21) {
                /*
                    r19 = this;
                    r1 = r19
                    r0 = r20
                    r2 = 1
                    O.M0 r3 = r1.f12708B
                    java.lang.Object r3 = kotlin.C1513M0.I(r3)
                    O.M0 r4 = r1.f12708B
                    monitor-enter(r3)
                    ac.t r5 = kotlin.C1513M0.L(r4)     // Catch: java.lang.Throwable -> L74
                    java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L74
                    O.M0$d r5 = (kotlin.C1513M0.d) r5     // Catch: java.lang.Throwable -> L74
                    O.M0$d r6 = kotlin.C1513M0.d.Idle     // Catch: java.lang.Throwable -> L74
                    int r5 = r5.compareTo(r6)     // Catch: java.lang.Throwable -> L74
                    if (r5 < 0) goto Lb3
                    s.K r5 = kotlin.C1513M0.H(r4)     // Catch: java.lang.Throwable -> L74
                    boolean r6 = r0 instanceof Q.d     // Catch: java.lang.Throwable -> L74
                    if (r6 == 0) goto L88
                    Q.d r0 = (Q.d) r0     // Catch: java.lang.Throwable -> L74
                    s.V r0 = r0.c()     // Catch: java.lang.Throwable -> L74
                    java.lang.Object[] r6 = r0.elements     // Catch: java.lang.Throwable -> L74
                    long[] r0 = r0.metadata     // Catch: java.lang.Throwable -> L74
                    int r7 = r0.length     // Catch: java.lang.Throwable -> L74
                    int r7 = r7 + (-2)
                    if (r7 < 0) goto Lae
                    r9 = 0
                L38:
                    r10 = r0[r9]     // Catch: java.lang.Throwable -> L74
                    long r12 = ~r10     // Catch: java.lang.Throwable -> L74
                    r14 = 7
                    long r12 = r12 << r14
                    long r12 = r12 & r10
                    r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r12 = r12 & r14
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 == 0) goto L84
                    int r12 = r9 - r7
                    int r12 = ~r12     // Catch: java.lang.Throwable -> L74
                    int r12 = r12 >>> 31
                    r13 = 8
                    int r12 = 8 - r12
                    r14 = 0
                L52:
                    if (r14 >= r12) goto L81
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r10
                    r17 = 128(0x80, double:6.32E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto L7c
                    int r15 = r9 << 3
                    int r15 = r15 + r14
                    r15 = r6[r15]     // Catch: java.lang.Throwable -> L74
                    boolean r8 = r15 instanceof Z.l     // Catch: java.lang.Throwable -> L74
                    if (r8 == 0) goto L76
                    r8 = r15
                    Z.l r8 = (Z.l) r8     // Catch: java.lang.Throwable -> L74
                    int r13 = androidx.compose.runtime.snapshots.e.a(r2)     // Catch: java.lang.Throwable -> L74
                    boolean r8 = r8.p(r13)     // Catch: java.lang.Throwable -> L74
                    if (r8 != 0) goto L76
                    goto L79
                L74:
                    r0 = move-exception
                    goto Lc3
                L76:
                    r5.h(r15)     // Catch: java.lang.Throwable -> L74
                L79:
                    r8 = 8
                    goto L7d
                L7c:
                    r8 = r13
                L7d:
                    long r10 = r10 >> r8
                    int r14 = r14 + r2
                    r13 = r8
                    goto L52
                L81:
                    r8 = r13
                    if (r12 != r8) goto Lae
                L84:
                    if (r9 == r7) goto Lae
                    int r9 = r9 + r2
                    goto L38
                L88:
                    java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L74
                    java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L74
                L8e:
                    boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L74
                    if (r6 == 0) goto Lae
                    java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L74
                    boolean r7 = r6 instanceof Z.l     // Catch: java.lang.Throwable -> L74
                    if (r7 == 0) goto Laa
                    r7 = r6
                    Z.l r7 = (Z.l) r7     // Catch: java.lang.Throwable -> L74
                    int r8 = androidx.compose.runtime.snapshots.e.a(r2)     // Catch: java.lang.Throwable -> L74
                    boolean r7 = r7.p(r8)     // Catch: java.lang.Throwable -> L74
                    if (r7 != 0) goto Laa
                    goto L8e
                Laa:
                    r5.h(r6)     // Catch: java.lang.Throwable -> L74
                    goto L8e
                Lae:
                    Xb.l r0 = kotlin.C1513M0.v(r4)     // Catch: java.lang.Throwable -> L74
                    goto Lb4
                Lb3:
                    r0 = 0
                Lb4:
                    monitor-exit(r3)
                    if (r0 == 0) goto Lc2
                    oa.q$a r2 = oa.C4172q.INSTANCE
                    oa.F r2 = oa.C4153F.f46609a
                    java.lang.Object r2 = oa.C4172q.a(r2)
                    r0.resumeWith(r2)
                Lc2:
                    return
                Lc3:
                    monitor-exit(r3)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C1513M0.j.b.a(java.util.Set, androidx.compose.runtime.snapshots.g):void");
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(Set<? extends Object> set, androidx.compose.runtime.snapshots.g gVar) {
                a(set, gVar);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(q<? super I, ? super InterfaceC1545g0, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, InterfaceC1545g0 interfaceC1545g0, InterfaceC4588d<? super j> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f12702F = qVar;
            this.f12703G = interfaceC1545g0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            j jVar = C1513M0.this.new j(this.f12702F, this.f12703G, interfaceC4588d);
            jVar.f12700D = obj;
            return jVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((j) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C1513M0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {574, 585}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXb/I;", "LO/g0;", "parentFrameClock", "Loa/F;", "<anonymous>", "(LXb/I;LO/g0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.M0$k */
    static final class k extends kotlin.coroutines.jvm.internal.l implements q<I, InterfaceC1545g0, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f12709B;

        /* renamed from: C, reason: collision with root package name */
        Object f12710C;

        /* renamed from: D, reason: collision with root package name */
        Object f12711D;

        /* renamed from: E, reason: collision with root package name */
        Object f12712E;

        /* renamed from: F, reason: collision with root package name */
        Object f12713F;

        /* renamed from: G, reason: collision with root package name */
        Object f12714G;

        /* renamed from: H, reason: collision with root package name */
        Object f12715H;

        /* renamed from: I, reason: collision with root package name */
        Object f12716I;

        /* renamed from: J, reason: collision with root package name */
        int f12717J;

        /* renamed from: K, reason: collision with root package name */
        /* synthetic */ Object f12718K;

        /* compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O.M0$k$a */
        static final class a extends AbstractC3864v implements Ba.l<Long, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C1513M0 f12720B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4389K<Object> f12721C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C4389K<InterfaceC1496E> f12722D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC1496E> f12723E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ List<C1553k0> f12724F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ C4389K<InterfaceC1496E> f12725G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC1496E> f12726H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ C4389K<InterfaceC1496E> f12727I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ Set<Object> f12728J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1513M0 c1513m0, C4389K<Object> c4389k, C4389K<InterfaceC1496E> c4389k2, List<InterfaceC1496E> list, List<C1553k0> list2, C4389K<InterfaceC1496E> c4389k3, List<InterfaceC1496E> list3, C4389K<InterfaceC1496E> c4389k4, Set<? extends Object> set) {
                super(1);
                this.f12720B = c1513m0;
                this.f12721C = c4389k;
                this.f12722D = c4389k2;
                this.f12723E = list;
                this.f12724F = list2;
                this.f12725G = c4389k3;
                this.f12726H = list3;
                this.f12727I = c4389k4;
                this.f12728J = set;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:205:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:218:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:222:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x01a2  */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v1 */
            /* JADX WARN: Type inference failed for: r7v13 */
            /* JADX WARN: Type inference failed for: r7v2 */
            /* JADX WARN: Type inference failed for: r7v33 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(long r28) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 893
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C1513M0.k.a.a(long):void");
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Long l10) throws Throwable {
                a(l10.longValue());
                return C4153F.f46609a;
            }
        }

        k(InterfaceC4588d<? super k> interfaceC4588d) {
            super(3, interfaceC4588d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void o(kotlin.C1513M0 r23, java.util.List<kotlin.InterfaceC1496E> r24, java.util.List<kotlin.C1553k0> r25, java.util.List<kotlin.InterfaceC1496E> r26, s.C4389K<kotlin.InterfaceC1496E> r27, s.C4389K<kotlin.InterfaceC1496E> r28, s.C4389K<java.lang.Object> r29, s.C4389K<kotlin.InterfaceC1496E> r30) {
            /*
                Method dump skipped, instructions count: 326
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C1513M0.k.o(O.M0, java.util.List, java.util.List, java.util.List, s.K, s.K, s.K, s.K):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(List<C1553k0> list, C1513M0 c1513m0) {
            list.clear();
            synchronized (c1513m0.stateLock) {
                try {
                    List list2 = c1513m0.compositionValuesAwaitingInsert;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((C1553k0) list2.get(i10));
                    }
                    c1513m0.compositionValuesAwaitingInsert.clear();
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
        /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0139 -> B:23:0x0142). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0151 -> B:24:0x014d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C1513M0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // Ba.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object g(I i10, InterfaceC1545g0 interfaceC1545g0, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            k kVar = C1513M0.this.new k(interfaceC4588d);
            kVar.f12718K = interfaceC1545g0;
            return kVar.invokeSuspend(C4153F.f46609a);
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Loa/F;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.M0$l */
    static final class l extends AbstractC3864v implements Ba.l<Object, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1496E f12729B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4389K<Object> f12730C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC1496E interfaceC1496E, C4389K<Object> c4389k) {
            super(1);
            this.f12729B = interfaceC1496E;
            this.f12730C = c4389k;
        }

        public final void a(Object obj) {
            this.f12729B.p(obj);
            C4389K<Object> c4389k = this.f12730C;
            if (c4389k != null) {
                c4389k.h(obj);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
            a(obj);
            return C4153F.f46609a;
        }
    }

    public C1513M0(ta.g gVar) {
        C1546h c1546h = new C1546h(new e());
        this.broadcastFrameClock = c1546h;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new C4389K<>(0, 1, null);
        this.compositionInvalidations = new Q.b<>(new InterfaceC1496E[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = J.a(d.Inactive);
        InterfaceC1870x interfaceC1870xA = C1873y0.a((InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE));
        interfaceC1870xA.q(new f());
        this.effectJob = interfaceC1870xA;
        this.effectCoroutineContext = gVar.s(c1546h).s(interfaceC1870xA);
        this.recomposerInfo = new c();
    }

    private final Ba.l<Object, C4153F> C0(InterfaceC1496E composition, C4389K<Object> modifiedValues) {
        return new l(composition, modifiedValues);
    }

    private final void X(InterfaceC1496E composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
    }

    private final void Y(androidx.compose.runtime.snapshots.b snapshot) {
        try {
            if (snapshot.C() instanceof h.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Z(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        C1849m c1849m;
        if (j0()) {
            return C4153F.f46609a;
        }
        C1849m c1849m2 = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m2.x();
        synchronized (this.stateLock) {
            if (j0()) {
                c1849m = c1849m2;
            } else {
                this.workContinuation = c1849m2;
                c1849m = null;
            }
        }
        if (c1849m != null) {
            C4172q.Companion companion = C4172q.INSTANCE;
            c1849m.resumeWith(C4172q.a(C4153F.f46609a));
        }
        Object objR = c1849m2.r();
        if (objR == C4696b.e()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC4588d);
        }
        return objR == C4696b.e() ? objR : C4153F.f46609a;
    }

    private final void b0() {
        this._knownCompositions.clear();
        this._knownCompositionsCache = r.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1847l<C4153F> c0() {
        d dVar;
        int i10 = 0;
        int i11 = 1;
        C3854k c3854k = null;
        if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
            b0();
            this.snapshotInvalidations = new C4389K<>(i10, i11, c3854k);
            this.compositionInvalidations.l();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            InterfaceC1847l<? super C4153F> interfaceC1847l = this.workContinuation;
            if (interfaceC1847l != null) {
                InterfaceC1847l.a.a(interfaceC1847l, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            dVar = d.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new C4389K<>(i10, i11, c3854k);
            this.compositionInvalidations.l();
            dVar = h0() ? d.InactivePendingWork : d.Inactive;
        } else {
            dVar = (this.compositionInvalidations.y() || this.snapshotInvalidations.e() || !this.compositionsAwaitingApply.isEmpty() || !this.compositionValuesAwaitingInsert.isEmpty() || this.concurrentCompositionsOutstanding > 0 || h0()) ? d.PendingWork : d.Idle;
        }
        this._state.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        InterfaceC1847l interfaceC1847l2 = this.workContinuation;
        this.workContinuation = null;
        return interfaceC1847l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        int i10;
        List listM;
        synchronized (this.stateLock) {
            try {
                if (this.compositionValuesRemoved.isEmpty()) {
                    listM = r.m();
                } else {
                    List listZ = r.z(this.compositionValuesRemoved.values());
                    this.compositionValuesRemoved.clear();
                    listM = new ArrayList(listZ.size());
                    int size = listZ.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C1553k0 c1553k0 = (C1553k0) listZ.get(i11);
                        listM.add(v.a(c1553k0, this.compositionValueStatesAvailable.get(c1553k0)));
                    }
                    this.compositionValueStatesAvailable.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = listM.size();
        for (i10 = 0; i10 < size2; i10++) {
            C4170o c4170o = (C4170o) listM.get(i10);
            C1553k0 c1553k02 = (C1553k0) c4170o.a();
            C1551j0 c1551j0 = (C1551j0) c4170o.b();
            if (c1551j0 != null) {
                c1553k02.getComposition().i(c1551j0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g0() {
        boolean zH0;
        synchronized (this.stateLock) {
            zH0 = h0();
        }
        return zH0;
    }

    private final boolean h0() {
        return !this.frameClockPaused && this.broadcastFrameClock.w();
    }

    private final boolean i0() {
        return this.compositionInvalidations.y() || h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j0() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            s.K<java.lang.Object> r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            Q.b<O.E> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.y()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            boolean r1 = r2.h0()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            r1 = 0
            goto L1f
        L1c:
            r1 = move-exception
            goto L21
        L1e:
            r1 = 1
        L1f:
            monitor-exit(r0)
            return r1
        L21:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1513M0.j0():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC1496E> k0() {
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<InterfaceC1496E> list3 = this._knownCompositions;
            List listM = list3.isEmpty() ? r.m() : new ArrayList(list3);
            this._knownCompositionsCache = listM;
            list2 = listM;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l0() {
        boolean z10;
        synchronized (this.stateLock) {
            z10 = this.isClosed;
        }
        if (z10) {
            Iterator<InterfaceC1867v0> it = this.effectJob.p().iterator();
            while (it.hasNext()) {
                if (it.next().a()) {
                }
            }
            return false;
        }
        return true;
    }

    private final void o0(InterfaceC1496E composition) {
        synchronized (this.stateLock) {
            List<C1553k0> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (C3862t.b(list.get(i10).getComposition(), composition)) {
                    C4153F c4153f = C4153F.f46609a;
                    ArrayList arrayList = new ArrayList();
                    p0(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        q0(arrayList, null);
                        p0(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void p0(List<C1553k0> list, C1513M0 c1513m0, InterfaceC1496E interfaceC1496E) {
        list.clear();
        synchronized (c1513m0.stateLock) {
            try {
                Iterator<C1553k0> it = c1513m0.compositionValuesAwaitingInsert.iterator();
                while (it.hasNext()) {
                    C1553k0 next = it.next();
                    if (C3862t.b(next.getComposition(), interfaceC1496E)) {
                        list.add(next);
                        it.remove();
                    }
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        r1 = r7.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (r6 >= r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r7.get(r6).d() == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        if (r8 >= r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r9 = r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
    
        if (r9.d() != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        r9 = r9.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r9 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        r6 = r13.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        kotlin.collections.r.D(r13.compositionValuesAwaitingInsert, r1);
        r1 = oa.C4153F.f46609a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        if (r8 >= r6) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        r9 = r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
    
        if (r9.d() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0128, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<kotlin.InterfaceC1496E> q0(java.util.List<kotlin.C1553k0> r14, s.C4389K<java.lang.Object> r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1513M0.q0(java.util.List, s.K):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1496E r0(InterfaceC1496E composition, C4389K<Object> modifiedValues) {
        Set<InterfaceC1496E> set;
        if (composition.n() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        androidx.compose.runtime.snapshots.b bVarO = androidx.compose.runtime.snapshots.g.INSTANCE.o(u0(composition), C0(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.g gVarL = bVarO.l();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.e()) {
                        composition.u(new h(modifiedValues, composition));
                    }
                } catch (Throwable th) {
                    bVarO.s(gVarL);
                    throw th;
                }
            }
            boolean zW = composition.w();
            bVarO.s(gVarL);
            if (zW) {
                return composition;
            }
            return null;
        } finally {
            Y(bVarO);
        }
    }

    private final void s0(Exception e10, InterfaceC1496E failedInitialComposition, boolean recoverable) throws Exception {
        int i10 = 0;
        if (!f12652B.get().booleanValue() || (e10 instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                b bVar = this.errorState;
                if (bVar != null) {
                    throw bVar.getCause();
                }
                this.errorState = new b(false, e10);
                C4153F c4153f = C4153F.f46609a;
            }
            throw e10;
        }
        synchronized (this.stateLock) {
            try {
                C1530b.f("Error was captured in composition while live edit was enabled.", e10);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.l();
                this.snapshotInvalidations = new C4389K<>(i10, 1, null);
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new b(recoverable, e10);
                if (failedInitialComposition != null) {
                    x0(failedInitialComposition);
                }
                c0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void t0(C1513M0 c1513m0, Exception exc, InterfaceC1496E interfaceC1496E, boolean z10, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            interfaceC1496E = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c1513m0.s0(exc, interfaceC1496E, z10);
    }

    private final Ba.l<Object, C4153F> u0(InterfaceC1496E composition) {
        return new i(composition);
    }

    private final Object v0(q<? super I, ? super InterfaceC1545g0, ? super InterfaceC4588d<? super C4153F>, ? extends Object> qVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objG = C1837g.g(this.broadcastFrameClock, new j(qVar, C1547h0.a(interfaceC4588d.getContext()), null), interfaceC4588d);
        return objG == C4696b.e() ? objG : C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w0() {
        List<InterfaceC1496E> listK0;
        boolean zI0;
        int i10 = 1;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.d()) {
                return i0();
            }
            Set<? extends Object> setA = Q.e.a(this.snapshotInvalidations);
            C3854k c3854k = null;
            int i11 = 0;
            this.snapshotInvalidations = new C4389K<>(i11, i10, c3854k);
            synchronized (this.stateLock) {
                listK0 = k0();
            }
            try {
                int size = listK0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    listK0.get(i12).l(setA);
                    if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new C4389K<>(i11, i10, c3854k);
                    C4153F c4153f = C4153F.f46609a;
                }
                synchronized (this.stateLock) {
                    if (c0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zI0 = i0();
                }
                return zI0;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.i(setA);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(InterfaceC1496E composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        z0(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(InterfaceC1867v0 callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            c0();
        }
    }

    private final void z0(InterfaceC1496E composition) {
        this._knownCompositions.remove(composition);
        this._knownCompositionsCache = null;
    }

    public final void A0() {
        InterfaceC1847l<C4153F> interfaceC1847lC0;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                interfaceC1847lC0 = c0();
            } else {
                interfaceC1847lC0 = null;
            }
        }
        if (interfaceC1847lC0 != null) {
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847lC0.resumeWith(C4172q.a(C4153F.f46609a));
        }
    }

    public final Object B0(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objV0 = v0(new k(null), interfaceC4588d);
        return objV0 == C4696b.e() ? objV0 : C4153F.f46609a;
    }

    @Override // kotlin.AbstractC1564q
    public void a(InterfaceC1496E composition, p<? super InterfaceC1554l, ? super Integer, C4153F> content) throws Exception {
        boolean zN = composition.n();
        try {
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.b bVarO = companion.o(u0(composition), C0(composition, null));
            try {
                androidx.compose.runtime.snapshots.g gVarL = bVarO.l();
                try {
                    composition.q(content);
                    C4153F c4153f = C4153F.f46609a;
                    if (!zN) {
                        companion.g();
                    }
                    synchronized (this.stateLock) {
                        if (this._state.getValue().compareTo(d.ShuttingDown) > 0 && !k0().contains(composition)) {
                            X(composition);
                        }
                    }
                    try {
                        o0(composition);
                        try {
                            composition.m();
                            composition.g();
                            if (zN) {
                                return;
                            }
                            companion.g();
                        } catch (Exception e10) {
                            t0(this, e10, null, false, 6, null);
                        }
                    } catch (Exception e11) {
                        s0(e11, composition, true);
                    }
                } finally {
                    bVarO.s(gVarL);
                }
            } finally {
                Y(bVarO);
            }
        } catch (Exception e12) {
            s0(e12, composition, true);
        }
    }

    public final void a0() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(d.Idle) >= 0) {
                    this._state.setValue(d.ShuttingDown);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC1867v0.a.a(this.effectJob, null, 1, null);
    }

    @Override // kotlin.AbstractC1564q
    public void b(C1553k0 reference) {
        synchronized (this.stateLock) {
            C1515N0.a(this.compositionValuesRemoved, reference.c(), reference);
        }
    }

    @Override // kotlin.AbstractC1564q
    public boolean d() {
        return f12652B.get().booleanValue();
    }

    @Override // kotlin.AbstractC1564q
    public boolean e() {
        return false;
    }

    /* renamed from: e0, reason: from getter */
    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // kotlin.AbstractC1564q
    public boolean f() {
        return false;
    }

    public final H<d> f0() {
        return this._state;
    }

    @Override // kotlin.AbstractC1564q
    public int h() {
        return 1000;
    }

    @Override // kotlin.AbstractC1564q
    /* renamed from: i, reason: from getter */
    public ta.g getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // kotlin.AbstractC1564q
    public void k(C1553k0 reference) {
        InterfaceC1847l<C4153F> interfaceC1847lC0;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            interfaceC1847lC0 = c0();
        }
        if (interfaceC1847lC0 != null) {
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847lC0.resumeWith(C4172q.a(C4153F.f46609a));
        }
    }

    @Override // kotlin.AbstractC1564q
    public void l(InterfaceC1496E composition) {
        InterfaceC1847l<C4153F> interfaceC1847lC0;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.m(composition)) {
                interfaceC1847lC0 = null;
            } else {
                this.compositionInvalidations.c(composition);
                interfaceC1847lC0 = c0();
            }
        }
        if (interfaceC1847lC0 != null) {
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847lC0.resumeWith(C4172q.a(C4153F.f46609a));
        }
    }

    @Override // kotlin.AbstractC1564q
    public void m(C1553k0 reference, C1551j0 data) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            C4153F c4153f = C4153F.f46609a;
        }
    }

    public final Object m0(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objP = C1972g.p(f0(), new g(null), interfaceC4588d);
        return objP == C4696b.e() ? objP : C4153F.f46609a;
    }

    @Override // kotlin.AbstractC1564q
    public C1551j0 n(C1553k0 reference) {
        C1551j0 c1551j0Remove;
        synchronized (this.stateLock) {
            c1551j0Remove = this.compositionValueStatesAvailable.remove(reference);
        }
        return c1551j0Remove;
    }

    public final void n0() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            C4153F c4153f = C4153F.f46609a;
        }
    }

    @Override // kotlin.AbstractC1564q
    public void q(InterfaceC1496E composition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.AbstractC1564q
    public void t(InterfaceC1496E composition) {
        synchronized (this.stateLock) {
            z0(composition);
            this.compositionInvalidations.B(composition);
            this.compositionsAwaitingApply.remove(composition);
            C4153F c4153f = C4153F.f46609a;
        }
    }

    @Override // kotlin.AbstractC1564q
    public void o(Set<InterfaceC1879a> table) {
    }
}
