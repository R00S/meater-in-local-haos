package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
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
public final class zzb extends Fragment implements LifecycleFragment {

    /* renamed from: f */
    private static final WeakHashMap f17629f = new WeakHashMap();

    /* renamed from: g */
    private final Map f17630g = Collections.synchronizedMap(new C0867a());

    /* renamed from: h */
    private int f17631h = 0;

    /* renamed from: i */
    private Bundle f17632i;

    /* renamed from: f */
    public static zzb m14251f(Activity activity) {
        zzb zzbVar;
        WeakHashMap weakHashMap = f17629f;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzbVar = (zzb) weakReference.get()) != null) {
            return zzbVar;
        }
        try {
            zzb zzbVar2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzbVar2 == null || zzbVar2.isRemoving()) {
                zzbVar2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzbVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzbVar2));
            return zzbVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    /* renamed from: a */
    public final void mo14040a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f17630g.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f17630g.put(str, lifecycleCallback);
        if (this.f17631h > 0) {
            new zzi(Looper.getMainLooper()).post(new RunnableC6403x0(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo14041b(String str, Class<T> cls) {
        return cls.cast(this.f17630g.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    /* renamed from: c */
    public final Activity mo14042c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f17630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14031a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator it = this.f17630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14033d(i2, i3, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17631h = 1;
        this.f17632i = bundle;
        for (Map.Entry entry : this.f17630g.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo14034e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f17631h = 5;
        Iterator it = this.f17630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14035f();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f17631h = 3;
        Iterator it = this.f17630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14036g();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f17630g.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo14037h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f17631h = 2;
        Iterator it = this.f17630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14038i();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f17631h = 4;
        Iterator it = this.f17630g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo14039j();
        }
    }
}
