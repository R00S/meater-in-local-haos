package io.rakam.api;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: DeviceInfo.java */
/* renamed from: io.rakam.api.d */
/* loaded from: classes2.dex */
public class C9228d {

    /* renamed from: a */
    private boolean f35623a = true;

    /* renamed from: b */
    private Context f35624b;

    /* renamed from: c */
    private b f35625c;

    /* compiled from: DeviceInfo.java */
    /* renamed from: io.rakam.api.d$b */
    private class b {

        /* renamed from: a */
        private String f35626a;

        /* renamed from: b */
        private String f35627b;

        /* renamed from: c */
        private String f35628c;

        /* renamed from: d */
        private String f35629d;

        /* renamed from: e */
        private String f35630e;

        /* renamed from: f */
        private String f35631f;

        /* renamed from: g */
        private String f35632g;

        /* renamed from: h */
        private String f35633h;

        /* renamed from: i */
        private String f35634i;

        /* renamed from: j */
        private String f35635j;

        /* renamed from: k */
        private boolean f35636k;

        /* renamed from: l */
        private boolean f35637l;

        /* renamed from: A */
        private String m29854A() {
            return Build.VERSION.RELEASE;
        }

        /* renamed from: B */
        private String m29855B() {
            try {
                return C9228d.this.f35624b.getPackageManager().getPackageInfo(C9228d.this.f35624b.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e2) {
                C9229e.m29884e().m29888g("Failed to get version name", e2);
                return null;
            }
        }

        /* renamed from: m */
        private boolean m29868m() {
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, C9228d.this.f35624b);
                if (num != null) {
                    return num.intValue() == 0;
                }
                return false;
            } catch (ClassNotFoundException e2) {
                C9232h.m29964d().m29970g("io.rakam.api.DeviceInfo", "Google Play Services Util not found!");
                C9229e.m29884e().m29888g("Failed to check GPS enabled", e2);
                return false;
            } catch (IllegalAccessException e3) {
                C9232h.m29964d().m29970g("io.rakam.api.DeviceInfo", "Google Play Services not available");
                C9229e.m29884e().m29888g("Failed to check GPS enabled", e3);
                return false;
            } catch (NoClassDefFoundError e4) {
                C9232h.m29964d().m29970g("io.rakam.api.DeviceInfo", "Google Play Services Util not found!");
                C9229e.m29884e().m29888g("Failed to check GPS enabled", e4);
                return false;
            } catch (NoSuchMethodException e5) {
                C9232h.m29964d().m29970g("io.rakam.api.DeviceInfo", "Google Play Services not available");
                C9229e.m29884e().m29888g("Failed to check GPS enabled", e5);
                return false;
            } catch (InvocationTargetException e6) {
                C9232h.m29964d().m29970g("io.rakam.api.DeviceInfo", "Google Play Services not available");
                C9229e.m29884e().m29888g("Failed to check GPS enabled", e6);
                return false;
            } catch (Exception e7) {
                C9232h.m29964d().m29970g("io.rakam.api.DeviceInfo", "Error when checking for Google Play Services: " + e7);
                C9229e.m29884e().m29888g("Failed to check GPS enabled", e7);
                return false;
            }
        }

        /* renamed from: n */
        private String m29869n() {
            return "Amazon".equals(m29879x()) ? m29870o() : m29871p();
        }

        /* renamed from: o */
        private String m29870o() {
            ContentResolver contentResolver = C9228d.this.f35624b.getContentResolver();
            this.f35636k = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1;
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            this.f35626a = string;
            return string;
        }

