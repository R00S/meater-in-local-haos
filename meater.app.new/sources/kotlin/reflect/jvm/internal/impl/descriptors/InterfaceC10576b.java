package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* compiled from: CallableMemberDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b */
/* loaded from: classes2.dex */
public interface InterfaceC10576b extends InterfaceC10573a, InterfaceC10580c0 {

    /* compiled from: CallableMemberDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: g */
        public boolean m37667g() {
            return this != FAKE_OVERRIDE;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    InterfaceC10576b mo37019a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: e */
    Collection<? extends InterfaceC10576b> mo37027e();

    /* renamed from: i */
    a mo37030i();

    /* renamed from: k0 */
    InterfaceC10576b mo36990k0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, a aVar, boolean z);

    /* renamed from: x0 */
    void mo36993x0(Collection<? extends InterfaceC10576b> collection);
}
