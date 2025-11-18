package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public class zzfo extends IOException {

    /* renamed from: f */
    private zzgo f28142f;

    public zzfo(String str) {
        super(str);
        this.f28142f = null;
    }

    /* renamed from: a */
    static zzfo m22296a() {
        return new zzfo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzfo m22297b() {
        return new zzfo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzfo m22298c() {
        return new zzfo("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static zzfo m22299d() {
        return new zzfo("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static zzfo m22300e() {
        return new zzfo("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static zzfn m22301f() {
        return new zzfn("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static zzfo m22302g() {
        return new zzfo("Failed to parse the message.");
    }

    /* renamed from: h */
    static zzfo m22303h() {
        return new zzfo("Protocol message had invalid UTF-8.");
    }
}
