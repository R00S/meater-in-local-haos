package com.google.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public class UninitializedMessageException extends RuntimeException {

    /* renamed from: B, reason: collision with root package name */
    private final List<String> f39213B;

    public UninitializedMessageException(P p10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f39213B = null;
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
