package g0;

import A0.AbstractC0834m;
import A0.C0832k;
import A0.e0;
import androidx.compose.ui.focus.FocusTargetNode;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3860q;
import oa.C4153F;
import s.C4389K;
import s.W;
import x0.C5047a;

/* compiled from: FocusInvalidationManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f¨\u0006$"}, d2 = {"Lg0/e;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Loa/F;", "onRequestApplyChangesListener", "invalidateOwnerFocusState", "<init>", "(LBa/l;LBa/a;)V", "T", "Ls/K;", "node", "g", "(Ls/K;Ljava/lang/Object;)V", "c", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Lg0/c;", "e", "(Lg0/c;)V", "Lg0/j;", "f", "(Lg0/j;)V", "", "b", "()Z", "a", "LBa/l;", "LBa/a;", "Ls/K;", "focusTargetNodes", "focusEventNodes", "focusPropertiesNodes", "focusTargetsWithInvalidatedFocusEvents", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Ba.a<C4153F>, C4153F> onRequestApplyChangesListener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> invalidateOwnerFocusState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C4389K<FocusTargetNode> focusTargetNodes = W.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C4389K<c> focusEventNodes = W.a();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C4389K<j> focusPropertiesNodes = W.a();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C4389K<FocusTargetNode> focusTargetsWithInvalidatedFocusEvents = W.a();

    /* compiled from: FocusInvalidationManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C3860q implements Ba.a<C4153F> {
        a(Object obj) {
            super(0, obj, e.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        public final void c() {
            ((e) this.receiver).c();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            c();
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Ba.l<? super Ba.a<C4153F>, C4153F> lVar, Ba.a<C4153F> aVar) {
        this.onRequestApplyChangesListener = lVar;
        this.invalidateOwnerFocusState = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        int i10;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        o oVarQ2;
        Q.b bVar;
        int i11;
        int i12;
        int i13;
        long[] jArr3;
        Object[] objArr3;
        boolean z10;
        Object[] objArr4;
        boolean z11;
        int i14;
        Q.b bVar2;
        long[] jArr4;
        long[] jArr5;
        int i15;
        long[] jArr6;
        long[] jArr7;
        C4389K<j> c4389k = this.focusPropertiesNodes;
        Object[] objArr5 = c4389k.elements;
        long[] jArr8 = c4389k.metadata;
        int length = jArr8.length - 2;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i16 = 8;
        int i17 = 1;
        if (length >= 0) {
            int i18 = 0;
            while (true) {
                long j11 = jArr8[i18];
                if ((((~j11) << c10) & j11 & j10) != j10) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j11 & 255) < 128) {
                            j jVar = (j) objArr5[(i18 << 3) + i20];
                            if (jVar.getNode().getIsAttached()) {
                                int iA = e0.a(1024);
                                i.c node = jVar.getNode();
                                Q.b bVar3 = null;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        this.focusTargetNodes.h((FocusTargetNode) node);
                                    } else {
                                        if ((node.getKindSet() & iA) != 0 && (node instanceof AbstractC0834m)) {
                                            i.c delegate = ((AbstractC0834m) node).getDelegate();
                                            int i21 = 0;
                                            while (delegate != null) {
                                                if ((delegate.getKindSet() & iA) != 0) {
                                                    i21++;
                                                    if (i21 == i17) {
                                                        jArr7 = jArr8;
                                                        node = delegate;
                                                    } else {
                                                        if (bVar3 == null) {
                                                            jArr7 = jArr8;
                                                            bVar3 = new Q.b(new i.c[16], 0);
                                                        } else {
                                                            jArr7 = jArr8;
                                                        }
                                                        if (node != null) {
                                                            bVar3.c(node);
                                                            node = null;
                                                        }
                                                        bVar3.c(delegate);
                                                    }
                                                } else {
                                                    jArr7 = jArr8;
                                                }
                                                delegate = delegate.getChild();
                                                jArr8 = jArr7;
                                                i17 = 1;
                                            }
                                            jArr6 = jArr8;
                                            int i22 = i17;
                                            if (i21 == i22) {
                                                i17 = i22;
                                                jArr8 = jArr6;
                                            }
                                        }
                                        node = C0832k.g(bVar3);
                                        jArr8 = jArr6;
                                        i17 = 1;
                                    }
                                    jArr6 = jArr8;
                                    node = C0832k.g(bVar3);
                                    jArr8 = jArr6;
                                    i17 = 1;
                                }
                                jArr5 = jArr8;
                                if (!jVar.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                Q.b bVar4 = new Q.b(new i.c[16], 0);
                                i.c child = jVar.getNode().getChild();
                                if (child == null) {
                                    C0832k.c(bVar4, jVar.getNode());
                                } else {
                                    bVar4.c(child);
                                }
                                while (bVar4.y()) {
                                    i.c cVarG = (i.c) bVar4.E(bVar4.getSize() - 1);
                                    if ((cVarG.getAggregateChildKindSet() & iA) == 0) {
                                        C0832k.c(bVar4, cVarG);
                                    } else {
                                        while (true) {
                                            if (cVarG == null) {
                                                break;
                                            }
                                            if ((cVarG.getKindSet() & iA) != 0) {
                                                Q.b bVar5 = null;
                                                while (cVarG != null) {
                                                    if (cVarG instanceof FocusTargetNode) {
                                                        this.focusTargetNodes.h((FocusTargetNode) cVarG);
                                                    } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
                                                        int i23 = 0;
                                                        for (i.c delegate2 = ((AbstractC0834m) cVarG).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                                            if ((delegate2.getKindSet() & iA) != 0) {
                                                                i23++;
                                                                if (i23 == 1) {
                                                                    cVarG = delegate2;
                                                                } else {
                                                                    if (bVar5 == null) {
                                                                        bVar5 = new Q.b(new i.c[16], 0);
                                                                    }
                                                                    if (cVarG != null) {
                                                                        bVar5.c(cVarG);
                                                                        cVarG = null;
                                                                    }
                                                                    bVar5.c(delegate2);
                                                                }
                                                            }
                                                        }
                                                        if (i23 == 1) {
                                                        }
                                                    }
                                                    cVarG = C0832k.g(bVar5);
                                                }
                                            } else {
                                                cVarG = cVarG.getChild();
                                            }
                                        }
                                    }
                                }
                            } else {
                                jArr5 = jArr8;
                            }
                            i15 = 8;
                        } else {
                            jArr5 = jArr8;
                            i15 = i16;
                        }
                        j11 >>= i15;
                        i20++;
                        i16 = i15;
                        jArr8 = jArr5;
                        i17 = 1;
                    }
                    jArr4 = jArr8;
                    if (i19 != i16) {
                        break;
                    }
                } else {
                    jArr4 = jArr8;
                }
                if (i18 == length) {
                    break;
                }
                i18++;
                jArr8 = jArr4;
                c10 = 7;
                j10 = -9187201950435737472L;
                i17 = 1;
                i16 = 8;
            }
        }
        this.focusPropertiesNodes.m();
        C4389K<c> c4389k2 = this.focusEventNodes;
        Object[] objArr6 = c4389k2.elements;
        long[] jArr9 = c4389k2.metadata;
        int length2 = jArr9.length - 2;
        if (length2 >= 0) {
            int i24 = 0;
            while (true) {
                long j12 = jArr9[i24];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                    int i26 = 0;
                    while (i26 < i25) {
                        if ((j12 & 255) < 128) {
                            c cVar = (c) objArr6[(i24 << 3) + i26];
                            if (cVar.getNode().getIsAttached()) {
                                int iA2 = e0.a(1024);
                                i.c node2 = cVar.getNode();
                                boolean z12 = false;
                                boolean z13 = true;
                                FocusTargetNode focusTargetNode = null;
                                Q.b bVar6 = null;
                                while (node2 != null) {
                                    if (node2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node2;
                                        if (focusTargetNode != null) {
                                            z12 = true;
                                        }
                                        if (this.focusTargetNodes.a(focusTargetNode2)) {
                                            this.focusTargetsWithInvalidatedFocusEvents.h(focusTargetNode2);
                                            z13 = false;
                                        }
                                        jArr3 = jArr9;
                                        objArr3 = objArr6;
                                        focusTargetNode = focusTargetNode2;
                                    } else {
                                        if ((node2.getKindSet() & iA2) == 0 || !(node2 instanceof AbstractC0834m)) {
                                            jArr3 = jArr9;
                                            objArr3 = objArr6;
                                            z10 = z12;
                                        } else {
                                            i.c delegate3 = ((AbstractC0834m) node2).getDelegate();
                                            jArr3 = jArr9;
                                            int i27 = 0;
                                            while (delegate3 != null) {
                                                if ((delegate3.getKindSet() & iA2) != 0) {
                                                    i27++;
                                                    objArr4 = objArr6;
                                                    if (i27 == 1) {
                                                        node2 = delegate3;
                                                    } else {
                                                        if (bVar6 == null) {
                                                            i14 = i27;
                                                            z11 = z12;
                                                            bVar2 = new Q.b(new i.c[16], 0);
                                                        } else {
                                                            i14 = i27;
                                                            z11 = z12;
                                                            bVar2 = bVar6;
                                                        }
                                                        if (node2 != null) {
                                                            bVar2.c(node2);
                                                            node2 = null;
                                                        }
                                                        bVar2.c(delegate3);
                                                        bVar6 = bVar2;
                                                        i27 = i14;
                                                        delegate3 = delegate3.getChild();
                                                        objArr6 = objArr4;
                                                        z12 = z11;
                                                    }
                                                } else {
                                                    objArr4 = objArr6;
                                                }
                                                z11 = z12;
                                                delegate3 = delegate3.getChild();
                                                objArr6 = objArr4;
                                                z12 = z11;
                                            }
                                            objArr3 = objArr6;
                                            z10 = z12;
                                            if (i27 == 1) {
                                                jArr9 = jArr3;
                                                objArr6 = objArr3;
                                                z12 = z10;
                                            }
                                        }
                                        z12 = z10;
                                    }
                                    node2 = C0832k.g(bVar6);
                                    jArr9 = jArr3;
                                    objArr6 = objArr3;
                                }
                                jArr2 = jArr9;
                                objArr2 = objArr6;
                                boolean z14 = z12;
                                if (!cVar.getNode().getIsAttached()) {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                                Q.b bVar7 = new Q.b(new i.c[16], 0);
                                i.c child2 = cVar.getNode().getChild();
                                if (child2 == null) {
                                    C0832k.c(bVar7, cVar.getNode());
                                } else {
                                    bVar7.c(child2);
                                }
                                boolean z15 = z14;
                                while (bVar7.y()) {
                                    i.c cVarG2 = (i.c) bVar7.E(bVar7.getSize() - 1);
                                    if ((cVarG2.getAggregateChildKindSet() & iA2) == 0) {
                                        C0832k.c(bVar7, cVarG2);
                                    } else {
                                        while (cVarG2 != null) {
                                            if ((cVarG2.getKindSet() & iA2) != 0) {
                                                Q.b bVar8 = null;
                                                while (cVarG2 != null) {
                                                    if (cVarG2 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVarG2;
                                                        if (focusTargetNode != null) {
                                                            z15 = true;
                                                        }
                                                        if (this.focusTargetNodes.a(focusTargetNode3)) {
                                                            this.focusTargetsWithInvalidatedFocusEvents.h(focusTargetNode3);
                                                            z13 = false;
                                                        }
                                                        bVar = bVar7;
                                                        focusTargetNode = focusTargetNode3;
                                                    } else if ((cVarG2.getKindSet() & iA2) == 0 || !(cVarG2 instanceof AbstractC0834m)) {
                                                        bVar = bVar7;
                                                    } else {
                                                        i.c delegate4 = ((AbstractC0834m) cVarG2).getDelegate();
                                                        bVar = bVar7;
                                                        int i28 = 0;
                                                        while (delegate4 != null) {
                                                            if ((delegate4.getKindSet() & iA2) != 0) {
                                                                i28++;
                                                                i12 = iA2;
                                                                if (i28 == 1) {
                                                                    cVarG2 = delegate4;
                                                                } else {
                                                                    if (bVar8 == null) {
                                                                        i13 = i28;
                                                                        bVar8 = new Q.b(new i.c[16], 0);
                                                                    } else {
                                                                        i13 = i28;
                                                                    }
                                                                    if (cVarG2 != null) {
                                                                        bVar8.c(cVarG2);
                                                                        cVarG2 = null;
                                                                    }
                                                                    bVar8.c(delegate4);
                                                                    i28 = i13;
                                                                    delegate4 = delegate4.getChild();
                                                                    iA2 = i12;
                                                                }
                                                            } else {
                                                                i12 = iA2;
                                                            }
                                                            delegate4 = delegate4.getChild();
                                                            iA2 = i12;
                                                        }
                                                        i11 = iA2;
                                                        if (i28 != 1) {
                                                            cVarG2 = C0832k.g(bVar8);
                                                        }
                                                        bVar7 = bVar;
                                                        iA2 = i11;
                                                    }
                                                    i11 = iA2;
                                                    cVarG2 = C0832k.g(bVar8);
                                                    bVar7 = bVar;
                                                    iA2 = i11;
                                                }
                                            } else {
                                                cVarG2 = cVarG2.getChild();
                                                iA2 = iA2;
                                            }
                                        }
                                    }
                                    bVar7 = bVar7;
                                    iA2 = iA2;
                                }
                                if (z13) {
                                    if (z15) {
                                        oVarQ2 = d.a(cVar);
                                    } else if (focusTargetNode == null || (oVarQ2 = focusTargetNode.q2()) == null) {
                                        oVarQ2 = p.Inactive;
                                    }
                                    cVar.u(oVarQ2);
                                }
                            } else {
                                cVar.u(p.Inactive);
                                jArr2 = jArr9;
                                objArr2 = objArr6;
                            }
                        } else {
                            jArr2 = jArr9;
                            objArr2 = objArr6;
                        }
                        j12 >>= 8;
                        i26++;
                        jArr9 = jArr2;
                        objArr6 = objArr2;
                    }
                    jArr = jArr9;
                    objArr = objArr6;
                    i10 = 0;
                    if (i25 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr9;
                    objArr = objArr6;
                    i10 = 0;
                }
                if (i24 == length2) {
                    break;
                }
                i24++;
                jArr9 = jArr;
                objArr6 = objArr;
            }
        } else {
            i10 = 0;
        }
        this.focusEventNodes.m();
        C4389K<FocusTargetNode> c4389k3 = this.focusTargetNodes;
        Object[] objArr7 = c4389k3.elements;
        long[] jArr10 = c4389k3.metadata;
        int length3 = jArr10.length - 2;
        if (length3 >= 0) {
            int i29 = i10;
            while (true) {
                long j13 = jArr10[i29];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i30 = 8 - ((~(i29 - length3)) >>> 31);
                    for (int i31 = i10; i31 < i30; i31++) {
                        if ((j13 & 255) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr7[(i29 << 3) + i31];
                            if (focusTargetNode4.getIsAttached()) {
                                p pVarQ2 = focusTargetNode4.q2();
                                focusTargetNode4.v2();
                                if (pVarQ2 != focusTargetNode4.q2() || this.focusTargetsWithInvalidatedFocusEvents.a(focusTargetNode4)) {
                                    d.c(focusTargetNode4);
                                }
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i30 != 8) {
                        break;
                    }
                }
                if (i29 == length3) {
                    break;
                } else {
                    i29++;
                }
            }
        }
        this.focusTargetNodes.m();
        this.focusTargetsWithInvalidatedFocusEvents.m();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodes.d()) {
            C5047a.b("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodes.d()) {
            C5047a.b("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodes.d()) {
            return;
        }
        C5047a.b("Unprocessed FocusTarget nodes");
    }

    private final <T> void g(C4389K<T> c4389k, T t10) {
        if (c4389k.h(t10) && this.focusTargetNodes.get_size() + this.focusEventNodes.get_size() + this.focusPropertiesNodes.get_size() == 1) {
            this.onRequestApplyChangesListener.invoke(new a(this));
        }
    }

    public final boolean b() {
        return this.focusTargetNodes.e() || this.focusPropertiesNodes.e() || this.focusEventNodes.e();
    }

    public final void d(FocusTargetNode node) {
        g(this.focusTargetNodes, node);
    }

    public final void e(c node) {
        g(this.focusEventNodes, node);
    }

    public final void f(j node) {
        g(this.focusPropertiesNodes, node);
    }
}
