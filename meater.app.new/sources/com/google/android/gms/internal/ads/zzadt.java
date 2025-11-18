package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzadt extends zzaeb {

    /* renamed from: f */
    private static final int f21941f;

    /* renamed from: g */
    private static final int f21942g;

    /* renamed from: h */
    private static final int f21943h;

    /* renamed from: i */
    private static final int f21944i;

    /* renamed from: j */
    private final String f21945j;

    /* renamed from: k */
    private final List<zzadw> f21946k = new ArrayList();

    /* renamed from: l */
    private final List<zzaei> f21947l = new ArrayList();

    /* renamed from: m */
    private final int f21948m;

    /* renamed from: n */
    private final int f21949n;

    /* renamed from: o */
    private final int f21950o;

    /* renamed from: p */
    private final int f21951p;

    /* renamed from: q */
    private final int f21952q;

    /* renamed from: r */
    private final boolean f21953r;

    static {
        int iRgb = Color.rgb(12, 174, 206);
        f21941f = iRgb;
        int iRgb2 = Color.rgb(204, 204, 204);
        f21942g = iRgb2;
        f21943h = iRgb2;
        f21944i = iRgb;
    }

    public zzadt(String str, List<zzadw> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.f21945j = str;
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                zzadw zzadwVar = list.get(i4);
                this.f21946k.add(zzadwVar);
                this.f21947l.add(zzadwVar);
            }
        }
        this.f21948m = num != null ? num.intValue() : f21943h;
        this.f21949n = num2 != null ? num2.intValue() : f21944i;
        this.f21950o = num3 != null ? num3.intValue() : 12;
        this.f21951p = i2;
        this.f21952q = i3;
        this.f21953r = z;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    /* renamed from: M0 */
    public final List<zzaei> mo16459M0() {
        return this.f21947l;
    }

    /* renamed from: i7 */
    public final int m16460i7() {
        return this.f21948m;
    }

    /* renamed from: j7 */
    public final int m16461j7() {
        return this.f21949n;
    }

    /* renamed from: k7 */
    public final int m16462k7() {
        return this.f21950o;
    }

    /* renamed from: l7 */
    public final List<zzadw> m16463l7() {
        return this.f21946k;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    /* renamed from: m1 */
    public final String mo16464m1() {
        return this.f21945j;
    }

    /* renamed from: m7 */
    public final int m16465m7() {
        return this.f21951p;
    }

    /* renamed from: n7 */
    public final int m16466n7() {
        return this.f21952q;
    }
}
