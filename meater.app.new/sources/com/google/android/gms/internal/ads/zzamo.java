package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.InterfaceC6226b;
import com.google.ads.mediation.InterfaceC6234e;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzamo extends zzamq {

    /* renamed from: f */
    private static final zzapb f22168f = new zzapb();

    /* renamed from: g */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f22169g;

    /* renamed from: i7 */
    private final <NetworkExtrasT extends InterfaceC6234e, ServerParametersT extends MediationServerParameters> zzams m16690i7(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, zzamo.class.getClassLoader());
            if (InterfaceC6226b.class.isAssignableFrom(cls)) {
                InterfaceC6226b interfaceC6226b = (InterfaceC6226b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new zzant(interfaceC6226b, (InterfaceC6234e) this.f22169g.get(interfaceC6226b.getAdditionalParametersType()));
            }
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                return new zzanl((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            if (Adapter.class.isAssignableFrom(cls)) {
                return new zzanl((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(" (not a valid adapter).");
            zzbad.m17353i(sb.toString());
            throw new RemoteException();
        } catch (Throwable unused) {
            return m16691j7(str);
        }
    }

    /* renamed from: j7 */
    private final zzams m16691j7(String str) throws RemoteException {
        try {
            zzbad.m17349e("Reflection failed, retrying using direct instantiation");
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            zzbad.m17348d(sb.toString(), th);
        }
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
            return new zzanl(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
            return new zzanl(new AdUrlAdapter());
        }
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            return new zzanl(new CustomEventAdapter());
        }
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
            return new zzant(customEventAdapter, (CustomEventExtras) this.f22169g.get(customEventAdapter.getAdditionalParametersType()));
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    /* renamed from: N6 */
    public final boolean mo16692N6(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzamo.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            zzbad.m17353i(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    /* renamed from: P2 */
    public final zzaov mo16693P2(String str) throws RemoteException {
        return zzapb.m16823a(str);
    }

    /* renamed from: k7 */
    public final void m16694k7(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f22169g = map;
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    /* renamed from: l6 */
    public final zzams mo16695l6(String str) throws RemoteException {
        return m16690i7(str);
    }
}
