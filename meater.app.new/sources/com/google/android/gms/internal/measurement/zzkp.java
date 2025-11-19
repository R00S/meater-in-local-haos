package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public class zzkp extends IOException {
    public zzkp(String str) {
        super(str);
    }

    static zzko a() {
        return new zzko("Protocol message tag had invalid wire type.");
    }

    static zzkp b() {
        return new zzkp("Protocol message contained an invalid tag (zero).");
    }

    static zzkp c() {
        return new zzkp("Protocol message had invalid UTF-8.");
    }

    static zzkp d() {
        return new zzkp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzkp e() {
        return new zzkp("Failed to parse the message.");
    }

    static zzkp f() {
        return new zzkp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static zzkp g() {
        return new zzkp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
