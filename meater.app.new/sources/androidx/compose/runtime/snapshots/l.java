package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C1489A0;
import kotlin.C1533c;
import kotlin.C1560o;
import kotlin.C4734X;
import kotlin.InterfaceC1502H;
import kotlin.InterfaceC1504I;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import kotlin.m1;
import oa.C4153F;
import s.C4385G;
import s.C4388J;
import s.C4389K;

/* compiled from: SnapshotStateObserver.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001'B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u0018\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001e\u001a\u00020\u0004\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u001b\u001a\u00028\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b#\u0010\u0007J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\fJ\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\fR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010-\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010)j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R,\u00105\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0004018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010(R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0018088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010/R\u0018\u0010C\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010E¨\u0006G"}, d2 = {"Landroidx/compose/runtime/snapshots/l;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Loa/F;", "onChangedExecutor", "<init>", "(LBa/l;)V", "", "m", "()Z", "r", "()V", "", "set", "i", "(Ljava/util/Set;)V", "p", "()Ljava/util/Set;", "", "q", "()Ljava/lang/Void;", "T", "onChanged", "Landroidx/compose/runtime/snapshots/l$a;", "n", "(LBa/l;)Landroidx/compose/runtime/snapshots/l$a;", "scope", "onValueChangedForScope", "block", "o", "(Ljava/lang/Object;LBa/l;LBa/a;)V", "k", "(Ljava/lang/Object;)V", "predicate", "l", "s", "t", "j", "a", "LBa/l;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "c", "Z", "sendingNotifications", "Lkotlin/Function2;", "Landroidx/compose/runtime/snapshots/g;", "d", "LBa/p;", "applyObserver", "e", "readObserver", "LQ/b;", "f", "LQ/b;", "observedScopeMaps", "LZ/b;", "g", "LZ/b;", "applyUnsubscribe", "h", "isPaused", "Landroidx/compose/runtime/snapshots/l$a;", "currentMap", "", "J", "currentMapThreadId", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final int f22636k = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Ba.a<C4153F>, C4153F> onChangedExecutor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean sendingNotifications;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Z.b applyUnsubscribe;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isPaused;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private a currentMap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<Set<? extends Object>, g, C4153F> applyObserver = new b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Object, C4153F> readObserver = new c();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Q.b<a> observedScopeMaps = new Q.b<>(new a[16], 0);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long currentMapThreadId = -1;

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0011J7\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u0011J!\u0010\u001d\u001a\u00020\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0\u0002¢\u0006\u0004\b\u001d\u0010\u0006J\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00032\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0003¢\u0006\u0004\b*\u0010!R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00101R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R&\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u001e\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010>R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00103R$\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030&048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00105R<\u0010J\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0012\u0006\u0012\u0004\u0018\u00010\u00010Gj\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0012\u0006\u0012\u0004\u0018\u00010\u0001`H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010I¨\u0006K"}, d2 = {"Landroidx/compose/runtime/snapshots/l$a;", "", "Lkotlin/Function1;", "Loa/F;", "onChanged", "<init>", "(LBa/l;)V", "value", "", "currentToken", "currentScope", "Ls/G;", "recordedValues", "l", "(Ljava/lang/Object;ILjava/lang/Object;Ls/G;)V", "scope", "d", "(Ljava/lang/Object;)V", "m", "(Ljava/lang/Object;Ljava/lang/Object;)V", "k", "readObserver", "Lkotlin/Function0;", "block", "i", "(Ljava/lang/Object;LBa/l;LBa/a;)V", "e", "", "predicate", "n", "g", "()Z", "c", "()V", "", "changes", "j", "(Ljava/util/Set;)Z", "LO/H;", "derivedState", "o", "(LO/H;)V", "h", "a", "LBa/l;", "f", "()LBa/l;", "b", "Ljava/lang/Object;", "Ls/G;", "currentScopeReads", "I", "LQ/f;", "LQ/f;", "valueToScopes", "Ls/J;", "Ls/J;", "scopeToValues", "Ls/K;", "Ls/K;", "invalidated", "LQ/b;", "LQ/b;", "statesToReread", "LO/I;", "LO/I;", "getDerivedStateObserver", "()LO/I;", "derivedStateObserver", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Ba.l<Object, C4153F> onChanged;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Object currentScope;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private C4385G<Object> currentScopeReads;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int deriveStateScopeCount;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int currentToken = -1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Q.f<Object, Object> valueToScopes = new Q.f<>();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final C4388J<Object, C4385G<Object>> scopeToValues = new C4388J<>(0, 1, null);

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C4389K<Object> invalidated = new C4389K<>(0, 1, null);

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Q.b<InterfaceC1502H<?>> statesToReread = new Q.b<>(new InterfaceC1502H[16], 0);

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1504I derivedStateObserver = new C0322a();

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final Q.f<Object, InterfaceC1502H<?>> dependencyToDerivedStates = new Q.f<>();

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final HashMap<InterfaceC1502H<?>, Object> recordedDerivedStateValues = new HashMap<>();

        /* compiled from: SnapshotStateObserver.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/snapshots/l$a$a", "LO/I;", "LO/H;", "derivedState", "Loa/F;", "a", "(LO/H;)V", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.snapshots.l$a$a, reason: collision with other inner class name */
        public static final class C0322a implements InterfaceC1504I {
            C0322a() {
            }

            @Override // kotlin.InterfaceC1504I
            public void a(InterfaceC1502H<?> derivedState) {
                a.this.deriveStateScopeCount++;
            }

            @Override // kotlin.InterfaceC1504I
            public void b(InterfaceC1502H<?> derivedState) {
                a aVar = a.this;
                aVar.deriveStateScopeCount--;
            }
        }

        public a(Ba.l<Object, C4153F> lVar) {
            this.onChanged = lVar;
        }

        private final void d(Object scope) {
            int i10 = this.currentToken;
            C4385G<Object> c4385g = this.currentScopeReads;
            if (c4385g == null) {
                return;
            }
            long[] jArr = c4385g.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = c4385g.keys[i14];
                            boolean z10 = c4385g.values[i14] != i10;
                            if (z10) {
                                m(scope, obj);
                            }
                            if (z10) {
                                c4385g.q(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void l(java.lang.Object r21, int r22, java.lang.Object r23, s.C4385G<java.lang.Object> r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                int r3 = r0.deriveStateScopeCount
                if (r3 <= 0) goto Lb
                return
            Lb:
                r3 = -1
                r4 = r24
                int r4 = r4.p(r1, r2, r3)
                boolean r5 = r1 instanceof kotlin.InterfaceC1502H
                r6 = 2
                if (r5 == 0) goto L91
                if (r4 == r2) goto L91
                r2 = r1
                O.H r2 = (kotlin.InterfaceC1502H) r2
                O.H$a r2 = r2.o()
                java.util.HashMap<O.H<?>, java.lang.Object> r5 = r0.recordedDerivedStateValues
                java.lang.Object r7 = r2.a()
                r5.put(r1, r7)
                s.M r2 = r2.b()
                Q.f<java.lang.Object, O.H<?>> r5 = r0.dependencyToDerivedStates
                r5.g(r1)
                java.lang.Object[] r7 = r2.keys
                long[] r2 = r2.metadata
                int r8 = r2.length
                int r8 = r8 - r6
                if (r8 < 0) goto L8f
                r10 = 0
            L3b:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L89
                int r13 = r10 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                r14 = 8
                int r13 = 8 - r13
                r15 = 0
            L55:
                if (r15 >= r13) goto L86
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r11 & r16
                r18 = 128(0x80, double:6.32E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto L7f
                int r16 = r10 << 3
                int r16 = r16 + r15
                r16 = r7[r16]
                r9 = r16
                Z.k r9 = (Z.k) r9
                boolean r3 = r9 instanceof Z.l
                if (r3 == 0) goto L79
                r3 = r9
                Z.l r3 = (Z.l) r3
                int r14 = androidx.compose.runtime.snapshots.e.a(r6)
                r3.q(r14)
            L79:
                r5.a(r9, r1)
                r3 = 8
                goto L80
            L7f:
                r3 = r14
            L80:
                long r11 = r11 >> r3
                int r15 = r15 + 1
                r14 = r3
                r3 = -1
                goto L55
            L86:
                r3 = r14
                if (r13 != r3) goto L8f
            L89:
                if (r10 == r8) goto L8f
                int r10 = r10 + 1
                r3 = -1
                goto L3b
            L8f:
                r2 = -1
                goto L92
            L91:
                r2 = r3
            L92:
                if (r4 != r2) goto La9
                boolean r2 = r1 instanceof Z.l
                if (r2 == 0) goto La2
                r2 = r1
                Z.l r2 = (Z.l) r2
                int r3 = androidx.compose.runtime.snapshots.e.a(r6)
                r2.q(r3)
            La2:
                Q.f<java.lang.Object, java.lang.Object> r2 = r0.valueToScopes
                r3 = r23
                r2.a(r1, r3)
            La9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.l.a.l(java.lang.Object, int, java.lang.Object, s.G):void");
        }

        private final void m(Object scope, Object value) {
            this.valueToScopes.f(value, scope);
            if (!(value instanceof InterfaceC1502H) || this.valueToScopes.c(value)) {
                return;
            }
            this.dependencyToDerivedStates.g(value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void c() {
            this.valueToScopes.b();
            this.scopeToValues.h();
            this.dependencyToDerivedStates.b();
            this.recordedDerivedStateValues.clear();
        }

        public final void e(Object scope) {
            C4385G<Object> c4385gO = this.scopeToValues.o(scope);
            if (c4385gO == null) {
                return;
            }
            Object[] objArr = c4385gO.keys;
            int[] iArr = c4385gO.values;
            long[] jArr = c4385gO.metadata;
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
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            int i14 = iArr[i13];
                            m(scope, obj);
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

        public final Ba.l<Object, C4153F> f() {
            return this.onChanged;
        }

        public final boolean g() {
            return this.scopeToValues.f();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h() {
            /*
                r17 = this;
                r0 = r17
                s.K<java.lang.Object> r1 = r0.invalidated
                Ba.l<java.lang.Object, oa.F> r2 = r0.onChanged
                java.lang.Object[] r3 = r1.elements
                long[] r4 = r1.metadata
                int r5 = r4.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L49
                r6 = 0
                r7 = r6
            L11:
                r8 = r4[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L44
                int r10 = r7 - r5
                int r10 = ~r10
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L2b:
                if (r12 >= r10) goto L42
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.32E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L3e
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]
                r2.invoke(r13)
            L3e:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L2b
            L42:
                if (r10 != r11) goto L49
            L44:
                if (r7 == r5) goto L49
                int r7 = r7 + 1
                goto L11
            L49:
                r1.m()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.l.a.h():void");
        }

        public final void i(Object scope, Ba.l<Object, C4153F> readObserver, Ba.a<C4153F> block) {
            Object obj = this.currentScope;
            C4385G<Object> c4385g = this.currentScopeReads;
            int i10 = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.b(scope);
            if (this.currentToken == -1) {
                this.currentToken = j.H().getId();
            }
            InterfaceC1504I interfaceC1504I = this.derivedStateObserver;
            Q.b<InterfaceC1504I> bVarC = m1.c();
            try {
                bVarC.c(interfaceC1504I);
                g.INSTANCE.h(readObserver, null, block);
                bVarC.E(bVarC.getSize() - 1);
                Object obj2 = this.currentScope;
                C3862t.d(obj2);
                d(obj2);
                this.currentScope = obj;
                this.currentScopeReads = c4385g;
                this.currentToken = i10;
            } catch (Throwable th) {
                bVarC.E(bVarC.getSize() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x0314 A[PHI: r20
          0x0314: PHI (r20v40 boolean) = (r20v39 boolean), (r20v41 boolean) binds: [B:110:0x02e4, B:119:0x0312] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0321  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x04c2  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x05d9 A[PHI: r20
          0x05d9: PHI (r20v11 boolean) = (r20v10 boolean), (r20v12 boolean) binds: [B:211:0x05a9, B:220:0x05d7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0293 A[PHI: r20
          0x0293: PHI (r20v46 boolean) = (r20v45 boolean), (r20v47 boolean) binds: [B:87:0x0263, B:96:0x0291] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean j(java.util.Set<? extends java.lang.Object> r43) {
            /*
                Method dump skipped, instructions count: 1699
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.l.a.j(java.util.Set):boolean");
        }

        public final void k(Object value) {
            Object obj = this.currentScope;
            C3862t.d(obj);
            int i10 = this.currentToken;
            C4385G<Object> c4385g = this.currentScopeReads;
            if (c4385g == null) {
                c4385g = new C4385G<>(0, 1, null);
                this.currentScopeReads = c4385g;
                this.scopeToValues.r(obj, c4385g);
                C4153F c4153f = C4153F.f46609a;
            }
            l(value, i10, obj, c4385g);
        }

        public final void n(Ba.l<Object, Boolean> predicate) {
            long[] jArr;
            int i10;
            long[] jArr2;
            int i11;
            long j10;
            int i12;
            long j11;
            int i13;
            C4388J<Object, C4385G<Object>> c4388j = this.scopeToValues;
            long[] jArr3 = c4388j.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j12 = jArr3[i14];
                long j13 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j12 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj = c4388j.keys[i18];
                            C4385G c4385g = (C4385G) c4388j.values[i18];
                            Boolean boolInvoke = predicate.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = c4385g.keys;
                                int[] iArr = c4385g.values;
                                long[] jArr4 = c4385g.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i12 = i16;
                                    int i19 = 0;
                                    while (true) {
                                        long j14 = jArr4[i19];
                                        i11 = i14;
                                        j10 = j12;
                                        j11 = -9187201950435737472L;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                if ((j14 & 255) < 128) {
                                                    int i22 = (i19 << 3) + i21;
                                                    Object obj2 = objArr[i22];
                                                    int i23 = iArr[i22];
                                                    m(obj, obj2);
                                                }
                                                j14 >>= 8;
                                            }
                                            if (i20 != 8) {
                                                break;
                                            }
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i14 = i11;
                                        j12 = j10;
                                    }
                                } else {
                                    i11 = i14;
                                    j10 = j12;
                                    i12 = i16;
                                    j11 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i14;
                                j10 = j12;
                                i12 = i16;
                                j11 = j13;
                            }
                            if (boolInvoke.booleanValue()) {
                                c4388j.p(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr3;
                            i11 = i14;
                            j10 = j12;
                            i12 = i16;
                            j11 = j13;
                            i13 = i15;
                        }
                        j12 = j10 >> i13;
                        i17++;
                        i15 = i13;
                        j13 = j11;
                        jArr3 = jArr2;
                        i16 = i12;
                        i14 = i11;
                    }
                    jArr = jArr3;
                    int i24 = i14;
                    if (i16 != i15) {
                        return;
                    } else {
                        i10 = i24;
                    }
                } else {
                    jArr = jArr3;
                    i10 = i14;
                }
                if (i10 == length) {
                    return;
                }
                i14 = i10 + 1;
                jArr3 = jArr;
            }
        }

        public final void o(InterfaceC1502H<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i10;
            C4385G<Object> c4385g;
            C4388J<Object, C4385G<Object>> c4388j = this.scopeToValues;
            int id2 = j.H().getId();
            Object objB = this.valueToScopes.d().b(derivedState);
            if (objB == null) {
                return;
            }
            if (!(objB instanceof C4389K)) {
                C4385G<Object> c4385gB = c4388j.b(objB);
                if (c4385gB == null) {
                    c4385gB = new C4385G<>(0, 1, null);
                    c4388j.r(objB, c4385gB);
                    C4153F c4153f = C4153F.f46609a;
                }
                l(derivedState, id2, objB, c4385gB);
                return;
            }
            C4389K c4389k = (C4389K) objB;
            Object[] objArr = c4389k.elements;
            long[] jArr3 = c4389k.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            Object obj = objArr[(i11 << 3) + i14];
                            C4385G<Object> c4385gB2 = c4388j.b(obj);
                            jArr2 = jArr3;
                            if (c4385gB2 == null) {
                                c4385g = new C4385G<>(0, 1, null);
                                c4388j.r(obj, c4385g);
                                C4153F c4153f2 = C4153F.f46609a;
                            } else {
                                c4385g = c4385gB2;
                            }
                            l(derivedState, id2, obj, c4385g);
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
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Landroidx/compose/runtime/snapshots/g;", "<anonymous parameter 1>", "Loa/F;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.p<Set<? extends Object>, g, C4153F> {
        b() {
            super(2);
        }

        public final void a(Set<? extends Object> set, g gVar) {
            l.this.i(set);
            if (l.this.m()) {
                l.this.r();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(Set<? extends Object> set, g gVar) {
            a(set, gVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Loa/F;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<Object, C4153F> {
        c() {
            super(1);
        }

        public final void a(Object obj) {
            if (l.this.isPaused) {
                return;
            }
            Q.b bVar = l.this.observedScopeMaps;
            l lVar = l.this;
            synchronized (bVar) {
                a aVar = lVar.currentMap;
                C3862t.d(aVar);
                aVar.k(obj);
                C4153F c4153f = C4153F.f46609a;
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
            a(obj);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<C4153F> {
        d() {
            super(0);
        }

        public final void a() {
            do {
                Q.b bVar = l.this.observedScopeMaps;
                l lVar = l.this;
                synchronized (bVar) {
                    try {
                        if (!lVar.sendingNotifications) {
                            lVar.sendingNotifications = true;
                            try {
                                Q.b bVar2 = lVar.observedScopeMaps;
                                int size = bVar2.getSize();
                                if (size > 0) {
                                    Object[] objArrT = bVar2.t();
                                    int i10 = 0;
                                    do {
                                        ((a) objArrT[i10]).h();
                                        i10++;
                                    } while (i10 < size);
                                }
                                lVar.sendingNotifications = false;
                            } finally {
                            }
                        }
                        C4153F c4153f = C4153F.f46609a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (l.this.m());
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(Ba.l<? super Ba.a<C4153F>, C4153F> lVar) {
        this.onChangedExecutor = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set<? extends Object> set) {
        Object obj;
        List listF0;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listF0 = set;
            } else if (obj instanceof Set) {
                listF0 = r.p(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new KotlinNothingValueException();
                }
                listF0 = r.F0((Collection) obj, r.e(set));
            }
        } while (!C4734X.a(this.pendingChanges, obj, listF0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        boolean z10;
        synchronized (this.observedScopeMaps) {
            z10 = this.sendingNotifications;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set<? extends Object> setP = p();
            if (setP == null) {
                return z11;
            }
            synchronized (this.observedScopeMaps) {
                try {
                    Q.b<a> bVar = this.observedScopeMaps;
                    int size = bVar.getSize();
                    if (size > 0) {
                        a[] aVarArrT = bVar.t();
                        int i10 = 0;
                        do {
                            z11 = aVarArrT[i10].j(setP) || z11;
                            i10++;
                        } while (i10 < size);
                    }
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final <T> a n(Ba.l<? super T, C4153F> onChanged) {
        a aVar;
        Q.b<a> bVar = this.observedScopeMaps;
        int size = bVar.getSize();
        if (size > 0) {
            a[] aVarArrT = bVar.t();
            int i10 = 0;
            do {
                aVar = aVarArrT[i10];
                if (aVar.f() == onChanged) {
                    break;
                }
                i10++;
            } while (i10 < size);
            aVar = null;
        } else {
            aVar = null;
        }
        a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2;
        }
        C3862t.e(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar3 = new a((Ba.l) W.f(onChanged, 1));
        this.observedScopeMaps.c(aVar3);
        return aVar3;
    }

    private final Set<Object> p() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!C4734X.a(this.pendingChanges, obj, objSubList));
        return set;
    }

    private final Void q() {
        C1560o.t("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.onChangedExecutor.invoke(new d());
    }

    public final void j() {
        synchronized (this.observedScopeMaps) {
            try {
                Q.b<a> bVar = this.observedScopeMaps;
                int size = bVar.getSize();
                if (size > 0) {
                    a[] aVarArrT = bVar.t();
                    int i10 = 0;
                    do {
                        aVarArrT[i10].c();
                        i10++;
                    } while (i10 < size);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Object scope) {
        synchronized (this.observedScopeMaps) {
            try {
                Q.b<a> bVar = this.observedScopeMaps;
                int size = bVar.getSize();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    a aVar = bVar.t()[i11];
                    aVar.e(scope);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.t()[i11 - i10] = bVar.t()[i11];
                    }
                }
                int i12 = size - i10;
                C3831l.u(bVar.t(), null, i12, size);
                bVar.I(i12);
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(Ba.l<Object, Boolean> predicate) {
        synchronized (this.observedScopeMaps) {
            try {
                Q.b<a> bVar = this.observedScopeMaps;
                int size = bVar.getSize();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    a aVar = bVar.t()[i11];
                    aVar.n(predicate);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.t()[i11 - i10] = bVar.t()[i11];
                    }
                }
                int i12 = size - i10;
                C3831l.u(bVar.t(), null, i12, size);
                bVar.I(i12);
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T> void o(T scope, Ba.l<? super T, C4153F> onValueChangedForScope, Ba.a<C4153F> block) {
        a aVarN;
        synchronized (this.observedScopeMaps) {
            aVarN = n(onValueChangedForScope);
        }
        boolean z10 = this.isPaused;
        a aVar = this.currentMap;
        long j10 = this.currentMapThreadId;
        if (j10 != -1) {
            if (!(j10 == C1533c.a())) {
                C1489A0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + C1533c.a() + ", name=" + C1533c.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = aVarN;
            this.currentMapThreadId = C1533c.a();
            aVarN.i(scope, this.readObserver, block);
        } finally {
            this.currentMap = aVar;
            this.isPaused = z10;
            this.currentMapThreadId = j10;
        }
    }

    public final void s() {
        this.applyUnsubscribe = g.INSTANCE.i(this.applyObserver);
    }

    public final void t() {
        Z.b bVar = this.applyUnsubscribe;
        if (bVar != null) {
            bVar.c();
        }
    }
}
