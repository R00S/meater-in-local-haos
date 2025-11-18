package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.P;

/* compiled from: AbstractParser.java */
/* renamed from: androidx.datastore.preferences.protobuf.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2056b<MessageType extends P> implements Y<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final C2069o f24898a = C2069o.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.b()) {
            return messagetype;
        }
        throw d(messagetype).a().i(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof AbstractC2055a ? ((AbstractC2055a) messagetype).o() : new UninitializedMessageException(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(AbstractC2062h abstractC2062h, C2069o c2069o) {
        return (MessageType) c(f(abstractC2062h, c2069o));
    }

    public MessageType f(AbstractC2062h abstractC2062h, C2069o c2069o) throws InvalidProtocolBufferException {
        AbstractC2063i abstractC2063iB = abstractC2062h.B();
        MessageType messagetypeB = b(abstractC2063iB, c2069o);
        try {
            abstractC2063iB.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.i(messagetypeB);
        }
    }
}
