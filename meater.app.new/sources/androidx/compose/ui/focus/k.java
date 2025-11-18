package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;

/* compiled from: FocusRequester.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/k;", "", "<init>", "()V", "", "d", "()Z", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "c", "(LBa/l;)Z", "LQ/b;", "Lg0/n;", "a", "LQ/b;", "e", "()LQ/b;", "focusRequesterNodes", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final k f22764c = new k();

    /* renamed from: d, reason: collision with root package name */
    private static final k f22765d = new k();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Q.b<g0.n> focusRequesterNodes = new Q.b<>(new g0.n[16], 0);

    /* compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/k$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/k;", "Default", "Landroidx/compose/ui/focus/k;", "b", "()Landroidx/compose/ui/focus/k;", "Cancel", "a", "getCancel$annotations", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final k a() {
            return k.f22765d;
        }

        public final k b() {
            return k.f22764c;
        }

        private Companion() {
        }
    }

    /* compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<FocusTargetNode, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f22767B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(m.j(focusTargetNode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x005d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(Ba.l<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.k.c(Ba.l):boolean");
    }

    public final boolean d() {
        return c(b.f22767B);
    }

    public final Q.b<g0.n> e() {
        return this.focusRequesterNodes;
    }
}
