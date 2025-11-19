package w;

import A0.A0;
import A0.B0;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import y0.InterfaceC5116v;

/* compiled from: FocusedBounds.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0018B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR0\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lw/w;", "Lb0/i$c;", "LA0/A0;", "Lkotlin/Function1;", "Ly0/v;", "Loa/F;", "onPositioned", "<init>", "(LBa/l;)V", "focusedBounds", "j2", "(Ly0/v;)V", "O", "LBa/l;", "getOnPositioned", "()LBa/l;", "setOnPositioned", "", "P", "Ljava/lang/Object;", "U", "()Ljava/lang/Object;", "traverseKey", "Q", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w extends i.c implements A0 {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: R, reason: collision with root package name */
    public static final int f51764R = 8;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super InterfaceC5116v, C4153F> onPositioned;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = INSTANCE;

    /* compiled from: FocusedBounds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw/w$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w.w$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    public w(Ba.l<? super InterfaceC5116v, C4153F> lVar) {
        this.onPositioned = lVar;
    }

    @Override // A0.A0
    /* renamed from: U, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void j2(InterfaceC5116v focusedBounds) {
        this.onPositioned.invoke(focusedBounds);
        w wVar = (w) B0.b(this);
        if (wVar != null) {
            wVar.j2(focusedBounds);
        }
    }
}
