package kotlin;

import Ba.l;
import Ha.g;
import Tb.k;
import Ub.n;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import f1.C3310c;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.AbstractC3389F;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: ActivityNavigator.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f \u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lg3/c;", "Lg3/F;", "Lg3/c$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "l", "()Lg3/c$b;", "", "k", "()Z", "destination", "Landroid/os/Bundle;", "args", "Lg3/z;", "navOptions", "Lg3/F$a;", "navigatorExtras", "Lg3/t;", "m", "(Lg3/c$b;Landroid/os/Bundle;Lg3/z;Lg3/F$a;)Lg3/t;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", "e", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC3389F.b("activity")
/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3397c extends AbstractC3389F<b> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Activity hostActivity;

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R(\u00102\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R(\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010$R(\u00106\u001a\u0004\u0018\u00010\u00162\b\u0010-\u001a\u0004\u0018\u00010\u00168F@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R(\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\b8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b:\u0010$¨\u0006;"}, d2 = {"Lg3/c$b;", "Lg3/t;", "Lg3/F;", "activityNavigator", "<init>", "(Lg3/F;)V", "Landroid/content/Context;", "context", "", "pattern", "Y", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "dataPattern", "c0", "(Ljava/lang/String;)Lg3/c$b;", "Landroid/util/AttributeSet;", "attrs", "Loa/F;", "K", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "packageName", "d0", "Landroid/content/ComponentName;", "name", "a0", "(Landroid/content/ComponentName;)Lg3/c$b;", "action", "Z", "Landroid/net/Uri;", "data", "b0", "(Landroid/net/Uri;)Lg3/c$b;", "", "R", "()Z", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Intent;", "<set-?>", "N", "Landroid/content/Intent;", "V", "()Landroid/content/Intent;", "intent", "O", "Ljava/lang/String;", "U", "component", "Landroid/content/ComponentName;", "T", "()Landroid/content/ComponentName;", "S", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.c$b */
    public static class b extends C3414t {

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private Intent intent;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata */
        private String dataPattern;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC3389F<? extends b> activityNavigator) {
            super(activityNavigator);
            C3862t.g(activityNavigator, "activityNavigator");
        }

        private final String Y(Context context, String pattern) {
            if (pattern == null) {
                return null;
            }
            String packageName = context.getPackageName();
            C3862t.f(packageName, "context.packageName");
            return n.C(pattern, "${applicationId}", packageName, false, 4, null);
        }

        @Override // kotlin.C3414t
        public void K(Context context, AttributeSet attrs) {
            C3862t.g(context, "context");
            C3862t.g(attrs, "attrs");
            super.K(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C3394K.f41607a);
            C3862t.f(typedArrayObtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
            d0(Y(context, typedArrayObtainAttributes.getString(C3394K.f41612f)));
            String string = typedArrayObtainAttributes.getString(C3394K.f41608b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                a0(new ComponentName(context, string));
            }
            Z(typedArrayObtainAttributes.getString(C3394K.f41609c));
            String strY = Y(context, typedArrayObtainAttributes.getString(C3394K.f41610d));
            if (strY != null) {
                b0(Uri.parse(strY));
            }
            c0(Y(context, typedArrayObtainAttributes.getString(C3394K.f41611e)));
            typedArrayObtainAttributes.recycle();
        }

        @Override // kotlin.C3414t
        public boolean R() {
            return false;
        }

        public final String S() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName T() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        /* renamed from: U, reason: from getter */
        public final String getDataPattern() {
            return this.dataPattern;
        }

        /* renamed from: V, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        public final b Z(String action) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            C3862t.d(intent);
            intent.setAction(action);
            return this;
        }

        public final b a0(ComponentName name) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            C3862t.d(intent);
            intent.setComponent(name);
            return this;
        }

        public final b b0(Uri data) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            C3862t.d(intent);
            intent.setData(data);
            return this;
        }

        public final b c0(String dataPattern) {
            this.dataPattern = dataPattern;
            return this;
        }

        public final b d0(String packageName) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            C3862t.d(intent);
            intent.setPackage(packageName);
            return this;
        }

        @Override // kotlin.C3414t
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !(other instanceof b)) {
                return false;
            }
            if (super.equals(other)) {
                Intent intent = this.intent;
                if ((intent != null ? intent.filterEquals(((b) other).intent) : ((b) other).intent == null) && C3862t.b(this.dataPattern, ((b) other).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.C3414t
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.dataPattern;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // kotlin.C3414t
        public String toString() {
            ComponentName componentNameT = T();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentNameT != null) {
                sb2.append(" class=");
                sb2.append(componentNameT.getClassName());
            } else {
                String strS = S();
                if (strS != null) {
                    sb2.append(" action=");
                    sb2.append(strS);
                }
            }
            String string = sb2.toString();
            C3862t.f(string, "sb.toString()");
            return string;
        }
    }

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lg3/c$c;", "Lg3/F$a;", "", "a", "I", "b", "()I", "flags", "Lf1/c;", "activityOptions", "Lf1/c;", "()Lf1/c;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.c$c, reason: collision with other inner class name */
    public static final class C0525c implements AbstractC3389F.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int flags;

        public final C3310c a() {
            return null;
        }

        /* renamed from: b, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }
    }

    /* compiled from: ActivityNavigator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.c$d */
    static final class d extends AbstractC3864v implements l<Context, Context> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f41625B = new d();

        d() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            C3862t.g(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public C3397c(Context context) {
        Object next;
        C3862t.g(context, "context");
        this.context = context;
        Iterator it = k.i(context, d.f41625B).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) next;
    }

    @Override // kotlin.AbstractC3389F
    public boolean k() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // kotlin.AbstractC3389F
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @Override // kotlin.AbstractC3389F
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3414t d(b destination, Bundle args, C3420z navOptions, AbstractC3389F.a navigatorExtras) {
        Intent intent;
        int intExtra;
        String strEncode;
        C3862t.g(destination, "destination");
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (args != null) {
            intent2.putExtras(args);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!args.containsKey(strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + args + " to fill data pattern " + dataPattern).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    Map<String, C3405k> mapZ = destination.z();
                    C3862t.d(strGroup);
                    C3405k c3405k = mapZ.get(strGroup);
                    AbstractC3386C<Object> abstractC3386CA = c3405k != null ? c3405k.a() : null;
                    if (abstractC3386CA == null || (strEncode = abstractC3386CA.i(abstractC3386CA.a(args, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(args.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = navigatorExtras instanceof C0525c;
        if (z10) {
            intent2.addFlags(((C0525c) navigatorExtras).getFlags());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.getSingleTop()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.getId());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim <= 0 || !C3862t.b(resources.getResourceTypeName(popEnterAnim), "animator")) && (popExitAnim <= 0 || !C3862t.b(resources.getResourceTypeName(popExitAnim), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", popEnterAnim);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", popExitAnim);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
            }
        }
        if (z10) {
            ((C0525c) navigatorExtras).a();
            this.context.startActivity(intent2);
        } else {
            this.context.startActivity(intent2);
        }
        if (navOptions != null && this.hostActivity != null) {
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if ((enterAnim > 0 && C3862t.b(resources.getResourceTypeName(enterAnim), "animator")) || (exitAnim > 0 && C3862t.b(resources.getResourceTypeName(exitAnim), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
            } else if (enterAnim >= 0 || exitAnim >= 0) {
                this.hostActivity.overridePendingTransition(g.d(enterAnim, 0), g.d(exitAnim, 0));
            }
        }
        return null;
    }
}
