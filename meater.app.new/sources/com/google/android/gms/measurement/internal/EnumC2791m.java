package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
enum EnumC2791m {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* renamed from: B, reason: collision with root package name */
    private final char f35456B;

    EnumC2791m(char c10) {
        this.f35456B = c10;
    }

    public static EnumC2791m j(char c10) {
        for (EnumC2791m enumC2791m : values()) {
            if (enumC2791m.f35456B == c10) {
                return enumC2791m;
            }
        }
        return UNSET;
    }
}
