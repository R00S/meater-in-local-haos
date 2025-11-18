package com.bumptech.glide;

import com.bumptech.glide.l;

/* compiled from: TransitionOptions.java */
/* loaded from: classes2.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: B, reason: collision with root package name */
    private F6.c<? super TranscodeType> f33016B = F6.a.b();

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    final F6.c<? super TranscodeType> c() {
        return this.f33016B;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return H6.l.d(this.f33016B, ((l) obj).f33016B);
        }
        return false;
    }

    public int hashCode() {
        F6.c<? super TranscodeType> cVar = this.f33016B;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
