package androidx.compose.ui.input.nestedscroll;

import A0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import t0.InterfaceC4536a;
import t0.b;
import t0.c;

/* compiled from: NestedScrollModifier.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "LA0/V;", "Lt0/c;", "Lt0/a;", "connection", "Lt0/b;", "dispatcher", "<init>", "(Lt0/a;Lt0/b;)V", "p", "()Lt0/c;", "node", "Loa/F;", "s", "(Lt0/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lt0/a;", "getConnection", "()Lt0/a;", "c", "Lt0/b;", "getDispatcher", "()Lt0/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class NestedScrollElement extends V<c> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4536a connection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b dispatcher;

    public NestedScrollElement(InterfaceC4536a interfaceC4536a, b bVar) {
        this.connection = interfaceC4536a;
        this.dispatcher = bVar;
    }

    public boolean equals(Object other) {
        if (!(other instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) other;
        return C3862t.b(nestedScrollElement.connection, this.connection) && C3862t.b(nestedScrollElement.dispatcher, this.dispatcher);
    }

    public int hashCode() {
        int iHashCode = this.connection.hashCode() * 31;
        b bVar = this.dispatcher;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c m() {
        return new c(this.connection, this.dispatcher);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(c node) {
        node.q2(this.connection, this.dispatcher);
    }
}
