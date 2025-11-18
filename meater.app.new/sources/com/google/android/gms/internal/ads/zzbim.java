package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzbim extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f23067a;

    /* renamed from: b */
    private Context f23068b;

    /* renamed from: c */
    private Context f23069c;

    public zzbim(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Context m17733a() {
        return this.f23069c;
    }

    /* renamed from: b */
    public final Activity m17734b() {
        return this.f23067a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f23069c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f23068b = applicationContext;
        this.f23067a = context instanceof Activity ? (Activity) context : null;
        this.f23069c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f23067a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f23068b.startActivity(intent);
        }
    }
}
