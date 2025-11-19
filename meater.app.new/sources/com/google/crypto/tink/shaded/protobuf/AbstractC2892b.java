package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.P;

/* compiled from: AbstractParser.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2892b<MessageType extends P> implements Y<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final C2905o f37778a = C2905o.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.b()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof AbstractC2891a ? ((AbstractC2891a) messagetype).o() : new UninitializedMessageException(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Y
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(AbstractC2898h abstractC2898h, C2905o c2905o) {
        return (MessageType) c(f(abstractC2898h, c2905o));
    }

    public MessageType f(AbstractC2898h abstractC2898h, C2905o c2905o) throws InvalidProtocolBufferException {
        AbstractC2899i abstractC2899iB = abstractC2898h.B();
        MessageType messagetypeB = b(abstractC2899iB, c2905o);
        try {
            abstractC2899iB.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.k(messagetypeB);
        }
    }
}
