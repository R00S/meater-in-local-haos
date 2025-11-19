package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class W2 implements X2 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f33922a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, String> f33923b = null;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, Boolean> f33924c = new HashMap<>(16, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Integer> f33925d = new HashMap<>(16, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, Long> f33926e = new HashMap<>(16, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, Float> f33927f = new HashMap<>(16, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private Object f33928g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33929h = false;

    /* renamed from: i, reason: collision with root package name */
    private String[] f33930i = new String[0];

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC2458d3 f33931j = new C2449c3();

    @Override // com.google.android.gms.internal.measurement.X2
    public final String a(ContentResolver contentResolver, String str, String str2) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                if (this.f33923b == null) {
                    this.f33922a.set(false);
                    this.f33923b = new HashMap<>(16, 1.0f);
                    this.f33928g = new Object();
                    contentResolver.registerContentObserver(V2.f33905a, true, new Y2(this, null));
                } else if (this.f33922a.getAndSet(false)) {
                    this.f33923b.clear();
                    this.f33924c.clear();
                    this.f33925d.clear();
                    this.f33926e.clear();
                    this.f33927f.clear();
                    this.f33928g = new Object();
                    this.f33929h = false;
                }
                Object obj = this.f33928g;
                if (this.f33923b.containsKey(str)) {
                    String str3 = this.f33923b.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : this.f33930i) {
                    if (str.startsWith(str4)) {
                        if (!this.f33929h) {
                            try {
                                HashMap<String, String> map = (HashMap) this.f33931j.b(contentResolver, this.f33930i, new InterfaceC2440b3() { // from class: com.google.android.gms.internal.measurement.a3
                                    @Override // com.google.android.gms.internal.measurement.InterfaceC2440b3
                                    public final Map g(int i10) {
                                        return new HashMap(i10, 1.0f);
                                    }
                                });
                                if (!map.isEmpty()) {
                                    Set<String> setKeySet = map.keySet();
                                    setKeySet.removeAll(this.f33924c.keySet());
                                    setKeySet.removeAll(this.f33925d.keySet());
                                    setKeySet.removeAll(this.f33926e.keySet());
                                    setKeySet.removeAll(this.f33927f.keySet());
                                }
                                if (!map.isEmpty()) {
                                    if (this.f33923b.isEmpty()) {
                                        this.f33923b = map;
                                    } else {
                                        this.f33923b.putAll(map);
                                    }
                                }
                                this.f33929h = true;
                            } catch (zzhd unused) {
                            }
                            if (this.f33923b.containsKey(str)) {
                                String str5 = this.f33923b.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    String strA = this.f33931j.a(contentResolver, str);
                    if (strA != null && strA.equals(null)) {
                        strA = null;
                    }
                    synchronized (this) {
                        try {
                            if (obj == this.f33928g) {
                                this.f33923b.put(str, strA);
                            }
                        } finally {
                        }
                    }
                    if (strA != null) {
                        return strA;
                    }
                    return null;
                } catch (zzhd unused2) {
                    return null;
                }
            } finally {
            }
        }
    }
}
