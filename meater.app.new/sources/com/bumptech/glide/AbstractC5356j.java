package com.bumptech.glide;

import com.bumptech.glide.AbstractC5356j;
import com.bumptech.glide.p141p.p143m.C5581c;
import com.bumptech.glide.p141p.p143m.InterfaceC5583e;
import com.bumptech.glide.p145r.C5596j;

/* compiled from: TransitionOptions.java */
/* renamed from: com.bumptech.glide.j */
/* loaded from: classes.dex */
public abstract class AbstractC5356j<CHILD extends AbstractC5356j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: f */
    private InterfaceC5583e<? super TranscodeType> f13125f = C5581c.m11008c();

    /* renamed from: e */
    private CHILD m10049e() {
        return this;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: d */
    final InterfaceC5583e<? super TranscodeType> m10051d() {
        return this.f13125f;
    }

    /* renamed from: f */
    public final CHILD m10052f(InterfaceC5583e<? super TranscodeType> interfaceC5583e) {
        this.f13125f = (InterfaceC5583e) C5596j.m11042d(interfaceC5583e);
        return (CHILD) m10049e();
    }
}
