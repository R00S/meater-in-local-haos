package Ra;

import java.util.Collection;

/* compiled from: CallableMemberDescriptor.java */
/* renamed from: Ra.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1689b extends InterfaceC1688a, D {

    /* compiled from: CallableMemberDescriptor.java */
    /* renamed from: Ra.b$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean c() {
            return this != FAKE_OVERRIDE;
        }
    }

    InterfaceC1689b a0(InterfaceC1700m interfaceC1700m, E e10, AbstractC1707u abstractC1707u, a aVar, boolean z10);

    @Override // Ra.InterfaceC1688a, Ra.InterfaceC1700m
    InterfaceC1689b b();

    @Override // Ra.InterfaceC1688a
    Collection<? extends InterfaceC1689b> g();

    a i();

    void w0(Collection<? extends InterfaceC1689b> collection);
}
