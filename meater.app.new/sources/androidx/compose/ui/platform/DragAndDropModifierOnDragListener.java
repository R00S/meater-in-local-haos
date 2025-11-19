package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import e0.C3111b;
import e0.C3114e;
import e0.C3117h;
import e0.InterfaceC3112c;
import e0.InterfaceC3113d;
import e0.InterfaceC3116g;
import h0.C3482m;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import s.C4392b;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R8\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroid/view/View$OnDragListener;", "Le0/c;", "Lkotlin/Function3;", "Le0/h;", "Lh0/m;", "Lkotlin/Function1;", "Lk0/f;", "Loa/F;", "", "startDrag", "<init>", "(LBa/q;)V", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", "event", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Le0/d;", "node", "a", "(Le0/d;)V", "b", "(Le0/d;)Z", "LBa/q;", "Le0/e;", "Le0/e;", "rootDragAndDropNode", "Ls/b;", "c", "Ls/b;", "interestedNodes", "Lb0/i;", "d", "Lb0/i;", "()Lb0/i;", "modifier", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements View.OnDragListener, InterfaceC3112c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.q<C3117h, C3482m, Ba.l<? super k0.f, C4153F>, Boolean> startDrag;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C3114e rootDragAndDropNode = new C3114e(a.f22914B);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4392b<InterfaceC3113d> interestedNodes = new C4392b<>(0, 1, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b0.i modifier = new A0.V<C3114e>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f22915b.rootDragAndDropNode.hashCode();
        }

        @Override // A0.V
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C3114e m() {
            return this.f22915b.rootDragAndDropNode;
        }

        @Override // A0.V
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public void n(C3114e node) {
        }
    };

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le0/b;", "it", "Le0/g;", "a", "(Le0/b;)Le0/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<C3111b, InterfaceC3116g> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22914B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3116g invoke(C3111b c3111b) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(Ba.q<? super C3117h, ? super C3482m, ? super Ba.l<? super k0.f, C4153F>, Boolean> qVar) {
        this.startDrag = qVar;
    }

    @Override // e0.InterfaceC3112c
    public void a(InterfaceC3113d node) {
        this.interestedNodes.add(node);
    }

    @Override // e0.InterfaceC3112c
    public boolean b(InterfaceC3113d node) {
        return this.interestedNodes.contains(node);
    }

    /* renamed from: d, reason: from getter */
    public b0.i getModifier() {
        return this.modifier;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent event) {
        C3111b c3111b = new C3111b(event);
        switch (event.getAction()) {
            case 1:
                boolean zJ2 = this.rootDragAndDropNode.j2(c3111b);
                Iterator<InterfaceC3113d> it = this.interestedNodes.iterator();
                while (it.hasNext()) {
                    it.next().P0(c3111b);
                }
                break;
            case 2:
                this.rootDragAndDropNode.L0(c3111b);
                break;
            case 4:
                this.rootDragAndDropNode.T(c3111b);
                break;
            case 5:
                this.rootDragAndDropNode.z1(c3111b);
                break;
            case 6:
                this.rootDragAndDropNode.c0(c3111b);
                break;
        }
        return false;
    }
}
