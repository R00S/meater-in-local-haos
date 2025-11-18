package com.bumptech.glide.load.p131o.p136g;

import android.util.Log;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5367c;
import com.bumptech.glide.load.InterfaceC5428k;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.p145r.C5587a;
import java.io.File;
import java.io.IOException;

/* compiled from: GifDrawableEncoder.java */
/* renamed from: com.bumptech.glide.load.o.g.d */
/* loaded from: classes.dex */
public class C5518d implements InterfaceC5428k<C5517c> {
    @Override // com.bumptech.glide.load.InterfaceC5428k
    /* renamed from: b */
    public EnumC5367c mo10454b(C5426i c5426i) {
        return EnumC5367c.SOURCE;
    }

    @Override // com.bumptech.glide.load.InterfaceC5368d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo10155a(InterfaceC5404u<C5517c> interfaceC5404u, File file, C5426i c5426i) throws Throwable {
        try {
            C5587a.m11017d(interfaceC5404u.get().m10740c(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }
}
