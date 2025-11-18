package com.google.protobuf;

import com.google.protobuf.P;

/* compiled from: AbstractParser.java */
/* renamed from: com.google.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2942b<MessageType extends P> implements Y<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final C2954n f39220a = C2954n.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.b()) {
            return messagetype;
        }
        throw d(messagetype).a().j(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof AbstractC2941a ? ((AbstractC2941a) messagetype).u() : new UninitializedMessageException(messagetype);
    }

    @Override // com.google.protobuf.Y
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(AbstractC2947g abstractC2947g, C2954n c2954n) {
        return (MessageType) c(f(abstractC2947g, c2954n));
    }

    public MessageType f(AbstractC2947g abstractC2947g, C2954n c2954n) throws InvalidProtocolBufferException {
        AbstractC2948h abstractC2948hZ = abstractC2947g.z();
        MessageType messagetypeB = b(abstractC2948hZ, c2954n);
        try {
            abstractC2948hZ.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.j(messagetypeB);
        }
    }
}
