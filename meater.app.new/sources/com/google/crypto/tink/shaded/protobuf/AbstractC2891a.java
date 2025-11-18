package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC2891a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2891a.AbstractC0485a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import com.google.crypto.tink.shaded.protobuf.P;
import java.io.IOException;

/* compiled from: AbstractMessageLite.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2891a<MessageType extends AbstractC2891a<MessageType, BuilderType>, BuilderType extends AbstractC0485a<MessageType, BuilderType>> implements P {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0485a<MessageType extends AbstractC2891a<MessageType, BuilderType>, BuilderType extends AbstractC0485a<MessageType, BuilderType>> implements P.a {
        protected static UninitializedMessageException o(P p10) {
            return new UninitializedMessageException(p10);
        }

        protected abstract BuilderType m(MessageType messagetype);

        @Override // com.google.crypto.tink.shaded.protobuf.P.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public BuilderType G0(P p10) {
            if (c().getClass().isInstance(p10)) {
                return (BuilderType) m((AbstractC2891a) p10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int a() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public AbstractC2898h i() {
        try {
            AbstractC2898h.C0486h c0486hA = AbstractC2898h.A(f());
            k(c0486hA.b());
            return c0486hA.a();
        } catch (IOException e10) {
            throw new RuntimeException(n("ByteString"), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public byte[] l() {
        try {
            byte[] bArr = new byte[f()];
            CodedOutputStream codedOutputStreamC0 = CodedOutputStream.c0(bArr);
            k(codedOutputStreamC0);
            codedOutputStreamC0.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(n("byte array"), e10);
        }
    }

    int m(f0 f0Var) {
        int iA = a();
        if (iA != -1) {
            return iA;
        }
        int iE = f0Var.e(this);
        p(iE);
        return iE;
    }

    UninitializedMessageException o() {
        return new UninitializedMessageException(this);
    }

    void p(int i10) {
        throw new UnsupportedOperationException();
    }
}
