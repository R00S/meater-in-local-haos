package y6;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import m6.C3972g;
import m6.EnumC3968c;
import m6.InterfaceC3975j;
import o6.InterfaceC4139c;

/* compiled from: GifDrawableEncoder.java */
/* renamed from: y6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5132d implements InterfaceC3975j<C5131c> {
    @Override // m6.InterfaceC3975j
    public EnumC3968c b(C3972g c3972g) {
        return EnumC3968c.SOURCE;
    }

    @Override // m6.InterfaceC3969d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(InterfaceC4139c<C5131c> interfaceC4139c, File file, C3972g c3972g) throws Throwable {
        try {
            H6.a.f(interfaceC4139c.get().c(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
