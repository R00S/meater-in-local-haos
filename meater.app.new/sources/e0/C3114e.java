package e0;

import A0.A0;
import A0.B0;
import A0.C0832k;
import A0.z0;
import Ba.l;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.O;
import x0.C5047a;

/* compiled from: DragAndDropNode.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u001d\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0013R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Le0/e;", "Lb0/i$c;", "LA0/A0;", "Le0/d;", "Lkotlin/Function1;", "Le0/b;", "Le0/g;", "onDragAndDropStart", "<init>", "(LBa/l;)V", "Loa/F;", "U1", "()V", "startEvent", "", "j2", "(Le0/b;)Z", "event", "P0", "(Le0/b;)V", "z1", "L0", "c0", "S0", "T", "O", "LBa/l;", "", "P", "Ljava/lang/Object;", "U", "()Ljava/lang/Object;", "traverseKey", "Q", "Le0/d;", "lastChildDragAndDropModifierNode", "R", "Le0/g;", "thisDragAndDropTarget", "S", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3114e extends i.c implements A0, InterfaceC3113d {

    /* renamed from: T, reason: collision with root package name */
    public static final int f39948T = 8;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final l<C3111b, InterfaceC3116g> onDragAndDropStart;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = Companion.C0508a.f39953a;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3113d lastChildDragAndDropModifierNode;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3116g thisDragAndDropTarget;

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le0/e;", "currentNode", "LA0/z0;", "a", "(Le0/e;)LA0/z0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e0.e$b */
    static final class b extends AbstractC3864v implements l<C3114e, z0> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3111b f39954B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C3114e f39955C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ K f39956D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3111b c3111b, C3114e c3114e, K k10) {
            super(1);
            this.f39954B = c3111b;
            this.f39955C = c3114e;
            this.f39956D = k10;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(C3114e c3114e) {
            if (!c3114e.getIsAttached()) {
                return z0.SkipSubtreeAndContinueTraversal;
            }
            if (!(c3114e.thisDragAndDropTarget == null)) {
                C5047a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            c3114e.thisDragAndDropTarget = (InterfaceC3116g) c3114e.onDragAndDropStart.invoke(this.f39954B);
            boolean z10 = c3114e.thisDragAndDropTarget != null;
            if (z10) {
                C0832k.l(this.f39955C).getDragAndDropManager().a(c3114e);
            }
            K k10 = this.f39956D;
            k10.f43974B = k10.f43974B || z10;
            return z0.ContinueTraversal;
        }
    }

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le0/e;", "currentNode", "LA0/z0;", "a", "(Le0/e;)LA0/z0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e0.e$c */
    static final class c extends AbstractC3864v implements l<C3114e, z0> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3111b f39957B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3111b c3111b) {
            super(1);
            this.f39957B = c3111b;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(C3114e c3114e) {
            if (!c3114e.getNode().getIsAttached()) {
                return z0.SkipSubtreeAndContinueTraversal;
            }
            InterfaceC3116g interfaceC3116g = c3114e.thisDragAndDropTarget;
            if (interfaceC3116g != null) {
                interfaceC3116g.T(this.f39957B);
            }
            c3114e.thisDragAndDropTarget = null;
            c3114e.lastChildDragAndDropModifierNode = null;
            return z0.ContinueTraversal;
        }
    }

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA0/A0;", "T", "child", "LA0/z0;", "a", "(LA0/A0;)LA0/z0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e0.e$d */
    public static final class d extends AbstractC3864v implements l<C3114e, z0> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ O f39958B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C3114e f39959C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C3111b f39960D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(O o10, C3114e c3114e, C3111b c3111b) {
            super(1);
            this.f39958B = o10;
            this.f39959C = c3114e;
            this.f39960D = c3111b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(C3114e c3114e) {
            C3114e c3114e2 = c3114e;
            if (!C0832k.l(this.f39959C).getDragAndDropManager().b(c3114e2) || !C3115f.d(c3114e2, C3118i.a(this.f39960D))) {
                return z0.ContinueTraversal;
            }
            this.f39958B.f43978B = c3114e;
            return z0.CancelTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3114e(l<? super C3111b, ? extends InterfaceC3116g> lVar) {
        this.onDragAndDropStart = lVar;
    }

    @Override // e0.InterfaceC3116g
    public void L0(C3111b event) {
        A0 a02;
        InterfaceC3113d interfaceC3113d;
        InterfaceC3113d interfaceC3113d2 = this.lastChildDragAndDropModifierNode;
        if (interfaceC3113d2 == null || !C3115f.d(interfaceC3113d2, C3118i.a(event))) {
            if (getNode().getIsAttached()) {
                O o10 = new O();
                B0.f(this, new d(o10, this, event));
                a02 = (A0) o10.f43978B;
            } else {
                a02 = null;
            }
            interfaceC3113d = (InterfaceC3113d) a02;
        } else {
            interfaceC3113d = interfaceC3113d2;
        }
        if (interfaceC3113d != null && interfaceC3113d2 == null) {
            C3115f.e(interfaceC3113d, event);
            InterfaceC3116g interfaceC3116g = this.thisDragAndDropTarget;
            if (interfaceC3116g != null) {
                interfaceC3116g.c0(event);
            }
        } else if (interfaceC3113d == null && interfaceC3113d2 != null) {
            InterfaceC3116g interfaceC3116g2 = this.thisDragAndDropTarget;
            if (interfaceC3116g2 != null) {
                C3115f.e(interfaceC3116g2, event);
            }
            interfaceC3113d2.c0(event);
        } else if (!C3862t.b(interfaceC3113d, interfaceC3113d2)) {
            if (interfaceC3113d != null) {
                C3115f.e(interfaceC3113d, event);
            }
            if (interfaceC3113d2 != null) {
                interfaceC3113d2.c0(event);
            }
        } else if (interfaceC3113d != null) {
            interfaceC3113d.L0(event);
        } else {
            InterfaceC3116g interfaceC3116g3 = this.thisDragAndDropTarget;
            if (interfaceC3116g3 != null) {
                interfaceC3116g3.L0(event);
            }
        }
        this.lastChildDragAndDropModifierNode = interfaceC3113d;
    }

    @Override // e0.InterfaceC3116g
    public void P0(C3111b event) {
        InterfaceC3116g interfaceC3116g = this.thisDragAndDropTarget;
        if (interfaceC3116g != null) {
            interfaceC3116g.P0(event);
            return;
        }
        InterfaceC3113d interfaceC3113d = this.lastChildDragAndDropModifierNode;
        if (interfaceC3113d != null) {
            interfaceC3113d.P0(event);
        }
    }

    @Override // e0.InterfaceC3116g
    public boolean S0(C3111b event) {
        InterfaceC3113d interfaceC3113d = this.lastChildDragAndDropModifierNode;
        if (interfaceC3113d != null) {
            return interfaceC3113d.S0(event);
        }
        InterfaceC3116g interfaceC3116g = this.thisDragAndDropTarget;
        if (interfaceC3116g != null) {
            return interfaceC3116g.S0(event);
        }
        return false;
    }

    @Override // e0.InterfaceC3116g
    public void T(C3111b event) {
        C3115f.f(this, new c(event));
    }

    @Override // A0.A0
    /* renamed from: U, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // b0.i.c
    public void U1() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // e0.InterfaceC3116g
    public void c0(C3111b event) {
        InterfaceC3116g interfaceC3116g = this.thisDragAndDropTarget;
        if (interfaceC3116g != null) {
            interfaceC3116g.c0(event);
        }
        InterfaceC3113d interfaceC3113d = this.lastChildDragAndDropModifierNode;
        if (interfaceC3113d != null) {
            interfaceC3113d.c0(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    public boolean j2(C3111b startEvent) {
        K k10 = new K();
        C3115f.f(this, new b(startEvent, this, k10));
        return k10.f43974B;
    }

    @Override // e0.InterfaceC3116g
    public void z1(C3111b event) {
        InterfaceC3116g interfaceC3116g = this.thisDragAndDropTarget;
        if (interfaceC3116g != null) {
            interfaceC3116g.z1(event);
            return;
        }
        InterfaceC3113d interfaceC3113d = this.lastChildDragAndDropModifierNode;
        if (interfaceC3113d != null) {
            interfaceC3113d.z1(event);
        }
    }
}
