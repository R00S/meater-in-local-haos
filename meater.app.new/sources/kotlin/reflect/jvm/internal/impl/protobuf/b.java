package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: AbstractParser.java */
/* loaded from: classes3.dex */
public abstract class b<MessageType extends o> implements q<MessageType> {

    /* renamed from: a, reason: collision with root package name */
    private static final f f44020a = f.c();

    private MessageType e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.b()) {
            return messagetype;
        }
        throw f(messagetype).a().i(messagetype);
    }

    private UninitializedMessageException f(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).a() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType c(InputStream inputStream, f fVar) {
        return (MessageType) e(j(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType a(InputStream inputStream, f fVar) {
        return (MessageType) e(k(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType d(d dVar, f fVar) {
        return (MessageType) e(l(dVar, fVar));
    }

    public MessageType j(InputStream inputStream, f fVar) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return (MessageType) k(new a.AbstractC0582a.C0583a(inputStream, e.B(i10, inputStream)), fVar);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10.getMessage());
        }
    }

    public MessageType k(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        e eVarG = e.g(inputStream);
        MessageType messagetypeB = b(eVarG, fVar);
        try {
            eVarG.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.i(messagetypeB);
        }
    }

    public MessageType l(d dVar, f fVar) throws InvalidProtocolBufferException {
        e eVarB = dVar.B();
        MessageType messagetypeB = b(eVarB, fVar);
        try {
            eVarB.a(0);
            return messagetypeB;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.i(messagetypeB);
        }
    }
}
