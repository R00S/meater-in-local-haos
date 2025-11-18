package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@zzard
@TargetApi(14)
/* loaded from: classes.dex */
public abstract class zzbco extends TextureView implements InterfaceC6701g8 {

    /* renamed from: f */
    protected final zzbcy f22786f;

    /* renamed from: g */
    protected final zzbdi f22787g;

    public zzbco(Context context) {
        super(context);
        this.f22786f = new zzbcy();
        this.f22787g = new zzbdi(context, this);
    }

    /* renamed from: b */
    public abstract void mo15161b();

    /* renamed from: c */
    public abstract void mo17408c();

    /* renamed from: d */
    public abstract void mo17409d();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    /* renamed from: h */
    public abstract void mo17410h(int i2);

    /* renamed from: i */
    public abstract void mo17411i();

    /* renamed from: j */
    public abstract void mo17412j(float f2, float f3);

    /* renamed from: k */
    public abstract void mo17413k(zzbcn zzbcnVar);

    /* renamed from: l */
    public void mo17425l(String str, String[] strArr) {
        setVideoPath(str);
    }

    /* renamed from: m */
    public void mo17426m(int i2) {
    }

    /* renamed from: n */
    public void mo17427n(int i2) {
    }

    /* renamed from: o */
    public void mo17428o(int i2) {
    }

    /* renamed from: p */
    public void mo17429p(int i2) {
    }

    /* renamed from: q */
    public void mo17430q(int i2) {
    }

    /* renamed from: r */
    public abstract String mo17414r();

    public abstract void setVideoPath(String str);
}
