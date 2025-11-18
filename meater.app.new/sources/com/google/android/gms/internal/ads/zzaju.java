package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@zzard
/* loaded from: classes2.dex */
public class zzaju<ReferenceT> implements zzajt {

    /* renamed from: f */
    private final Map<String, CopyOnWriteArrayList<zzaho<? super ReferenceT>>> f22072f = new HashMap();

    /* renamed from: g */
    private ReferenceT f22073g;

    /* renamed from: g0 */
    private final synchronized void m16615g0(String str, final Map<String, String> map) {
        if (zzbad.m17345a(2)) {
            String strValueOf = String.valueOf(str);
            zzawz.m17082m(strValueOf.length() != 0 ? "Received GMSG: ".concat(strValueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                zzawz.m17082m(sb.toString());
            }
        }
        CopyOnWriteArrayList<zzaho<? super ReferenceT>> copyOnWriteArrayList = this.f22072f.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator<zzaho<? super ReferenceT>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                final zzaho<? super ReferenceT> next = it.next();
                zzbbm.f22757a.execute(new Runnable(this, next, map) { // from class: com.google.android.gms.internal.ads.a1

                    /* renamed from: f */
                    private final zzaju f18066f;

                    /* renamed from: g */
                    private final zzaho f18067g;

                    /* renamed from: h */
                    private final Map f18068h;

                    {
                        this.f18066f = this;
                        this.f18067g = next;
                        this.f18068h = map;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18066f.m16617L(this.f18067g, this.f18068h);
                    }
                });
            }
        }
    }

    /* renamed from: B */
    public final synchronized void m16616B() {
        this.f22072f.clear();
    }

    /* renamed from: L */
    final /* synthetic */ void m16617L(zzaho zzahoVar, Map map) {
        zzahoVar.mo14739a(this.f22073g, map);
    }

    /* renamed from: f */
    public final synchronized void m16618f(String str, zzaho<? super ReferenceT> zzahoVar) {
        CopyOnWriteArrayList<zzaho<? super ReferenceT>> copyOnWriteArrayList = this.f22072f.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f22072f.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzahoVar);
    }

    /* renamed from: i */
    public final synchronized void m16619i(String str, zzaho<? super ReferenceT> zzahoVar) {
        CopyOnWriteArrayList<zzaho<? super ReferenceT>> copyOnWriteArrayList = this.f22072f.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.remove(zzahoVar);
    }

    /* renamed from: r0 */
    public final void m16620r0(ReferenceT referencet) {
        this.f22073g = referencet;
    }

    /* renamed from: t */
    public final synchronized void m16621t(String str, Predicate<zzaho<? super ReferenceT>> predicate) {
        CopyOnWriteArrayList<zzaho<? super ReferenceT>> copyOnWriteArrayList = this.f22072f.get(str);
        if (copyOnWriteArrayList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzaho<? super ReferenceT> zzahoVar = (zzaho) it.next();
            if (predicate.mo14652a(zzahoVar)) {
                arrayList.add(zzahoVar);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    /* renamed from: u */
    public final boolean mo16614u(String str) {
        return str != null && m16622w0(Uri.parse(str));
    }

    /* renamed from: w0 */
    public final boolean m16622w0(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        m16623y0(uri);
        return true;
    }

    /* renamed from: y0 */
    public final void m16623y0(Uri uri) {
        String path = uri.getPath();
        zzk.zzlg();
        m16615g0(path, zzaxi.m17139X(uri));
    }
}
