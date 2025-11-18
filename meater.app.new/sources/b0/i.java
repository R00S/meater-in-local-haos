package b0;

import A0.AbstractC0823c0;
import A0.C0832k;
import A0.InterfaceC0831j;
import A0.j0;
import Ba.p;
import Xb.C1873y0;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.J;
import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import kotlin.Metadata;
import oa.C4153F;
import x0.C5047a;

/* compiled from: Modifier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000 \f2\u00020\u0001:\u0003\f\u0011\u0007J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lb0/i;", "", "R", "initial", "Lkotlin/Function2;", "Lb0/i$b;", "operation", "c", "(Ljava/lang/Object;LBa/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "a", "(LBa/l;)Z", "other", "e", "(Lb0/i;)Lb0/i;", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f29918b;

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lb0/i$b;", "Lb0/i;", "R", "initial", "Lkotlin/Function2;", "operation", "c", "(Ljava/lang/Object;LBa/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "a", "(LBa/l;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b extends i {
        @Override // b0.i
        default boolean a(Ba.l<? super b, Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }

        @Override // b0.i
        default <R> R c(R initial, p<? super R, ? super b, ? extends R> operation) {
            return operation.invoke(initial, this);
        }
    }

    boolean a(Ba.l<? super b, Boolean> predicate);

    <R> R c(R initial, p<? super R, ? super b, ? extends R> operation);

    default i e(i other) {
        return other == INSTANCE ? this : new f(this, other);
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R$\u00102\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u0017R$\u00106\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u0017R$\u0010>\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\b@\u0010AR\"\u0010I\u001a\u00020B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010M\u001a\u00020B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR\u0016\u0010O\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010DR\u0016\u0010Q\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010DR$\u0010T\u001a\u00020B2\u0006\u0010\u0018\u001a\u00020B8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010D\u001a\u0004\bS\u0010FR\u0011\u0010W\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001a\u0010Z\u001a\u00020B8VX\u0096\u0004¢\u0006\f\u0012\u0004\bY\u0010\u0003\u001a\u0004\bX\u0010F¨\u0006["}, d2 = {"Lb0/i$c;", "LA0/j;", "<init>", "()V", "LA0/c0;", "coordinator", "Loa/F;", "i2", "(LA0/c0;)V", "R1", "X1", "Y1", "S1", "W1", "T1", "U1", "V1", "Lkotlin/Function0;", "effect", "h2", "(LBa/a;)V", "owner", "a2", "(Lb0/i$c;)V", "<set-?>", "B", "Lb0/i$c;", "Z0", "()Lb0/i$c;", "getNode$annotations", "node", "LXb/I;", "C", "LXb/I;", "scope", "", "D", "I", "L1", "()I", "d2", "(I)V", "kindSet", "E", "G1", "Z1", "aggregateChildKindSet", "F", "N1", "f2", "parent", "G", "H1", "b2", "child", "LA0/j0;", "H", "LA0/j0;", "M1", "()LA0/j0;", "e2", "(LA0/j0;)V", "ownerScope", "LA0/c0;", "I1", "()LA0/c0;", "", "J", "Z", "K1", "()Z", "c2", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "K", "P1", "g2", "updatedNodeAwaitingAttachForInvalidation", "L", "onAttachRunExpected", "M", "onDetachRunExpected", "N", "Q1", "isAttached", "J1", "()LXb/I;", "coroutineScope", "O1", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c implements InterfaceC0831j {

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private I scope;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private int kindSet;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private c parent;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private c child;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private j0 ownerScope;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private AbstractC0823c0 coordinator;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata */
        private boolean insertedNodeAwaitingAttachForInvalidation;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata */
        private boolean updatedNodeAwaitingAttachForInvalidation;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata */
        private boolean onAttachRunExpected;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata */
        private boolean onDetachRunExpected;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private boolean isAttached;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private c node = this;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private int aggregateChildKindSet = -1;

        /* renamed from: G1, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        /* renamed from: H1, reason: from getter */
        public final c getChild() {
            return this.child;
        }

        /* renamed from: I1, reason: from getter */
        public final AbstractC0823c0 getCoordinator() {
            return this.coordinator;
        }

        public final I J1() {
            I i10 = this.scope;
            if (i10 != null) {
                return i10;
            }
            I iA = J.a(C0832k.l(this).getCoroutineContext().s(C1873y0.a((InterfaceC1867v0) C0832k.l(this).getCoroutineContext().b(InterfaceC1867v0.INSTANCE))));
            this.scope = iA;
            return iA;
        }

        /* renamed from: K1, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: L1, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        /* renamed from: M1, reason: from getter */
        public final j0 getOwnerScope() {
            return this.ownerScope;
        }

        /* renamed from: N1, reason: from getter */
        public final c getParent() {
            return this.parent;
        }

        public boolean O1() {
            return true;
        }

        /* renamed from: P1, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: Q1, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public void R1() {
            if (this.isAttached) {
                C5047a.b("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                C5047a.b("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void S1() {
            if (!this.isAttached) {
                C5047a.b("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                C5047a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                C5047a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            I i10 = this.scope;
            if (i10 != null) {
                J.c(i10, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void W1() {
            if (!this.isAttached) {
                C5047a.b("reset() called on an unattached node");
            }
            V1();
        }

        public void X1() {
            if (!this.isAttached) {
                C5047a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                C5047a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            T1();
            this.onDetachRunExpected = true;
        }

        public void Y1() {
            if (!this.isAttached) {
                C5047a.b("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                C5047a.b("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                C5047a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            U1();
        }

        @Override // A0.InterfaceC0831j
        /* renamed from: Z0, reason: from getter */
        public final c getNode() {
            return this.node;
        }

        public final void Z1(int i10) {
            this.aggregateChildKindSet = i10;
        }

        public void a2(c owner) {
            this.node = owner;
        }

        public final void b2(c cVar) {
            this.child = cVar;
        }

        public final void c2(boolean z10) {
            this.insertedNodeAwaitingAttachForInvalidation = z10;
        }

        public final void d2(int i10) {
            this.kindSet = i10;
        }

        public final void e2(j0 j0Var) {
            this.ownerScope = j0Var;
        }

        public final void f2(c cVar) {
            this.parent = cVar;
        }

        public final void g2(boolean z10) {
            this.updatedNodeAwaitingAttachForInvalidation = z10;
        }

        public final void h2(Ba.a<C4153F> effect) {
            C0832k.l(this).k(effect);
        }

        public void i2(AbstractC0823c0 coordinator) {
            this.coordinator = coordinator;
        }

        public void T1() {
        }

        public void U1() {
        }

        public void V1() {
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lb0/i$a;", "Lb0/i;", "<init>", "()V", "R", "initial", "Lkotlin/Function2;", "Lb0/i$b;", "operation", "c", "(Ljava/lang/Object;LBa/p;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "a", "(LBa/l;)Z", "other", "e", "(Lb0/i;)Lb0/i;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: b0.i$a, reason: from kotlin metadata */
    public static final class Companion implements i {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f29918b = new Companion();

        private Companion() {
        }

        @Override // b0.i
        public boolean a(Ba.l<? super b, Boolean> predicate) {
            return true;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // b0.i
        public i e(i other) {
            return other;
        }

        @Override // b0.i
        public <R> R c(R initial, p<? super R, ? super b, ? extends R> operation) {
            return initial;
        }
    }
}
