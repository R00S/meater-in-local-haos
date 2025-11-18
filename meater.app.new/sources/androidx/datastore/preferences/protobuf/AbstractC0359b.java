package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InterfaceC0405q0;

/* compiled from: AbstractParser.java */
/* renamed from: androidx.datastore.preferences.protobuf.b */
/* loaded from: classes.dex */
public abstract class AbstractC0359b<MessageType extends InterfaceC0405q0> implements InterfaceC0424y0<MessageType> {

    /* renamed from: a */
    private static final C0401p f2681a = C0401p.m3078b();

    /* renamed from: c */
    private MessageType m2572c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m2573d(messagetype).m2541a().m2540i(messagetype);
    }

    /* renamed from: d */
    private UninitializedMessageException m2573d(MessageType messagetype) {
        return messagetype instanceof AbstractC0356a ? ((AbstractC0356a) messagetype).m2547m() : new UninitializedMessageException(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0424y0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType mo2574a(AbstractC0377h abstractC0377h, C0401p c0401p) throws InvalidProtocolBufferException {
        return (MessageType) m2572c(m2576f(abstractC0377h, c0401p));
    }

    /* renamed from: f */
    public MessageType m2576f(AbstractC0377h abstractC0377h, C0401p c0401p) throws InvalidProtocolBufferException {
        try {
            AbstractC0383j abstractC0383jMo2729v = abstractC0377h.mo2729v();
            MessageType messagetypeMo3356b = mo3356b(abstractC0383jMo2729v, c0401p);
            try {
                abstractC0383jMo2729v.mo2859a(0);
                return messagetypeMo3356b;
            } catch (InvalidProtocolBufferException e2) {
                throw e2.m2540i(messagetypeMo3356b);
            }
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }
}
