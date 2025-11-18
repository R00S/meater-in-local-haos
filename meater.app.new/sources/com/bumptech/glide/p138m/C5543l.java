package com.bumptech.glide.p138m;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C5355i;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.C5597k;
import java.util.HashMap;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: RequestManagerRetriever.java */
/* renamed from: com.bumptech.glide.m.l */
/* loaded from: classes.dex */
public class C5543l implements Handler.Callback {

    /* renamed from: f */
    private static final b f13871f = new a();

    /* renamed from: g */
    private volatile C5355i f13872g;

    /* renamed from: j */
    private final Handler f13875j;

    /* renamed from: k */
    private final b f13876k;

    /* renamed from: h */
    final Map<FragmentManager, FragmentC5542k> f13873h = new HashMap();

    /* renamed from: i */
    final Map<androidx.fragment.app.FragmentManager, C5546o> f13874i = new HashMap();

    /* renamed from: l */
    private final C0867a<View, Fragment> f13877l = new C0867a<>();

    /* renamed from: m */
    private final C0867a<View, android.app.Fragment> f13878m = new C0867a<>();

    /* renamed from: n */
    private final Bundle f13879n = new Bundle();

    /* compiled from: RequestManagerRetriever.java */
    /* renamed from: com.bumptech.glide.m.l$a */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.p138m.C5543l.b
        /* renamed from: a */
        public C5355i mo10815a(ComponentCallbacks2C5349c componentCallbacks2C5349c, InterfaceC5539h interfaceC5539h, InterfaceC5544m interfaceC5544m, Context context) {
            return new C5355i(componentCallbacks2C5349c, interfaceC5539h, interfaceC5544m, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    /* renamed from: com.bumptech.glide.m.l$b */
    public interface b {
        /* renamed from: a */
        C5355i mo10815a(ComponentCallbacks2C5349c componentCallbacks2C5349c, InterfaceC5539h interfaceC5539h, InterfaceC5544m interfaceC5544m, Context context);
    }

    public C5543l(b bVar) {
        this.f13876k = bVar == null ? f13871f : bVar;
        this.f13875j = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    /* renamed from: a */
    private static void m10802a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @Deprecated
    /* renamed from: b */
    private C5355i m10803b(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        FragmentC5542k fragmentC5542kM10805i = m10805i(fragmentManager, fragment, z);
        C5355i c5355iM10798d = fragmentC5542kM10805i.m10798d();
        if (c5355iM10798d != null) {
            return c5355iM10798d;
        }
        C5355i c5355iMo10815a = this.f13876k.mo10815a(ComponentCallbacks2C5349c.m9972c(context), fragmentC5542kM10805i.m10797b(), fragmentC5542kM10805i.m10799e(), context);
        fragmentC5542kM10805i.m10801i(c5355iMo10815a);
        return c5355iMo10815a;
    }

    /* renamed from: g */
    private C5355i m10804g(Context context) {
        if (this.f13872g == null) {
            synchronized (this) {
                if (this.f13872g == null) {
                    this.f13872g = this.f13876k.mo10815a(ComponentCallbacks2C5349c.m9972c(context.getApplicationContext()), new C5533b(), new C5538g(), context.getApplicationContext());
                }
            }
        }
        return this.f13872g;
    }

    /* renamed from: i */
    private FragmentC5542k m10805i(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        FragmentC5542k fragmentC5542k = (FragmentC5542k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC5542k == null && (fragmentC5542k = this.f13873h.get(fragmentManager)) == null) {
            fragmentC5542k = new FragmentC5542k();
            fragmentC5542k.m10800h(fragment);
            if (z) {
                fragmentC5542k.m10797b().m10786d();
            }
            this.f13873h.put(fragmentManager, fragmentC5542k);
            fragmentManager.beginTransaction().add(fragmentC5542k, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f13875j.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC5542k;
    }

    /* renamed from: k */
    private C5546o m10806k(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C5546o c5546o = (C5546o) fragmentManager.m3488j0("com.bumptech.glide.manager");
        if (c5546o == null && (c5546o = this.f13874i.get(fragmentManager)) == null) {
            c5546o = new C5546o();
            c5546o.m10831k(fragment);
            if (z) {
                c5546o.m10828e().m10786d();
            }
            this.f13874i.put(fragmentManager, c5546o);
            fragmentManager.m3493m().m3737e(c5546o, "com.bumptech.glide.manager").mo3549j();
            this.f13875j.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return c5546o;
    }

    /* renamed from: l */
    private static boolean m10807l(Activity activity) {
        return !activity.isFinishing();
    }

    /* renamed from: m */
    private C5355i m10808m(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C5546o c5546oM10806k = m10806k(fragmentManager, fragment, z);
        C5355i c5355iM10829g = c5546oM10806k.m10829g();
        if (c5355iM10829g != null) {
            return c5355iM10829g;
        }
        C5355i c5355iMo10815a = this.f13876k.mo10815a(ComponentCallbacks2C5349c.m9972c(context), c5546oM10806k.m10828e(), c5546oM10806k.m10830h(), context);
        c5546oM10806k.m10832l(c5355iMo10815a);
        return c5355iMo10815a;
    }

    /* renamed from: c */
    public C5355i m10809c(Activity activity) {
        if (C5597k.m11060q()) {
            return m10810d(activity.getApplicationContext());
        }
        m10802a(activity);
        return m10803b(activity, activity.getFragmentManager(), null, m10807l(activity));
    }

    /* renamed from: d */
    public C5355i m10810d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (C5597k.m11061r() && !(context instanceof Application)) {
            if (context instanceof ActivityC0468d) {
                return m10812f((ActivityC0468d) context);
            }
            if (context instanceof Activity) {
                return m10809c((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return m10810d(((ContextWrapper) context).getBaseContext());
            }
        }
        return m10804g(context);
    }

    /* renamed from: e */
    public C5355i m10811e(Fragment fragment) {
        C5596j.m11043e(fragment.getActivity(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C5597k.m11060q()) {
            return m10810d(fragment.getActivity().getApplicationContext());
        }
        return m10808m(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    /* renamed from: f */
    public C5355i m10812f(ActivityC0468d activityC0468d) {
        if (C5597k.m11060q()) {
            return m10810d(activityC0468d.getApplicationContext());
        }
        m10802a(activityC0468d);
        return m10808m(activityC0468d, activityC0468d.getSupportFragmentManager(), null, m10807l(activityC0468d));
    }

    @Deprecated
    /* renamed from: h */
    FragmentC5542k m10813h(Activity activity) {
        return m10805i(activity.getFragmentManager(), null, m10807l(activity));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        int i2 = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i2 == 1) {
            obj = (FragmentManager) message.obj;
            objRemove = this.f13873h.remove(obj);
        } else {
            if (i2 != 2) {
                z = false;
                obj2 = null;
                if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            objRemove = this.f13874i.remove(obj);
        }
        Object obj4 = obj;
        obj3 = objRemove;
        obj2 = obj4;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }

    /* renamed from: j */
    C5546o m10814j(ActivityC0468d activityC0468d) {
        return m10806k(activityC0468d.getSupportFragmentManager(), null, m10807l(activityC0468d));
    }
}
