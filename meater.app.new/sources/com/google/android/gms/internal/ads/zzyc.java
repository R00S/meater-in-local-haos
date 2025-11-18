package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzyc {

    /* renamed from: a */
    public static final zzyc f27446a = new zzyc();

    @VisibleForTesting
    protected zzyc() {
    }

    /* renamed from: a */
    public static zzxz m20820a(Context context, zzaaz zzaazVar) {
        Context context2;
        List listUnmodifiableList;
        String strM17302c;
        Date dateM16204a = zzaazVar.m16204a();
        long time = dateM16204a != null ? dateM16204a.getTime() : -1L;
        String strM16205b = zzaazVar.m16205b();
        int iM16208e = zzaazVar.m16208e();
        Set<String> setM16209f = zzaazVar.m16209f();
        if (setM16209f.isEmpty()) {
            context2 = context;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(setM16209f));
            context2 = context;
        }
        boolean zM16217n = zzaazVar.m16217n(context2);
        int iM16222s = zzaazVar.m16222s();
        Location locationM16210g = zzaazVar.m16210g();
        Bundle bundleM16214k = zzaazVar.m16214k(AdMobAdapter.class);
        boolean zM16211h = zzaazVar.m16211h();
        String strM16215l = zzaazVar.m16215l();
        SearchAdRequest searchAdRequestM16219p = zzaazVar.m16219p();
        zzaca zzacaVar = searchAdRequestM16219p != null ? new zzaca(searchAdRequestM16219p) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzyt.m20844a();
            strM17302c = zzazt.m17302c(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strM17302c = null;
        }
        return new zzxz(8, time, bundleM16214k, iM16208e, listUnmodifiableList, zM16217n, iM16222s, zM16211h, strM16215l, zzacaVar, locationM16210g, strM16205b, zzaazVar.m16221r(), zzaazVar.m16207d(), Collections.unmodifiableList(new ArrayList(zzaazVar.m16223t())), zzaazVar.m16218o(), strM17302c, zzaazVar.m16216m(), null, zzaazVar.m16224u(), zzaazVar.m16212i());
    }
}
