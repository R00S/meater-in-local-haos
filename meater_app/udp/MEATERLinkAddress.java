package com.apptionlabs.meater_app.udp;

import gg.a;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Objects;
import k6.b;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERLinkAddress {

    /* renamed from: a, reason: collision with root package name */
    @a
    private final String f10161a;

    /* renamed from: b, reason: collision with root package name */
    @a
    private final int f10162b;

    public MEATERLinkAddress(String str, int i10) {
        this.f10161a = str;
        this.f10162b = i10;
    }

    public InetAddress a() {
        try {
            return InetAddress.getByName(b().replace("/", ""));
        } catch (UnknownHostException e10) {
            b.n("MEATERLinkAddress InetAddress.getByName failed: " + e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public String b() {
        return this.f10161a;
    }

    public int c() {
        return this.f10162b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MEATERLinkAddress)) {
            return false;
        }
        MEATERLinkAddress mEATERLinkAddress = (MEATERLinkAddress) obj;
        if (!Objects.equals(mEATERLinkAddress.b(), this.f10161a) || mEATERLinkAddress.f10162b != this.f10162b) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f10161a + ":" + this.f10162b;
    }
}
