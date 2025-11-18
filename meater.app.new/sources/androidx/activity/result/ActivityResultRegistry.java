package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.p002d.AbstractC0053a;
import androidx.core.app.C0238b;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0513i;
import androidx.lifecycle.InterfaceC0515k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f117a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f118b = new HashMap();

    /* renamed from: c */
    private final Map<String, Integer> f119c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0047d> f120d = new HashMap();

    /* renamed from: e */
    final transient Map<String, C0046c<?>> f121e = new HashMap();

    /* renamed from: f */
    final Map<String, Object> f122f = new HashMap();

    /* renamed from: g */
    final Bundle f123g = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    class C0044a<I> extends AbstractC0051b<I> {

        /* renamed from: a */
        final /* synthetic */ int f128a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0053a f129b;

        /* renamed from: c */
        final /* synthetic */ String f130c;

        C0044a(int i2, AbstractC0053a abstractC0053a, String str) {
            this.f128a = i2;
            this.f129b = abstractC0053a;
            this.f130c = str;
        }

        @Override // androidx.activity.result.AbstractC0051b
        /* renamed from: b */
        public void mo158b(I i2, C0238b c0238b) {
            ActivityResultRegistry.this.mo125f(this.f128a, this.f129b, i2, c0238b);
        }

        @Override // androidx.activity.result.AbstractC0051b
        /* renamed from: c */
        public void mo159c() {
            ActivityResultRegistry.this.m157l(this.f130c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    class C0045b<I> extends AbstractC0051b<I> {

        /* renamed from: a */
        final /* synthetic */ int f132a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0053a f133b;

        /* renamed from: c */
        final /* synthetic */ String f134c;

        C0045b(int i2, AbstractC0053a abstractC0053a, String str) {
            this.f132a = i2;
            this.f133b = abstractC0053a;
            this.f134c = str;
        }

        @Override // androidx.activity.result.AbstractC0051b
        /* renamed from: b */
        public void mo158b(I i2, C0238b c0238b) {
            ActivityResultRegistry.this.mo125f(this.f132a, this.f133b, i2, c0238b);
        }

        @Override // androidx.activity.result.AbstractC0051b
        /* renamed from: c */
        public void mo159c() {
            ActivityResultRegistry.this.m157l(this.f134c);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    private static class C0046c<O> {

        /* renamed from: a */
        final InterfaceC0050a<O> f136a;

        /* renamed from: b */
        final AbstractC0053a<?, O> f137b;

        C0046c(InterfaceC0050a<O> interfaceC0050a, AbstractC0053a<?, O> abstractC0053a) {
            this.f136a = interfaceC0050a;
            this.f137b = abstractC0053a;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    private static class C0047d {

        /* renamed from: a */
        final AbstractC0511g f138a;

        /* renamed from: b */
        private final ArrayList<InterfaceC0513i> f139b = new ArrayList<>();

        C0047d(AbstractC0511g abstractC0511g) {
            this.f138a = abstractC0511g;
        }

        /* renamed from: a */
        void m160a(InterfaceC0513i interfaceC0513i) {
            this.f138a.mo3861a(interfaceC0513i);
            this.f139b.add(interfaceC0513i);
        }

        /* renamed from: b */
        void m161b() {
            Iterator<InterfaceC0513i> it = this.f139b.iterator();
            while (it.hasNext()) {
                this.f138a.mo3863c(it.next());
            }
            this.f139b.clear();
        }
    }

    /* renamed from: a */
    private void m147a(int i2, String str) {
        this.f118b.put(Integer.valueOf(i2), str);
        this.f119c.put(str, Integer.valueOf(i2));
    }

    /* renamed from: d */
    private <O> void m148d(String str, int i2, Intent intent, C0046c<O> c0046c) {
        InterfaceC0050a<O> interfaceC0050a;
        if (c0046c != null && (interfaceC0050a = c0046c.f136a) != null) {
            interfaceC0050a.mo171a(c0046c.f137b.mo175c(i2, intent));
        } else {
            this.f122f.remove(str);
            this.f123g.putParcelable(str, new ActivityResult(i2, intent));
        }
    }

    /* renamed from: e */
    private int m149e() {
        int iNextInt = this.f117a.nextInt(2147418112);
        while (true) {
            int i2 = iNextInt + 65536;
            if (!this.f118b.containsKey(Integer.valueOf(i2))) {
                return i2;
            }
            iNextInt = this.f117a.nextInt(2147418112);
        }
    }

    /* renamed from: k */
    private int m150k(String str) {
        Integer num = this.f119c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iM149e = m149e();
        m147a(iM149e, str);
        return iM149e;
    }

    /* renamed from: b */
    public final boolean m151b(int i2, int i3, Intent intent) {
        String str = this.f118b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        m148d(str, i3, intent, this.f121e.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m152c(int i2, @SuppressLint({"UnknownNullness"}) O o) {
        InterfaceC0050a<?> interfaceC0050a;
        String str = this.f118b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0046c<?> c0046c = this.f121e.get(str);
        if (c0046c != null && (interfaceC0050a = c0046c.f136a) != null) {
            interfaceC0050a.mo171a(o);
            return true;
        }
        this.f123g.remove(str);
        this.f122f.put(str, o);
        return true;
    }

    /* renamed from: f */
    public abstract <I, O> void mo125f(int i2, AbstractC0053a<I, O> abstractC0053a, @SuppressLint({"UnknownNullness"}) I i3, C0238b c0238b);

    /* renamed from: g */
    public final void m153g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        int size = stringArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m147a(integerArrayList.get(i2).intValue(), stringArrayList.get(i2));
        }
        this.f117a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f123g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    }

    /* renamed from: h */
    public final void m154h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f118b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f118b.values()));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f123g.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f117a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final <I, O> AbstractC0051b<I> m155i(String str, AbstractC0053a<I, O> abstractC0053a, InterfaceC0050a<O> interfaceC0050a) {
        int iM150k = m150k(str);
        this.f121e.put(str, new C0046c<>(interfaceC0050a, abstractC0053a));
        if (this.f122f.containsKey(str)) {
            Object obj = this.f122f.get(str);
            this.f122f.remove(str);
            interfaceC0050a.mo171a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f123g.getParcelable(str);
        if (activityResult != null) {
            this.f123g.remove(str);
            interfaceC0050a.mo171a(abstractC0053a.mo175c(activityResult.m144b(), activityResult.m143a()));
        }
        return new C0045b(iM150k, abstractC0053a, str);
    }

    /* renamed from: j */
    public final <I, O> AbstractC0051b<I> m156j(final String str, InterfaceC0515k interfaceC0515k, final AbstractC0053a<I, O> abstractC0053a, final InterfaceC0050a<O> interfaceC0050a) {
        AbstractC0511g lifecycle = interfaceC0515k.getLifecycle();
        if (lifecycle.mo3862b().m3867g(AbstractC0511g.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC0515k + " is attempting to register while current state is " + lifecycle.mo3862b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int iM150k = m150k(str);
        C0047d c0047d = this.f120d.get(str);
        if (c0047d == null) {
            c0047d = new C0047d(lifecycle);
        }
        c0047d.m160a(new InterfaceC0513i() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.InterfaceC0513i
            /* renamed from: a */
            public void mo124a(InterfaceC0515k interfaceC0515k2, AbstractC0511g.b bVar) {
                if (!AbstractC0511g.b.ON_START.equals(bVar)) {
                    if (AbstractC0511g.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f121e.remove(str);
                        return;
                    } else {
                        if (AbstractC0511g.b.ON_DESTROY.equals(bVar)) {
                            ActivityResultRegistry.this.m157l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f121e.put(str, new C0046c<>(interfaceC0050a, abstractC0053a));
                if (ActivityResultRegistry.this.f122f.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f122f.get(str);
                    ActivityResultRegistry.this.f122f.remove(str);
                    interfaceC0050a.mo171a(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f123g.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f123g.remove(str);
                    interfaceC0050a.mo171a(abstractC0053a.mo175c(activityResult.m144b(), activityResult.m143a()));
                }
            }
        });
        this.f120d.put(str, c0047d);
        return new C0044a(iM150k, abstractC0053a, str);
    }

    /* renamed from: l */
    final void m157l(String str) {
        Integer numRemove = this.f119c.remove(str);
        if (numRemove != null) {
            this.f118b.remove(numRemove);
        }
        this.f121e.remove(str);
        if (this.f122f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f122f.get(str));
            this.f122f.remove(str);
        }
        if (this.f123g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f123g.getParcelable(str));
            this.f123g.remove(str);
        }
        C0047d c0047d = this.f120d.get(str);
        if (c0047d != null) {
            c0047d.m161b();
            this.f120d.remove(str);
        }
    }
}
