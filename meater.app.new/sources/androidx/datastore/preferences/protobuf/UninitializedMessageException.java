package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: B, reason: collision with root package name */
    private final List<String> f24892B;

    public UninitializedMessageException(P p10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f24892B = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
