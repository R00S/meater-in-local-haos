package mc;

import ic.C3696d;
import ic.InterfaceC3693a;
import ic.InterfaceC3698f;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import lc.InterfaceC3942b;

/* compiled from: AbstractPolymorphicSerializer.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lmc/b;", "", "T", "Lic/a;", "<init>", "()V", "Llc/c;", "encoder", "value", "Loa/F;", "a", "(Llc/c;Ljava/lang/Object;)V", "Lic/f;", "e", "(Llc/c;Ljava/lang/Object;)Lic/f;", "LIa/d;", "f", "()LIa/d;", "baseClass", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4022b<T> implements InterfaceC3693a<T> {
    @Override // ic.InterfaceC3698f
    public final void a(lc.c encoder, T value) {
        C3862t.g(encoder, "encoder");
        C3862t.g(value, "value");
        InterfaceC3698f<? super T> interfaceC3698fA = C3696d.a(this, encoder, value);
        kc.f descriptor = getDescriptor();
        InterfaceC3942b interfaceC3942bB = encoder.b(descriptor);
        interfaceC3942bB.r(getDescriptor(), 0, interfaceC3698fA.getDescriptor().getSerialName());
        kc.f descriptor2 = getDescriptor();
        C3862t.e(interfaceC3698fA, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        interfaceC3942bB.j(descriptor2, 1, interfaceC3698fA, value);
        interfaceC3942bB.p(descriptor);
    }

    public InterfaceC3698f<T> e(lc.c encoder, T value) {
        C3862t.g(encoder, "encoder");
        C3862t.g(value, "value");
        return encoder.n().a(f(), value);
    }

    public abstract Ia.d<T> f();
}
