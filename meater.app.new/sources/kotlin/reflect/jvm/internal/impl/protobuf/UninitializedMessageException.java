package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: B, reason: collision with root package name */
    private final List<String> f44017B;

    public UninitializedMessageException(o oVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f44017B = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