        /* renamed from: p */
        private String m29871p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                boolean z = true;
                Object objInvoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, C9228d.this.f35624b);
                Boolean bool = (Boolean) objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(objInvoke, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                this.f35636k = z;
                this.f35626a = (String) objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
            } catch (ClassNotFoundException e2) {
                C9232h.m29964d().m29970g("io.rakam.api.DeviceInfo", "Google Play Services SDK not found!");
                C9229e.m29884e().m29888g("Failed to get ADID", e2);
            } catch (InvocationTargetException e3) {
                C9232h.m29964d().m29970g("io.rakam.api.DeviceInfo", "Google Play Services not available");
                C9229e.m29884e().m29888g("Failed to get ADID", e3);
            } catch (Exception e4) {
                C9232h.m29964d().m29967c("io.rakam.api.DeviceInfo", "Encountered an error connecting to Google Play Services", e4);
                C9229e.m29884e().m29888g("Failed to get ADID", e4);
            }
            return this.f35626a;
        }

        /* renamed from: q */
        private String m29872q() {
            return Build.BRAND;
        }

        /* renamed from: r */
        private String m29873r() {
            try {
                return ((TelephonyManager) C9228d.this.f35624b.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception e2) {
                C9229e.m29884e().m29888g("Failed to get carrier", e2);
                return null;
            }
        }

        /* renamed from: s */
        private String m29874s() {
            String strM29876u = m29876u();
            if (!C9234j.m29988d(strM29876u)) {
                return strM29876u;
            }
            String strM29877v = m29877v();
            return !C9234j.m29988d(strM29877v) ? strM29877v : m29875t();
        }

        /* renamed from: t */
        private String m29875t() {
            return Locale.getDefault().getCountry();
        }

        /* renamed from: u */
        private String m29876u() {
            Location locationM29846l;
            List<Address> fromLocation;
            if (C9228d.this.m29852r() && (locationM29846l = C9228d.this.m29846l()) != null) {
                try {
                    if (Geocoder.isPresent() && (fromLocation = C9228d.this.m29842h().getFromLocation(locationM29846l.getLatitude(), locationM29846l.getLongitude(), 1)) != null) {
                        for (Address address : fromLocation) {
                            if (address != null) {
                                return address.getCountryCode();
                            }
                        }
                    }
                } catch (IOException e2) {
                    C9229e.m29884e().m29888g("Failed to get country from location", e2);
                } catch (IllegalArgumentException e3) {
                    C9229e.m29884e().m29888g("Failed to get country from location", e3);
                } catch (IllegalStateException e4) {
                    C9229e.m29884e().m29888g("Failed to get country from location", e4);
                } catch (NoSuchMethodError e5) {
                    C9229e.m29884e().m29888g("Failed to get country from location", e5);
                } catch (NullPointerException e6) {
                    C9229e.m29884e().m29888g("Failed to get country from location", e6);
                }
            }
            return null;
        }

        /* renamed from: v */
        private String m29877v() {
            String networkCountryIso;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C9228d.this.f35624b.getSystemService("phone");
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                return networkCountryIso.toUpperCase(Locale.US);
            } catch (Exception e2) {
                C9229e.m29884e().m29888g("Failed to get country from network", e2);
                return null;
            }
        }

        /* renamed from: w */
        private String m29878w() {
            return Locale.getDefault().getLanguage();
        }

        /* renamed from: x */
        private String m29879x() {
            return Build.MANUFACTURER;
        }

        /* renamed from: y */
        private String m29880y() {
            return Build.MODEL;
        }

        /* renamed from: z */
        private String m29881z() {
            return "android";
        }

        private b() {
            this.f35626a = m29869n();
            this.f35628c = m29855B();
            this.f35629d = m29881z();
            this.f35630e = m29854A();
            this.f35631f = m29872q();
            this.f35632g = m29879x();
            this.f35633h = m29880y();
            this.f35634i = m29873r();
            this.f35627b = m29874s();
            this.f35635j = m29878w();
            this.f35637l = m29868m();
        }
    }

    public C9228d(Context context) {
        this.f35624b = context;
    }

    /* renamed from: b */
    public static String m29836b() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: e */
    private b m29837e() {
        if (this.f35625c == null) {
            this.f35625c = new b();
        }
        return this.f35625c;
    }

    /* renamed from: c */
    public String m29838c() {
        return m29837e().f35626a;
    }

    /* renamed from: d */
    public String m29839d() {
        return m29837e().f35631f;
    }

    /* renamed from: f */
    public String m29840f() {
        return m29837e().f35634i;
    }

    /* renamed from: g */
    public String m29841g() {
        return m29837e().f35627b;
    }

    /* renamed from: h */
    protected Geocoder m29842h() {
        return new Geocoder(this.f35624b, Locale.ENGLISH);
    }

    /* renamed from: i */
    public String m29843i() {
        return m29837e().f35635j;
    }

    /* renamed from: j */
    public String m29844j() {
        return m29837e().f35632g;
    }

    /* renamed from: k */
    public String m29845k() {
        return m29837e().f35633h;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0032 A[SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.location.Location m29846l() {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get most recent location"
            boolean r1 = r8.m29852r()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            android.content.Context r1 = r8.f35624b
            java.lang.String r3 = "location"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r1 != 0) goto L17
            return r2
        L17:
            r3 = 1
            java.util.List r3 = r1.getProviders(r3)     // Catch: java.lang.SecurityException -> L1d
            goto L26
        L1d:
            r3 = move-exception
            io.rakam.api.e r4 = io.rakam.api.C9229e.m29884e()
            r4.m29888g(r0, r3)
            r3 = r2
        L26:
            if (r3 != 0) goto L29
            return r2
        L29:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L32:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            android.location.Location r5 = r1.getLastKnownLocation(r5)     // Catch: java.lang.SecurityException -> L43 java.lang.IllegalArgumentException -> L4c
            goto L55
        L43:
            r5 = move-exception
            io.rakam.api.e r6 = io.rakam.api.C9229e.m29884e()
            r6.m29888g(r0, r5)
            goto L54
        L4c:
            r5 = move-exception
            io.rakam.api.e r6 = io.rakam.api.C9229e.m29884e()
            r6.m29888g(r0, r5)
        L54:
            r5 = r2
        L55:
            if (r5 == 0) goto L32
            r4.add(r5)
            goto L32
        L5b:
            r0 = -1
            java.util.Iterator r3 = r4.iterator()
        L61:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r3.next()
            android.location.Location r4 = (android.location.Location) r4
            long r5 = r4.getTime()
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L61
            long r0 = r4.getTime()
            r2 = r4
            goto L61
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.C9228d.m29846l():android.location.Location");
    }

    /* renamed from: m */
    public String m29847m() {
        return m29837e().f35629d;
    }

    /* renamed from: n */
    public String m29848n() {
        return m29837e().f35630e;
    }

    /* renamed from: o */
    public String m29849o() {
        return m29837e().f35628c;
    }

    /* renamed from: p */
    public boolean m29850p() {
        return m29837e().f35637l;
    }

    /* renamed from: q */
    public boolean m29851q() {
        return m29837e().f35636k;
    }

    /* renamed from: r */
    public boolean m29852r() {
        return this.f35623a;
    }

    /* renamed from: s */
    public void m29853s() {
        m29837e();
    }
}
