package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: f */
    private final List<String> f2672f;

    public UninitializedMessageException(InterfaceC0405q0 interfaceC0405q0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f2672f = null;
    }

    /* renamed from: a */
    public InvalidProtocolBufferException m2541a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
