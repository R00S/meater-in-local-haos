package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;

/* compiled from: AbstractParser.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10743b<MessageType extends InterfaceC10756o> implements InterfaceC10758q<MessageType> {

    /* renamed from: a */
    private static final C10747f f41257a = C10747f.m38347c();

    /* renamed from: e */
    private MessageType m38258e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m38259f(messagetype).m38254a().m38253i(messagetype);
    }

    /* renamed from: f */
    private UninitializedMessageException m38259f(MessageType messagetype) {
        return messagetype instanceof AbstractC10742a ? ((AbstractC10742a) messagetype).m38255a() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType mo38261c(InputStream inputStream, C10747f c10747f) throws InvalidProtocolBufferException {
        return (MessageType) m38258e(m38266j(inputStream, c10747f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType mo38260a(InputStream inputStream, C10747f c10747f) throws InvalidProtocolBufferException {
        return (MessageType) m38258e(m38267k(inputStream, c10747f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType mo38262d(AbstractC10745d abstractC10745d, C10747f c10747f) throws InvalidProtocolBufferException {
        return (MessageType) m38258e(m38268l(abstractC10745d, c10747f));
    }

    /* renamed from: j */
    public MessageType m38266j(InputStream inputStream, C10747f c10747f) throws IOException {
        try {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            return (MessageType) m38267k(new AbstractC10742a.a.C11581a(inputStream, C10746e.m38300B(i2, inputStream)), c10747f);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    /* renamed from: k */
    public MessageType m38267k(InputStream inputStream, C10747f c10747f) throws InvalidProtocolBufferException {
        C10746e c10746eM38308g = C10746e.m38308g(inputStream);
        MessageType messagetypeMo34086b = mo34086b(c10746eM38308g, c10747f);
        try {
            c10746eM38308g.m38326a(0);
            return messagetypeMo34086b;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.m38253i(messagetypeMo34086b);
        }
    }

    /* renamed from: l */
    public MessageType m38268l(AbstractC10745d abstractC10745d, C10747f c10747f) throws InvalidProtocolBufferException {
        try {
            C10746e c10746eMo38291v = abstractC10745d.mo38291v();
            MessageType messagetypeMo34086b = mo34086b(c10746eMo38291v, c10747f);
            try {
                c10746eMo38291v.m38326a(0);
                return messagetypeMo34086b;
            } catch (InvalidProtocolBufferException e2) {
                throw e2.m38253i(messagetypeMo34086b);
            }
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }
}
