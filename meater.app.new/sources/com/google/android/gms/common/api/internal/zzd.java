package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzd extends Fragment implements LifecycleFragment {

    /* renamed from: f */
    private static final WeakHashMap f17633f = new WeakHashMap();

    /* renamed from: g */
    private final Map f17634g = Collections.synchronizedMap(new C0867a());

    /* renamed from: h */
    private int f17635h = 0;

    /* renamed from: i */
    private Bundle f17636i;

    /* renamed from: f */
    public static zzd m14254f(ActivityC0468d activityC0468d) {
        zzd zzdVar;
        WeakHashMap weakHashMap = f17633f;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC0468d);
        if (weakReference != null && (zzdVar = (zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) activityC0468d.getSupportFragmentManager().m3488j0("SupportLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                activityC0468d.getSupportFragmentManager().m3493m().m3737e(zzdVar2, "SupportLifecycleFragmentImpl").mo3549j();
            }
            weakHashMap.put(activityC0468d, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    /* renamed from: a */
    public final void mo14040a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f17634g.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f17634g.put(str, lifecycleCallback);
        if (this.f17635h > 0) {
            new zzi(Looper.getMainLooper()).post(new RunnableC6405y0(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo14041b(String str, Class<T> cls) {
        return cls.cast(this.f17634g.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    /* renamed from: c */
    public final /* synthetic */ Activity mo14042c() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f17634g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14031a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator it = this.f17634g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14033d(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17635h = 1;
        this.f17636i = bundle;
        for (Map.Entry entry : this.f17634g.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo14034e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f17635h = 5;
        Iterator it = this.f17634g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14035f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f17635h = 3;
        Iterator it = this.f17634g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14036g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f17634g.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo14037h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f17635h = 2;
        Iterator it = this.f17634g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14038i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f17635h = 4;
        Iterator it = this.f17634g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14039j();
        }
    }
}
