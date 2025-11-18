package cm.aptoide.p092pt.networking.image;

import android.content.Context;
import com.bumptech.glide.C5350d;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.EnumC5366b;
import com.bumptech.glide.load.engine.p123a0.C5378g;
import com.bumptech.glide.load.engine.p123a0.C5380i;
import com.bumptech.glide.load.engine.p126z.C5419k;
import com.bumptech.glide.p139n.InterfaceC5549b;
import com.bumptech.glide.p141p.C5565h;

/* loaded from: classes.dex */
public class GlideModifications implements InterfaceC5549b {
    @Override // com.bumptech.glide.p139n.InterfaceC5549b
    public void applyOptions(Context context, C5350d c5350d) {
        c5350d.m9994c(C5565h.m10945u0(EnumC5366b.PREFER_RGB_565));
        C5380i c5380iM10206a = new C5380i.a(context).m10206a();
        c5350d.m9995d(new C5378g(c5380iM10206a.m10205d()));
        c5350d.m9993b(new C5419k(c5380iM10206a.m10204b()));
    }

    @Override // com.bumptech.glide.p139n.InterfaceC5549b
    public void registerComponents(Context context, ComponentCallbacks2C5349c componentCallbacks2C5349c, Registry registry) {
    }
}
