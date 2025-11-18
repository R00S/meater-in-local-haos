package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzgx {

    /* renamed from: a */
    private static final HashMap<C7443a, Pair<String, MediaCodecInfo.CodecCapabilities>> f26167a = new HashMap<>();

    /* renamed from: com.google.android.gms.internal.ads.zzgx$a */
    static final class C7443a {

        /* renamed from: a */
        public final String f26168a;

        /* renamed from: b */
        public final boolean f26169b;

        public C7443a(String str, boolean z) {
            this.f26168a = str;
            this.f26169b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == C7443a.class) {
                C7443a c7443a = (C7443a) obj;
                if (TextUtils.equals(this.f26168a, c7443a.f26168a) && this.f26169b == c7443a.f26169b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f26168a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f26169b ? 1231 : 1237);
        }
    }

    /* renamed from: a */
    private static Pair<String, MediaCodecInfo.CodecCapabilities> m20011a(C7443a c7443a, InterfaceC6728gz interfaceC6728gz) throws zzgz {
        try {
            String str = c7443a.f26168a;
            int iMo15242c = interfaceC6728gz.mo15242c();
            boolean zMo15241b = interfaceC6728gz.mo15241b();
            boolean z = false;
            int i2 = 0;
            while (i2 < iMo15242c) {
                MediaCodecInfo mediaCodecInfoMo15240a = interfaceC6728gz.mo15240a(i2);
                String name = mediaCodecInfoMo15240a.getName();
                if (!mediaCodecInfoMo15240a.isEncoder() && name.startsWith("OMX.") && (zMo15241b || !name.endsWith(".secure"))) {
                    String[] supportedTypes = mediaCodecInfoMo15240a.getSupportedTypes();
                    int i3 = 0;
                    while (i3 < supportedTypes.length) {
                        String str2 = supportedTypes[i3];
                        if (str2.equalsIgnoreCase(str)) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo15240a.getCapabilitiesForType(str2);
                            boolean zMo15243d = interfaceC6728gz.mo15243d(c7443a.f26168a, capabilitiesForType);
                            if (zMo15241b) {
                                f26167a.put(c7443a.f26169b == zMo15243d ? c7443a : new C7443a(str, zMo15243d), Pair.create(name, capabilitiesForType));
                            } else {
                                HashMap<C7443a, Pair<String, MediaCodecInfo.CodecCapabilities>> map = f26167a;
                                map.put(c7443a.f26169b ? new C7443a(str, z) : c7443a, Pair.create(name, capabilitiesForType));
                                if (zMo15243d) {
                                    map.put(c7443a.f26169b ? c7443a : new C7443a(str, true), Pair.create(name.concat(".secure"), capabilitiesForType));
                                }
                            }
                            HashMap<C7443a, Pair<String, MediaCodecInfo.CodecCapabilities>> map2 = f26167a;
                            if (map2.containsKey(c7443a)) {
                                return map2.get(c7443a);
                            }
                        }
                        i3++;
                        z = false;
                    }
                }
                i2++;
                z = false;
            }
            return null;
        } catch (Exception e2) {
            throw new zzgz(e2);
        }
    }

    /* renamed from: b */
    public static zzgc m20012b(String str, boolean z) throws zzgz {
        Pair<String, MediaCodecInfo.CodecCapabilities> pairM20013c = m20013c(str, z);
        if (pairM20013c == null) {
            return null;
        }
        return new zzgc((String) pairM20013c.first, zzkq.f26428a >= 19 ? ((MediaCodecInfo.CodecCapabilities) pairM20013c.second).isFeatureSupported("adaptive-playback") : false);
    }

    /* renamed from: c */
    private static synchronized Pair<String, MediaCodecInfo.CodecCapabilities> m20013c(String str, boolean z) throws zzgz {
        C7443a c7443a = new C7443a(str, z);
        HashMap<C7443a, Pair<String, MediaCodecInfo.CodecCapabilities>> map = f26167a;
        if (map.containsKey(c7443a)) {
            return map.get(c7443a);
        }
        int i2 = zzkq.f26428a;
        Pair<String, MediaCodecInfo.CodecCapabilities> pairM20011a = m20011a(c7443a, i2 >= 21 ? new C6802iz(z) : new C6765hz());
        if (z && pairM20011a == null && i2 >= 21 && (pairM20011a = m20011a(c7443a, new C6765hz())) != null) {
            String str2 = (String) pairM20011a.first;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
            sb.append("MediaCodecList API didn't list secure decoder for: ");
            sb.append(str);
            sb.append(". Assuming: ");
            sb.append(str2);
            Log.w("MediaCodecUtil", sb.toString());
        }
        return pairM20011a;
    }
}
