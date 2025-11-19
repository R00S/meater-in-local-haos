package r8;

import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.P;
import java.security.GeneralSecurityException;

/* compiled from: KeyManagerImpl.java */
/* loaded from: classes2.dex */
class i<PrimitiveT, KeyProtoT extends P> implements h<PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.crypto.tink.internal.d<KeyProtoT> f48436a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f48437b;

    /* compiled from: KeyManagerImpl.java */
    private static class a<KeyFormatProtoT extends P, KeyProtoT extends P> {

        /* renamed from: a, reason: collision with root package name */
        final d.a<KeyFormatProtoT, KeyProtoT> f48438a;

        a(d.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f48438a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.f48438a.e(keyformatprotot);
            return (KeyProtoT) this.f48438a.a(keyformatprotot);
        }

        KeyProtoT a(AbstractC2898h abstractC2898h) {
            return (KeyProtoT) b(this.f48438a.d(abstractC2898h));
        }
    }

    public i(com.google.crypto.tink.internal.d<KeyProtoT> dVar, Class<PrimitiveT> cls) {
        if (!dVar.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dVar.toString(), cls.getName()));
        }
        this.f48436a = dVar;
        this.f48437b = cls;
    }

    private a<?, KeyProtoT> e() {
        return new a<>(this.f48436a.f());
    }

    private PrimitiveT f(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.f48437b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f48436a.j(keyprotot);
        return (PrimitiveT) this.f48436a.e(keyprotot, this.f48437b);
    }

    @Override // r8.h
    public final P a(AbstractC2898h abstractC2898h) throws GeneralSecurityException {
        try {
            return e().a(abstractC2898h);
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f48436a.f().b().getName(), e10);
        }
    }

    @Override // r8.h
    public final D8.y b(AbstractC2898h abstractC2898h) throws GeneralSecurityException {
        try {
            return D8.y.g0().E(c()).F(e().a(abstractC2898h).i()).D(this.f48436a.g()).e();
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // r8.h
    public final String c() {
        return this.f48436a.d();
    }

    @Override // r8.h
    public final PrimitiveT d(AbstractC2898h abstractC2898h) throws GeneralSecurityException {
        try {
            return f(this.f48436a.h(abstractC2898h));
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f48436a.c().getName(), e10);
        }
    }
}
