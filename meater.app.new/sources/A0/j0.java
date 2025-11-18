package A0;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: ObserverModifierNode.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"LA0/j0;", "LA0/n0;", "LA0/h0;", "observerNode", "<init>", "(LA0/h0;)V", "B", "LA0/h0;", "b", "()LA0/h0;", "", "b0", "()Z", "isValidOwnerScope", "C", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j0 implements n0 {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    public static final int f633D = 8;

    /* renamed from: E, reason: collision with root package name */
    private static final Ba.l<j0, C4153F> f634E = a.f636B;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final h0 observerNode;

    /* compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/j0;", "it", "Loa/F;", "a", "(LA0/j0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<j0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f636B = new a();

        a() {
            super(1);
        }

        public final void a(j0 j0Var) {
            if (j0Var.b0()) {
                j0Var.getObserverNode().e1();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(j0 j0Var) {
            a(j0Var);
            return C4153F.f46609a;
        }
    }

    /* compiled from: ObserverModifierNode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LA0/j0$b;", "", "<init>", "()V", "Lkotlin/Function1;", "LA0/j0;", "Loa/F;", "OnObserveReadsChanged", "LBa/l;", "a", "()LBa/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.j0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Ba.l<j0, C4153F> a() {
            return j0.f634E;
        }

        private Companion() {
        }
    }

    public j0(h0 h0Var) {
        this.observerNode = h0Var;
    }

    /* renamed from: b, reason: from getter */
    public final h0 getObserverNode() {
        return this.observerNode;
    }

    @Override // A0.n0
    public boolean b0() {
        return this.observerNode.getNode().getIsAttached();
    }
}
