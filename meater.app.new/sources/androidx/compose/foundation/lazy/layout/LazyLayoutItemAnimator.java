package androidx.compose.foundation.lazy.layout;

import A0.C0839s;
import A0.V;
import A0.r;
import U0.n;
import U0.o;
import U0.s;
import Xb.I;
import b0.i;
import i0.F0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import k0.InterfaceC3783c;
import kotlin.C0967f;
import kotlin.C0975n;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.w;
import kotlin.x;
import l0.C3870c;
import l0.C3872e;
import oa.C4153F;
import ra.C4370a;
import s.C4388J;
import s.C4389K;
import s.U;
import s.W;

/* compiled from: LazyLayoutItemAnimator.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003X36B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\b\u0002\u0010\u000e\u001a\f0\rR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0089\u0001\u0010+\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u0005J\u001f\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u000b¢\u0006\u0004\b0\u00101R*\u00105\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\rR\b\u0012\u0004\u0012\u00028\u00000\u0000028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010?R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010?R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020/0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010?R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0017\u0010P\u001a\u00020M8\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bJ\u0010OR\u0018\u0010R\u001a\u00020\u0011*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010QR\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010SR\u0018\u0010T\u001a\u00020\u000b*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010SR\u0017\u0010W\u001a\u00020U8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "LC/w;", "T", "", "<init>", "()V", "key", "Loa/F;", "n", "(Ljava/lang/Object;)V", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;", "itemInfo", "k", "(LC/w;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;)V", "", "isMovingAway", "p", "(LC/w;Z)V", "", "r", "([ILC/w;)I", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/layout/c;", "keyIndexMap", "LC/x;", "itemProvider", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "LXb/I;", "coroutineScope", "Li0/F0;", "graphicsContext", "m", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/c;LC/x;ZZIZIILXb/I;Li0/F0;)V", "o", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/b;", "e", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/b;", "Ls/J;", "a", "Ls/J;", "keyToItemInfoMap", "b", "Landroidx/compose/foundation/lazy/layout/c;", "c", "I", "firstVisibleIndex", "Ls/K;", "d", "Ls/K;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "f", "movingInFromEndBound", "g", "movingAwayToStartBound", "h", "movingAwayToEndBound", "i", "disappearingItems", "LA0/r;", "j", "LA0/r;", "displayingNode", "Lb0/i;", "Lb0/i;", "()Lb0/i;", "modifier", "(LC/w;)Z", "hasAnimations", "(LC/w;)I", "crossAxisOffset", "LU0/r;", "()J", "minSizeToFitDisappearingItems", "DisplayingDisappearingItemsElement", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends w> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.c keyIndexMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int firstVisibleIndex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private r displayingNode;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4388J<Object, LazyLayoutItemAnimator<T>.b> keyToItemInfoMap = U.d();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C4389K<Object> movingAwayKeys = W.a();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingInFromStartBound = new ArrayList();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingInFromEndBound = new ArrayList();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingAwayToStartBound = new ArrayList();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<T> movingAwayToEndBound = new ArrayList();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<androidx.compose.foundation.lazy.layout.b> disappearingItems = new ArrayList();

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final b0.i modifier = new DisplayingDisappearingItemsElement(this);

    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "LA0/V;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "p", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "node", "Loa/F;", "s", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class DisplayingDisappearingItemsElement extends V<DisplayingDisappearingItemsNode> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && C3862t.b(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // A0.V
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // A0.V
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void n(DisplayingDisappearingItemsNode node) {
            node.j2(this.animator);
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Lb0/i$c;", "LA0/r;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "Lk0/c;", "Loa/F;", "d", "(Lk0/c;)V", "T1", "()V", "U1", "j2", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "O", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$a, reason: from toString */
    private static final /* data */ class DisplayingDisappearingItemsNode extends i.c implements r {

        /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
        private LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // b0.i.c
        public void T1() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // b0.i.c
        public void U1() {
            this.animator.o();
        }

        @Override // A0.r
        public void d(InterfaceC3783c interfaceC3783c) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) list.get(i10);
                C3870c c3870cP = bVar.getLayer();
                if (c3870cP != null) {
                    float fH = n.h(bVar.getFinalOffset());
                    float fH2 = fH - n.h(c3870cP.getTopLeft());
                    float fI = n.i(bVar.getFinalOffset()) - n.i(c3870cP.getTopLeft());
                    interfaceC3783c.getDrawContext().getTransform().b(fH2, fI);
                    try {
                        C3872e.a(interfaceC3783c, c3870cP);
                    } finally {
                        interfaceC3783c.getDrawContext().getTransform().b(-fH2, -fI);
                    }
                }
            }
            interfaceC3783c.C1();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && C3862t.b(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public final void j2(LazyLayoutItemAnimator<?> animator) {
            if (C3862t.b(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.o();
            ((LazyLayoutItemAnimator) animator).displayingNode = this;
            this.animator = animator;
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR4\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R*\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\"\u0010%\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\"\u0010)\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b*\u0010 R$\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b&\u0010 R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;", "", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "positionedItem", "LXb/I;", "coroutineScope", "Li0/F0;", "graphicsContext", "", "layoutMinOffset", "layoutMaxOffset", "crossAxisOffset", "Loa/F;", "k", "(LC/w;LXb/I;Li0/F0;III)V", "", "Landroidx/compose/foundation/lazy/layout/b;", "<set-?>", "a", "[Landroidx/compose/foundation/lazy/layout/b;", "()[Landroidx/compose/foundation/lazy/layout/b;", "animations", "LU0/b;", "b", "LU0/b;", "()LU0/b;", "setConstraints-_Sx5XlM", "(LU0/b;)V", "constraints", "c", "I", "()I", "setCrossAxisOffset", "(I)V", "d", "i", "lane", "e", "g", "j", "span", "f", "", "h", "()Z", "isRunningPlacement", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private U0.b constraints;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int crossAxisOffset;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int lane;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int layoutMinOffset;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int layoutMaxOffset;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private androidx.compose.foundation.lazy.layout.b[] animations = C0975n.f2055a;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int span = 1;

        /* compiled from: LazyLayoutItemAnimator.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC/w;", "T", "Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ LazyLayoutItemAnimator<T> f22360B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LazyLayoutItemAnimator<T> lazyLayoutItemAnimator) {
                super(0);
                this.f22360B = lazyLayoutItemAnimator;
            }

            public final void a() {
                r rVar = ((LazyLayoutItemAnimator) this.f22360B).displayingNode;
                if (rVar != null) {
                    C0839s.a(rVar);
                }
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        public b() {
        }

        private final boolean h() {
            for (androidx.compose.foundation.lazy.layout.b bVar : this.animations) {
                if (bVar != null && bVar.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void l(b bVar, w wVar, I i10, F0 f02, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 32) != 0) {
                i13 = LazyLayoutItemAnimator.this.f(wVar);
            }
            bVar.k(wVar, i10, f02, i11, i12, i13);
        }

        /* renamed from: a, reason: from getter */
        public final androidx.compose.foundation.lazy.layout.b[] getAnimations() {
            return this.animations;
        }

        /* renamed from: b, reason: from getter */
        public final U0.b getConstraints() {
            return this.constraints;
        }

        /* renamed from: c, reason: from getter */
        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        /* renamed from: d, reason: from getter */
        public final int getLane() {
            return this.lane;
        }

        /* renamed from: e, reason: from getter */
        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        /* renamed from: f, reason: from getter */
        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        /* renamed from: g, reason: from getter */
        public final int getSpan() {
            return this.span;
        }

        public final void i(int i10) {
            this.lane = i10;
        }

        public final void j(int i10) {
            this.span = i10;
        }

        public final void k(T positionedItem, I coroutineScope, F0 graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (!h()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int length = this.animations.length;
            for (int iB = positionedItem.b(); iB < length; iB++) {
                androidx.compose.foundation.lazy.layout.b bVar = this.animations[iB];
                if (bVar != null) {
                    bVar.x();
                }
            }
            if (this.animations.length != positionedItem.b()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, positionedItem.b());
                C3862t.f(objArrCopyOf, "copyOf(this, newSize)");
                this.animations = (androidx.compose.foundation.lazy.layout.b[]) objArrCopyOf;
            }
            this.constraints = U0.b.a(positionedItem.getConstraints());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int iB2 = positionedItem.b();
            LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i10 = 0; i10 < iB2; i10++) {
                C0967f c0967fC = C0975n.c(positionedItem.g(i10));
                if (c0967fC == null) {
                    androidx.compose.foundation.lazy.layout.b bVar2 = this.animations[i10];
                    if (bVar2 != null) {
                        bVar2.x();
                    }
                    this.animations[i10] = null;
                } else {
                    androidx.compose.foundation.lazy.layout.b bVar3 = this.animations[i10];
                    if (bVar3 == null) {
                        bVar3 = new androidx.compose.foundation.lazy.layout.b(coroutineScope, graphicsContext, new a(lazyLayoutItemAnimator));
                        this.animations[i10] = bVar3;
                    }
                    bVar3.B(c0967fC.j2());
                    bVar3.G(c0967fC.l2());
                    bVar3.C(c0967fC.k2());
                }
            }
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements Comparator {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f22361B;

        public c(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f22361B = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C4370a.d(Integer.valueOf(this.f22361B.c(((w) t10).getKey())), Integer.valueOf(this.f22361B.c(((w) t11).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d<T> implements Comparator {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f22362B;

        public d(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f22362B = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C4370a.d(Integer.valueOf(this.f22362B.c(((w) t10).getKey())), Integer.valueOf(this.f22362B.c(((w) t11).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e<T> implements Comparator {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f22363B;

        public e(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f22363B = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C4370a.d(Integer.valueOf(this.f22363B.c(((w) t11).getKey())), Integer.valueOf(this.f22363B.c(((w) t10).getKey())));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class f<T> implements Comparator {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.c f22364B;

        public f(androidx.compose.foundation.lazy.layout.c cVar) {
            this.f22364B = cVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C4370a.d(Integer.valueOf(this.f22364B.c(((w) t11).getKey())), Integer.valueOf(this.f22364B.c(((w) t10).getKey())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(w wVar) {
        long j10 = wVar.j(0);
        return !wVar.getIsVertical() ? n.i(j10) : n.h(j10);
    }

    private final boolean g(T t10) {
        int iB = t10.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (C0975n.c(t10.g(i10)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int h(w wVar) {
        long j10 = wVar.j(0);
        return wVar.getIsVertical() ? n.i(j10) : n.h(j10);
    }

    private final void k(T item, int mainAxisOffset, LazyLayoutItemAnimator<T>.b itemInfo) {
        int i10 = 0;
        long j10 = item.j(0);
        long jE = item.getIsVertical() ? n.e(j10, 0, mainAxisOffset, 1, null) : n.e(j10, mainAxisOffset, 0, 2, null);
        androidx.compose.foundation.lazy.layout.b[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i11 = 0;
        while (i10 < length) {
            androidx.compose.foundation.lazy.layout.b bVar = animations[i10];
            int i12 = i11 + 1;
            if (bVar != null) {
                bVar.H(n.l(jE, n.k(item.j(i11), j10)));
            }
            i10++;
            i11 = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void l(LazyLayoutItemAnimator lazyLayoutItemAnimator, w wVar, int i10, b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            LazyLayoutItemAnimator<T>.b bVarB = lazyLayoutItemAnimator.keyToItemInfoMap.b(wVar.getKey());
            C3862t.d(bVarB);
            bVar = bVarB;
        }
        lazyLayoutItemAnimator.k(wVar, i10, bVar);
    }

    private final void n(Object key) {
        androidx.compose.foundation.lazy.layout.b[] animations;
        LazyLayoutItemAnimator<T>.b bVarO = this.keyToItemInfoMap.o(key);
        if (bVarO == null || (animations = bVarO.getAnimations()) == null) {
            return;
        }
        for (androidx.compose.foundation.lazy.layout.b bVar : animations) {
            if (bVar != null) {
                bVar.x();
            }
        }
    }

    private final void p(T item, boolean isMovingAway) {
        LazyLayoutItemAnimator<T>.b bVarB = this.keyToItemInfoMap.b(item.getKey());
        C3862t.d(bVarB);
        androidx.compose.foundation.lazy.layout.b[] animations = bVarB.getAnimations();
        int length = animations.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            androidx.compose.foundation.lazy.layout.b bVar = animations[i10];
            int i12 = i11 + 1;
            if (bVar != null) {
                long j10 = item.j(i11);
                long jR = bVar.getRawOffset();
                if (!n.g(jR, androidx.compose.foundation.lazy.layout.b.INSTANCE.a()) && !n.g(jR, j10)) {
                    bVar.m(n.k(j10, jR), isMovingAway);
                }
                bVar.H(j10);
            }
            i10++;
            i11 = i12;
        }
    }

    static /* synthetic */ void q(LazyLayoutItemAnimator lazyLayoutItemAnimator, w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lazyLayoutItemAnimator.p(wVar, z10);
    }

    private final int r(int[] iArr, T t10) {
        int iK = t10.getLane();
        int iF = t10.getSpan() + iK;
        int iMax = 0;
        while (iK < iF) {
            int iE = iArr[iK] + t10.getMainAxisSizeWithSpacings();
            iArr[iK] = iE;
            iMax = Math.max(iMax, iE);
            iK++;
        }
        return iMax;
    }

    public final androidx.compose.foundation.lazy.layout.b e(Object key, int placeableIndex) {
        androidx.compose.foundation.lazy.layout.b[] animations;
        LazyLayoutItemAnimator<T>.b bVarB = this.keyToItemInfoMap.b(key);
        if (bVarB == null || (animations = bVarB.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    public final long i() {
        long jA = U0.r.INSTANCE.a();
        List<androidx.compose.foundation.lazy.layout.b> list = this.disappearingItems;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.foundation.lazy.layout.b bVar = list.get(i10);
            C3870c c3870cP = bVar.getLayer();
            if (c3870cP != null) {
                jA = s.a(Math.max(U0.r.g(jA), n.h(bVar.getRawOffset()) + U0.r.g(c3870cP.getSize())), Math.max(U0.r.f(jA), n.i(bVar.getRawOffset()) + U0.r.f(c3870cP.getSize())));
            }
        }
        return jA;
    }

    /* renamed from: j, reason: from getter */
    public final b0.i getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int consumedScroll, int layoutWidth, int layoutHeight, List<T> positionedItems, androidx.compose.foundation.lazy.layout.c keyIndexMap, x<T> itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, I coroutineScope, F0 graphicsContext) {
        androidx.compose.foundation.lazy.layout.c cVar;
        androidx.compose.foundation.lazy.layout.c cVar2;
        int[] iArr;
        int i10;
        int i11;
        androidx.compose.foundation.lazy.layout.c cVar3;
        int[] iArr2;
        long[] jArr;
        Object[] objArr;
        int i12;
        long[] jArr2;
        Object[] objArr2;
        int[] iArr3;
        androidx.compose.foundation.lazy.layout.b[] bVarArr;
        int i13;
        androidx.compose.foundation.lazy.layout.b[] bVarArr2;
        int i14;
        int i15;
        androidx.compose.foundation.lazy.layout.c cVar4;
        int i16;
        androidx.compose.foundation.lazy.layout.c cVar5;
        int i17;
        long[] jArr3;
        Object[] objArr3;
        int i18;
        long[] jArr4;
        Object[] objArr4;
        List<T> list = positionedItems;
        int i19 = laneCount;
        androidx.compose.foundation.lazy.layout.c cVar6 = this.keyIndexMap;
        this.keyIndexMap = keyIndexMap;
        int size = positionedItems.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size) {
                if (this.keyToItemInfoMap.e()) {
                    o();
                    return;
                }
            } else if (g(list.get(i20))) {
                break;
            } else {
                i20++;
            }
        }
        int i21 = this.firstVisibleIndex;
        w wVar = (w) kotlin.collections.r.l0(positionedItems);
        this.firstVisibleIndex = wVar != null ? wVar.getIndex() : 0;
        long jA = isVertical ? o.a(0, consumedScroll) : o.a(consumedScroll, 0);
        boolean z10 = isLookingAhead || !hasLookaheadOccurred;
        C4388J<Object, LazyLayoutItemAnimator<T>.b> c4388j = this.keyToItemInfoMap;
        Object[] objArr5 = c4388j.keys;
        long[] jArr5 = c4388j.metadata;
        int length = jArr5.length - 2;
        boolean z11 = z10;
        if (length >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr5[i22];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i23 = 8 - ((~(i22 - length)) >>> 31);
                    int i24 = 0;
                    while (i24 < i23) {
                        if ((j10 & 255) < 128) {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                            this.movingAwayKeys.h(objArr5[(i22 << 3) + i24]);
                        } else {
                            jArr4 = jArr5;
                            objArr4 = objArr5;
                        }
                        j10 >>= 8;
                        i24++;
                        objArr5 = objArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                    i18 = 1;
                    if (i23 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    objArr3 = objArr5;
                    i18 = 1;
                }
                if (i22 == length) {
                    break;
                }
                i22 += i18;
                objArr5 = objArr3;
                jArr5 = jArr3;
            }
        }
        int size2 = positionedItems.size();
        int i25 = 0;
        while (i25 < size2) {
            T t10 = list.get(i25);
            this.movingAwayKeys.x(t10.getKey());
            if (g(t10)) {
                LazyLayoutItemAnimator<T>.b bVarB = this.keyToItemInfoMap.b(t10.getKey());
                int iC = cVar6 != null ? cVar6.c(t10.getKey()) : -1;
                boolean z12 = iC == -1 && cVar6 != null;
                if (bVarB == null) {
                    LazyLayoutItemAnimator<T>.b bVar = new b();
                    b.l(bVar, t10, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                    this.keyToItemInfoMap.r(t10.getKey(), bVar);
                    if (t10.getIndex() == iC || iC == -1) {
                        long j11 = t10.j(0);
                        k(t10, t10.getIsVertical() ? n.i(j11) : n.h(j11), bVar);
                        if (z12) {
                            androidx.compose.foundation.lazy.layout.b[] animations = bVar.getAnimations();
                            for (androidx.compose.foundation.lazy.layout.b bVar2 : animations) {
                                if (bVar2 != null) {
                                    bVar2.k();
                                    C4153F c4153f = C4153F.f46609a;
                                }
                            }
                        }
                    } else if (iC < i21) {
                        this.movingInFromStartBound.add(t10);
                    } else {
                        this.movingInFromEndBound.add(t10);
                    }
                } else if (z11) {
                    b.l(bVarB, t10, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                    androidx.compose.foundation.lazy.layout.b[] animations2 = bVarB.getAnimations();
                    int i26 = 0;
                    for (int length2 = animations2.length; i26 < length2; length2 = i17) {
                        int i27 = size2;
                        androidx.compose.foundation.lazy.layout.b bVar3 = animations2[i26];
                        if (bVar3 != null) {
                            cVar5 = cVar6;
                            i17 = length2;
                            if (!n.g(bVar3.getRawOffset(), androidx.compose.foundation.lazy.layout.b.INSTANCE.a())) {
                                bVar3.H(n.l(bVar3.getRawOffset(), jA));
                            }
                        } else {
                            cVar5 = cVar6;
                            i17 = length2;
                        }
                        i26++;
                        size2 = i27;
                        cVar6 = cVar5;
                    }
                    i15 = size2;
                    cVar4 = cVar6;
                    if (z12) {
                        for (androidx.compose.foundation.lazy.layout.b bVar4 : bVarB.getAnimations()) {
                            if (bVar4 != null) {
                                if (bVar4.u()) {
                                    this.disappearingItems.remove(bVar4);
                                    r rVar = this.displayingNode;
                                    if (rVar != null) {
                                        C0839s.a(rVar);
                                        C4153F c4153f2 = C4153F.f46609a;
                                    }
                                }
                                bVar4.k();
                            }
                        }
                    }
                    i16 = 1;
                    q(this, t10, false, 2, null);
                }
                i15 = size2;
                cVar4 = cVar6;
                i16 = 1;
            } else {
                i15 = size2;
                cVar4 = cVar6;
                i16 = 1;
                n(t10.getKey());
            }
            i25 += i16;
            list = positionedItems;
            size2 = i15;
            cVar6 = cVar4;
        }
        androidx.compose.foundation.lazy.layout.c cVar7 = cVar6;
        int i28 = 0;
        int[] iArr4 = new int[i19];
        int i29 = 0;
        while (i29 < i19) {
            iArr4[i29] = i28;
            i29++;
            i28 = 0;
        }
        if (!z11 || cVar7 == null) {
            cVar = cVar7;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                cVar = cVar7;
            } else {
                List<T> list2 = this.movingInFromStartBound;
                if (list2.size() > 1) {
                    cVar = cVar7;
                    kotlin.collections.r.C(list2, new e(cVar));
                } else {
                    cVar = cVar7;
                }
                List<T> list3 = this.movingInFromStartBound;
                int size3 = list3.size();
                for (int i30 = 0; i30 < size3; i30++) {
                    T t11 = list3.get(i30);
                    l(this, t11, layoutMinOffset - r(iArr4, t11), null, 4, null);
                    q(this, t11, false, 2, null);
                }
                C3831l.v(iArr4, 0, 0, 0, 6, null);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list4 = this.movingInFromEndBound;
                if (list4.size() > 1) {
                    kotlin.collections.r.C(list4, new c(cVar));
                }
                List<T> list5 = this.movingInFromEndBound;
                int size4 = list5.size();
                for (int i31 = 0; i31 < size4; i31++) {
                    T t12 = list5.get(i31);
                    l(this, t12, (layoutMaxOffset + r(iArr4, t12)) - t12.getMainAxisSizeWithSpacings(), null, 4, null);
                    q(this, t12, false, 2, null);
                }
                C3831l.v(iArr4, 0, 0, 0, 6, null);
            }
        }
        C4389K<Object> c4389k = this.movingAwayKeys;
        Object[] objArr6 = c4389k.elements;
        long[] jArr6 = c4389k.metadata;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i32 = 0;
            while (true) {
                long j12 = jArr6[i32];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i33 = 8 - ((~(i32 - length3)) >>> 31);
                    int i34 = 0;
                    while (i34 < i33) {
                        if ((j12 & 255) < 128) {
                            Object obj = objArr6[(i32 << 3) + i34];
                            LazyLayoutItemAnimator<T>.b bVarB2 = this.keyToItemInfoMap.b(obj);
                            C3862t.d(bVarB2);
                            LazyLayoutItemAnimator<T>.b bVar5 = bVarB2;
                            int iC2 = keyIndexMap.c(obj);
                            jArr2 = jArr6;
                            bVar5.j(Math.min(i19, bVar5.getSpan()));
                            objArr2 = objArr6;
                            bVar5.i(Math.min(i19 - bVar5.getSpan(), bVar5.getLane()));
                            if (iC2 == -1) {
                                androidx.compose.foundation.lazy.layout.b[] animations3 = bVar5.getAnimations();
                                int length4 = animations3.length;
                                int i35 = 0;
                                int i36 = 0;
                                boolean z13 = false;
                                while (i35 < length4) {
                                    androidx.compose.foundation.lazy.layout.b bVar6 = animations3[i35];
                                    int i37 = i36 + 1;
                                    if (bVar6 != null) {
                                        if (bVar6.u()) {
                                            bVarArr2 = animations3;
                                        } else if (bVar6.t()) {
                                            bVar6.x();
                                            bVar5.getAnimations()[i36] = null;
                                            bVarArr2 = animations3;
                                            this.disappearingItems.remove(bVar6);
                                            r rVar2 = this.displayingNode;
                                            if (rVar2 != null) {
                                                C0839s.a(rVar2);
                                                C4153F c4153f3 = C4153F.f46609a;
                                            }
                                        } else {
                                            bVarArr2 = animations3;
                                            if (bVar6.getLayer() != null) {
                                                bVar6.l();
                                            }
                                            if (bVar6.u()) {
                                                this.disappearingItems.add(bVar6);
                                                r rVar3 = this.displayingNode;
                                                if (rVar3 != null) {
                                                    C0839s.a(rVar3);
                                                    C4153F c4153f4 = C4153F.f46609a;
                                                }
                                            } else {
                                                bVar6.x();
                                                bVar5.getAnimations()[i36] = null;
                                                i14 = 1;
                                                i35 += i14;
                                                i36 = i37;
                                                animations3 = bVarArr2;
                                            }
                                        }
                                        i14 = 1;
                                        z13 = true;
                                        i35 += i14;
                                        i36 = i37;
                                        animations3 = bVarArr2;
                                    } else {
                                        bVarArr2 = animations3;
                                    }
                                    i14 = 1;
                                    i35 += i14;
                                    i36 = i37;
                                    animations3 = bVarArr2;
                                }
                                if (!z13) {
                                    n(obj);
                                }
                            } else {
                                U0.b constraints = bVar5.getConstraints();
                                C3862t.d(constraints);
                                w wVarA = itemProvider.a(iC2, bVar5.getLane(), bVar5.getSpan(), constraints.getValue());
                                wVarA.d(true);
                                androidx.compose.foundation.lazy.layout.b[] animations4 = bVar5.getAnimations();
                                int length5 = animations4.length;
                                iArr3 = iArr4;
                                int i38 = 0;
                                while (true) {
                                    if (i38 < length5) {
                                        androidx.compose.foundation.lazy.layout.b bVar7 = animations4[i38];
                                        int i39 = length5;
                                        if (bVar7 != null) {
                                            boolean zV = bVar7.v();
                                            bVarArr = animations4;
                                            i13 = 1;
                                            if (zV) {
                                                break;
                                            }
                                        } else {
                                            bVarArr = animations4;
                                            i13 = 1;
                                        }
                                        i38 += i13;
                                        animations4 = bVarArr;
                                        length5 = i39;
                                    } else if (cVar == null || iC2 != cVar.c(obj)) {
                                        break;
                                    } else {
                                        n(obj);
                                    }
                                }
                                bVar5.k(wVarA, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, bVar5.getCrossAxisOffset());
                                if (iC2 < this.firstVisibleIndex) {
                                    this.movingAwayToStartBound.add(wVarA);
                                } else {
                                    this.movingAwayToEndBound.add(wVarA);
                                }
                                j12 >>= 8;
                                i34++;
                                objArr6 = objArr2;
                                i19 = laneCount;
                                jArr6 = jArr2;
                                iArr4 = iArr3;
                            }
                        } else {
                            jArr2 = jArr6;
                            objArr2 = objArr6;
                        }
                        iArr3 = iArr4;
                        j12 >>= 8;
                        i34++;
                        objArr6 = objArr2;
                        i19 = laneCount;
                        jArr6 = jArr2;
                        iArr4 = iArr3;
                    }
                    cVar2 = keyIndexMap;
                    jArr = jArr6;
                    objArr = objArr6;
                    iArr = iArr4;
                    i12 = 1;
                    if (i33 != 8) {
                        break;
                    }
                } else {
                    cVar2 = keyIndexMap;
                    jArr = jArr6;
                    objArr = objArr6;
                    iArr = iArr4;
                    i12 = 1;
                }
                if (i32 == length3) {
                    break;
                }
                i32 += i12;
                objArr6 = objArr;
                i19 = laneCount;
                jArr6 = jArr;
                iArr4 = iArr;
            }
        } else {
            cVar2 = keyIndexMap;
            iArr = iArr4;
        }
        if (this.movingAwayToStartBound.isEmpty()) {
            i10 = layoutWidth;
            i11 = layoutHeight;
            cVar3 = cVar2;
            iArr2 = iArr;
        } else {
            List<T> list6 = this.movingAwayToStartBound;
            if (list6.size() > 1) {
                kotlin.collections.r.C(list6, new f(cVar2));
            }
            List<T> list7 = this.movingAwayToStartBound;
            int size5 = list7.size();
            int i40 = 0;
            while (i40 < size5) {
                T t13 = list7.get(i40);
                LazyLayoutItemAnimator<T>.b bVarB3 = this.keyToItemInfoMap.b(t13.getKey());
                C3862t.d(bVarB3);
                LazyLayoutItemAnimator<T>.b bVar8 = bVarB3;
                int[] iArr5 = iArr;
                t13.n((isLookingAhead ? h((w) kotlin.collections.r.j0(positionedItems)) : bVar8.getLayoutMinOffset()) - r(iArr5, t13), bVar8.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z11) {
                    p(t13, true);
                }
                i40++;
                iArr = iArr5;
            }
            i10 = layoutWidth;
            i11 = layoutHeight;
            iArr2 = iArr;
            cVar3 = cVar2;
            C3831l.v(iArr2, 0, 0, 0, 6, null);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list8 = this.movingAwayToEndBound;
            if (list8.size() > 1) {
                kotlin.collections.r.C(list8, new d(cVar3));
            }
            List<T> list9 = this.movingAwayToEndBound;
            int size6 = list9.size();
            for (int i41 = 0; i41 < size6; i41++) {
                T t14 = list9.get(i41);
                LazyLayoutItemAnimator<T>.b bVarB4 = this.keyToItemInfoMap.b(t14.getKey());
                C3862t.d(bVarB4);
                LazyLayoutItemAnimator<T>.b bVar9 = bVarB4;
                t14.n((isLookingAhead ? h((w) kotlin.collections.r.u0(positionedItems)) : bVar9.getLayoutMaxOffset() - t14.getMainAxisSizeWithSpacings()) + r(iArr2, t14), bVar9.getCrossAxisOffset(), i10, i11);
                if (z11) {
                    p(t14, true);
                }
            }
        }
        List<T> list10 = this.movingAwayToStartBound;
        kotlin.collections.r.X(list10);
        C4153F c4153f5 = C4153F.f46609a;
        positionedItems.addAll(0, list10);
        positionedItems.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r14 = this;
            s.J<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r0 = r14.keyToItemInfoMap
            boolean r0 = r0.f()
            if (r0 == 0) goto L63
            s.J<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r0 = r14.keyToItemInfoMap
            java.lang.Object[] r1 = r0.values
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5e
            r3 = 0
            r4 = r3
        L15:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L59
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2f:
            if (r9 >= r7) goto L57
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L53
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r10
            androidx.compose.foundation.lazy.layout.b[] r10 = r10.getAnimations()
            int r11 = r10.length
            r12 = r3
        L47:
            if (r12 >= r11) goto L53
            r13 = r10[r12]
            if (r13 == 0) goto L50
            r13.x()
        L50:
            int r12 = r12 + 1
            goto L47
        L53:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2f
        L57:
            if (r7 != r8) goto L5e
        L59:
            if (r4 == r2) goto L5e
            int r4 = r4 + 1
            goto L15
        L5e:
            s.J<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r0 = r14.keyToItemInfoMap
            r0.h()
        L63:
            androidx.compose.foundation.lazy.layout.c$a r0 = androidx.compose.foundation.lazy.layout.c.INSTANCE
            r14.keyIndexMap = r0
            r0 = -1
            r14.firstVisibleIndex = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.o():void");
    }
}
