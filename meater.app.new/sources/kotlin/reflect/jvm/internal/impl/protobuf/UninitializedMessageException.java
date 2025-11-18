package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: f */
    private final List<String> f41254f;

    public UninitializedMessageException(InterfaceC10756o interfaceC10756o) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f41254f = null;
    }

    /* renamed from: a */
    public InvalidProtocolBufferException m38254a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
