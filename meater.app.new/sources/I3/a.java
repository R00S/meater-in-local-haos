package I3;

import Ba.l;
import E3.h;
import E3.j;
import F3.c;
import F3.d;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SidecarAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u001bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"LI3/a;", "", "LE3/j;", "verificationMode", "<init>", "(LE3/j;)V", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "first", "second", "", "c", "(Ljava/util/List;Ljava/util/List;)Z", "b", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z", "sidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "deviceState", "LF3/a;", "f", "(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/List;", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "extensionInfo", "state", "LF3/j;", "e", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)LF3/j;", "a", "(Landroidx/window/sidecar/SidecarDeviceState;Landroidx/window/sidecar/SidecarDeviceState;)Z", "d", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Z", "feature", "g", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)LF3/a;", "LE3/j;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f6668c = a.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j verificationMode;

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LI3/a$a;", "", "<init>", "()V", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "c", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "b", "(Landroidx/window/sidecar/SidecarDeviceState;)I", "a", "posture", "Loa/F;", "d", "(Landroidx/window/sidecar/SidecarDeviceState;I)V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I3.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final int a(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C3862t.g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return 0;
                }
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) objInvoke).intValue();
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C3862t.g(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final List<SidecarDisplayFeature> c(SidecarWindowLayoutInfo info) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C3862t.g(info, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? r.m() : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return r.m();
                }
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                C3862t.e(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) objInvoke;
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(SidecarDeviceState sidecarDeviceState, int posture) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            C3862t.g(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = posture;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(posture));
            }
        }

        private Companion() {
        }
    }

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements l<SidecarDisplayFeature, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f6670B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            C3862t.g(require, "$this$require");
            boolean z10 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements l<SidecarDisplayFeature, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f6671B = new c();

        c() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            C3862t.g(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements l<SidecarDisplayFeature, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f6672B = new d();

        d() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            C3862t.g(require, "$this$require");
            boolean z10 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: SidecarAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements l<SidecarDisplayFeature, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f6673B = new e();

        e() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature require) {
            C3862t.g(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean b(SidecarDisplayFeature first, SidecarDisplayFeature second) {
        if (C3862t.b(first, second)) {
            return true;
        }
        if (first == null || second == null || first.getType() != second.getType()) {
            return false;
        }
        return C3862t.b(first.getRect(), second.getRect());
    }

    private final boolean c(List<SidecarDisplayFeature> first, List<SidecarDisplayFeature> second) {
        if (first == second) {
            return true;
        }
        if (first == null || second == null || first.size() != second.size()) {
            return false;
        }
        int size = first.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!b(first.get(i10), second.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(SidecarDeviceState first, SidecarDeviceState second) {
        if (C3862t.b(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        Companion companion = INSTANCE;
        return companion.b(first) == companion.b(second);
    }

    public final boolean d(SidecarWindowLayoutInfo first, SidecarWindowLayoutInfo second) {
        if (C3862t.b(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        Companion companion = INSTANCE;
        return c(companion.c(first), companion.c(second));
    }

    public final F3.j e(SidecarWindowLayoutInfo extensionInfo, SidecarDeviceState state) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(state, "state");
        if (extensionInfo == null) {
            return new F3.j(r.m());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        Companion companion = INSTANCE;
        companion.d(sidecarDeviceState, companion.b(state));
        return new F3.j(f(companion.c(extensionInfo), sidecarDeviceState));
    }

    public final List<F3.a> f(List<SidecarDisplayFeature> sidecarDisplayFeatures, SidecarDeviceState deviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        C3862t.g(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            F3.a aVarG = g((SidecarDisplayFeature) it.next(), deviceState);
            if (aVarG != null) {
                arrayList.add(aVarG);
            }
        }
        return arrayList;
    }

    public final F3.a g(SidecarDisplayFeature feature, SidecarDeviceState deviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d.b bVarA;
        c.b bVar;
        C3862t.g(feature, "feature");
        C3862t.g(deviceState, "deviceState");
        h.Companion companion = h.INSTANCE;
        String TAG = f6668c;
        C3862t.f(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) h.Companion.b(companion, feature, TAG, this.verificationMode, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f6670B).c("Feature bounds must not be 0", c.f6671B).c("TYPE_FOLD must have 0 area", d.f6672B).c("Feature be pinned to either left or top", e.f6673B).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVarA = d.b.INSTANCE.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.INSTANCE.b();
        }
        int iB = INSTANCE.b(deviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            bVar = c.b.f4486d;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            bVar = c.b.f4485c;
        }
        Rect rect = feature.getRect();
        C3862t.f(rect, "feature.rect");
        return new F3.d(new E3.b(rect), bVarA, bVar);
    }

    public a(j verificationMode) {
        C3862t.g(verificationMode, "verificationMode");
        this.verificationMode = verificationMode;
    }

    public /* synthetic */ a(j jVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? j.QUIET : jVar);
    }
}
