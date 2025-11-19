package A0;

import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x0.C5047a;

/* compiled from: DelegatingNode.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0010¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0007H\u0010¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\"\u0010\u0003R \u0010(\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0015¨\u0006/"}, d2 = {"LA0/m;", "Lb0/i$c;", "<init>", "()V", "", "delegateKindSet", "delegateNode", "Loa/F;", "o2", "(ILb0/i$c;)V", "newKindSet", "", "recalculateOwner", "n2", "(IZ)V", "LA0/c0;", "coordinator", "i2", "(LA0/c0;)V", "owner", "a2", "(Lb0/i$c;)V", "LA0/j;", "T", "delegatableNode", "j2", "(LA0/j;)LA0/j;", "instance", "m2", "(LA0/j;)V", "R1", "X1", "Y1", "S1", "W1", "O", "I", "l2", "()I", "getSelfKindSet$ui_release$annotations", "selfKindSet", "P", "Lb0/i$c;", "k2", "()Lb0/i$c;", "setDelegate$ui_release", "delegate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0834m extends i.c {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int selfKindSet = f0.g(this);

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private i.c delegate;

    private final void n2(int newKindSet, boolean recalculateOwner) {
        i.c child;
        int kindSet = getKindSet();
        d2(newKindSet);
        if (kindSet != newKindSet) {
            if (C0832k.f(this)) {
                Z1(newKindSet);
            }
            if (getIsAttached()) {
                i.c node = getNode();
                i.c parent = this;
                while (parent != null) {
                    newKindSet |= parent.getKindSet();
                    parent.d2(newKindSet);
                    if (parent == node) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (recalculateOwner && parent == node) {
                    newKindSet = f0.h(node);
                    node.d2(newKindSet);
                }
                int aggregateChildKindSet = newKindSet | ((parent == null || (child = parent.getChild()) == null) ? 0 : child.getAggregateChildKindSet());
                while (parent != null) {
                    aggregateChildKindSet |= parent.getKindSet();
                    parent.Z1(aggregateChildKindSet);
                    parent = parent.getParent();
                }
            }
        }
    }

    private final void o2(int delegateKindSet, i.c delegateNode) {
        int kindSet = getKindSet();
        if ((delegateKindSet & e0.a(2)) == 0 || (e0.a(2) & kindSet) == 0 || (this instanceof B)) {
            return;
        }
        C5047a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + delegateNode);
    }

    @Override // b0.i.c
    public void R1() {
        super.R1();
        for (i.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.i2(getCoordinator());
            if (!delegate.getIsAttached()) {
                delegate.R1();
            }
        }
    }

    @Override // b0.i.c
    public void S1() {
        for (i.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.S1();
        }
        super.S1();
    }

    @Override // b0.i.c
    public void W1() {
        super.W1();
        for (i.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.W1();
        }
    }

    @Override // b0.i.c
    public void X1() {
        for (i.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.X1();
        }
        super.X1();
    }

    @Override // b0.i.c
    public void Y1() {
        super.Y1();
        for (i.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.Y1();
        }
    }

    @Override // b0.i.c
    public void a2(i.c owner) {
        super.a2(owner);
        for (i.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.a2(owner);
        }
    }

    @Override // b0.i.c
    public void i2(AbstractC0823c0 coordinator) {
        super.i2(coordinator);
        for (i.c delegate = getDelegate(); delegate != null; delegate = delegate.getChild()) {
            delegate.i2(coordinator);
        }
    }

    protected final <T extends InterfaceC0831j> T j2(T delegatableNode) {
        i.c node = delegatableNode.getNode();
        if (node != delegatableNode) {
            i.c cVar = delegatableNode instanceof i.c ? (i.c) delegatableNode : null;
            i.c parent = cVar != null ? cVar.getParent() : null;
            if (node == getNode() && C3862t.b(parent, this)) {
                return delegatableNode;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.getIsAttached()) {
            C5047a.b("Cannot delegate to an already attached node");
        }
        node.a2(getNode());
        int kindSet = getKindSet();
        int iH = f0.h(node);
        node.d2(iH);
        o2(iH, node);
        node.b2(this.delegate);
        this.delegate = node;
        node.f2(this);
        n2(getKindSet() | iH, false);
        if (getIsAttached()) {
            if ((iH & e0.a(2)) == 0 || (kindSet & e0.a(2)) != 0) {
                i2(getCoordinator());
            } else {
                C0819a0 nodes = C0832k.k(this).getNodes();
                getNode().i2(null);
                nodes.C();
            }
            node.R1();
            node.X1();
            f0.a(node);
        }
        return delegatableNode;
    }

    /* renamed from: k2, reason: from getter */
    public final i.c getDelegate() {
        return this.delegate;
    }

    /* renamed from: l2, reason: from getter */
    public final int getSelfKindSet() {
        return this.selfKindSet;
    }

    protected final void m2(InterfaceC0831j instance) {
        i.c cVar = null;
        for (i.c child = this.delegate; child != null; child = child.getChild()) {
            if (child == instance) {
                if (child.getIsAttached()) {
                    f0.d(child);
                    child.Y1();
                    child.S1();
                }
                child.a2(child);
                child.Z1(0);
                if (cVar == null) {
                    this.delegate = child.getChild();
                } else {
                    cVar.b2(child.getChild());
                }
                child.b2(null);
                child.f2(null);
                int kindSet = getKindSet();
                int iH = f0.h(this);
                n2(iH, true);
                if (getIsAttached() && (kindSet & e0.a(2)) != 0 && (e0.a(2) & iH) == 0) {
                    C0819a0 nodes = C0832k.k(this).getNodes();
                    getNode().i2(null);
                    nodes.C();
                    return;
                }
                return;
            }
            cVar = child;
        }
        throw new IllegalStateException(("Could not find delegate: " + instance).toString());
    }
}
