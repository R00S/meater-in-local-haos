package g;

import Tb.k;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import f1.C3310c;
import h.AbstractC3466a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;

/* compiled from: ActivityResultRegistry.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b&\u0018\u0000 \u00122\u00020\u0001:\u00037:=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&JI\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b)\u0010\u0011J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u0010-J)\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u00102J%\u00104\u001a\u000200\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00103\u001a\u00028\u0000H\u0007¢\u0006\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010@R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00108R\"\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00108R\u0014\u0010E\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010D¨\u0006F"}, d2 = {"Lg/e;", "", "<init>", "()V", "O", "", "key", "", "resultCode", "Landroid/content/Intent;", "data", "Lg/e$a;", "callbackAndContract", "Loa/F;", "g", "(Ljava/lang/String;ILandroid/content/Intent;Lg/e$a;)V", "o", "(Ljava/lang/String;)V", "h", "()I", "rc", "d", "(ILjava/lang/String;)V", "I", "requestCode", "Lh/a;", "contract", "input", "Lf1/c;", "options", "i", "(ILh/a;Ljava/lang/Object;Lf1/c;)V", "Landroidx/lifecycle/v;", "lifecycleOwner", "Lg/b;", "callback", "Lg/c;", "l", "(Ljava/lang/String;Landroidx/lifecycle/v;Lh/a;Lg/b;)Lg/c;", "m", "(Ljava/lang/String;Lh/a;Lg/b;)Lg/c;", "p", "Landroid/os/Bundle;", "outState", "k", "(Landroid/os/Bundle;)V", "savedInstanceState", "j", "", "e", "(IILandroid/content/Intent;)Z", "result", "f", "(ILjava/lang/Object;)Z", "", "a", "Ljava/util/Map;", "rcToKey", "b", "keyToRc", "Lg/e$c;", "c", "keyToLifecycleContainers", "", "Ljava/util/List;", "launchedKeys", "keyToCallback", "parsedPendingResults", "Landroid/os/Bundle;", "pendingResults", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3373e {

    /* renamed from: h, reason: collision with root package name */
    private static final b f41493h = new b(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, c> keyToLifecycleContainers = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> launchedKeys = new ArrayList();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final transient Map<String, a<?>> keyToCallback = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Bundle pendingResults = new Bundle();

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR!\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg/e$a;", "O", "", "Lg/b;", "callback", "Lh/a;", "contract", "<init>", "(Lg/b;Lh/a;)V", "a", "Lg/b;", "()Lg/b;", "b", "Lh/a;", "()Lh/a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$a */
    private static final class a<O> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC3370b<O> callback;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractC3466a<?, O> contract;

        public a(InterfaceC3370b<O> callback, AbstractC3466a<?, O> contract) {
            C3862t.g(callback, "callback");
            C3862t.g(contract, "contract");
            this.callback = callback;
            this.contract = contract;
        }

        public final InterfaceC3370b<O> a() {
            return this.callback;
        }

        public final AbstractC3466a<?, O> b() {
            return this.contract;
        }
    }

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lg/e$b;", "", "<init>", "()V", "", "INITIAL_REQUEST_CODE_VALUE", "I", "", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$b */
    private static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lg/e$c;", "", "Landroidx/lifecycle/m;", "lifecycle", "<init>", "(Landroidx/lifecycle/m;)V", "Landroidx/lifecycle/s;", "observer", "Loa/F;", "a", "(Landroidx/lifecycle/s;)V", "b", "()V", "Landroidx/lifecycle/m;", "getLifecycle", "()Landroidx/lifecycle/m;", "", "Ljava/util/List;", "observers", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AbstractC2106m lifecycle;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<InterfaceC2111s> observers;

        public c(AbstractC2106m lifecycle) {
            C3862t.g(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void a(InterfaceC2111s observer) {
            C3862t.g(observer, "observer");
            this.lifecycle.a(observer);
            this.observers.add(observer);
        }

        public final void b() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.d((InterfaceC2111s) it.next());
            }
            this.observers.clear();
        }
    }

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g.e$d */
    static final class d extends AbstractC3864v implements Ba.a<Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f41505B = new d();

        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Fa.c.INSTANCE.c(2147418112) + 65536);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"g/e$e", "Lg/c;", "input", "Lf1/c;", "options", "Loa/F;", "b", "(Ljava/lang/Object;Lf1/c;)V", "c", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$e, reason: collision with other inner class name */
    public static final class C0523e<I> extends AbstractC3371c<I> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41507b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3466a<I, O> f41508c;

        C0523e(String str, AbstractC3466a<I, O> abstractC3466a) {
            this.f41507b = str;
            this.f41508c = abstractC3466a;
        }

        @Override // g.AbstractC3371c
        public void b(I input, C3310c options) throws Exception {
            Object obj = AbstractC3373e.this.keyToRc.get(this.f41507b);
            Object obj2 = this.f41508c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                AbstractC3373e.this.launchedKeys.add(this.f41507b);
                try {
                    AbstractC3373e.this.i(iIntValue, this.f41508c, input, options);
                    return;
                } catch (Exception e10) {
                    AbstractC3373e.this.launchedKeys.remove(this.f41507b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.AbstractC3371c
        public void c() {
            AbstractC3373e.this.p(this.f41507b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"g/e$f", "Lg/c;", "input", "Lf1/c;", "options", "Loa/F;", "b", "(Ljava/lang/Object;Lf1/c;)V", "c", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$f */
    public static final class f<I> extends AbstractC3371c<I> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41510b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3466a<I, O> f41511c;

        f(String str, AbstractC3466a<I, O> abstractC3466a) {
            this.f41510b = str;
            this.f41511c = abstractC3466a;
        }

        @Override // g.AbstractC3371c
        public void b(I input, C3310c options) throws Exception {
            Object obj = AbstractC3373e.this.keyToRc.get(this.f41510b);
            Object obj2 = this.f41511c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                AbstractC3373e.this.launchedKeys.add(this.f41510b);
                try {
                    AbstractC3373e.this.i(iIntValue, this.f41511c, input, options);
                    return;
                } catch (Exception e10) {
                    AbstractC3373e.this.launchedKeys.remove(this.f41510b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.AbstractC3371c
        public void c() {
            AbstractC3373e.this.p(this.f41510b);
        }
    }

    private final void d(int rc2, String key) {
        this.rcToKey.put(Integer.valueOf(rc2), key);
        this.keyToRc.put(key, Integer.valueOf(rc2));
    }

    private final <O> void g(String key, int resultCode, Intent data, a<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.a() : null) == null || !this.launchedKeys.contains(key)) {
            this.parsedPendingResults.remove(key);
            this.pendingResults.putParcelable(key, new C3369a(resultCode, data));
        } else {
            callbackAndContract.a().a(callbackAndContract.b().c(resultCode, data));
            this.launchedKeys.remove(key);
        }
    }

    private final int h() {
        for (Number number : k.h(d.f41505B)) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AbstractC3373e this$0, String key, InterfaceC3370b callback, AbstractC3466a contract, InterfaceC2114v interfaceC2114v, AbstractC2106m.a event) {
        C3862t.g(this$0, "this$0");
        C3862t.g(key, "$key");
        C3862t.g(callback, "$callback");
        C3862t.g(contract, "$contract");
        C3862t.g(interfaceC2114v, "<anonymous parameter 0>");
        C3862t.g(event, "event");
        if (AbstractC2106m.a.ON_START != event) {
            if (AbstractC2106m.a.ON_STOP == event) {
                this$0.keyToCallback.remove(key);
                return;
            } else {
                if (AbstractC2106m.a.ON_DESTROY == event) {
                    this$0.p(key);
                    return;
                }
                return;
            }
        }
        this$0.keyToCallback.put(key, new a<>(callback, contract));
        if (this$0.parsedPendingResults.containsKey(key)) {
            Object obj = this$0.parsedPendingResults.get(key);
            this$0.parsedPendingResults.remove(key);
            callback.a(obj);
        }
        C3369a c3369a = (C3369a) n1.c.a(this$0.pendingResults, key, C3369a.class);
        if (c3369a != null) {
            this$0.pendingResults.remove(key);
            callback.a(contract.c(c3369a.getResultCode(), c3369a.getData()));
        }
    }

    private final void o(String key) {
        if (this.keyToRc.get(key) != null) {
            return;
        }
        d(h(), key);
    }

    public final boolean e(int requestCode, int resultCode, Intent data) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        g(str, resultCode, data, this.keyToCallback.get(str));
        return true;
    }

    public final <O> boolean f(int requestCode, O result) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.keyToCallback.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, result);
            return true;
        }
        InterfaceC3370b<?> interfaceC3370bA = aVar.a();
        C3862t.e(interfaceC3370bA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        interfaceC3370bA.a(result);
        return true;
    }

    public abstract <I, O> void i(int requestCode, AbstractC3466a<I, O> contract, I input, C3310c options);

    public final void j(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle = savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle != null) {
            this.pendingResults.putAll(bundle);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    W.d(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i10);
            C3862t.f(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i10);
            C3862t.f(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle outState) {
        C3862t.g(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.launchedKeys));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.pendingResults));
    }

    public final <I, O> AbstractC3371c<I> l(final String key, InterfaceC2114v lifecycleOwner, final AbstractC3466a<I, O> contract, final InterfaceC3370b<O> callback) {
        C3862t.g(key, "key");
        C3862t.g(lifecycleOwner, "lifecycleOwner");
        C3862t.g(contract, "contract");
        C3862t.g(callback, "callback");
        AbstractC2106m lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState().j(AbstractC2106m.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC2111s() { // from class: g.d
            @Override // android.view.InterfaceC2111s
            public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                AbstractC3373e.n(this.f41489B, key, callback, contract, interfaceC2114v, aVar);
            }
        });
        this.keyToLifecycleContainers.put(key, cVar);
        return new C0523e(key, contract);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> AbstractC3371c<I> m(String key, AbstractC3466a<I, O> contract, InterfaceC3370b<O> callback) {
        C3862t.g(key, "key");
        C3862t.g(contract, "contract");
        C3862t.g(callback, "callback");
        o(key);
        this.keyToCallback.put(key, new a<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.a(obj);
        }
        C3369a c3369a = (C3369a) n1.c.a(this.pendingResults, key, C3369a.class);
        if (c3369a != null) {
            this.pendingResults.remove(key);
            callback.a(contract.c(c3369a.getResultCode(), c3369a.getData()));
        }
        return new f(key, contract);
    }

    public final void p(String key) {
        Integer numRemove;
        C3862t.g(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C3369a) n1.c.a(this.pendingResults, key, C3369a.class)));
            this.pendingResults.remove(key);
        }
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar != null) {
            cVar.b();
            this.keyToLifecycleContainers.remove(key);
        }
    }
}
