package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C1489A0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4170o;
import oa.v;
import s.C4389K;
import s.W;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u0000 52\u00020\u0001:\u0001dBE\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ?\u0010\u0012\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ%\u0010\u0018\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\bH\u0010¢\u0006\u0004\b \u0010\u000eJ5\u0010&\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00022\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0006\u0010%\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0000¢\u0006\u0004\b(\u0010\u000eJ\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0010¢\u0006\u0004\b5\u00106R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\"\u0010A\u001a\u00020\u00028\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b=\u0010&\u001a\u0004\b>\u0010?\"\u0004\b@\u0010*R:\u0010I\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010B2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010B8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b>\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010P\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010V\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u00102R\"\u0010[\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010/R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\"\u0010b\u001a\u00020\\8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010_¨\u0006e"}, d2 = {"Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/g;", "", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "Lkotlin/Function1;", "", "Loa/F;", "readObserver", "writeObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/i;LBa/l;LBa/l;)V", "R", "()V", "S", "A", "N", "Q", "(LBa/l;LBa/l;)Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "d", "x", "(LBa/l;)Landroidx/compose/runtime/snapshots/g;", "snapshot", "m", "(Landroidx/compose/runtime/snapshots/g;)V", "n", "o", "c", "r", "snapshotId", "", "Landroidx/compose/runtime/snapshots/n;", "optimisticMerges", "invalidSnapshots", "I", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/h;", "B", "J", "(I)V", "L", "", "handles", "M", "([I)V", "snapshots", "K", "(Landroidx/compose/runtime/snapshots/i;)V", "LZ/k;", "state", "p", "(LZ/k;)V", "g", "LBa/l;", "H", "()LBa/l;", "h", "k", "i", "j", "()I", "w", "writeCount", "Ls/K;", "<set-?>", "Ls/K;", "E", "()Ls/K;", "P", "(Ls/K;)V", "modified", "", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "merged", "l", "Landroidx/compose/runtime/snapshots/i;", "F", "()Landroidx/compose/runtime/snapshots/i;", "setPreviousIds$runtime_release", "previousIds", "[I", "G", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "", "Z", "D", "()Z", "O", "(Z)V", "applied", "readOnly", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: p, reason: collision with root package name */
    private static final a f22571p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f22572q = 8;

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f22573r = new int[0];

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Object, C4153F> readObserver;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Object, C4153F> writeObserver;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int writeCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C4389K<Z.k> modified;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<? extends Z.k> merged;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private i previousIds;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int[] previousPinnedSnapshots;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean applied;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/b$a;", "", "<init>", "()V", "", "EmptyIntArray", "[I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    public b(int i10, i iVar, Ba.l<Object, C4153F> lVar, Ba.l<Object, C4153F> lVar2) {
        super(i10, iVar, null);
        this.readObserver = lVar;
        this.writeObserver = lVar2;
        this.previousIds = i.INSTANCE.a();
        this.previousPinnedSnapshots = f22573r;
        this.snapshots = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A() {
        /*
            r15 = this;
            s.K r0 = r15.E()
            if (r0 == 0) goto L77
            r15.R()
            r1 = 0
            r15.P(r1)
            int r1 = r15.getId()
            java.lang.Object[] r2 = r0.elements
            long[] r0 = r0.metadata
            int r3 = r0.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L77
            r4 = 0
            r5 = r4
        L1c:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L72
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L36:
            if (r10 >= r8) goto L70
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L6c
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            Z.k r11 = (Z.k) r11
            androidx.compose.runtime.snapshots.n r11 = r11.getFirstStateRecord()
        L4c:
            if (r11 == 0) goto L6c
            int r12 = r11.getSnapshotId()
            if (r12 == r1) goto L64
            androidx.compose.runtime.snapshots.i r12 = r15.previousIds
            int r13 = r11.getSnapshotId()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r12 = kotlin.collections.r.a0(r12, r13)
            if (r12 == 0) goto L67
        L64:
            r11.h(r4)
        L67:
            androidx.compose.runtime.snapshots.n r11 = r11.getNext()
            goto L4c
        L6c:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L36
        L70:
            if (r8 != r9) goto L77
        L72:
            if (r5 == r3) goto L77
            int r5 = r5 + 1
            goto L1c
        L77:
            r15.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.b.A():void");
    }

    private final void N() {
        int length = this.previousPinnedSnapshots.length;
        for (int i10 = 0; i10 < length; i10++) {
            j.Y(this.previousPinnedSnapshots[i10]);
        }
    }

    private final void R() {
        if (this.applied) {
            C1489A0.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void S() {
        if (!this.applied || ((g) this).pinningTrackingHandle >= 0) {
            return;
        }
        C1489A0.b("Unsupported operation on a disposed or applied snapshot");
    }

    public final void B() {
        J(getId());
        C4153F c4153f = C4153F.f46609a;
        if (getApplied() || getDisposed()) {
            return;
        }
        int id2 = getId();
        synchronized (j.I()) {
            int i10 = j.f22614e;
            j.f22614e = i10 + 1;
            u(i10);
            j.f22613d = j.f22613d.D(getId());
        }
        v(j.z(getInvalid(), id2 + 1, getId()));
    }

    public h C() throws Throwable {
        C4389K<Z.k> c4389kE;
        int i10;
        C4389K<Z.k> c4389kE2 = E();
        Map<n, ? extends n> mapR = c4389kE2 != null ? j.R((b) j.f22619j.get(), this, j.f22613d.y(((androidx.compose.runtime.snapshots.a) j.f22619j.get()).getId())) : null;
        List listM = r.m();
        synchronized (j.I()) {
            try {
                j.g0(this);
                if (c4389kE2 == null || c4389kE2.get_size() == 0) {
                    c();
                    androidx.compose.runtime.snapshots.a aVar = (androidx.compose.runtime.snapshots.a) j.f22619j.get();
                    j.a0(aVar, j.f22610a);
                    c4389kE = aVar.E();
                    if (c4389kE == null || !c4389kE.e()) {
                        c4389kE = null;
                    } else {
                        listM = j.f22617h;
                    }
                } else {
                    androidx.compose.runtime.snapshots.a aVar2 = (androidx.compose.runtime.snapshots.a) j.f22619j.get();
                    h hVarI = I(j.f22614e, mapR, j.f22613d.y(aVar2.getId()));
                    if (!C3862t.b(hVarI, h.b.f22597a)) {
                        return hVarI;
                    }
                    c();
                    j.a0(aVar2, j.f22610a);
                    c4389kE = aVar2.E();
                    P(null);
                    aVar2.P(null);
                    listM = j.f22617h;
                }
                C4153F c4153f = C4153F.f46609a;
                this.applied = true;
                if (c4389kE != null) {
                    Set setA = Q.e.a(c4389kE);
                    if (!setA.isEmpty()) {
                        int size = listM.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((Ba.p) listM.get(i11)).invoke(setA, this);
                        }
                    }
                }
                if (c4389kE2 != null && c4389kE2.e()) {
                    Set setA2 = Q.e.a(c4389kE2);
                    int size2 = listM.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((Ba.p) listM.get(i12)).invoke(setA2, this);
                    }
                }
                synchronized (j.I()) {
                    try {
                        r();
                        j.C();
                        if (c4389kE != null) {
                            try {
                                Object[] objArr = c4389kE.elements;
                                long[] jArr = c4389kE.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j10 = jArr[i13];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                if ((j10 & 255) < 128) {
                                                    j.U((Z.k) objArr[(i13 << 3) + i15]);
                                                }
                                                j10 >>= 8;
                                            }
                                            if (i14 != 8) {
                                                break;
                                            }
                                        }
                                        if (i13 == length) {
                                            break;
                                        }
                                        i13++;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        if (c4389kE2 != null) {
                            Object[] objArr2 = c4389kE2.elements;
                            long[] jArr2 = c4389kE2.metadata;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j11 = jArr2[i16];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j11 & 255) < 128) {
                                                j.U((Z.k) objArr2[(i16 << 3) + i18]);
                                            }
                                            j11 >>= 8;
                                        }
                                        i10 = 1;
                                        if (i17 != 8) {
                                            break;
                                        }
                                    } else {
                                        i10 = 1;
                                    }
                                    if (i16 == length2) {
                                        break;
                                    }
                                    i16 += i10;
                                }
                            }
                        }
                        List<? extends Z.k> list = this.merged;
                        if (list != null) {
                            int size3 = list.size();
                            for (int i19 = 0; i19 < size3; i19++) {
                                j.U(list.get(i19));
                            }
                        }
                        this.merged = null;
                        C4153F c4153f2 = C4153F.f46609a;
                        return h.b.f22597a;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: D, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public C4389K<Z.k> E() {
        return this.modified;
    }

    /* renamed from: F, reason: from getter */
    public final i getPreviousIds() {
        return this.previousIds;
    }

    /* renamed from: G, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: H */
    public Ba.l<Object, C4153F> h() {
        return this.readObserver;
    }

    public final h I(int snapshotId, Map<n, ? extends n> optimisticMerges, i invalidSnapshots) {
        C4389K<Z.k> c4389k;
        List<? extends Z.k> listF0;
        i iVar;
        Object[] objArr;
        long[] jArr;
        int i10;
        i iVar2;
        C4389K<Z.k> c4389k2;
        Object[] objArr2;
        long[] jArr2;
        int i11;
        n nVarW;
        n nVarJ;
        i iVarB = getInvalid().D(getId()).B(this.previousIds);
        C4389K<Z.k> c4389kE = E();
        C3862t.d(c4389kE);
        Object[] objArr3 = c4389kE.elements;
        long[] jArr3 = c4389kE.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        if (length >= 0) {
            listF0 = null;
            int i12 = 0;
            while (true) {
                long j10 = jArr3[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            Z.k kVar = (Z.k) objArr3[(i12 << 3) + i15];
                            n firstStateRecord = kVar.getFirstStateRecord();
                            c4389k2 = c4389kE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            n nVarW2 = j.W(firstStateRecord, snapshotId, invalidSnapshots);
                            if (nVarW2 == null || (nVarW = j.W(firstStateRecord, getId(), iVarB)) == null) {
                                iVar2 = iVarB;
                            } else {
                                iVar2 = iVarB;
                                if (nVarW.getSnapshotId() != 1 && !C3862t.b(nVarW2, nVarW)) {
                                    n nVarW3 = j.W(firstStateRecord, getId(), getInvalid());
                                    if (nVarW3 == null) {
                                        j.V();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (optimisticMerges == null || (nVarJ = optimisticMerges.get(nVarW2)) == null) {
                                        nVarJ = kVar.j(nVarW, nVarW2, nVarW3);
                                    }
                                    if (nVarJ == null) {
                                        return new h.a(this);
                                    }
                                    if (!C3862t.b(nVarJ, nVarW3)) {
                                        if (C3862t.b(nVarJ, nVarW2)) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(v.a(kVar, nVarW2.d()));
                                            if (listF0 == null) {
                                                listF0 = new ArrayList<>();
                                            }
                                            listF0.add(kVar);
                                        } else {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(!C3862t.b(nVarJ, nVarW) ? v.a(kVar, nVarJ) : v.a(kVar, nVarW.d()));
                                        }
                                    }
                                }
                            }
                            i11 = 8;
                        } else {
                            iVar2 = iVarB;
                            c4389k2 = c4389kE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i11 = i13;
                        }
                        j10 >>= i11;
                        i15++;
                        i13 = i11;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        c4389kE = c4389k2;
                        iVarB = iVar2;
                    }
                    iVar = iVarB;
                    c4389k = c4389kE;
                    objArr = objArr3;
                    jArr = jArr3;
                    i10 = 1;
                    if (i14 != i13) {
                        break;
                    }
                } else {
                    iVar = iVarB;
                    c4389k = c4389kE;
                    objArr = objArr3;
                    jArr = jArr3;
                    i10 = 1;
                }
                if (i12 == length) {
                    break;
                }
                i12 += i10;
                objArr3 = objArr;
                jArr3 = jArr;
                c4389kE = c4389k;
                iVarB = iVar;
            }
        } else {
            c4389k = c4389kE;
            listF0 = null;
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                C4170o c4170o = (C4170o) arrayList.get(i16);
                Z.k kVar2 = (Z.k) c4170o.a();
                n nVar = (n) c4170o.b();
                nVar.h(getId());
                synchronized (j.I()) {
                    nVar.g(kVar2.getFirstStateRecord());
                    kVar2.h(nVar);
                    C4153F c4153f = C4153F.f46609a;
                }
            }
        }
        if (listF0 != null) {
            int size2 = listF0.size();
            for (int i17 = 0; i17 < size2; i17++) {
                c4389k.x(listF0.get(i17));
            }
            List<? extends Z.k> list = this.merged;
            if (list != null) {
                listF0 = r.F0(list, listF0);
            }
            this.merged = listF0;
        }
        return h.b.f22597a;
    }

    public final void J(int id2) {
        synchronized (j.I()) {
            this.previousIds = this.previousIds.D(id2);
            C4153F c4153f = C4153F.f46609a;
        }
    }

    public final void K(i snapshots) {
        synchronized (j.I()) {
            this.previousIds = this.previousIds.B(snapshots);
            C4153F c4153f = C4153F.f46609a;
        }
    }

    public final void L(int id2) {
        if (id2 >= 0) {
            this.previousPinnedSnapshots = C3831l.z(this.previousPinnedSnapshots, id2);
        }
    }

    public final void M(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = C3831l.A(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    public final void O(boolean z10) {
        this.applied = z10;
    }

    public void P(C4389K<Z.k> c4389k) {
        this.modified = c4389k;
    }

    public b Q(Ba.l<Object, C4153F> readObserver, Ba.l<Object, C4153F> writeObserver) {
        c cVar;
        z();
        S();
        J(getId());
        synchronized (j.I()) {
            int i10 = j.f22614e;
            j.f22614e = i10 + 1;
            j.f22613d = j.f22613d.D(i10);
            i invalid = getInvalid();
            v(invalid.D(i10));
            cVar = new c(i10, j.z(invalid, getId() + 1, i10), j.L(readObserver, h(), false, 4, null), j.M(writeObserver, k()), this);
        }
        if (!getApplied() && !getDisposed()) {
            int id2 = getId();
            synchronized (j.I()) {
                int i11 = j.f22614e;
                j.f22614e = i11 + 1;
                u(i11);
                j.f22613d = j.f22613d.D(getId());
                C4153F c4153f = C4153F.f46609a;
            }
            v(j.z(getInvalid(), id2 + 1, getId()));
        }
        return cVar;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void c() {
        j.f22613d = j.f22613d.y(getId()).x(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        if (getDisposed()) {
            return;
        }
        super.d();
        n(this);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean i() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: j, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public Ba.l<Object, C4153F> k() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void m(g snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void n(g snapshot) {
        if (!(this.snapshots > 0)) {
            C1489A0.a("no pending nested snapshots");
        }
        int i10 = this.snapshots - 1;
        this.snapshots = i10;
        if (i10 != 0 || this.applied) {
            return;
        }
        A();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
        if (this.applied || getDisposed()) {
            return;
        }
        B();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(Z.k state) {
        C4389K<Z.k> c4389kE = E();
        if (c4389kE == null) {
            c4389kE = W.a();
            P(c4389kE);
        }
        c4389kE.h(state);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void r() {
        N();
        super.r();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void w(int i10) {
        this.writeCount = i10;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(Ba.l<Object, C4153F> readObserver) {
        d dVar;
        z();
        S();
        int id2 = getId();
        J(getId());
        synchronized (j.I()) {
            int i10 = j.f22614e;
            j.f22614e = i10 + 1;
            j.f22613d = j.f22613d.D(i10);
            dVar = new d(i10, j.z(getInvalid(), id2 + 1, i10), j.L(readObserver, h(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            int id3 = getId();
            synchronized (j.I()) {
                int i11 = j.f22614e;
                j.f22614e = i11 + 1;
                u(i11);
                j.f22613d = j.f22613d.D(getId());
                C4153F c4153f = C4153F.f46609a;
            }
            v(j.z(getInvalid(), id3 + 1, getId()));
        }
        return dVar;
    }
}
