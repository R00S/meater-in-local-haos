package kotlin;

import Ba.p;
import Q.f;
import Z.k;
import Z.l;
import a0.InterfaceC1881c;
import androidx.compose.runtime.snapshots.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C4734X;
import kotlin.InterfaceC1502H;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4170o;
import s.C4379A;
import s.C4388J;
import s.C4389K;
import s.M;
import s.V;
import s.W;
import ta.g;

/* compiled from: Composition.kt */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001@B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040/H\u0002¢\u0006\u0004\b0\u00101J\u0011\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b5\u0010\u0011J\u001d\u00106\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b6\u0010\u0011J\u001d\u00107\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0013J\u001d\u00109\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010 J\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\bA\u0010 J\u000f\u0010B\u001a\u00020\u0016H\u0016¢\u0006\u0004\bB\u0010CJ+\u0010H\u001a\u00020\u000e2\u001a\u0010G\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020F\u0012\u0006\u0012\u0004\u0018\u00010F0E0DH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000eH\u0016¢\u0006\u0004\bN\u0010\u0013J\u000f\u0010O\u001a\u00020\u000eH\u0016¢\u0006\u0004\bO\u0010\u0013J\u000f\u0010P\u001a\u00020\u000eH\u0016¢\u0006\u0004\bP\u0010\u0013J\u000f\u0010Q\u001a\u00020\u000eH\u0016¢\u0006\u0004\bQ\u0010\u0013J\u000f\u0010R\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010\u0013J5\u0010W\u001a\u00028\u0000\"\u0004\b\u0000\u0010S2\b\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010V\u001a\u00020U2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\bW\u0010XJ!\u0010Y\u001a\u00020,2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b]\u0010^J\u001b\u0010`\u001a\u00020\u000e2\n\u0010K\u001a\u0006\u0012\u0002\b\u00030_H\u0000¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000eH\u0016¢\u0006\u0004\bb\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010cR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010dR(\u0010h\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010gR\u0014\u0010j\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010iR \u0010p\u001a\b\u0012\u0004\u0012\u00020l0k8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bm\u0010n\u0012\u0004\bo\u0010\u0013R \u0010w\u001a\u00020q8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010\u0013\u001a\u0004\bt\u0010uR \u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010xR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020%0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010{R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020%0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010{R$\u0010~\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030_0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010xR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\u007fR\u0015\u0010\u0080\u0001\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u007fR!\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010xR$\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040/8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010xR/\u0010\u008a\u0001\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0012\u0005\b\u0089\u0001\u0010\u0013\u001a\u0005\b\u0086\u0001\u0010C\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008e\u0001\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010\u001fR\u001f\u0010\u0093\u0001\u001a\u00030\u008f\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\br\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u009a\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009c\u0001\u001a\u00020\u00168\u0006¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u0085\u0001\u001a\u0005\b\u009c\u0001\u0010CR\u0019\u0010\u009e\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0085\u0001R.\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0005\b£\u0001\u0010\u0011R\u0015\u0010¥\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010CR\u0016\u0010§\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010CR\u0016\u0010©\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010CR\u0016\u0010«\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010C¨\u0006¬\u0001"}, d2 = {"LO/s;", "LO/E;", "LO/T0;", "LO/L0;", "", "LO/q;", "parent", "LO/f;", "applier", "Lta/g;", "recomposeContext", "<init>", "(LO/q;LO/f;Lta/g;)V", "Lkotlin/Function0;", "Loa/F;", "content", "C", "(LBa/p;)V", "D", "()V", "E", "value", "", "forgetConditionalScopes", "j", "(Ljava/lang/Object;Z)V", "", "values", "z", "(Ljava/util/Set;Z)V", "B", "I", "(Ljava/lang/Object;)V", "LP/a;", "changes", "A", "(LP/a;)V", "LO/J0;", "scope", "instance", "N", "(LO/J0;Ljava/lang/Object;)Z", "LO/d;", "anchor", "LO/Y;", "H", "(LO/J0;LO/d;Ljava/lang/Object;)LO/Y;", "LQ/f;", "M", "()LQ/f;", "La0/c;", "J", "()La0/c;", "k", "v", "q", "c", "l", "(Ljava/util/Set;)V", "b", "(Ljava/util/Set;)Z", "block", "u", "(LBa/a;)V", "a", "p", "w", "()Z", "", "Loa/o;", "LO/k0;", "references", "o", "(Ljava/util/List;)V", "LO/j0;", "state", "i", "(LO/j0;)V", "m", "g", "t", "s", "x", "R", "to", "", "groupIndex", "y", "(LO/E;ILBa/a;)Ljava/lang/Object;", "e", "(LO/J0;Ljava/lang/Object;)LO/Y;", "d", "(LO/J0;)V", "L", "(Ljava/lang/Object;LO/J0;)V", "LO/H;", "K", "(LO/H;)V", "deactivate", "LO/q;", "LO/f;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Ljava/lang/Object;", "lock", "", "LO/R0;", "F", "Ljava/util/Set;", "getAbandonSet$annotations", "abandonSet", "LO/Z0;", "G", "LO/Z0;", "getSlotTable$runtime_release", "()LO/Z0;", "getSlotTable$runtime_release$annotations", "slotTable", "LQ/f;", "observations", "Ls/K;", "Ls/K;", "invalidatedScopes", "conditionallyInvalidatedScopes", "derivedStates", "LP/a;", "lateChanges", "observationsProcessed", "O", "invalidations", "P", "Z", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "pendingInvalidScopes", "Q", "LO/s;", "invalidationDelegate", "invalidationDelegateGroup", "LO/z;", "S", "LO/z;", "()LO/z;", "observerHolder", "LO/m;", "T", "LO/m;", "composer", "U", "Lta/g;", "_recomposeContext", "V", "isRoot", "W", "disposed", "X", "LBa/p;", "getComposable", "()LBa/p;", "setComposable", "composable", "areChildrenComposing", "n", "isComposing", "h", "isDisposed", "r", "hasInvalidations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1568s implements InterfaceC1496E, T0, InterfaceC1511L0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1564q parent;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1542f<?> applier;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> pendingModifications;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Set<R0> abandonSet;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Z0 slotTable;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final f<Object, C1507J0> observations;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final C4389K<C1507J0> invalidatedScopes;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final C4389K<C1507J0> conditionallyInvalidatedScopes;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final f<Object, InterfaceC1502H<?>> derivedStates;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final P.a changes;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final P.a lateChanges;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final f<Object, C1507J0> observationsProcessed;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private f<C1507J0, Object> invalidations;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean pendingInvalidScopes;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private C1568s invalidationDelegate;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private int invalidationDelegateGroup;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final C1582z observerHolder;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final C1556m composer;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final g _recomposeContext;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final boolean isRoot;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private p<? super InterfaceC1554l, ? super Integer, C4153F> composable;

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-¨\u00060"}, d2 = {"LO/s$a;", "LO/Q0;", "", "LO/R0;", "abandoning", "<init>", "(Ljava/util/Set;)V", "", "instance", "", "endRelativeOrder", "priority", "endRelativeAfter", "Loa/F;", "j", "(Ljava/lang/Object;III)V", "i", "(I)V", "c", "(LO/R0;)V", "b", "(LO/R0;III)V", "Lkotlin/Function0;", "effect", "d", "(LBa/a;)V", "LO/k;", "a", "(LO/k;III)V", "e", "g", "()V", "h", "f", "Ljava/util/Set;", "", "Ljava/util/List;", "remembering", "leaving", "sideEffects", "Ls/K;", "Ls/K;", "releasing", "pending", "Ls/A;", "Ls/A;", "priorities", "afters", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.s$a */
    private static final class a implements Q0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<R0> abandoning;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private C4389K<InterfaceC1552k> releasing;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<R0> remembering = new ArrayList();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<Object> leaving = new ArrayList();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<Ba.a<C4153F>> sideEffects = new ArrayList();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<Object> pending = new ArrayList();

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C4379A priorities = new C4379A(0, 1, null);

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final C4379A afters = new C4379A(0, 1, null);

        public a(Set<R0> set) {
            this.abandoning = set;
        }

        private final void i(int endRelativeOrder) {
            if (this.pending.isEmpty()) {
                return;
            }
            int i10 = 0;
            int i11 = 0;
            List listS = null;
            C4379A c4379a = null;
            C4379A c4379a2 = null;
            while (i11 < this.afters.get_size()) {
                if (endRelativeOrder <= this.afters.a(i11)) {
                    Object objRemove = this.pending.remove(i11);
                    int iN = this.afters.n(i11);
                    int iN2 = this.priorities.n(i11);
                    if (listS == null) {
                        listS = r.s(objRemove);
                        c4379a2 = new C4379A(0, 1, null);
                        c4379a2.i(iN);
                        c4379a = new C4379A(0, 1, null);
                        c4379a.i(iN2);
                    } else {
                        C3862t.e(c4379a, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        C3862t.e(c4379a2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        listS.add(objRemove);
                        c4379a2.i(iN);
                        c4379a.i(iN2);
                    }
                } else {
                    i11++;
                }
            }
            if (listS != null) {
                C3862t.e(c4379a, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                C3862t.e(c4379a2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = listS.size() - 1;
                while (i10 < size) {
                    int i12 = i10 + 1;
                    int size2 = listS.size();
                    for (int i13 = i12; i13 < size2; i13++) {
                        int iA = c4379a2.a(i10);
                        int iA2 = c4379a2.a(i13);
                        if (iA < iA2 || (iA2 == iA && c4379a.a(i10) < c4379a.a(i13))) {
                            C1570t.f(listS, i10, i13);
                            C1570t.g(c4379a, i10, i13);
                            C1570t.g(c4379a2, i10, i13);
                        }
                    }
                    i10 = i12;
                }
                this.leaving.addAll(listS);
            }
        }

        private final void j(Object instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            i(endRelativeOrder);
            if (endRelativeAfter < 0 || endRelativeAfter >= endRelativeOrder) {
                this.leaving.add(instance);
                return;
            }
            this.pending.add(instance);
            this.priorities.i(priority);
            this.afters.i(endRelativeAfter);
        }

        @Override // kotlin.Q0
        public void a(InterfaceC1552k instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            j(instance, endRelativeOrder, priority, endRelativeAfter);
        }

        @Override // kotlin.Q0
        public void b(R0 instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            j(instance, endRelativeOrder, priority, endRelativeAfter);
        }

        @Override // kotlin.Q0
        public void c(R0 instance) {
            this.remembering.add(instance);
        }

        @Override // kotlin.Q0
        public void d(Ba.a<C4153F> effect) {
            this.sideEffects.add(effect);
        }

        @Override // kotlin.Q0
        public void e(InterfaceC1552k instance, int endRelativeOrder, int priority, int endRelativeAfter) {
            C4389K<InterfaceC1552k> c4389kA = this.releasing;
            if (c4389kA == null) {
                c4389kA = W.a();
                this.releasing = c4389kA;
            }
            c4389kA.v(instance);
            j(instance, endRelativeOrder, priority, endRelativeAfter);
        }

        public final void f() {
            if (this.abandoning.isEmpty()) {
                return;
            }
            Object objA = B1.f12598a.a("Compose:abandons");
            try {
                Iterator<R0> it = this.abandoning.iterator();
                while (it.hasNext()) {
                    R0 next = it.next();
                    it.remove();
                    next.b();
                }
                C4153F c4153f = C4153F.f46609a;
                B1.f12598a.b(objA);
            } catch (Throwable th) {
                B1.f12598a.b(objA);
                throw th;
            }
        }

        public final void g() {
            Object objA;
            i(Integer.MIN_VALUE);
            if (!this.leaving.isEmpty()) {
                objA = B1.f12598a.a("Compose:onForgotten");
                try {
                    V v10 = this.releasing;
                    for (int size = this.leaving.size() - 1; -1 < size; size--) {
                        Object obj = this.leaving.get(size);
                        if (obj instanceof R0) {
                            this.abandoning.remove(obj);
                            ((R0) obj).c();
                        }
                        if (obj instanceof InterfaceC1552k) {
                            if (v10 == null || !v10.a(obj)) {
                                ((InterfaceC1552k) obj).i();
                            } else {
                                ((InterfaceC1552k) obj).a();
                            }
                        }
                    }
                    C4153F c4153f = C4153F.f46609a;
                    B1.f12598a.b(objA);
                } finally {
                }
            }
            if (this.remembering.isEmpty()) {
                return;
            }
            objA = B1.f12598a.a("Compose:onRemembered");
            try {
                List<R0> list = this.remembering;
                int size2 = list.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    R0 r02 = list.get(i10);
                    this.abandoning.remove(r02);
                    r02.d();
                }
                C4153F c4153f2 = C4153F.f46609a;
                B1.f12598a.b(objA);
            } finally {
            }
        }

        public final void h() {
            if (this.sideEffects.isEmpty()) {
                return;
            }
            Object objA = B1.f12598a.a("Compose:sideeffects");
            try {
                List<Ba.a<C4153F>> list = this.sideEffects;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invoke();
                }
                this.sideEffects.clear();
                C4153F c4153f = C4153F.f46609a;
                B1.f12598a.b(objA);
            } catch (Throwable th) {
                B1.f12598a.b(objA);
                throw th;
            }
        }
    }

    public C1568s(AbstractC1564q abstractC1564q, InterfaceC1542f<?> interfaceC1542f, g gVar) {
        this.parent = abstractC1564q;
        this.applier = interfaceC1542f;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<R0> setL = new C4389K(0, 1, null).l();
        this.abandonSet = setL;
        Z0 z02 = new Z0();
        if (abstractC1564q.d()) {
            z02.w();
        }
        if (abstractC1564q.getCollectingSourceInformation()) {
            z02.x();
        }
        this.slotTable = z02;
        this.observations = new f<>();
        this.invalidatedScopes = new C4389K<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new C4389K<>(0, 1, null);
        this.derivedStates = new f<>();
        P.a aVar = new P.a();
        this.changes = aVar;
        P.a aVar2 = new P.a();
        this.lateChanges = aVar2;
        this.observationsProcessed = new f<>();
        this.invalidations = new f<>();
        this.observerHolder = new C1582z(null, false, 3, null);
        C1556m c1556m = new C1556m(interfaceC1542f, abstractC1564q, z02, setL, aVar, aVar2, this);
        abstractC1564q.p(c1556m);
        this.composer = c1556m;
        this._recomposeContext = gVar;
        this.isRoot = abstractC1564q instanceof C1513M0;
        this.composable = C1548i.f12861a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A(P.a r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1568s.A(P.a):void");
    }

    private final void B() {
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        int i13;
        boolean zD;
        Object[] objArr;
        long[] jArr3;
        long[] jArr4;
        C4388J<Object, Object> c4388jD = this.derivedStates.d();
        long[] jArr5 = c4388jD.metadata;
        int length = jArr5.length - 2;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j11 = jArr5[i15];
                if ((((~j11) << c10) & j11 & j10) != j10) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = c4388jD.keys[i18];
                            Object obj2 = c4388jD.values[i18];
                            if (obj2 instanceof C4389K) {
                                C3862t.e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                C4389K c4389k = (C4389K) obj2;
                                Object[] objArr2 = c4389k.elements;
                                long[] jArr6 = c4389k.metadata;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i11 = length;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j12 = jArr6[i19];
                                        i12 = i15;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j12) << c10) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                int i22 = i21;
                                                Object[] objArr4 = objArr3;
                                                if ((j12 & 255) < 128) {
                                                    int i23 = (i19 << 3) + i22;
                                                    jArr4 = jArr6;
                                                    if (!this.observations.c((InterfaceC1502H) objArr4[i23])) {
                                                        c4389k.y(i23);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j12 >>= 8;
                                                i21 = i22 + 1;
                                                jArr6 = jArr4;
                                                objArr3 = objArr4;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i20 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        jArr6 = jArr3;
                                        objArr2 = objArr;
                                        i15 = i12;
                                        c10 = 7;
                                    }
                                } else {
                                    i12 = i15;
                                }
                                zD = c4389k.d();
                            } else {
                                jArr2 = jArr5;
                                i11 = length;
                                i12 = i15;
                                C3862t.e(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                zD = !this.observations.c((InterfaceC1502H) obj2);
                            }
                            if (zD) {
                                c4388jD.p(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr5;
                            i11 = length;
                            i12 = i15;
                            i13 = i14;
                        }
                        j11 >>= i13;
                        i17++;
                        i14 = i13;
                        jArr5 = jArr2;
                        length = i11;
                        i15 = i12;
                        c10 = 7;
                    }
                    jArr = jArr5;
                    int i24 = length;
                    int i25 = i15;
                    if (i16 != i14) {
                        break;
                    }
                    length = i24;
                    i10 = i25;
                } else {
                    jArr = jArr5;
                    i10 = i15;
                }
                if (i10 == length) {
                    break;
                }
                i15 = i10 + 1;
                jArr5 = jArr;
                c10 = 7;
                j10 = -9187201950435737472L;
                i14 = 8;
            }
        }
        if (!this.conditionallyInvalidatedScopes.e()) {
            return;
        }
        C4389K<C1507J0> c4389k2 = this.conditionallyInvalidatedScopes;
        Object[] objArr5 = c4389k2.elements;
        long[] jArr7 = c4389k2.metadata;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i26 = 0;
        while (true) {
            long j13 = jArr7[i26];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i27 = 8 - ((~(i26 - length3)) >>> 31);
                for (int i28 = 0; i28 < i27; i28++) {
                    if ((j13 & 255) < 128) {
                        int i29 = (i26 << 3) + i28;
                        if (!((C1507J0) objArr5[i29]).t()) {
                            c4389k2.y(i29);
                        }
                    }
                    j13 >>= 8;
                }
                if (i27 != 8) {
                    return;
                }
            }
            if (i26 == length3) {
                return;
            } else {
                i26++;
            }
        }
    }

    private final void C(p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        if (this.disposed) {
            C1489A0.b("The composition is disposed");
        }
        this.composable = content;
        this.parent.a(this, content);
    }

    private final void D() {
        Object andSet = this.pendingModifications.getAndSet(C1570t.f13025a);
        if (andSet != null) {
            if (C3862t.b(andSet, C1570t.f13025a)) {
                C1560o.t("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                z((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C1560o.t("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                z(set, true);
            }
        }
    }

    private final void E() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (C3862t.b(andSet, C1570t.f13025a)) {
            return;
        }
        if (andSet instanceof Set) {
            z((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                z(set, false);
            }
            return;
        }
        if (andSet == null) {
            C1560o.t("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        C1560o.t("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final boolean F() {
        return this.composer.B0();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab A[Catch: all -> 0x001e, EDGE_INSN: B:65:0x00ab->B:51:0x00ab BREAK  A[LOOP:0: B:32:0x0064->B:47:0x00a3], EDGE_INSN: B:66:0x00ab->B:51:0x00ab BREAK  A[LOOP:0: B:32:0x0064->B:47:0x00a3], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x003b, B:24:0x003f, B:25:0x0048, B:27:0x0054, B:29:0x0058, B:32:0x0064, B:34:0x0074, B:36:0x0080, B:38:0x008a, B:43:0x0099, B:47:0x00a3, B:48:0x00a6, B:51:0x00ab), top: B:63:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.EnumC1525Y H(kotlin.C1507J0 r21, kotlin.C1536d r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1568s.H(O.J0, O.d, java.lang.Object):O.Y");
    }

    private final void I(Object value) {
        Object objB = this.observations.d().b(value);
        if (objB == null) {
            return;
        }
        if (!(objB instanceof C4389K)) {
            C1507J0 c1507j0 = (C1507J0) objB;
            if (c1507j0.s(value) == EnumC1525Y.IMMINENT) {
                this.observationsProcessed.a(value, c1507j0);
                return;
            }
            return;
        }
        C4389K c4389k = (C4389K) objB;
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
                        C1507J0 c1507j02 = (C1507J0) objArr[(i10 << 3) + i12];
                        if (c1507j02.s(value) == EnumC1525Y.IMMINENT) {
                            this.observationsProcessed.a(value, c1507j02);
                        }
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

    private final InterfaceC1881c J() {
        C1582z c1582z = this.observerHolder;
        if (c1582z.getRoot()) {
            c1582z.a();
        } else {
            C1582z c1582zJ = this.parent.getObserverHolder();
            if (c1582zJ != null) {
                c1582zJ.a();
            }
            c1582z.a();
            if (!C3862t.b(null, null)) {
                c1582z.c(null);
            }
        }
        return null;
    }

    private final f<C1507J0, Object> M() {
        f<C1507J0, Object> fVar = this.invalidations;
        this.invalidations = new f<>();
        return fVar;
    }

    private final boolean N(C1507J0 scope, Object instance) {
        return n() && this.composer.p1(scope, instance);
    }

    private final void j(Object value, boolean forgetConditionalScopes) {
        Object objB = this.observations.d().b(value);
        if (objB == null) {
            return;
        }
        if (!(objB instanceof C4389K)) {
            C1507J0 c1507j0 = (C1507J0) objB;
            if (this.observationsProcessed.f(value, c1507j0) || c1507j0.s(value) == EnumC1525Y.IGNORED) {
                return;
            }
            if (!c1507j0.t() || forgetConditionalScopes) {
                this.invalidatedScopes.h(c1507j0);
                return;
            } else {
                this.conditionallyInvalidatedScopes.h(c1507j0);
                return;
            }
        }
        C4389K c4389k = (C4389K) objB;
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
                        C1507J0 c1507j02 = (C1507J0) objArr[(i10 << 3) + i12];
                        if (!this.observationsProcessed.f(value, c1507j02) && c1507j02.s(value) != EnumC1525Y.IGNORED) {
                            if (!c1507j02.t() || forgetConditionalScopes) {
                                this.invalidatedScopes.h(c1507j02);
                            } else {
                                this.conditionallyInvalidatedScopes.h(c1507j02);
                            }
                        }
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180 A[EDGE_INSN: B:69:0x0180->B:221:0x0111 BREAK  A[LOOP:13: B:59:0x0146->B:70:0x0182]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(java.util.Set<? extends java.lang.Object> r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1568s.z(java.util.Set, boolean):void");
    }

    /* renamed from: G, reason: from getter */
    public final C1582z getObserverHolder() {
        return this.observerHolder;
    }

    public final void K(InterfaceC1502H<?> state) {
        if (this.observations.c(state)) {
            return;
        }
        this.derivedStates.g(state);
    }

    public final void L(Object instance, C1507J0 scope) {
        this.observations.f(instance, scope);
    }

    @Override // kotlin.InterfaceC1496E, kotlin.InterfaceC1511L0
    public void a(Object value) {
        C1507J0 c1507j0D0;
        long[] jArr;
        long[] jArr2;
        int i10;
        if (F() || (c1507j0D0 = this.composer.D0()) == null) {
            return;
        }
        c1507j0D0.H(true);
        if (c1507j0D0.w(value)) {
            return;
        }
        if (value instanceof l) {
            ((l) value).q(e.a(1));
        }
        this.observations.a(value, c1507j0D0);
        if (value instanceof InterfaceC1502H) {
            InterfaceC1502H<?> interfaceC1502H = (InterfaceC1502H) value;
            InterfaceC1502H.a<?> aVarO = interfaceC1502H.o();
            this.derivedStates.g(value);
            M<k> mB = aVarO.b();
            Object[] objArr = mB.keys;
            long[] jArr3 = mB.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr3[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                k kVar = (k) objArr[(i11 << 3) + i14];
                                if (kVar instanceof l) {
                                    jArr2 = jArr3;
                                    ((l) kVar).q(e.a(1));
                                } else {
                                    jArr2 = jArr3;
                                }
                                this.derivedStates.a(kVar, value);
                                i10 = 8;
                            } else {
                                jArr2 = jArr3;
                                i10 = i12;
                            }
                            j10 >>= i10;
                            i14++;
                            i12 = i10;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    jArr3 = jArr;
                }
            }
            c1507j0D0.v(interfaceC1502H, aVarO.a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // kotlin.InterfaceC1496E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.util.Set<? extends java.lang.Object> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof Q.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            Q.d r15 = (Q.d) r15
            s.V r15 = r15.c()
            java.lang.Object[] r0 = r15.elements
            long[] r15 = r15.metadata
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            Q.f<java.lang.Object, O.J0> r11 = r14.observations
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L50
            Q.f<java.lang.Object, O.H<?>> r11 = r14.derivedStates
            boolean r10 = r11.c(r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            Q.f<java.lang.Object, O.J0> r3 = r14.observations
            boolean r3 = r3.c(r0)
            if (r3 != 0) goto L7c
            Q.f<java.lang.Object, O.H<?>> r3 = r14.derivedStates
            boolean r0 = r3.c(r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1568s.b(java.util.Set):boolean");
    }

    @Override // kotlin.InterfaceC1562p
    public void c() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    C1489A0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = C1548i.f12861a.b();
                    P.a aVarE0 = this.composer.getDeferredChanges();
                    if (aVarE0 != null) {
                        A(aVarE0);
                    }
                    boolean z10 = this.slotTable.getGroupsSize() > 0;
                    if (z10 || !this.abandonSet.isEmpty()) {
                        a aVar = new a(this.abandonSet);
                        if (z10) {
                            this.applier.e();
                            SlotWriter slotWriterL = this.slotTable.L();
                            try {
                                C1560o.M(slotWriterL, aVar);
                                C4153F c4153f = C4153F.f46609a;
                                slotWriterL.L(true);
                                this.applier.clear();
                                this.applier.i();
                                aVar.g();
                            } catch (Throwable th) {
                                slotWriterL.L(false);
                                throw th;
                            }
                        }
                        aVar.f();
                    }
                    this.composer.p0();
                }
                C4153F c4153f2 = C4153F.f46609a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.t(this);
    }

    @Override // kotlin.InterfaceC1511L0
    public void d(C1507J0 scope) {
        this.pendingInvalidScopes = true;
    }

    @Override // kotlin.T0
    public void deactivate() {
        synchronized (this.lock) {
            try {
                boolean z10 = this.slotTable.getGroupsSize() > 0;
                if (z10 || !this.abandonSet.isEmpty()) {
                    B1 b12 = B1.f12598a;
                    Object objA = b12.a("Compose:deactivate");
                    try {
                        a aVar = new a(this.abandonSet);
                        if (z10) {
                            this.applier.e();
                            SlotWriter slotWriterL = this.slotTable.L();
                            try {
                                C1560o.u(slotWriterL, aVar);
                                C4153F c4153f = C4153F.f46609a;
                                slotWriterL.L(true);
                                this.applier.i();
                                aVar.g();
                            } catch (Throwable th) {
                                slotWriterL.L(false);
                                throw th;
                            }
                        }
                        aVar.f();
                        C4153F c4153f2 = C4153F.f46609a;
                        b12.b(objA);
                    } catch (Throwable th2) {
                        B1.f12598a.b(objA);
                        throw th2;
                    }
                }
                this.observations.b();
                this.derivedStates.b();
                this.invalidations.b();
                this.changes.a();
                this.lateChanges.a();
                this.composer.o0();
                C4153F c4153f3 = C4153F.f46609a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // kotlin.InterfaceC1511L0
    public EnumC1525Y e(C1507J0 scope, Object instance) {
        C1568s c1568s;
        if (scope.k()) {
            scope.C(true);
        }
        C1536d c1536dI = scope.getAnchor();
        if (c1536dI == null || !c1536dI.b()) {
            return EnumC1525Y.IGNORED;
        }
        if (this.slotTable.M(c1536dI)) {
            return !scope.j() ? EnumC1525Y.IGNORED : H(scope, c1536dI, instance);
        }
        synchronized (this.lock) {
            c1568s = this.invalidationDelegate;
        }
        return (c1568s == null || !c1568s.N(scope, instance)) ? EnumC1525Y.IGNORED : EnumC1525Y.IMMINENT;
    }

    @Override // kotlin.InterfaceC1496E
    public void g() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.d()) {
                    A(this.lateChanges);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th;
                    } catch (Exception e10) {
                        s();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // kotlin.InterfaceC1562p
    /* renamed from: h, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // kotlin.InterfaceC1496E
    public void i(C1551j0 state) {
        a aVar = new a(this.abandonSet);
        SlotWriter slotWriterL = state.getSlotTable().L();
        try {
            C1560o.M(slotWriterL, aVar);
            C4153F c4153f = C4153F.f46609a;
            slotWriterL.L(true);
            aVar.g();
        } catch (Throwable th) {
            slotWriterL.L(false);
            throw th;
        }
    }

    @Override // kotlin.InterfaceC1562p
    public void k(p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        C(content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // kotlin.InterfaceC1496E
    public void l(Set<? extends Object> values) {
        Object obj;
        Set<? extends Object> setC;
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : C3862t.b(obj, C1570t.f13025a)) {
                setC = values;
            } else if (obj instanceof Set) {
                setC = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                C3862t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                setC = C3831l.C((Set[]) obj, values);
            }
        } while (!C4734X.a(this.pendingModifications, obj, setC));
        if (obj == null) {
            synchronized (this.lock) {
                E();
                C4153F c4153f = C4153F.f46609a;
            }
        }
    }

    @Override // kotlin.InterfaceC1496E
    public void m() {
        synchronized (this.lock) {
            try {
                A(this.changes);
                E();
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th;
                    } catch (Exception e10) {
                        s();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // kotlin.InterfaceC1496E
    public boolean n() {
        return this.composer.getIsComposing();
    }

    @Override // kotlin.InterfaceC1496E
    public void o(List<C4170o<C1553k0, C1553k0>> references) {
        boolean z10 = true;
        int size = references.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (!C3862t.b(references.get(i10).c().getComposition(), this)) {
                z10 = false;
                break;
            }
            i10++;
        }
        C1560o.Q(z10);
        try {
            this.composer.J0(references);
            C4153F c4153f = C4153F.f46609a;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // kotlin.InterfaceC1496E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.lock
            monitor-enter(r0)
            r14.I(r15)     // Catch: java.lang.Throwable -> L53
            Q.f<java.lang.Object, O.H<?>> r1 = r14.derivedStates     // Catch: java.lang.Throwable -> L53
            s.J r1 = r1.d()     // Catch: java.lang.Throwable -> L53
            java.lang.Object r15 = r1.b(r15)     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto L65
            boolean r1 = r15 instanceof s.C4389K     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L60
            s.K r15 = (s.C4389K) r15     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r1 = r15.elements     // Catch: java.lang.Throwable -> L53
            long[] r15 = r15.metadata     // Catch: java.lang.Throwable -> L53
            int r2 = r15.length     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + (-2)
            if (r2 < 0) goto L65
            r3 = 0
            r4 = r3
        L23:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L53
            long r7 = ~r5     // Catch: java.lang.Throwable -> L53
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L53
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L3d:
            if (r9 >= r7) goto L59
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L53
            O.H r10 = (kotlin.InterfaceC1502H) r10     // Catch: java.lang.Throwable -> L53
            r14.I(r10)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r15 = move-exception
            goto L69
        L55:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L3d
        L59:
            if (r7 != r8) goto L65
        L5b:
            if (r4 == r2) goto L65
            int r4 = r4 + 1
            goto L23
        L60:
            O.H r15 = (kotlin.InterfaceC1502H) r15     // Catch: java.lang.Throwable -> L53
            r14.I(r15)     // Catch: java.lang.Throwable -> L53
        L65:
            oa.F r15 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)
            return
        L69:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1568s.p(java.lang.Object):void");
    }

    @Override // kotlin.InterfaceC1496E
    public void q(p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        try {
            synchronized (this.lock) {
                D();
                f<C1507J0, Object> fVarM = M();
                try {
                    J();
                    this.composer.j0(fVarM, content);
                } catch (Exception e10) {
                    this.invalidations = fVarM;
                    throw e10;
                }
            }
        } finally {
        }
    }

    @Override // kotlin.InterfaceC1562p
    public boolean r() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.invalidations.e() > 0;
        }
        return z10;
    }

    @Override // kotlin.InterfaceC1496E
    public void s() {
        this.pendingModifications.set(null);
        this.changes.a();
        this.lateChanges.a();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new a(this.abandonSet).f();
    }

    @Override // kotlin.InterfaceC1496E
    public void t() {
        synchronized (this.lock) {
            try {
                this.composer.g0();
                if (!this.abandonSet.isEmpty()) {
                    new a(this.abandonSet).f();
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new a(this.abandonSet).f();
                        }
                        throw th;
                    } catch (Exception e10) {
                        s();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // kotlin.InterfaceC1496E
    public void u(Ba.a<C4153F> block) {
        this.composer.R0(block);
    }

    @Override // kotlin.T0
    public void v(p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        this.composer.n1();
        C(content);
        this.composer.u0();
    }

    @Override // kotlin.InterfaceC1496E
    public boolean w() {
        boolean zT0;
        synchronized (this.lock) {
            try {
                D();
                try {
                    f<C1507J0, Object> fVarM = M();
                    try {
                        J();
                        zT0 = this.composer.T0(fVarM);
                        if (!zT0) {
                            E();
                        }
                    } catch (Exception e10) {
                        this.invalidations = fVarM;
                        throw e10;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zT0;
    }

    @Override // kotlin.InterfaceC1496E
    public void x() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    C1507J0 c1507j0 = obj instanceof C1507J0 ? (C1507J0) obj : null;
                    if (c1507j0 != null) {
                        c1507j0.invalidate();
                    }
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.InterfaceC1496E
    public <R> R y(InterfaceC1496E to, int groupIndex, Ba.a<? extends R> block) {
        if (to == null || C3862t.b(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.invalidationDelegate = (C1568s) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    public /* synthetic */ C1568s(AbstractC1564q abstractC1564q, InterfaceC1542f interfaceC1542f, g gVar, int i10, C3854k c3854k) {
        this(abstractC1564q, interfaceC1542f, (i10 & 4) != 0 ? null : gVar);
    }
}
