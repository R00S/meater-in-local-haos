package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes3.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: f */
    private InterfaceC10756o f41253f;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f41253f = null;
    }

    /* renamed from: b */
    static InvalidProtocolBufferException m38243b() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static InvalidProtocolBufferException m38244c() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static InvalidProtocolBufferException m38245d() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static InvalidProtocolBufferException m38246e() {
        return new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    static InvalidProtocolBufferException m38247f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    static InvalidProtocolBufferException m38248g() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    static InvalidProtocolBufferException m38249h() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: j */
    static InvalidProtocolBufferException m38250j() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: k */
    static InvalidProtocolBufferException m38251k() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public InterfaceC10756o m38252a() {
        return this.f41253f;
    }

    /* renamed from: i */
    public InvalidProtocolBufferException m38253i(InterfaceC10756o interfaceC10756o) {
        this.f41253f = interfaceC10756o;
        return this;
    }
}
