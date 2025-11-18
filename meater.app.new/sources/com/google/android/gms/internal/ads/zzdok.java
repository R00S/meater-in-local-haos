package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzdok extends IOException {

    /* renamed from: f */
    private zzdpk f25777f;

    public zzdok(String str) {
        super(str);
        this.f25777f = null;
    }

    /* renamed from: a */
    static zzdok m19750a() {
        return new zzdok("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzdok m19751b() {
        return new zzdok("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzdok m19752c() {
        return new zzdok("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static zzdok m19753d() {
        return new zzdok("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static zzdok m19754e() {
        return new zzdok("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static zzdol m19755f() {
        return new zzdol("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static zzdok m19756g() {
        return new zzdok("Failed to parse the message.");
    }

    /* renamed from: h */
    static zzdok m19757h() {
        return new zzdok("Protocol message had invalid UTF-8.");
    }

    /* renamed from: i */
    public final zzdok m19758i(zzdpk zzdpkVar) {
        this.f25777f = zzdpkVar;
        return this;
    }
}
