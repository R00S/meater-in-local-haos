package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.file.CacheHelper;
import com.google.android.gms.ads.AdRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzpi {

    /* renamed from: d */
    private static final SparseIntArray f26812d;

    /* renamed from: e */
    private static final SparseIntArray f26813e;

    /* renamed from: f */
    private static final Map<String, Integer> f26814f;

    /* renamed from: a */
    private static final zzpd f26809a = zzpd.m20361g("OMX.google.raw.decoder");

    /* renamed from: b */
    private static final Pattern f26810b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap<C7444a, List<zzpd>> f26811c = new HashMap<>();

    /* renamed from: g */
    private static int f26815g = -1;

    /* renamed from: com.google.android.gms.internal.ads.zzpi$a */
    static final class C7444a {

        /* renamed from: a */
        public final String f26816a;

        /* renamed from: b */
        public final boolean f26817b;

        public C7444a(String str, boolean z) {
            this.f26816a = str;
            this.f26817b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == C7444a.class) {
                C7444a c7444a = (C7444a) obj;
                if (TextUtils.equals(this.f26816a, c7444a.f26816a) && this.f26817b == c7444a.f26817b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f26816a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f26817b ? 1231 : 1237);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26812d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f26813e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, AdRequest.MAX_CONTENT_URL_LENGTH);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, RecyclerView.AbstractC0599l.FLAG_MOVED);
        sparseIntArray2.put(41, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, Http2.INITIAL_MAX_FRAME_SIZE);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        f26814f = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", Integer.valueOf(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT));
        map.put("L150", Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE));
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", Integer.valueOf(CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES));
        map.put("L183", 4194304);
        map.put("L186", Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE));
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH));
        map.put("H120", Integer.valueOf(RecyclerView.AbstractC0599l.FLAG_MOVED));
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m20380a(String str, String[] strArr) {
        Integer numValueOf;
        Integer numValueOf2;
        if (strArr.length < 2) {
            String strValueOf = String.valueOf(str);
            Log.w("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else {
                if (strArr.length < 3) {
                    String strValueOf2 = String.valueOf(str);
                    Log.w("MediaCodecUtil", strValueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                Integer numValueOf3 = Integer.valueOf(Integer.parseInt(strArr[1]));
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                numValueOf2 = numValueOf3;
            }
            Integer numValueOf4 = Integer.valueOf(f26812d.get(numValueOf2.intValue()));
            if (numValueOf4 == null) {
                String strValueOf3 = String.valueOf(numValueOf2);
                StringBuilder sb = new StringBuilder(strValueOf3.length() + 21);
                sb.append("Unknown AVC profile: ");
                sb.append(strValueOf3);
                Log.w("MediaCodecUtil", sb.toString());
                return null;
            }
            Integer numValueOf5 = Integer.valueOf(f26813e.get(numValueOf.intValue()));
            if (numValueOf5 != null) {
                return new Pair<>(numValueOf4, numValueOf5);
            }
            String strValueOf4 = String.valueOf(numValueOf);
            StringBuilder sb2 = new StringBuilder(strValueOf4.length() + 19);
            sb2.append("Unknown AVC level: ");
            sb2.append(strValueOf4);
            Log.w("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf5 = String.valueOf(str);
            Log.w("MediaCodecUtil", strValueOf5.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf5) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzpk.<init>(java.lang.Throwable, com.google.android.gms.internal.ads.p20):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.google.android.gms.internal.ads.zzpd> m20381b(com.google.android.gms.internal.ads.zzpi.C7444a r17, com.google.android.gms.internal.ads.q20 r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpi.m20381b(com.google.android.gms.internal.ads.zzpi$a, com.google.android.gms.internal.ads.q20):java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m20382c(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpi.m20382c(java.lang.String):android.util.Pair");
    }

    /* renamed from: d */
    public static zzpd m20383d(String str, boolean z) throws zzpk {
        List<zzpd> listM20384e = m20384e(str, z);
        if (listM20384e.isEmpty()) {
            return null;
        }
        return listM20384e.get(0);
    }

    /* renamed from: e */
    private static synchronized List<zzpd> m20384e(String str, boolean z) throws zzpk {
        C7444a c7444a = new C7444a(str, z);
        HashMap<C7444a, List<zzpd>> map = f26811c;
        List<zzpd> list = map.get(c7444a);
        if (list != null) {
            return list;
        }
        int i2 = zzsy.f27024a;
        List<zzpd> listM20381b = m20381b(c7444a, i2 >= 21 ? new s20(z) : new r20());
        if (z && listM20381b.isEmpty() && 21 <= i2 && i2 <= 23) {
            listM20381b = m20381b(c7444a, new r20());
            if (!listM20381b.isEmpty()) {
                String str2 = listM20381b.get(0).f26759a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                Log.w("MediaCodecUtil", sb.toString());
            }
        }
        List<zzpd> listUnmodifiableList = Collections.unmodifiableList(listM20381b);
        map.put(c7444a, listUnmodifiableList);
        return listUnmodifiableList;
    }

    /* renamed from: f */
    public static zzpd m20385f() {
        return f26809a;
    }

    /* renamed from: g */
    public static int m20386g() throws zzpk {
        if (f26815g == -1) {
            int iMax = 0;
            zzpd zzpdVarM20383d = m20383d("video/avc", false);
            if (zzpdVarM20383d != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM20368j = zzpdVarM20383d.m20368j();
                int length = codecProfileLevelArrM20368j.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArrM20368j[iMax].level;
                    int i3 = 9437184;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i3 = 101376;
                                break;
                            case 64:
                                i3 = 202752;
                                break;
                            case 128:
                            case 256:
                                i3 = 414720;
                                break;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i3 = 921600;
                                break;
                            case 1024:
                                i3 = 1310720;
                                break;
                            case RecyclerView.AbstractC0599l.FLAG_MOVED /* 2048 */:
                            case RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                                i3 = 2097152;
                                break;
                            case 8192:
                                i3 = 2228224;
                                break;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i3 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i3 = -1;
                                break;
                        }
                    } else {
                        i3 = 25344;
                    }
                    iMax2 = Math.max(i3, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, zzsy.f27024a >= 21 ? 345600 : 172800);
            }
            f26815g = iMax;
        }
        return f26815g;
    }
}
