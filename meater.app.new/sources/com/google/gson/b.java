package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: FieldAttributes.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Field f38840a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f38840a = field;
    }

    public String toString() {
        return this.f38840a.toString();
    }
}
