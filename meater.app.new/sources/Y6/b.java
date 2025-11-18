package Y6;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes2.dex */
final class b extends Thread {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ Map f19445B;

    b(a aVar, Map map) {
        this.f19445B = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f19445B;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        d.a(builderBuildUpon.build().toString());
    }
}
