package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: f */
    private InterfaceC0405q0 f2671f;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f2671f = null;
    }

    /* renamed from: a */
    static InvalidProtocolBufferException m2530a() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    static InvalidProtocolBufferException m2531b() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static InvalidProtocolBufferException m2532c() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static InvalidWireTypeException m2533d() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    static InvalidProtocolBufferException m2534e() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static InvalidProtocolBufferException m2535f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    static InvalidProtocolBufferException m2536g() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: h */
    static InvalidProtocolBufferException m2537h() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: j */
    static InvalidProtocolBufferException m2538j() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: k */
    static InvalidProtocolBufferException m2539k() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: i */
    public InvalidProtocolBufferException m2540i(InterfaceC0405q0 interfaceC0405q0) {
        this.f2671f = interfaceC0405q0;
        return this;
    }
}
