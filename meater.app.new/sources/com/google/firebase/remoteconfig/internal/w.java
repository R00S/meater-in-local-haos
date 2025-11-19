package com.google.firebase.remoteconfig.internal;

/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* loaded from: classes2.dex */
public class w implements E9.j {

    /* renamed from: a, reason: collision with root package name */
    private final String f38783a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38784b;

    w(String str, int i10) {
        this.f38783a = str;
        this.f38784b = i10;
    }

    private String a() {
        return m().trim();
    }

    private void b() {
        if (this.f38783a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // E9.j
    public int j() {
        return this.f38784b;
    }

    @Override // E9.j
    public long k() {
        if (this.f38784b == 0) {
            return 0L;
        }
        String strA = a();
        try {
            return Long.valueOf(strA).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, "long"), e10);
        }
    }

    @Override // E9.j
    public double l() {
        if (this.f38784b == 0) {
            return 0.0d;
        }
        String strA = a();
        try {
            return Double.valueOf(strA).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, "double"), e10);
        }
    }

    @Override // E9.j
    public String m() {
        if (this.f38784b == 0) {
            return "";
        }
        b();
        return this.f38783a;
    }

    @Override // E9.j
    public boolean n() {
        if (this.f38784b == 0) {
            return false;
        }
        String strA = a();
        if (o.f38722f.matcher(strA).matches()) {
            return true;
        }
        if (o.f38723g.matcher(strA).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strA, "boolean"));
    }
}
