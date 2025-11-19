package com.google.crypto.tink.internal;

import D8.I;
import D8.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC2898h;
import java.security.GeneralSecurityException;

/* compiled from: ProtoKeySerialization.java */
/* loaded from: classes2.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    private final String f37680a;

    /* renamed from: b, reason: collision with root package name */
    private final F8.a f37681b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2898h f37682c;

    /* renamed from: d, reason: collision with root package name */
    private final y.c f37683d;

    /* renamed from: e, reason: collision with root package name */
    private final I f37684e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f37685f;

    private o(String str, AbstractC2898h abstractC2898h, y.c cVar, I i10, Integer num) {
        this.f37680a = str;
        this.f37681b = s.e(str);
        this.f37682c = abstractC2898h;
        this.f37683d = cVar;
        this.f37684e = i10;
        this.f37685f = num;
    }

    public static o b(String str, AbstractC2898h abstractC2898h, y.c cVar, I i10, Integer num) throws GeneralSecurityException {
        if (i10 == I.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, abstractC2898h, cVar, i10, num);
    }

    @Override // com.google.crypto.tink.internal.q
    public F8.a a() {
        return this.f37681b;
    }

    public Integer c() {
        return this.f37685f;
    }

    public y.c d() {
        return this.f37683d;
    }

    public I e() {
        return this.f37684e;
    }

    public String f() {
        return this.f37680a;
    }

    public AbstractC2898h g() {
        return this.f37682c;
    }
}
