package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    NetworkPolicy(int i2) {
        this.index = i2;
    }

    public static boolean isOfflineOnly(int i2) {
        return (i2 & OFFLINE.index) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i2) {
        return (i2 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i2) {
        return (i2 & NO_STORE.index) == 0;
    }
}
