package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzazr {

    /* renamed from: b */
    private static List<MediaCodecInfo> f22726b;

    /* renamed from: a */
    private static Map<String, List<Map<String, Object>>> f22725a = new HashMap();

    /* renamed from: c */
    private static final Object f22727c = new Object();

    @TargetApi(21)
    /* renamed from: a */
    private static Integer[] m17290a(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }

    @TargetApi(16)
    /* renamed from: b */
    public static List<Map<String, Object>> m17291b(String str) {
        ArrayList arrayList;
        Object obj = f22727c;
        synchronized (obj) {
            if (f22725a.containsKey(str)) {
                return f22725a.get(str);
            }
            try {
                synchronized (obj) {
                    if (f22726b == null) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 21) {
                            f22726b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (i2 >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f22726b = new ArrayList(codecCount);
                            for (int i3 = 0; i3 < codecCount; i3++) {
                                f22726b.add(MediaCodecList.getCodecInfoAt(i3));
                            }
                        } else {
                            f22726b = Collections.emptyList();
                        }
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f22726b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap map = new HashMap();
                            map.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            map.put("profileLevels", arrayList2);
                            int i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 21) {
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                map.put("bitRatesBps", m17290a(videoCapabilities.getBitrateRange()));
                                map.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                map.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                map.put("frameRates", m17290a(videoCapabilities.getSupportedFrameRates()));
                                map.put("widths", m17290a(videoCapabilities.getSupportedWidths()));
                                map.put("heights", m17290a(videoCapabilities.getSupportedHeights()));
                            }
                            if (i4 >= 23) {
                                map.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            }
                            arrayList.add(map);
                        }
                    }
                    f22725a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e2) {
                HashMap map2 = new HashMap();
                map2.put("error", e2.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map2);
                f22725a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }
}
