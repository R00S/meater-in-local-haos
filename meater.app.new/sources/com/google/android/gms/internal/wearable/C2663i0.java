package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.AbstractC2672l0;
import com.google.android.gms.internal.wearable.C2663i0;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2663i0<MessageType extends AbstractC2672l0<MessageType, BuilderType>, BuilderType extends C2663i0<MessageType, BuilderType>> extends A<MessageType, BuilderType> {

    /* renamed from: B, reason: collision with root package name */
    private final AbstractC2672l0 f34634B;

    /* renamed from: C, reason: collision with root package name */
    protected AbstractC2672l0 f34635C;

    protected C2663i0(MessageType messagetype) {
        this.f34634B = messagetype;
        if (messagetype.A()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f34635C = messagetype.k();
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C2663i0 clone() {
        C2663i0 c2663i0 = (C2663i0) this.f34634B.g(5, null, null);
        c2663i0.f34635C = z();
        return c2663i0;
    }

    public final MessageType i() {
        MessageType messagetype = (MessageType) z();
        if (AbstractC2672l0.y(messagetype, true)) {
            return messagetype;
        }
        throw new zzeo(messagetype);
    }

    @Override // com.google.android.gms.internal.wearable.M0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public MessageType z() {
        if (!this.f34635C.A()) {
            return (MessageType) this.f34635C;
        }
        this.f34635C.u();
        return (MessageType) this.f34635C;
    }

    @Override // com.google.android.gms.internal.wearable.O0
    public final boolean l() {
        return AbstractC2672l0.y(this.f34635C, false);
    }

    protected final void o() {
        if (this.f34635C.A()) {
            return;
        }
        p();
    }

    protected void p() {
        AbstractC2672l0 abstractC2672l0K = this.f34634B.k();
        W0.a().b(abstractC2672l0K.getClass()).f(abstractC2672l0K, this.f34635C);
        this.f34635C = abstractC2672l0K;
    }
}
